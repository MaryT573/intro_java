package intro_java.com.turpin.code.class_4;

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

class exercise_4 {
	/**
	 * Instantiates the instances of States, People, and Conversion and runs their 
	 * methods
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiates states and people and calls their methods
		States commonwealth = new States();
		People persons = new People();
		Conversion convert = new Conversion();
		commonwealth.ordered();
		commonwealth.reversed();
		persons.random_order();
		convert.change();
	}
}

