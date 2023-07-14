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
public class exercises_2 {
	public static void main(String[] args) {
		count();
	}
	//prints out 1-10
	public static void count() {
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		backwards();
	}
	//prints out 10-1
	public static void backwards() {
		System.out.println(" ");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);	
		}
		even();
	}
	// prints out all even numbers from 0-20
	public static void even() {
		System.out.println(" ");
		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);	
		}
	}
}