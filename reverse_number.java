//program for Reverse a number 
import java.util.Scanner;

public class reverse_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the reverse");
        int num = sc.nextInt();
        int rev=0;
        while (num > 0) {
            int rem = num % 10;
             rev = (rev * 10) + rem;
            num = num / 10;

        }
        System.out.println("Reverse of a number is=" +rev);
    }

}
