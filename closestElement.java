import java.util.Scanner;

public class closestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element in the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Entred element");
        for (int i = 0; i < size; i++) {
            System.out.println("Array= " + array[i]);

        }
        System.out.println("ENter the element to be nearby");
        int x = sc.nextInt();
        System.out.println("ENter the k");
        int k = sc.nextInt();
        int count = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                index = i;
            }

        }
        int lowest=index-1;
        

        }
    }