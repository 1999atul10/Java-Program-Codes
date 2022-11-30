//A leetcode program for implementing the concept of palindrome;
import java.util.Scanner;

public class LeetCode_Palindrome {
    static boolean palindrome(int x) {
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;

        }
        System.out.println("temp=" + temp);
        if (temp == rev) {
            return true;
        } else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The number is" + palindrome(n));
        sc.close();

    }

}
