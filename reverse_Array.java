import java.util.*;

public class reverse_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Elements In the array\n");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);

        }
        int last=size-1;

        for(int i=0;i<size/2;i++)
        {
            int temp=array[i];
            array[i]=array[last];
            array[last]=temp;
            last=last-1;
        }

        System.out.println("Array After Rotation");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }

    }
}