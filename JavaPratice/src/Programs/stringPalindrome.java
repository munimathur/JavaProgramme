package Programs;

public class stringPalindrome {

	public static void main(String[] args) {
		
		String s1="EYE";
		String s2="EYE";
		
		for(int i=s1.length()-1;i<=0;i--) 
		{
			s2+=s1.charAt(i);
		}
        if(s1.equalsIgnoreCase(s2))  // Compare 2  strings Return True false
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome");
        }
	}

}
