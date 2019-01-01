package Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringHashSet {

	public static void main(String[] args) 
	{
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		 
        Set<String> elements = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(elements.add(arrayElement)==false)
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
		
        }
	}

}
