package intro_java.com.turpin.code;
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
public class exercise_3 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i += 1) {
			arr[i] =  (int)(Math.random() * 100);
			System.out.println(String.valueOf(i) + " " + arr[i]);
			
		}
		
	}

}