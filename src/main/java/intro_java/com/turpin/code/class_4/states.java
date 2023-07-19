package intro_java.com.turpin.code.class_4;

import java.util.*;


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

class States {
	public TreeMap<String, String> create()
	{
		final String[] NAMES = {
	            "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
	            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
	            "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
	            "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
	            "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
	        };
		
		final String[] CODES = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", 
				"MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", 
				"TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"
		};
		
		int counter = 0;
		
		TreeMap<String, String> s = new TreeMap<String, String>();
		
		while (counter < 50) {
			s.put(CODES[counter], NAMES[counter]);
			counter++;
		}
		
		return s;
	}
	
	public void reversed() 
	{
		TreeMap<String, String> s = create();
		
		NavigableMap <String, String> nmap = s.descendingMap();
		
		System.out.println(nmap);
	}
	
	public void ordered()
	{
		TreeMap<String, String> s = create();
		System.out.println(s);
	}
}