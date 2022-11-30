public class Matrix {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        System.out.print("\n\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;

                }
            }
        }
        System.out.print("\nIdentity Matrix 5x5\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n\n");
    }
}
