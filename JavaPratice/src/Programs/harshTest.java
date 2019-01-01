package Programs;

// no divided by itself 

public class harshTest {

	public static void main(String[] args)
	{
		int count=0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Please enter the value");
		int limit=input.nextInt();
		for(int i=1 ; i<=limit ; i++)
		 {
		   for(int j=2 ;j<i; j++)
			 {
				if(i%j!=0)
				 	{
					  count=1;
					}
				 else
				 	{
					  count=0;
					  break;
					} 
			 	}
			 if(count==1)
			 System.out.println("prime number"+i);	
		 }   
	}
}
