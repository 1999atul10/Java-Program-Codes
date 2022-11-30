import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter the size of the array 1");
        int size1=sc.nextInt();
        int[]array1=new int[size1];
        System.out.println("Enter the size of the array 2");
        int size2=sc.nextInt();
        int[]array2=new int[size2];
        System.out.println("Enter the elements of array 1");
        for(int i=0;i<size1;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array 2");
        for(int i=0;i<size2;i++)
        {
            array2[i]=sc.nextInt();
        }
        int size=0;
        if(size1>size2)
        {
            size=size1;
        }
        else{
            size=size2;
        }
        for(int i=0;i<size;i++)
        {
            list.add(array1[i]);
            list.add(array2[i]);
        }
        System.out.println(" "+list);
    }
}
