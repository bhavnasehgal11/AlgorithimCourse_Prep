import java.util.Scanner;

public class Change {
    private static int getChange(int m){
    	int dimes, nickels, pennies;
    	dimes = (int) (m / 10);  
    	m %= 10;
        nickels = (int) (m / 5);
        m %= 5;
        pennies = (int) (m / 1);
        m %= 1;
        return dimes+nickels+pennies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

