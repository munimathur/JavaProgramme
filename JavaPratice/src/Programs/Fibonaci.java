package Programs;

//next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,6

public class Fibonaci {

	public static void main(String[] args) {
		
		int f0=0,f1=1,f2;
		
		System.out.println(f0+""+f1);
		
	  java.util.Scanner scn=new java.util.Scanner(System.in);
            int n=  scn.nextInt();
            
            for(int i=1;i<=n;i++) 
            {
            	f2=f0+f1;
            	System.out.println(""+f2);
            	f0=f1;
            	f1=f2;
            	
            }
	}

}

