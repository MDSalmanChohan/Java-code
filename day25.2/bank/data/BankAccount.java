package bank.data;

public class BankAccount {
     public String customer = "";
   public static float balance = 0;

	public    void deposit(float depositAmount) {
		if (depositAmount > 500) {
			System.out.println("Sorry you can not deposit more than 500");
		} else if (depositAmount < 10) {
			System.out.println("Sorry you  can not deposit less than " + depositAmount);
		} else {
			balance = balance + depositAmount;
			System.out.println(depositAmount + " rs added");

		   //input.nextLine();
		}

	}

	public    void withdraw(float withdrawAmount) {
		if (withdrawAmount > 500) {
			System.out.println("Sorry you can not withdraw more than 500");
		} else if (withdrawAmount < 13) {
			System.out.println("Sorry you can not withdraw less then " + withdrawAmount);
		} else   if (balance<=withdrawAmount) {
			System.out.println(" your shortly ammount " + balance);
			
		} else {
			balance = balance - withdrawAmount;
			System.out.println(withdrawAmount + "rs removed");
		}
	}

	

	

	public float showBalance() {
		return balance;
	}

    public void printBankCard() {
    }


    
}
