package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args)
	{
                Set<String> set=new HashSet<String>();	
                set.add("Muni");
                set.add("Sagar");
                set.add("sagar");
                
                Iterator<String> itr=set.iterator();
                while(itr.hasNext()) {
                	System.out.println(itr.next());
                }

	}

}
