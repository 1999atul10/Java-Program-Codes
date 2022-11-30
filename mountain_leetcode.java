import java.util.Scanner;

//Given an array of integers arr, return true if and only if it is a valid mountain array.

//Recall that arr is a mountain array if and only if:

//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

public class mountain_leetcode {
    public boolean mountain(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int left = 0, right = arr.length - 1;
        while ((left + 1 < arr.length - 1) && (arr[left] < arr[left + 1]))
            left++;
        while ((right - 1 > 0) && (arr[right] < arr[right - 1]))
            right--;
        return left == right;

    }
}