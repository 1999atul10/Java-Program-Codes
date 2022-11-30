import java.util.*;

public class twoSum {

    public static void main(String args[]) {
        int[] array = new int[5];
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Entered Elements are");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);

        }
        System.out.println("Enter the target value");
        target = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {

                if (array[i] + array[j] == target) {
                    System.out.println(" " + i);
                    break;

                }

            }

        }
        sc.close();

    }
}

