package Collections;

import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		
		ArrayEmployee e1=new ArrayEmployee("Muni",27,"QA");
		ArrayEmployee e2=new ArrayEmployee("Rahul",32,"QA");
		ArrayEmployee e3=new ArrayEmployee("Sagar",30,"Admin");
		
		ArrayList<ArrayEmployee> arr=new ArrayList<ArrayEmployee>();
		e1.add();
		e2.add();
		e3.add();
		
		Iterator<ArrayEmployee> it=arr1.iterator();
		while(it.hasNext()) {
			ArrayEmployee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.Age);
			System.out.println(emp.job);
			
		}
		

	}

}
