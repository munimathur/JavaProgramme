package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Muni");
		ll.add("Rahul");
		ll.add("Sagar");
		ll.add("Harsh");
		
		ll.addFirst("Aul");
		ll.addLast("Deepanshu");
		
		//  ll.removeFirst();
	   //	ll.removeLast();
		//  ll.remove(3);
		
		System.out.println(ll.get(1));
		System.out.println(ll);

		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

