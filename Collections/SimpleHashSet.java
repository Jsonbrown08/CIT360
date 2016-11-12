//You need to import the java utilities to use collections.
import java.util.*;

public class SimpleHashSet {
	 /* List example coding.
	 * The list interface allows you to store information in an ordered/sequenced way.
	 */
	 public static void main(String args[]) {
	 HashSet<String> TheBigBang = new HashSet<>(); 
		
	 	TheBigBang.add("Sheldon"); //You can add items to a Set just like you would in a List:
	 	TheBigBang.add("Amy");//Note add cannot add duplicate items.
	 	TheBigBang.add("Leonard");
	 	TheBigBang.add("Penny");
	 	TheBigBang.add("Howard");
		TheBigBang.add("Bernadette");
		TheBigBang.add("Raj");
		TheBigBang.add("Cinnamon");
		
		System.out.println(TheBigBang);//You can print sets out easily:
		TheBigBang.add("Cinnamon");//Doesn't duplicate items in the list
		System.out.println(TheBigBang); //These do not follow an order, and will print as they will. 
	 }
}

/*Hashset is used with fast and small memory usage for a specific application, 
and when you don't need to order the results*/