// import java.lang.String;
public class Jaif {
	public static void main(String[] args) {

		int age = 18;
		if (age > 18) {
			System.out.println("yes boy you can drive!");

		} else {
			System.out.println("no boy you cannot drive yet! ");

		}
		age = 103;
		if (age > 106) {
			System.out.println(" yes boy u can drive");
		} else {
			System.out.println(" no boe u can not drive");

		}
		int b = 10;
		do {
			System.out.println(b);
			b++;
		} while (b < 5);
		int c = 1;
		do {
			System.out.println(c);
			c++;

		} while (c <= 40);

		for (int i = 10; i >= 10; i--) {
			System.out.println(i);

			for (i = 1; i < 5; i++) {

				if (i == 3) {
					System.out.println("ending da loop");
					continue;

				}
				System.out.println(i);
				System.out.println("java is frustrated language");
				int n = 5;
				for (i = n; i > 0; i--) {
					for (int j = 0; j < i; j++) {
						System.out.print("**");

					}
					System.out.print("\n");
					n = 5;
					for (i = 1; i <= 10; i++) {
						System.out.printf("%d X %d = %d\n", n, i, n * i);
						int[] marks = { 84, 47, 49, 43, 89 };
						for (i = marks.length-1; i >= 0; i--) {
							System.out.println(marks[i]);
						}

						for (int element : marks) {
							System.out.println(element);

						}

					}
				}
				i=6;
			}
		}
	}
}