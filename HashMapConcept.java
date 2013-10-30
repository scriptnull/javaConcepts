import java.util.HashMap;


public class HashMapConcept {

	public static void main(String[] args) {
		//next level of Array lists
		//Array list stores with respect to index
		//Hash Map stores with respect to key
		
		//creating a hashmap
		HashMap<String, String> myMap = new HashMap<String,String>();
		myMap.put("Country", "India");
		myMap.put("Fruit", "Apple");
		myMap.put("Vegetable", "Tomato");
		myMap.put("Color", "Blue");
		
		System.out.println(myMap);
		
		System.out.println("Is a key named Fruit found in myMap ? " + myMap.containsKey("Fruit"));
		
		//getting a hashmap is done via key
		System.out.println(myMap.get("Fruit"));
		
		//removing from a hashmap
		myMap.remove("Fruit");
		
		System.out.println(myMap);
		System.out.println("Is a key named Fruit found in myMap ? " + myMap.containsKey("Fruit"));
		
	}

}
