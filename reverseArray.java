//program for implementing reverse of the array.
import java.util.Scanner;

public class reverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int array[];
        array = new int[n];
        int temp[] = new int[n];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        while ((i < n) || (j == 0)) {
            temp[i] = array[j];
            i += 1;
            j--;
        }
        for (int z = 0; z < n; z++) {
            System.out.println(" "+temp[z]+" ");
        }

    }

}
