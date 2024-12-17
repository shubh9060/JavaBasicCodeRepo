package Feb.March.June.MachineTest.staff;


public class newQ2 {
    public static void main(String[] args) {
        int[] arr = {202,580,10,1,650,640};
        
        int max=arr[0],smax=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>max) // 1>580
        	{
        		smax = max; // 202
        		max = arr[i];//580
        	} else if(arr[i]>smax && arr[i]!=max)
        	{
        		smax =arr[i];
        	}
        }
        System.out.println("smax :"+smax);
        
      
    }
}
