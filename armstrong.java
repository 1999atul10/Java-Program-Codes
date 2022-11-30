//Program for implementing the concept of armstrong number;
import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("The number is a armstrong number");
        } else {
            System.out.println("The number is not a armstrong number");
        }
        sc.close();

    }
}
