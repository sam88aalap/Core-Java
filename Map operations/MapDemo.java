import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer , String>();
		map.put(123, "Sam");
		map.put(124,"Ram");
		map.put(124,"Ram");
		map.put(125,"Ron");
		map.put(126,"Sam");
		System.out.println(map);
		System.out.println(map.keySet()); // to retrive all keys 
		
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			String value = map.get(key);
			System.out.println("key: "+key+", value: "+value);
		}
		
		System.out.println(map.values()); // to retrive all values
		
		Collection<String> values = map.values();
		for(String value: values)
			System.out.println(value);
		
		map.remove(123);
		System.out.println(map);
		map.replace(124, "John");
		System.out.println(map);
		
		
		System.out.println("_______________________________");
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry:entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: "+key+", value: "+value);
		}
	}

}
