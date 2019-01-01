package Programs;

//5! = 5*4*3*2*1 = 120  


public class Factorial {

	public static void main(String[] args) {
		int n=5, fact=1;
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}

