package intro_java.com.turpin.code;
/****************************************************************************
 * <b>Title:</b> Test.java
 * <b>Project:</b> lib
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
public class exercises {
	public static void main(String[] args) {	
		create();
	}
	// declares primitive vars of each type and then transforms them into 
	// objects in order to print them out in the display method
	public static void create() {
		int x = 42;
		boolean y = true;
		float z = 15;
		double a = 36.8;
		char b = 'f';
		Object[] objects = {x, y, z, a, b};
		for (int i = 0; i < 5; i++) {
			display(objects[i]);
		}
	}
	//prints out vars
	public static void display(Object var) {
		System.out.println(var);
	}
}