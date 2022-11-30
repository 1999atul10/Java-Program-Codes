//Program for Finding palindrome of a number.
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of which You want to find the palindrome");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;

        }
        System.out.println("rev=" + rev);
        System.out.println("temp=" + temp);

        if (temp == rev) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }

}
