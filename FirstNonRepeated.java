package Assingement1;

import java.util.HashMap;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = firstNonRepeated("book");
		System.out.println(s);

	}
	public static String firstNonRepeated( String str ){ 
		HashMap<Integer,Object> charHash = new HashMap<Integer,Object>();
		Object seenOnce = new Object();
		Object seenMultiple = new Object(); 
		Object seen = new Object();;	
		int i;
		int length = str.length();
		// Scan str, building hash table
		for (i = 0; i < length; ) { //increment intentionally omitted
			int cp = str.codePointAt(i);
			i += Character.charCount(cp); //increment based on code point 
			seen = charHash.get(cp);
			if (seen == null) { // not present
				charHash.put(cp, seenOnce);
				} else {
					if (seen == seenOnce) {
						charHash.put(cp, seenMultiple);
					}
				}
			}
		// Search hash table in order of str 
			for (i = 0; i < length; ) {
					final int cp = str.codePointAt(i); i += Character.charCount(cp);
					if (charHash.get(cp) == seenOnce) {
						//System.out.println(cp);
						return new String(Character.toChars(cp));
						}
					}
	return null; 
	}
}
