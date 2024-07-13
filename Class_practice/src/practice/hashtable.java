package practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class hashtable {

	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put("java", 3);
		map.put(1.4, "php");
		map.put(true, "python");
		map.put(56,"java");
		System.out.println(map);
//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			Map.Entry entry = (Entry)itr.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());

//	}
		System.out.println("==========hashmap==-===");
		Map map1 = new HashMap();
		map1.put(1, "c");//entry
		map1.put(2, "c++");
		map1.put("java", 3);
		map1.put(1.4, "php");
		map1.put(true, "python");
		map1.put(null,"java");
		System.out.println(map1);
		
		System.out.println("==========Treeset==-===");
		Set set = new TreeSet();
		set.add(345);
		set.add(34567);
		set.add(314535);
		set.add(-156);
		set.add(0);
		set.add(-1);
		System.out.println(set);

	}
}
