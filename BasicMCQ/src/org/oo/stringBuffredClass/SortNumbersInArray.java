package org.oo.stringBuffredClass;

public class SortNumbersInArray {

	public static void main(String[] args) {
		
		
		int arr[]= {342,45322,63454,2514};
		int sumArray[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int no = arr[i],count=0;// no=342
			while(no!=0)
			{
				++count;
				no/=10;
			}
			System.out.println("Count :"+count);
			no = arr[i];//342
			int temp[]=new int[count];
			int index=0;
			while(no!=0)
			{
				int rem = no%10;//rem 3 rem 4 rem 2
				temp[index++]=rem;
				no/=10;
				
			}
			System.out.println("Temp array:");
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]+"\t");
			}
			
			for(int j=0;j<temp.length;j++)
			{
				for(int k=j+1;k<temp.length;k++)
				{
					if(temp[j]>temp[k])
					{
						int t = temp[j];
						temp[j]=temp[k];
						temp[k]=t;
					}
				}
			}
			//3 2 4
			int sortNo=0;
			int sum=0;
			for(int k=0;k<temp.length;k++)
			{
				sortNo = sortNo*10+temp[k];
				sum+=temp[k];
			}
		System.out.println("Sorted No:"+sortNo);
			arr[i]=sortNo;
			
			sumArray[i]=sum;
		}
		System.out.println("After Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Sorted No:"+arr[i]);
		}
		
		System.out.println("After Calculate Sum:");
		for (int i = 0; i < sumArray.length; i++) {
			System.out.println("Sorted No:"+sumArray[i]);
		}
		
	}
}
