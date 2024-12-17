package Feb.March.June.MachineTest;

public class Q4 {

	public static void main(String[] args) {
		
		int arr[]= {0,1,4,6,8,10};
		int smallestMissingNumber=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int first = arr[i];
			int last = arr[i+1];
			boolean flag=false;
			for(int j=first+1;j<last;j++)
			{
				//System.out.print(j+"\t");
				if(j!=0) {
					smallestMissingNumber=j;
					flag=true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		System.out.println("Smallest Missing Number :"+smallestMissingNumber);
	}
}
