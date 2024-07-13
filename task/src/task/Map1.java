package task;

import java.util.*;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> stumap = new HashMap<Integer, String>();
		stumap.put(1, "Arkan");
		stumap.put(2, "Sarthak");
		stumap.put(3, "Bhavesh");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();

		int nextValue = stumap.size() + 1;

		if (stumap.containsValue(name)) {
			System.out.println(stumap.containsValue(name) +" " + name + " contents in map");
		} else {
			System.out.println(stumap.containsValue(name) +" " + name + " Does't contents in map");
			System.out.print("Do you want to add (y/n):");
			String userinput = sc.next();
			if (userinput.equalsIgnoreCase("y")) {
				stumap.put(nextValue, name);
				nextValue++;
			}
		}
		// Print out the updated contents of the map
		System.out.println("Map contents:");
		for (Map.Entry<Integer, String> entry : stumap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
