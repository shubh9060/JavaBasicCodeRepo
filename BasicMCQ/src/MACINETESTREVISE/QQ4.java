package MACINETESTREVISE;

import java.io.*;

/*
 Write a program to read the file using BufferReader and store words into
 words.txt file,digits store into digit.txt file and Special symbole store into the symbol.txt file.
 
  */

public class QQ4 {

	public static void main(String[] args) {

		try (BufferedReader bReader = new BufferedReader(new FileReader("D:\\GitTestFolder\\readFile.txt"));
				BufferedWriter digit = new BufferedWriter(new FileWriter("D:\\GitTestFolder\\Digit.txt"));
				BufferedWriter Alphabets = new BufferedWriter(new FileWriter("D:\\GitTestFolder\\Alphabets.txt"));
				BufferedWriter SpecialSymbol = new BufferedWriter(
						new FileWriter("D:\\GitTestFolder\\SpecialSymbol.txt"));
				BufferedWriter wordsF = new BufferedWriter(new FileWriter("D:\\GitTestFolder\\Wrods.txt"));) {

			// FileReader fReader = ;

			String lines = bReader.readLine();
			while (lines != null) {
				System.out.println("Lines :" + lines);

				String words[] = lines.split(" ");
				for (int i = 0; i < words.length; i++) {
					wordsF.write(words[i] + " ");
				}

				for (int i = 0; i < lines.length(); i++) {
					if (lines.charAt(i) >= '0' && lines.charAt(i) <= '9') {
						digit.write(lines.charAt(i));
					} else if ((lines.charAt(i) >= 'a' && lines.charAt(i) <= 'z')
							|| ((lines.charAt(i) >= 'A' && lines.charAt(i) <= 'Z'))) {
						Alphabets.write(lines.charAt(i));
					} else {
						SpecialSymbol.write(lines.charAt(i));
					}
				}

				lines = bReader.readLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File Handling Exception:" + e);
		}
	}
}
