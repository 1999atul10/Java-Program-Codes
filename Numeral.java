import java.util.Scanner;

public class Numeral {
    static int num1 = 0, num2 = 0;
    static Scanner sc = new Scanner(System.in);

    static void displayNums() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    static void sumNums() {
        System.out.println("The sum of 2 numbers is: " + (num1 + num2));
    }


    static void averageNums() {
        System.out.println("The average of 2 numbers is: " + ((num1 + num2) / 2));
    }

    static void maxNums() {
        if (num1 > num2)
            System.out.println("The max number is: " + num1);
        else
            System.out.println("The max number is: " + num2);
    }

    static void minNums() {
        if (num1 < num2)
            System.out.println("The min number is: " + num1);
        else
            System.out.println("The min number is: " + num2);
    }

    public static void main(String[] args) {
        NumPlay subObj = new NumPlay();

        System.out.println("Enter a num1: ");
        num1 = sc.nextInt();
        System.out.println("\nEnter a num2: ");
        num2 = sc.nextInt();

        while (true) {
            System.out.println(subObj.getMenu());
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayNums();
                    break;
                case 2:
                    sumNums();
                    break;
                case 3:
                    averageNums();
                    break;
                case 4:
                    maxNums();
                    break;
                case 5:
                    minNums();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class NumPlay {
    public String getMenu() {
        return "1. display numbers entered \n" +
                "2. sum of the numbers \n" +
                "3. average of the numbers \n" +
                "4. maximum of the numbers \n" +
                "5. minimum of the numbers \n" +
                "0. Exit Program \n" +
                "   Enter your choice \n";
    }
}
