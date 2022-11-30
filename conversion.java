import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.*;

public class conversion {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("Entered Number is:- " + num);
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> new_list = new ArrayList<Integer>();
        int temp = num;
        int num1=num;
        int rev=0;
        while(num1!=0)
        {
            int rem=num1%10;
            rev=(rev*10)+rem;
            num1=num1/10;
        }
        while (rev != 0) {
            int rem = rev % 10;
            number.add(rem);
            rev = rev / 10;
        }
        /*int d = 0;
        while (temp != 0) {
            int rem = temp % 10;
            d = (d * 10) + rem;
            if(d>9&&d<27)
            number.add(d);
            temp = temp / 10;

        }*/
        

        System.out.println("Number array length" + number.size());
        System.out.println("elements in the number list=");
        for (int i = 0; i < number.size(); i++) {
            System.out.println(" " + number.get(i));

        }
        for (int i = 0; i < number.size(); i++) {
            System.out.println(list.get(number.get(i)));

        }

    }

}
