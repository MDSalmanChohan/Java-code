package bank.webfront;

import java.util.Scanner;

import bank.service.BankService;

public class BankShop {

    private static BankService service = new BankService();

    public static void main(String[] args) {
        service.setupBankLibrary();

        while (true) {

            printSKD();

            Scanner input = new Scanner(System.in);

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Please tell me our name: ");
                String name = input.nextLine();
                int accountNumber = service.createAccount(name);
              
                System.out.println("Congrats! " + name + ", our account is opened. Ac. no: " + accountNumber);
              

            } else if (choice == 2) {
                int accountNumber = service.getAccountNumber(input);
                System.out.println(" aapko kitna paisa deposite krna hai ");

                float depositAmount = input.nextFloat();
                // input.nextLine();
                service.deposit(accountNumber, depositAmount);

            } else if (choice == 3) {
                int accountNumber = service.getAccountNumber(input);
                System.out.println(" aapko kitna paisa nikalna hai ");

                float withdrawAmount = input.nextFloat();
                input.nextLine();
                service.withdraw(accountNumber, withdrawAmount);

            } else if (choice == 4) {

                int accountNumber = service.getAccountNumber(input);
                System.out.println(" aapka total balance: " + service.showBalance(accountNumber));

            }  else if (choice == 5) {

                int accountNumber = service.getAccountNumber(input);
                service.printPassbook(accountNumber);

            }else if (choice == 6) {
                int accountNumber = service.getAccountNumber(input);
                System.out.println("* your Statement is Download Here...*");
                  service.downloadStatement(accountNumber); 
               
            } else if (  choice ==7 ){
                System.out.println("*******    thanks for visiting  panjab national bank  .******");
                input.close();
                return;
            }

        }
    }

    public static void printSKD() {
        System.out.println("***************\n welcome in panjab naitional bank ");
        System.out.println("Press 1 . for Open Account");
        System.out.println("Press 2 . for add ammount");
        System.out.println("Press 3 . for ammount Nikalo ");
        System.out.println("Press 4 . FOR Show balance");
        System.out.println("Press 5 . FOR Print passbook.");
         System.out.print(" press 6 . For Download Statement.");
        System.out.println("Press 7 . for exit");
    }

}
