package Assingement1;

public class Reversewords {

	public static void main(String[] args) {
		String str = "i'll like this program  very much";
		  char[] s = str.toCharArray();
		  reverseWords(s);
		  System.out.println(s);
	}
	public static void reverseWords(char[] s) {
	       reverse(s, 0, s.length - 1);
	       int start = 0;
	       //System.out.println(s);
	       for (int i = 0; i < s.length; i++) {
	    	   if (s[i] == ' ') {
	    		   reverse(s, start, i - 1);
	    		   start = i + 1;
	    		   //System.out.println(s);
	    	   }
	       }
	       reverse(s, start, s.length - 1);
	       //System.out.println(s);
	}
	 
	public static void reverse(char[] s, int start, int end) {
	    while (start < end) {
	        char temp = s[start];
	        s[start] = s[end];
	        s[end] = temp;
	        start++;
	        end--;
	    } 
	}
}
