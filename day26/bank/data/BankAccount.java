package bank.data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;

class PassbookEntry 
{
	 float amount;
	 LocalTime time;
	 LocalDate date;


	public PassbookEntry(float pamount) {
		this.amount = pamount;
		time = LocalTime.now();
		date = LocalDate.now();
	}
	
}

public class BankAccount {

	public String customer = "";
   private float balance = 0;
   private ArrayList<PassbookEntry> passbookEntry = new ArrayList<>();




	public void deposit(float depositAmount) {
		if (depositAmount > 500) {
			System.out.println("Sorry you can not deposit more than 500");
		} else if (depositAmount < 10) {
			System.out.println("Sorry you  can not deposit less than " + depositAmount);
		} else {
			balance = balance + depositAmount;
			System.out.println(depositAmount + " rs added");
			
			PassbookEntry entry = new PassbookEntry(depositAmount);
			passbookEntry.add(entry);

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
			PassbookEntry entry = new PassbookEntry(withdrawAmount*-1);
			passbookEntry.add(entry);
		}
	}

	

	

	public float showBalance() {
		return balance;
	}

    public void printPassbook() {
		System.out.println("Your passbook details:");
		for (PassbookEntry entry : passbookEntry) {
			System.out.println("Money: " + entry.date +  "    "+entry.time +":"+ "\t"+entry.amount);
		}
    }


    
}
