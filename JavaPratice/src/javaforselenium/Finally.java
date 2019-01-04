package javaforselenium;

public class Finally {

	public static void main(String[] args)
	{
		
		div();

	}
	
	
	public static void  div() {
		
		int i=10;
		try {
			System.out.println("Inside try block");
			int k=i/0;
		}
		
		catch(NullPointerException e) 
		{
			System.out.println("Inside catch block");
			
		}
		
		finally
		{
			
			System.out.println("Inside finally block");
		}
	}

}

