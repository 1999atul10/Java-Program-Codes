import java.util.*;

public class singleNumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] new_array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(" Enter");
            int x = array[i];
            System.out.println("x="+x);
            int low = 0;
            System.out.println("low="+low);
            int high = size-1;
            System.out.println("high= "+high);


            int mid = (low + high) / 2;


            while (low < high) {
                int count = 0;

                if (mid == x) {
                    System.out.println("found");
                    count++;
                    new_array[i] = count;
                    break;

                } else if (x > mid) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
                mid = (low + high) / 2;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println("count array" + new_array[i]);
        }
    }
}
