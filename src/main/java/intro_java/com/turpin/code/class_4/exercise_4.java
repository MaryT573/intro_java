package intro_java.com.turpin.code.class_4;

import java.util.Map;
import java.util.NavigableMap;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.List;
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
	public static void main(String[] args) {
		States states = new States();
		People people = new People();
		states.reverse();
	}
}

class States {
	public Map<String, String> create()
	{
		String[] names = {
	            "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
	            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
	            "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
	            "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
	            "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
	        };
		
		String[] codes = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", 
				"MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", 
				"TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"
		};
		
		int counter = 0;
		
		Map<String, String> s = new LinkedHashMap<String, String>();
		
		while (counter < 50) {
			s.put(codes[counter], names[counter]);
			counter++;
		}
		
		return s;
	}
	
	public void reverse() 
	{
		Map<String, String> s = create();
		System.out.println(s);
		int counter = 49;
		
		Map<String, String> reversed = new LinkedHashMap<String, String>();
		
		
	}
	
	public void reorder()
	{
		
	}
}

class People {
	public void random_order()
	{
		System.out.println("Hello");
	}	
}