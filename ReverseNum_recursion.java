//program for reverse a number using recursion. 
import java.util.Scanner;

public class ReverseNum_recursion {
    static int rev = 0;

    public static int reverse(int num) {

        if (num == 0)
            return 1;
        else {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = reverse(num / 10);
            return rev;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enter of which u want to find the reverse");
        int number = sc.nextInt();

        System.out.println("The reverse of the number is = " + reverse(number));

    }
}