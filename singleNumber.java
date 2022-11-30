import java.util.Scanner;

public class singleNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Entered Elements in the array");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        int[] count_array = new int[size];
        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;

                }
                count_array[i] = count;

            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Count array= " + count_array[i]);
        }
        for (int i = 0; i < size; i++) {
            if (count_array[i] == 1) {
                System.out.println(" " + array[i]);
            }
        }
    }

}
