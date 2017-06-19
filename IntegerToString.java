package Assingement1;

public class IntegerToString {
	
	public static void main(String[] args) {
		Combinations obj =  new Combinations("124");
		// TODO Auto-generated method stub
		//System.out.println(intToStr(1));
		//System.out.println(intToStr(-1));
		//System.out.println(intToStr(0));
		//System.out.println(intToStr(123));
		
		obj.combine();
	}
	public static final int MAX_DIGITS = 10; 
	public static String intToStr( int num ){
		int i = 0;
		boolean isNeg = false;
		char[] temp = new char[ MAX_DIGITS + 1 ];
		if( num < 0 ){
			num = -num;
			isNeg = true;
			}
		do {
			temp[i++] = (char)((num % 10) + '0');
			num /= 10;
			} while( num != 0 );
			StringBuilder b = new StringBuilder();
			if( isNeg )
				b.append( '-' );
			while( i > 0 ){
				b.append( temp[--i] );
			}
			return b.toString();
	}
}
