import java.util.ArrayList;
import java.util.List;


public class ArrayListConcept {

	public static void main(String[] args) {
		//arrays can't be resized 
		//so , here is ArrayList class
		ArrayList<String> mylist = new ArrayList<String>();
		
		//adding things to array list
		mylist.add("first");
		mylist.add("second");
		mylist.add("third");
		
		//iterating through the list
		//using foreach to get value 
		
		System.out.println("foreach magic");
		for(String x : mylist)
		{
			System.out.println(x);
		}
		
		//using List Iterators to loop through list seems more memory efficient
		System.out.println("ListIterator Magic");
		ListIterator<String> iterate = mylist.listIterator();
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
		
		
		System.out.println(mylist);
		
		ArrayList<String> mylistCloned = (ArrayList<String>) mylist.clone();
		mylistCloned.add("Fourth");
		mylistCloned.add("Fifth");
		System.out.println(mylistCloned);
		
		//add at specific position
		mylist.add(2, "newString");
		System.out.println(mylist);
		
		//combining lists
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("newList element 1");
		newList.add("newList element 2");
		newList.add("newList element 3");
		
		mylist.addAll(newList);
		System.out.println(mylist);
		
		//remove an element
		mylist.remove("newString");
		mylist.remove(2);
		System.out.println(mylist);
		
		//remove a combined list
		mylist.removeAll(newList);
		System.out.println(mylist);
		
		//getting a specific value from array list 
		String str = mylist.get(0);
		System.out.println(str);
		
		//getting a List	
		List<String> subList =  mylistCloned.subList(1, 4);
		System.out.println(subList);
		
		//ArrayList seems to be a very useful class in Java
		//so be sure to do basic operations with it
		
		


	}

}
