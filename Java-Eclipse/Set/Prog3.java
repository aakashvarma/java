// Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
// a) Reverse the elements of the Collection.
// b) Iterate the elements of the TreeSet using Iterator.
// c) Check if a particular element exists or not.

import java.util.Iterator;
import java.util.TreeSet;

public class Prog3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		String query = "John";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}