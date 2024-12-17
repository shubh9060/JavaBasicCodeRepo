package org.ArrayProgramms;
import java.util.*;
class UnBound{
	
	void printData(List<?> value)
	{
		for(Object obj:value)
		{
			System.out.println("Values :"+obj);
		}
	}
}
public class UnBoundedGenrices {

		public static void main(String[] args) {
			
			UnBound unBound = new UnBound();
		//	unBound.printData(Arrays.asList(10,20,50,40,90,150));
			unBound.printData(Arrays.asList("ajay","vijay","sanjay","Durgesh","Ganesh"));
		
			
		}
}
/*

	UnBound Genrices:-  When we Pass parameter function calling to defination if we have
						no idea about which type of parameter are required at time of
						function calling so that time we solve this problem using UnBound Genrices.
						UbBound Genrics Syntax:-
								returnType functionName(ReturnType<?> variableName)
								{
								
								}
							eg.
								void printData(List<?> data)
								{
									for(Object obj:data)
									{
										System.out.println("Values :"+obj);
									}
								}
								public static void main(String args[]){
									
									printData(Arrays.asList(1,2,4,5,9));
								}
				
						if we see above code (List<?> data) in this statement <?> This Question Mark
						are Indicated Runtime Parameter Type means we Pass Any Type of Parameter At runtime
						we are not need to understand which type of parameter i.e printData(List<?> variable) this function
						are accept any type of parameter	.
*/