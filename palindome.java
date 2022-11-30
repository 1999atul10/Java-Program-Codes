import java.util.ArrayList;
import java.util.Scanner;
import java.nio.channels.NetworkChannel;
import java.util.*;

public class palindome {
    public static void main(String args[]) {
        List<Character> list = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Entered String are:-");
        System.out.println(" " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122
                    || str.charAt(i) >= 48 && str.charAt(i) <= 58) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    char Charac = str.charAt(i);
                    int ascii = (int) Charac;
                    ascii = ascii + 32;
                    char convertedChar = (char) ascii;
                    list.add(convertedChar);
                } else {

                    list.add(str.charAt(i));
                }
            }

        }
        int first = 0;
        int last = list.size() - 1;
        int count = 0;
        while (first < last) {
            if (list.get(first) == list.get(last)) {
                first++;
                last--;
                count++;
                continue;
            } else {
                System.out.println("not a palinfrome");
                break;
            }

        }
        int mid = (list.size() / 2);
        if (mid == (count - 1)) {
            if (count == mid + 1) {
                System.out.println("Palindrome");
            }

        }
        if (count == mid) {
            System.out.println("Palindrome");
        }

    }
}
