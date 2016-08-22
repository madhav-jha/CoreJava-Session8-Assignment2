package session8.assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("Johny");
		hset.add("Monty");
		hset.add(new String("Carla"));
		
		Iterator<String> it=hset.iterator();  
		  while(it.hasNext()){  
			  
		   System.out.println(it.next()); 
		   
		  } 

	}

}
