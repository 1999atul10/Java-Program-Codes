//Implementing the the concept of creation of array and sorting of arrays.
import java.util.Scanner;

public class arrayConcept {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter z");
        int z=sc.nextInt();
        while(z!=0){
        System.out.println("Enter the elemets in the arrays");
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                int temp=0;
                if(array[j]<array[i])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<5;i++)
        {
        System.out.print(" "+array[i]);
        }
        System.out.println("Enter the value of z");
    z=sc.nextInt();

    }
    sc.close();
    }
    
    
}
