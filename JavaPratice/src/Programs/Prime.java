package Programs;

public class Prime {

	 public static void main(String abc[])
	 {
		
	  for (int no = 1; no<=50; no++)
	  {
		  int temp=0;
	   for (int j = 2; j<=no-1; j++)
	   {
		 	   
	    if(no%j == 0)
	    {
	    	temp = temp+1;
	    }
	  }
	    if(temp==0)
	    {
	    	System.out.println(no);
	     }
	    
	 
	 }
	  
	 }
	
}
	   