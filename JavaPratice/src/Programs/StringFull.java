package Programs;

public class StringFull {

	public static void main(String[] args) {
		
		String s1="Muni Get a job";
		String s2="As soon as Possible";
		
		// Comparing 2 Strings will Return True or False
		
		boolean compare=s1.equals(s2);
		System.out.println("Result of comparion is :"+compare);

	// Using char at function
		
		char cValue=s1.charAt(6);
	System.out.println("6th character value is "+cValue);
	
	// Using Contain Function True if string having another string
	
	boolean containFun=s1.contains("Get");
	System.out.println("Contain function is "+containFun);

	// Using Index of 
	
	int indexOf=s1.indexOf("a");
	System.out.println("Index of a is "+indexOf);
	
	// Using of Split Function
	
	  String [] aSplit = s1.split("Get");
	  System.out.println("The first part of the array is : " + aSplit[0]);
	  System.out.println("The last part of the array is : " + aSplit[1]);

	
	
	
	
	
	
	}
	

}
