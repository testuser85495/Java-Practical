package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("array");
		list.add('a');
		System.out.println(list);
		list.remove(2);
		Iterator iterator= list.iterator(); 
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}
}
