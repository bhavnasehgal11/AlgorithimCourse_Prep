import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FractionalKnapsack {
    private static Scanner scanner;

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        
        int n = values.length, a;
        Double[] valueByweight = new Double[n];
        
        for (int i = 0; i < n; i++) {
        	valueByweight[i] = (Double) (values[i]*1.0/weights[i]);
        }
        
        Map<Double, Integer[]> map = new HashMap<Double, Integer[]>();
        
        for (int i = 0; i < n; i++) {
            Integer[] temp = new Integer[2];
            temp[0] = values[i];
            temp[1] = weights[i];
            map.put(valueByweight[i], temp);
        }
        
        Map<Double, Integer[]> newMap = new TreeMap<Double, Integer[]>(Collections.reverseOrder());
        newMap.putAll(map);
        
        for (Double key: newMap.keySet()) {
            if (capacity == 0) {
                return value;
            }

            a = (newMap.get(key)[1] > capacity)?capacity:newMap.get(key)[1];
            value = value+a*(newMap.get(key)[0]*1.0/newMap.get(key)[1]);
            capacity = capacity-a;
        }
        
        return value;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        double answer = getOptimalValue(capacity, values, weights);
        System.out.println(String.format("%.4f", answer));

    }
} 
