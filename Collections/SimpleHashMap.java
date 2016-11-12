//You need to import the java utilities to use collections.
import java.util.*;

public class SimpleHashMap {
	/*
	 * The first step creates a HashMap called TheBigBang
	 * The first value in the <> is the key to call and associate the information.
	 * Key/Value order
	 */
	public static void main(String[] args) {
	HashMap<Integer, String> TheBigBang = new HashMap<>();
	
		//This will input values into the hashMap.
		TheBigBang.put(88,"Sheldon");
		TheBigBang.put(22,"Howard");
		TheBigBang.put(44,"Raj");
		TheBigBang.put(33,"Leonard");
		TheBigBang.put(66,"Cinnamon");
				
		System.out.println(TheBigBang.toString());
		TheBigBang.remove(66);//Removes the following key/value (Cinnamon) from the hashMap.
		TheBigBang.put(88,"Sheldon");//Attempt to add a duplicate Sheldon to the haspMap.
		System.out.println(TheBigBang.toString());//Returns an updated string of the hashMap
		TheBigBang.clear();//Removes all of the values from the hashMap.
		System.out.println(TheBigBang.toString());//Returns an updated string of the hashMap.

		}
	}

/*Hashmap, is a map where keys are unordered and it follows a hashtable.*/