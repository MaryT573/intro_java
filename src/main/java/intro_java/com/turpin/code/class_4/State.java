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

class State {
	/**
	 * The States class creates a treemap of states and state codes, in reversed it uses
	 * a NavigableMap map to reverse the og treemap. Ordered calls the ordered map and prints
	 * it
	 * @return Treemap <string, string>
	 */
	public TreeMap<String, String> create()
	{
		// create arrays for states and state codes
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
		// create empty treemap
		TreeMap<String, String> s = new TreeMap<String, String>();
		// loops through the arrays and puts them in the map
		while (counter < 50) {
			s.put(CODES[counter], NAMES[counter]);
			counter++;
		}
		//returns map
		return s;
	}
	
	public void reversed() 
	{
		//creates new treemap
		TreeMap<String, String> s = create();
		//creates navigable map and calls descending map which reverses the og map
		NavigableMap <String, String> nmap = s.descendingMap();
		// prints
		System.out.println(nmap);
	}
	
	public void ordered()
	{
		//calls ordered map and prints
		TreeMap<String, String> s = create();
		System.out.println(s);
	}
}