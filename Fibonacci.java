import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    long a=1, b=0, p=0, q=1, prev_a, prev_p = 0;
	while(n>0) {
		if (n%2 == 0) {
			prev_p = p;
			p = p*p + q*q;
			q = 2*prev_p*q + q*q;
			n /= 2;
		} else {
			prev_a = a;
			a = b*q + a*q + a*p;
			b = b*p + prev_a*q;
			n -= 1;
		}
	}
	return b;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
