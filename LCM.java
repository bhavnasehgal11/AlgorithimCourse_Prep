import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  /*lcm(a,b)=a *b/gcd(a,b)*/

  public static long lcm(long a, long b) {
      if (a == 0 || b == 0) {
          return 0;
      }
      return (a * b ) / gcd(a, b);
  }

  public static long gcd(long a, long b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }
	    return a;
	}

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    //System.out.println(lcm_naive(a, b));
    System.out.println(lcm(a, b));
  }
}
