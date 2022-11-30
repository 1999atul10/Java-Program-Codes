//Program for implementing the concept of array.
import java.util.Scanner;

public class Array {
    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the number in the Array");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("\nElement in the array are=" + array[i]);
        }
    }

}
