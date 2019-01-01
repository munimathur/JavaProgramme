package Programs;

// if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

public class Armstrong {

	public static void main(String[] args) {
	
		int n=153,r,sum=0;
	    int temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
				
		}

		if(temp==sum)
		{
			System.out.println("YES");
		}
		
		else
		{
			System.out.println("NO");
		}
	}
	

}


