//Program for implememting fabonacci using recursion.
import java.util.Scanner;

public class Fabonacci_recursion {
  static int n1 = 0;
  static int n2 = 1;
  static int n3 = 0;

  static void fibonacci_number(int count) {
    if (count == 0) {
      return;
    } else {
      n3 = n1 + n2;
      System.out.print(" "+n3);
      n1 = n2;
      n2 = n3;
      fibonacci_number(count - 1);

    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    System.out.print(" "+n1);
    System.out.print(" "+n2);
    fibonacci_number(num);
  }
}