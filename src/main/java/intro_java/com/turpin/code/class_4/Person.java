package intro_java.com.turpin.code.class_4;
import java.util.*;

/****************************************************************************
 * <b>Title:</b> Test.java
 * <b>Project:</b> intro_java
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2023
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author MaryT
 * @version 3.x
 * @since Jun 9, 2023
 * <b>updates:</b>
 *  
 ****************************************************************************/

class Person {
	String id;
	String fname;
	String lname;
	/**
	 * The People class creates an arraylist of people, shuffles, and then prints them
	 * @return arraylist strings
	 */
	public ArrayList<String> create() 
	{
		// arrays of names and ids 
		final String[] FNAME = {"John", "Jane", "Richard", "Carrie"};
		final String[] LNAME = {"Smith", "Doe", "Feynman", "Fisher"};
		final String[] ID = {"5", "353", "956", "4"};
		//instantiates list
		ArrayList<String> people = new ArrayList<>();
		// adds people to list
		for (int i = 0; i < FNAME.length; i += 1) {
			people.add("Id: " + ID[i] + " " + "Name: " + FNAME[i] + " " + LNAME[i]);
		}
		// prints unshuffled list
		System.out.println(people);
	
		return people;
	}
	
	public void random_order()
	{
		// creates people list
		ArrayList<String> people = create();
		// shuffles
		Collections.shuffle(people);
		//prints
		System.out.println(people);
	}	
}