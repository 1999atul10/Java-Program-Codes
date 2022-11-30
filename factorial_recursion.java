
//program for implementing factorial using recursion.
import java.util.*;

public class factorial_recursion {

    static int fact(int x) {
        if (x == 1) {
            return 1;

        } else {
            return (x * fact(x - 1));

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which u want to find the factorial");
        int n = sc.nextInt();
        System.out.println("\nThe factorial of a number is " + fact(n));

    }
}
/*
 * public class factorial {
 * int fact(int x) {
 * if (x == 1) {
 * return 1;
 * 
 * } else {
 * return (x * fact(x - 1));
 * 
 * }
 * 
 * }
 * }
 * 
 * public class factorial_recursion {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("Enter the number of which u want to find the factorial");
 * int n=sc.nextInt();
 * System.out.println("\nThe factorial of a number is "+fact(n));
 * 
 * }
 * }
 */