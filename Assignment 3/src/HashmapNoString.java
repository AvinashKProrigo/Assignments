//Java Program to find the occurrence
//of words in a String using HashMap.
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class HashmapNoString {
	public static void main(String[] args)
	{
		System.out.println(" Enter the String: ");
		Scanner sc = new Scanner(System.in);
		
		String str ;
		str = sc.nextLine();
		// Declaring a HashMap of <String, Integer>
		Map<String, Integer> hashMap = new HashMap<>();

		// Spliiting the words of string
		// and storing them in the array.
	String[] words = str.split("[, . ']+");  

		for (String word : words) {

			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = hashMap.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occurrence as value in the HashMap.
				hashMap.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
		sc.close();
	}
}
