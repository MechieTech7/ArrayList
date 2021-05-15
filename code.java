
import java.util.ArrayList;
public class ArrayList1{
	
	 public static void main(String args[])
	 {
		 
	    Training object1= new Training();
	    object1.addToMylist("Anu");
	    System.out.println(object1.isItemPresent("Anu"));
	 
	     
		 ArrayList<String> obj = new ArrayList<String>();

	      /*This is how we add elements to an ArrayList*/
	      obj.add("Anu");
	      obj.add("Harshini");
	      obj.add("Chaaru");
	      obj.add("Surya");
	      obj.add("Andavar");

	      // Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      /* Add element at the given index
	       * obj.add(0, "Rahul") - Adding element "Rahul" at first position
	       * obj.add(1, "Jayashree") - Adding element "Jayashree" at second position
	       */
	      obj.add(0, "Rahul");
	      obj.add(1, "Jayashree");

	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList like this
	      obj.remove("Chaaru"); //Removes "Chaaru" from ArrayList
	      obj.remove("Harshini"); //Removes "Harshini" from ArrayList

	      // Displaying elements
	      System.out.println("ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove element from the specified index
	      obj.remove(1); //Removes Second element from the List

	      // Displaying elements
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	 }    
	      
	}
