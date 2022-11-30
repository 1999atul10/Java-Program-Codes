import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		if(a>=1) {
			System.out.println("number is positive");
		}
		else if(a==0) {
			System.out.println("number is zero");
		}
		else {
			System.out.println("number is negative");
		}
	}
	
}
