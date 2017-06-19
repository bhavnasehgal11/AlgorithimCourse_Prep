package javaprepration;
//check two given words are palindrome
public class Palindrome {
	boolean checkPalindrome(String str1, String str2){
		char[] content1 = str1.toCharArray();
		char[] content2 = str2.toCharArray();
		if(content1.length!=content2.length){
			return false;
		}
		java.util.Arrays.sort(content1);
		java.util.Arrays.sort(content2);
		System.out.println(content1);
		System.out.println(content2);
		if(new String(content1).equals(new String(content2))){
			return true;
		}else{
			return false;
		}
	}
// Check given string has palindrome
	@SuppressWarnings("unused")
	boolean checkPalindromeWord(String Str){
		int strLength = Str.length();
		//boolean status = false;
			for(int i = 0 ; i<strLength; i++){
				if(Str.charAt(i)!=Str.charAt(strLength-1)){
					return false;
				}else{
					return true;
					
				}
			}
		return false;
	}

}
