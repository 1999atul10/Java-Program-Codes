import java.util.Scanner;

public class armstrongNCR {
    public static int countNum(int n)
    {
        int count=0;

        if(n<=0)
        {
            return 0;
        }
        else{
            while(n>0)
            {
                count++;
                n=n/10;

            }
        }
        return count;
    }
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    System.out.println(" "+countNum(n)); 
    int pow=countNum(n);
    int temp=n;
    int sum=0;
    while(n>0)
    {
        int rem=n%10;
        int powerOfParicularNumber=1;
       for(int i=0;i<pow;i++)
       {
        powerOfParicularNumber=powerOfParicularNumber*rem;
        System.out.println("rem= "+powerOfParicularNumber);
       }
       sum=sum+powerOfParicularNumber;
        n=n/10;

    }
    if(temp==sum)
    {
        System.out.println("Number is Armstrong number");
    }
    else{
        System.out.println("Number is not a armstrong number");
    }

}
    
}
