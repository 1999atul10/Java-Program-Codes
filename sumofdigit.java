import java.util.Scanner;

public class sumofdigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev+rem;
            n=n/10;

        }
        System.out.println("Sum of digit= "+rev);
    }
    
}
