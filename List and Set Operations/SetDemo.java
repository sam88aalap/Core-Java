import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		// HashSet- is not ordered, return data in any random order
		Set<Integer> set = new HashSet<Integer>();
		set.add(23);
		set.add(43);
		set.add(23);
		set.add(32);
		set.add(32);
		set.add(26);
		System.out.println("HashSet" +  set);
		System.out.println("______________________________________");
		
		// LinkedHashSet - returns data in the order in which it is entered.
		set= new LinkedHashSet<Integer>();
		set.add(23);
		set.add(43);
		set.add(23);
		set.add(32);
		set.add(32);
		set.add(26);
		System.out.println("LinkedHashSet" +  set);
		System.out.println("______________________________________");
		
		//TreeSet - Returns data after sorting
		set= new TreeSet<Integer>();
		set.add(23);
		set.add(43);
		set.add(23);
		set.add(32);
		set.add(32);
		set.add(26);
		System.out.println("TreeSet" +  set);
		System.out.println("______________________________________");
		
		Set<String> st1 = new TreeSet<String>();
		  
        // Use add() method to add elements into the Set
        st1.add("A");
        st1.add("B");
        st1.add("C");
        st1.add("D");
        System.out.println("Set1: " + st1);
        
        Set<String> st2 = new TreeSet<String>();
        
        // Use add() method to add elements into the Set
        st2.add("E");
        st2.add("F");
        System.out.println("Set2: " + st2);
  
        // Using addAll() method to Append
        st1.addAll(st2);
  
        // Displaying the final Set
        System.out.println("Set1 after addAll(): " + st1);
        System.out.println("______________________________________");
		
        
        // contains() method
        boolean flag=set.contains(26);
        if(flag)
        	System.out.println("element found");
        else
        	System.out.println("element Not found");
        System.out.println("______________________________________");
        
        // isEmpty()
        boolean flag2=set.isEmpty();
        if(flag2)
        	System.out.println("Set is Empty");
        else
        	System.out.println("Set not empty");
        System.out.println("______________________________________");
        
        // remove()
        set.remove(23);
        System.out.println("TreeSet after remove()" +  set);
        System.out.println("______________________________________");
        
        // iterator in set
        Iterator<String> itr = st1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
