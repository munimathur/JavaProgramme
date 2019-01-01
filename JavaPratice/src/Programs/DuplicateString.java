package Programs;

public class DuplicateString {

	public static void main(String[] args) {
	
		int arr[]= {2,5,6,7,6,5,};
		
		for(int i=0;i<=arr.length-1;i++) 
		{
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   System.out.println("Duplicate Element is"+arr[j]);
			   }
		   }
		}

	}

}
