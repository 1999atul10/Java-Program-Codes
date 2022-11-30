import java.util.Scanner;

public class pivotElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the  number");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println("\n sum=" + sum);
        int leftsum = 0;
        int flag = 0;
        for (int i = 0; i < size; i++) {
            leftsum = leftsum + array[i];
            if (sum == leftsum) {
                System.out.println("Pivot index is" + i);
                flag = 1;
                break;
            }
            sum = sum - array[i];

        }

         

            
        if (flag == 0) {
            System.out.println("pivot index not found");
        }

    }

}
