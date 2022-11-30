import java.util.Scanner;

public class bestTime120
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[]prices=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            prices[i]=sc.nextInt();
        }
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int profit1=prices[i]-prices[j];
                if(profit1>profit)
                {
                    profit=profit1;
                }
            }
            
        }
        System.out.println("Profit= "+profit);

}


    }