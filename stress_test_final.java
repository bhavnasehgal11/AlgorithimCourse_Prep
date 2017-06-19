import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class stress_test_final {

	static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (Long.valueOf(numbers[i]) * Long.valueOf(numbers[j]) > result) {
                    result = Long.valueOf(numbers[i]) * Long.valueOf(numbers[j]);
                }
            }
        }
        return result;
    }
    
    static long getMaxPairwiseProductFast(int[] numbers) {
    	  int n = numbers.length;

    	  int max_index1 = -1;
    	  for (int i = 0; i < n; ++i)
    	    if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
    	      max_index1 = i;

    	  int max_index2 = -1;
    	  for (int j = 0; j < n; ++j)
    	    if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
    	      max_index2 = j;

    	  return (Long.valueOf(numbers[max_index1]) * Long.valueOf(numbers[max_index2]));
    	}
    
    public static void main(String[] args) {
//    	Random random = new Random();
//        // Stress testing
//        while(true) {
//            int n = random.nextInt(10 - 2 + 1) + 2;
//            System.out.println(n);
//            int[] tests = new int[n];
//            for(int i = 0; i < n; i++) {
//                tests[i] = random.nextInt(100000 + 1);
//                System.out.print(tests[i] + " ");
//            }
//            System.out.println();
//            long res1 = getMaxPairwiseProduct(tests);
//            long res2 = getMaxPairwiseProductFast(tests);
//        if (res1 != res2) {
//        	System.out.println("Wrong answer: "+ res1 +"" + res2);
//          break;
//        }
//        else {
//        	System.out.println("OK");
//        }
//      }
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        long result2 = getMaxPairwiseProductFast(numbers);
        System.out.println(result2);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }


	}

}
