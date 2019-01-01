package Collections;
import java.util.*;
public class ArrayList
{

	public static void main(String[] args)
	{
		
		ArrayList arr=new ArrayList(); 
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
	
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
}
	
}


