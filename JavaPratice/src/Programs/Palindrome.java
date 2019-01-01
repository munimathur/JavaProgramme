package Programs;

// A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343

public class Palindrome {

	public static void main(String[] args) {
		int n=151,r,sum=0,temp;
	temp=n;
		 
		while(n>0)
		{
			r=n%10;   
			n=n/10;
			sum=sum*10+r;
			
			
		}
		if(temp==sum) 
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("False");
		}
	}

}

