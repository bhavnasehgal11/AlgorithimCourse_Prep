package Assingement1;

import java.util.HashMap;
import java.util.Set;

public class MaximumOccChar {

	public void countOccurrence(String str){
	    char[] arr = str.toCharArray();
	    HashMap<Character, Integer> map = new HashMap<>();
	    int max = 0;

	    for (char ch : arr) {
	        if(ch == ' '){
	            continue;
	        }
	        if (map.containsKey(ch)) {
	            map.put(ch, map.get(ch) + 1);
	        } else {
	            map.put(ch, 1);
	        }
	    }

	    Set<Character> set = map.keySet();

	    for (char c : set) {
	        if (max == 0 || map.get(c) > max) {
	            max = map.get(c);
	        }
	    }

	    for (Character o : map.keySet()) {
	        if (map.get(o).equals(max)) {
	            System.out.println(o);
	        }
	    }
	    System.out.println("");
	}

	public static void main(String[] args) {
		MaximumOccChar ho = new MaximumOccChar();
	    ho.countOccurrence("book");
	    ho.countOccurrence("abc");
	    ho.countOccurrence("324444422");
	    ho.countOccurrence("abc aa");
	    ho.countOccurrence(" ");
	}

}
