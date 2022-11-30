import java.util.Arrays;

public class ArrayFunctions {

    // a.
    void printToString(int[] arr) {
        System.out.println("\n\nArrays.toString() " + Arrays.toString(arr));
    }

    // b.
    void printCopyOf(int[] arr) {
        int length = arr.length;
        System.out.println("Array before copyOf() " + Arrays.toString(arr) + "\n");

        // Creating new length
        Arrays.copyOf(arr, 7);
        for (int i = length; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        System.out.println("Array after copyOf() " + Arrays.toString(arr) + "\n");
    }

    // c.
    void printSort(int[] arr) {
        System.out.println("Array before sort() " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort() " + Arrays.toString(arr));
    }

    // d.
    void doBinarySearch(int[] arr) {
        int targetElement = 69;
        int index = Arrays.binarySearch(arr, targetElement);
        System.out.println("Target index in array is : " + index + "\n");
    }

    // e.
    void doFill(int[] arr) {
        System.out.println("Array before fill() " + Arrays.toString(arr));
        Arrays.fill(arr, 69);
        System.out.println("Array after fill() " + Arrays.toString(arr) + "\n");
    }

    // f.
    void findEquals() {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int diffArr[] = { 5, 2, 3, 1 };
        System.out.println("Is both array equals(arr1, diffArr): " + Arrays.equals(arr1, diffArr));
        System.out.println("Is both array equals(diffArr, diffArr): " + Arrays.equals(diffArr, diffArr));
    }

    public static void main(String[] args) {
        ArrayFunctions arrObj = new ArrayFunctions();
        int arr[] = { 56, 32, 98, 54, 39, 15, 69, 54, 78, 34 };
        arrObj.printToString(arr);
        arrObj.printCopyOf(arr);
        arrObj.printSort(arr);
        arrObj.doBinarySearch(arr);
        arrObj.doFill(arr);
        arrObj.findEquals();
    }
}
