import java.util.Scanner;

public class longestCommonPrefix_leetCode {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the prefixing array");
        int n=sc.nextInt();
        String[]prefix=new String[n];
        System.out.println("Enter the words in the array");
        for(int i=0;i<n;i++)
        {
            prefix[i]=sc.next();
        }
        String temp;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (prefix[i].compareTo(prefix[j])>0) 
                {
                    temp = prefix[i];
                    prefix[i] = prefix[j];
                    prefix[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(prefix[i]);
        }
    }
    
}