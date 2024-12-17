package Feb.March.June.MachineTest;

public class Q5 {

	public static void main(String[] args) {
		
		String example = "Indian";
		char first=' ',last=' ';
		char searchCharacter='n';
		boolean flag=false;
		for(int i=0;i<example.length();i++)
		{
			if(example.charAt(i)==searchCharacter){
				
				if(i==example.length()-1)
				{
					flag=true;
					first= example.charAt(i-1);
					break;
				}else if(i==0)
				{
					last = example.charAt(i+1);
					flag=true;
					break;
				}else{
					first = example.charAt(i-1);
					last = example.charAt(i+1);
					flag=true;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Left character: "+first+"\t Right Character:"+last);
		}else {
			System.out.println("Not Found");
		}
		
		
	}
}
