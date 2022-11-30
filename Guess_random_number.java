//Mini Project
import javax.sound.sampled.SourceDataLine;

import java.util.*;

public class Guess_random_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1-100");
        int guess_number = sc.nextInt();
        int mynumber = (int) (Math.random() * 100);
        if (guess_number > mynumber) {
            System.out.println("The number is too large");

        }
        if (guess_number < mynumber) {
            System.out.println("The number is too short");

        } else {
            System.out.println("Congrats You guess the right number");

        }
        System.out.println("The right answer is=" + mynumber);

    }

}
