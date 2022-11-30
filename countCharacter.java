import java.util.Scanner;

public class countCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        str.toLowerCase();
        int[] count_array = new int[str.length()];
        System.out.println("Entered String= " + str);
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            count_array[i] = count;
        }
        for(int i=0;i<count_array.length;i++)
        {
            System.out.println("Count ="+count_array[i]);
        }
        int max = count_array[0];
        int index=0;
        for (int i = 0; i < count_array.length; i++) {
            if (count_array[i] > max) {
                max = count_array[i];
                index=i;
            }

        }
        System.out.println("max= "+max);
        System.out.println("str at 0"+str.charAt(0));

        System.out.println("Character with highest repeation is= " + str.charAt(index));
        sc.close();

    }
}