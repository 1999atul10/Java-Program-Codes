// import java.util.Scanner;

// public class poweFunction {

//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value");
//         Double value=sc.nextDouble();
//         System.out.println("Enter the power");
//         Double power=sc.nextDouble();
//         if(power<0)
//         {
//             power=(power*(-1));
//         }
//         Double ans=1.0;
//         for(Double i=0.0;i<power;i++)
//         {
//             ans=ans*value;

//         }
//         System.out.println("ans="+ans);
//         sc.close();
//     }
    
// }
import java.util.Scanner;

public class poweFunction {

    public static double myPow(double x, int n) {
        double ans = 1.0;
        for(int i = 0; i<n; i++){
            ans = ans * x;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(myPow(2,10));
    }
}


// class Solution {
//     public double myPow(double x, Long n) {
//                Double result=1.0;
//                    Long new_power=n;
//         if(new_power<0)
//         {
//             new_power=new_power*(-1);
//         }
//         while(new_power>0)
//         {
//             if(new_power%2==1)
//             {
//                 result=result*x;
//                 new_power=new_power-1;
//             }
//             else
//             {
//                 x=x*x;
//                 new_power=new_power/2;
//             }
//         }
//         if(n<0)
//         {
//             result=(Double)1.0/(Double)(result);
//         }
//         return result;

        
//     }
// }
