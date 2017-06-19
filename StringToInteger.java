package Assingement1;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strToInt("293"));
		System.out.println(strToInt("0"));
		System.out.println(strToInt("-1"));
		System.out.println(strToInt("1"));
	}
	
	public static int strToInt( String str ){
		int i = 0, num = 0;
		boolean isNeg = false;
		int len = str.length();
		if( str.charAt(0) == '-' ){
			isNeg = true;
			i = 1; 
			}
		while( i < len ){ 
			num *= 10;
			num += ( str.charAt(i++) - '0' );
			}
		if( isNeg )
			num = -num;
		return num;
	}
}

