package intro_java.com.turpin.code.class_4;

/****************************************************************************
 * <b>Title:</b> Test.java
 * <b>Project:</b> intro_java
 * <b>Description:</b> CHANGE ME!!
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
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiates states and people and calls their methods
		States states = new States();
		People people = new People();
		states.ordered();
		states.reversed();
		people.random_order();
	}
}

