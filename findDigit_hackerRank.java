import java.util.Scanner;

public class findDigit_hackerRank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            int rem=0;
            try{
            rem= n % 10;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Divide by zero condition");
            }
            if (n % rem == 0) {
                count++;
            }
            n = n / 10;

        }
        System.out.println("Count= " + count);
        sc.close();

    }

}
