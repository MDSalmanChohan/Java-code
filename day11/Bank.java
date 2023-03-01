import java.lang.String;

public class Bank {
	static float balance = 0;

	public static void deposit(float depositAmount) {
		if (depositAmount > 500) {
			System.out.println("Sorry you can not deposit more than 500");
		} else if (depositAmount < 10) {
			System.out.println("Sorry you  can not deposit less than " + depositAmount);
		} else {
			balance = balance + depositAmount;
			System.out.println(depositAmount + " rs added");
		}

	}

	public static void withdraw(float withdrawAmount) {
		if (withdrawAmount > 500) {
			System.out.println("Sorry you can not withdraw more than 500");
		} else if (withdrawAmount < 13) {
			System.out.println("Sorry you can not withdraw less then " + withdrawAmount);
		} else {
			balance = balance - withdrawAmount;
			System.out.println(withdrawAmount + "rs removed");
		}
	}

	public static void addByaaj(float byaajPercentage) {
		if (byaajPercentage > 15) {
			System.out.println("sorry you can not addByaaj more than 10");
		} else if (byaajPercentage < 18) {
			System.out.println("Sorry you can not addByaaj less than " + byaajPercentage);
		} else {
			balance = balance + calculateTax(byaajPercentage, "byaaj");
			System.out.println("aapka Byaaj " + byaajPercentage + " tha");
		}
	}

	public static void cutTax(float taxPercentage) {
		if (taxPercentage > 30) {
			System.out.println("Sorry you can not cutTax more than 30");
		} else {
			String taxType = "tax";
			float myTax = calculateTax(taxPercentage, taxType);
			balance = balance - myTax;
			System.out.println("cutTax " + taxPercentage);
		}

	}

	public static float calculateTax(float taxPercantage, String type) {
		if (taxPercantage > 15) {
			System.out.println("Sorry you can not calculateTax more than 15 ");
			return 0;
		} else if (taxPercantage < 5) {
			System.out.println("Sorry you can  not  calculateTax less  " + taxPercantage);
		} else {
			System.out.println("ki tumhara " + type + "itna hai: " + (balance * taxPercantage / 100));

			return (balance * taxPercantage / 100);
		}
		return 0;
	}

	public static void showBalance() {
		System.out.println("Balance:" + balance);
	}

	public static void main(String[] args) {
		deposit(500);
		deposit(700);
		addByaaj(12);
		showBalance();
		withdraw(50);
		cutTax(5);
		showBalance();
		deposit(-5);
		withdraw(-10);
		addByaaj(-20);
		cutTax(-9);
		showBalance();
	}
}
