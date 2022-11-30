import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class threeSum {
    public static void main(String args[]) {
        List<List<Integer>> result = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < size; i++) {
            int low = i + 1;
            int high = size - 1;
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            while (low < high) {
                int sum = array[i] + array[low] + array[high];
                if (sum == 0) {
                    result.add(Arrays.asList(array[i], array[low], array[high]));
                }
                if (sum > 0) {
                    high--;

                } else {
                    low++;

                }

            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        sc.close();
    }

}

