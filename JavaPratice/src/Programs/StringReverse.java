package Programs;

public class StringReverse {
	
	public static void main(String[] args) 
	
	{
		// we use length() and  charAt() methods.
		
		String name="Muni Mathur";
		String reverse="";		
		for(int i=name.length()-1;i>=0;i--)
      {
			reverse=reverse+name.charAt(i);
			
      }
		System.out.println(reverse);
		
	}

}
