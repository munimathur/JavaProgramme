package Programs;

public class ArrCount {

	public static void main(String[] args) {
		
		int arr[]=new int[7];
		
		for(int count=0;count<7;count++)
		{
			arr[count]=count+1; // arr[0]=0+1, arr[1]=1+1,
			
			System.out.println("array["+count+"] = "+ arr[count]);
	}

}
}

