import java.lang.String;
import java.util.Scanner;

public class Jaifels {
	public static void main(String[] args) {
		int age;

		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		if (age > 56) {
			System.out.println("you are experienced");

		} else if (age > 46) {
			System.out.println(" you are semi-experienced");
		} else if (age > 36) {
			System.out.println("you are semi semi experienced ");
		} else {
			System.out.println("you are not experienced ");
		}
		if (age > 2) {
			System.out.println("you are not  a baby  ");
		}
	}
}
