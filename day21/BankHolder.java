public class BankHolder {
    String customer = "";
    static float balance = 0;

	public  void deposit(float depositAmount) {
		if (depositAmount > 500) {
			System.out.println("Sorry you can not deposit more than 500");
		} else if (depositAmount < 10) {
			System.out.println("Sorry you  can not deposit less than " + depositAmount);
		} else {
			balance = balance + depositAmount;
			System.out.println(depositAmount + " rs added");
		}

	}

	public void withdraw(float withdrawAmount) {
		if (withdrawAmount > 500) {
			System.out.println("Sorry you can not withdraw more than 500");
		} else if (withdrawAmount < 13) {
			System.out.println("Sorry you can not withdraw less then " + withdrawAmount);
		} else {
			balance = balance - withdrawAmount;
			System.out.println(withdrawAmount + "rs removed");
		}
	}

	
//Salman khan Dabangg wanded human being human 
	

	public void showBalance() {
		System.out.println("Balance:" + balance);
	}

    public void printBankCard() {
    }

    
}
