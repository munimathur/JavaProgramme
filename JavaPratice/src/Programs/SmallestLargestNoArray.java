package Programs;

import java.util.Arrays;

public class SmallestLargestNoArray {

	public static void main(String[] args) {
		
		int numbers[]= {10,25,989,-98,-5};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) 
		{
			if(numbers[i]>largest) 
			{
				largest=numbers[i];
				
			}
			else
			{
				if (numbers[i]<smallest)
				{
					smallest=numbers[i];
				}
			}
			
		}
		System.out.println("Array string is"+Arrays.toString(numbers));
		System.out.println("Largest no is "+largest);
		System.out.println("Largest no is "+smallest);
	}

}
