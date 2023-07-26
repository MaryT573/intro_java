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

class People {
	/**
	 * The People class creates a list of people, shuffles, and then prints them
	 * @return
	 */
	public List<String> create() 
	{
		// create list string and add people
		List<String> people = new ArrayList<>();
		people.add("First Name: John, Last Name: Smith, ID: 5");
		people.add("First Name: Jane, Last Name: Doe, ID: 353");
		people.add("First Name: Richard, Last Name: Feynman, ID: 956");
		people.add("First Name: Carrie, Last Name: Fisher, ID: 4");
		return people;
	}
	
	public void random_order()
	{
		// creates people list
		List<String> people = create();
		// shuffles
		Collections.shuffle(people);
		//prints
		System.out.println(people);
	}	
}