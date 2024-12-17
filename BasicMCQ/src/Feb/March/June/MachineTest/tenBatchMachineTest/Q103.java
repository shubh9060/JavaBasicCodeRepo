package Feb.March.June.MachineTest.tenBatchMachineTest;
/*
 Write a program to read the file using BufferReader and store words into
 words.txt file,digits store into digit.txt file and Special symbole store into the symbol.txt file.
 * 
 */
import java.io.*;

public class Q103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader bReaderF = new BufferedReader(new FileReader("D:\\ReadFile_Folder\\basic.txt"));
				BufferedWriter wordsF = new BufferedWriter(new FileWriter("D:\\ReadFile_Folder\\wordsF.txt"));
				BufferedWriter digitsF = new BufferedWriter(new FileWriter("D:\\ReadFile_Folder\\digitsF.txt"));
				BufferedWriter symbolF = new BufferedWriter(new FileWriter("D:\\ReadFile_Folder\\symbolF.txt"));) {

			String lines = bReaderF.readLine();
			while (lines != null) {
				System.out.println("Values :" + lines);
				String words[] = lines.split(" ");
				// here we Write Words in WordsF file
				for (int i = 0; i < words.length; i++) {
					for (int j = 0; j < words[i].length(); j++) {
						String str = words[i];
						if (str.charAt(j) >= '0' && str.charAt(j) < '9') {
							char eachDigit = str.charAt(j);
							digitsF.write(eachDigit);
						} else if (!((str.charAt(j) >= 'a' && str.charAt(j) >= 'z')
								|| (str.charAt(j) >= 'A' && str.charAt(j) >= 'Z'))) {
							char eachSpecial = str.charAt(j);
							symbolF.write(eachSpecial);
						}
					}

					String eachWords = words + ",";
					wordsF.write(eachWords);
				}

				lines = bReaderF.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error when we read file:" + e);
		}
	}

}
