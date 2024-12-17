package JuneAssignmentPrograms100Programs;
class Mejority{
	int arr[];
		Mejority(int arr[]){
			this.arr=arr;
		}
	int getMejority() {
		int mid=arr.length/2;
		int count=0,result=0,value=0;
			for(int i=0;i<arr.length;i++)
			{
				count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j]) {
						++count;
					}
				}
				if(count>mid)
				{
					result = count;
					value=arr[i];
					break;
				}
			}
		
		
		return result>mid?1:0;
	}
}
public class Q3 {

	public static void main(String[] args) {
		int arr[]={4,4,4,5,5,4,4,4,1,1,1};
		Mejority MM = new Mejority(arr);
		if(MM.getMejority()==1) {
			System.out.println("Mejority Element Present Here.....");
		}else {
			System.out.println("Mejority Element Not Present Here.....");
		}
		
	}
}
