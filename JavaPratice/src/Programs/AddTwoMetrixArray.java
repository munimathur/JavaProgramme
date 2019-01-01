package Programs;

public class AddTwoMetrixArray {

	public static void main(String[] args) {
	
		int arr1[][]= {{1,2,3},{4,5,6}};
		int arr2[][]= {{7,8,9},{10,11,12}};
		
		int add[][]= new int[2][3]; // Creating new matrix to store
		
		for(int i=0;i<2;i++) 
		{
			for (int j=0;j<3;j++)
			{
				add[i][j]=arr1[i][j]+arr2[i][j];
				System.out.println(add[i][j]+"");
			}
		
		System.out.println();
		}

	}

}
