//You need to import the java utilities to use collections.
import java.util.*;

public class SimpleListArray {
	 public static void main(String args[]) {
	 List<String> TheBigBang = new ArrayList<>();
		
		//This list holds items needed for the class and we will put them in using .add
	 	TheBigBang.add("Penny");
	 	TheBigBang.add("Sheldon Cooper");
	 	TheBigBang.add("Leonard Hofstadter");
	 	TheBigBang.add("Raj Koothrappali");
		TheBigBang.add("Howard Wolowitz");
		TheBigBang.add(2, "Bernadette Rostenkowsk");//Adds to the list of three, since we specified [2]
		TheBigBang.add("Penny");//Adds a Duplicate 
		
		System.out.println(TheBigBang);
		
		TheBigBang.remove(1);//Removes the object (Sheldon) that was added above.
		System.out.println(TheBigBang.toString());//They are printed in the same order as entered.
		//you can also retrieve specific values.
		System.out.println(TheBigBang.get(2)); //This will print the second item in that array
		System.out.println(TheBigBang.get(5)); //This will print the last item in that array.
	}
}
	
	/* This is a simple list that is backed by an array. When the list size changes, 
	 * the array is recreated. It is fast and efficient. So if a list you are using in your 
	 * application is dynamic or changing, it is ideal to use an arrayList./*
	 */