import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//display length of array list
		System.out.println(list.size()+":"+list);
		
		//adding elements
		list.add(40);
		System.out.println(list.size()+":"+list);
		
		list.add(34);
		System.out.println(list.size()+":"+list);
		
		list.add(76);
		System.out.println(list.size()+":"+list);
		
		//inserting elements in btwn
		list.add(1,43);
		System.out.println(list.size()+":"+list);
		list.add(0,72);
		
		System.out.println(list.size()+":"+list);
		
		// remove element
		list.remove(3);
		System.out.println(list.size()+":"+list);
		
		// search element contains()
		boolean isDataAvailable = list.contains(40);
		if(isDataAvailable)
			System.out.println("value is found");
		else
			System.out.println("not found");
		
		// Iteration methods in list
		
		// 1. for loop
		
		System.out.println("______________________________________");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 2. for each loop
		System.out.println("______________________________________");
		for(int i:list) {
			System.out.println(i);
		}
		
		// 3. interface iterator
		System.out.println("______________________________________");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}

}
