//proram for implenting for each loop (GFG);
import java.util.Scanner;

public class readonlyloop {
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int[]array=new int[n];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<n;i++){
          array[i]=sc.nextInt();
      }
      for(int x:array)
      {
          System.out.println(" "+x);
      }
  }
}
