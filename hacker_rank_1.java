//Hacker rank program for implementing the concept of input and output
import java.util.*;

public class hacker_rank_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer value");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string value");
        String n=sc.nextLine();
        System.out.println("Enter the double value");
        double dou = sc.nextDouble();
        
        System.out.println(num);
        System.out.println(dou);
        System.out.print(n);
    }

}
/*

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double dou = sc.nextDouble();
        String str = sc.nextLine();
                System.out.println("String: "+str);
                        System.out.println("Double: "+dou);


        System.out.println("Int: "+num);
    }

}
*/
