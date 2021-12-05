import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWhileloop {

	// Main driver method
	public static void main(String[] arguments)
	{
		// Creating Hash map
		Map<String, String> stringType
			= new HashMap<String, String>();

		// Inserting data(Key-value pairs) in hashmap
		stringType.put("Mumbai", "Maharashtra");
		stringType.put("New Delhi", " Delhi");
		stringType.put("Chennai", "Tamilnadu");
		stringType.put(" Kolkatta", "West Banagal");

		// Iterator
		Iterator<Entry<String, String> > new_Iterator
			= stringType.entrySet().iterator();

		// Iterating every set of entry in the HashMap
		System.out.println("Using While loop:\n"); 
		while (new_Iterator.hasNext()) {
			Map.Entry<String, String> new_Map
				= (Map.Entry<String, String>)
					new_Iterator.next();

			// Displaying HashMap
			System.out.println("Key is "+new_Map.getKey() + "  Value is"
							+ new_Map.getValue());
		}
		
		System.out.println("\nUsing Advanced For loop:\n"); 
		 stringType.forEach(
		            (key, value)
		                -> System.out.println("Key is :"+key + " Value is: " + value));
	}
}
