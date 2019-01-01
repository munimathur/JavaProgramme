package sorting.java;
public class SelectionSort {

	public static int [] doSelectionSort(int [] arr )
	
	{
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int index= i; // 0 
		   for(int j=i+1;j<arr.length;j++)
			   
			   if(arr[j]<arr[index])
				   index=j;
		   
		   int smallNo=arr[index];
		   arr[index]=arr[i];
		   arr[i]=smallNo;
					   	   	
	   }
	   return arr;
	}
		
	public static void main(String[] args)
	{
		int [] arr1= {10,28,69,5,26,88,3,22};
	    int [] arr2=doSelectionSort(arr1);
            for(int i:arr2)
            {
            	System.out.print(i);
            	System.out.print(",");
            }
	}

}
