package bank.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import bank.data.BankAccount;

public class BankService {
    private static ArrayList<BankAccount> punjab = new ArrayList<>();

    public int getAccountNumber(Scanner input) {
        try {
            System.out.println("  aapka account number kya hai  ");
            int accountNumber = input.nextInt();
            input.nextLine();
            return accountNumber;
        } catch (Exception e) {
            System.out.println(" there is show account number ......");
            return 0;

        }
    }

    public void setupBankLibrary() {
    }

    public int createAccount(String name) {
        BankAccount account = new BankAccount();
        account.customer = name;
        punjab.add(account);
   
        return punjab.size();
    }

    public void deposit(int accountNumber, float depositAmount) {
        try {
            BankAccount account = punjab.get(accountNumber - 1);
            if (account != null) {
                account.deposit(depositAmount);
            } else {
                System.out.println("Account does not exist.");
            }

        } catch (Exception e) {

            System.out.println("Sorr! we are unable o ge our accoun deails. " + e.getMessage());

        }
    }

    public void withdraw(int accountNumber, float withdrawAmount) {
        try {
            BankAccount account = punjab.get(accountNumber - 1);
            if (account != null) {
                account.withdraw(withdrawAmount);
            } else {
                System.out.println("Account does not exist.");
            }

        } catch (Exception e) {
            System.out.println("Sorr! we are unable o ge our accoun deails. " + e.getMessage());

        }
    }

    public float showBalance(int accountNumber) {
        try {

            BankAccount account = punjab.get(accountNumber - 1);
            if (account != null) {
                return account.showBalance();
            } else {
                System.out.println("Account does not exist.");
            }
        } catch (Exception e) {
            System.out.println("  un definde ");
        }
        return 0;

    }

    public void printPassbook(int accountNumber) {
        try {

            BankAccount account = punjab.get(accountNumber - 1);
            if (account != null) {
                account.printPassbook();
            } else {
                System.out.println("Account does not exist.");
            }
        } catch (Exception e) {
            System.out.println("  undefined");
        }

    }

    public void downloadStatement(int accountNumber) {
        try {

            BankAccount account = punjab.get(accountNumber - 1);
            if (account != null) {
                account.downloadStatement();
            } else {
                System.out.println("Account does not exist.");
            }
        } catch (Exception e) {
            System.out.println("  undefined");
        }
    }

}
