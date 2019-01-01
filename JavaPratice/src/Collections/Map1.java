package Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args)
	{
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Muni");
		hm.put(2, "Sagar");
		hm.put(3, "Rahul");
		hm.put(4, "Harsh");
		
		// Entry is interface in map, in ,Map we have entryset method which will give the set of entries(Entry=Key value pair) 
		
		for(Entry m :hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
						
		}
		
	//	System.out.println(hm.get(1));
		//System.out.println(hm.remove(2));

	}

}
   
