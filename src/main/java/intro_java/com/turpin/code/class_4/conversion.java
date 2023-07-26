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

class Conversion {
	/**
	 * the conversions class creates a string array and then converts it to
	 * an List and prints the resulting List
	 */
	public void change()
	{
		//declare string array
		String[] arr = {"one", "two", "three"};
		//converts array to string list
		List<String> convert = Arrays.asList(arr);
		//print
		System.out.println(convert);
	}	
}