
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
import java.util.Scanner;

public class twoSum_leetcode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    System.out.print(i + " ");
                    System.out.print(j + " ");
                }

            }
        }
    }

}
