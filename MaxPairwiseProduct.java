import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
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
    
    static long MaxPairwiseProductFast(int[] numbers) {
    	  int n = numbers.length;

    	  int max_index1 = -1;
    	  for (int i = 0; i < n; ++i)
    	    if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
    	      max_index1 = i;

    	  int max_index2 = -1;
    	  for (int j = 0; j < n; ++j)
    	    if ((numbers[j] != numbers[max_index1]) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
    	      max_index2 = j;

    	  return (Long.valueOf(numbers[max_index1]) * Long.valueOf(numbers[max_index2]));
    	}
    
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        //long result1 = getMaxPairwiseProduct(numbers);
        long result2 = MaxPairwiseProductFast(numbers);
        //System.out.println(result1);
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