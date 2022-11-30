//Program for Implementing reverser integer leetcode.
import java.util.Scanner;

public class rev_leetcode {
    static int reverse(int x) {
        long k = x;
        boolean isNegtive = false;
        if (k < 0) {
            k = 0 - k;
            isNegtive = true;
        }

        long result = 0;
        while (k != 0) {
            result *= 10;
            result += k % 10;
            k /= 10;
        }

        if (result > Integer.MAX_VALUE)
            return 0;
        return isNegtive ? 0 - ((int) result) : (int) result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int numm = sc.nextInt();
        System.out.println(" " + reverse(numm));

    }

}
