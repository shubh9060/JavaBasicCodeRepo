package org.ArrayProgramms;

public class ParkingLots{
	
	public static void main(String[] args) {
		
		int arr[][]= {
				{1,0,0,0},
				{0,0,0},
				{1,1,1,1},
				{0,0,0,1,1}
		};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==1) {
					count++;
					//System.out.printf("%d ",arr[i][j]);
				}
			}	
			if(arr[i].length==count)
			{	
				System.out.println((i+1)+" This Floor is Full "+count);
			}else if(count==0){
				System.out.println((i+1)+" This Floor is Full "+count);
			}
			//System.out.println();
		}
	}
	
	
}