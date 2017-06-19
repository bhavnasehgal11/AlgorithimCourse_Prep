import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
    static long get_fibonacci_last_digit_fast(int n) {
        // write your code here

        long[] f = new long[(int) (n+1)];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2;i<=n;i++ ){
            f[i] = (f[i-1]+f[i-2])%10;
        }

        return f[n];
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int c = getFibonacciLastDigitNaive(n);
        long c = get_fibonacci_last_digit_fast(n);
        System.out.println(c);
       // System.out.println(d);
    }
}

