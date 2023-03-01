

import java.util.Scanner;
import java.util.HashMap;

public   class Bank {
   static HashMap <Integer, BankHolder> panjab = new HashMap<>() ;

    public   static void main(String[] args) {
        setupBankLibrary();
        
        while (true) {

            printSKD();

                Scanner input = new Scanner(System.in);

           int choice = input.nextInt();
        
          
        

             if (choice == 1) {
                int accountNumber = getAccountNumber(input);
            
                    BankHolder sDobj = panjab.get(accountNumber);
                    if(sDobj==null) {
                        sDobj = new BankHolder();
                        sDobj.balance = 0;
                        System.out.println("account holder ka naam bolo");
                        String customar = input.nextLine();
                        System.out.println("    ****customar ka naam : ****" + customar);
                        sDobj.customer = customar;
                        sDobj.printBankCard();
                        panjab.put(accountNumber, sDobj);
                    } else {
                        System.out.println("his account already fixed to "+sDobj.customer);
                    }
            } else if (choice == 2) {
                int accountNumber = getAccountNumber(input);
                BankHolder sDobj = panjab.get(accountNumber);
                if( sDobj==null) {
                    System.out.println("yeh account ka koi customer nahi hain.");
                } else {
                    System.out.println("aapko kitna paisa jma krna hai  ");

                    float depositAmount = input.nextFloat();
                    input.nextLine();
                    sDobj.deposit(depositAmount);
                    panjab.put(accountNumber, sDobj);
                }
            
            } else if (choice == 3) {
                int accountNumber = getAccountNumber(input);
               
                    BankHolder sDobj= panjab.get(accountNumber);
                    if( sDobj ==null) {
                        System.out.println("yeh account ka koi customer nahi hain.");
                    } else {
                System.out.println(" aapko kitna paisa nikaaalna hai ");

                float withdrawAmount = input.nextFloat();
                input.nextLine();

                sDobj.withdraw(withdrawAmount);
                panjab.put(accountNumber, sDobj);
                }
            
            } else if (choice == 4) {
                
                int accountNumber = getAccountNumber(input);
                BankHolder sDobj= panjab.get(accountNumber);
                if(sDobj==null){
                    System.out.println("yeh account ka koi customer nahi hain.");
                } else { 
                
                sDobj.showBalance();
                }

            } else if (choice == 5) {
                System.out.println("*******    thanks for visiting  panjab national bank  .******* ");
                setupBankLibrary();
                input.close();
                return;
            }
            
        }
    }

     public static int getAccountNumber(Scanner input) {
        System.out.println("  aapka account number kya hai  ");
        int accountNumber = input.nextInt();
        input.nextLine();
        return accountNumber;
    }

     public static void printSKD() {
        System.out.println("***************\n welcome in panjab naitional bank ");
        System.out.println("Press 1 . for Open Account");
        System.out.println("Press 2 . for add ammount");
        System.out.println("Press 3 . for ammount Nikalo ");
        System.out.println("Press 4 . FOR Show balance");
        System.out.println("Press 5 for exit");
    }

    public  static void setupBankLibrary() {
        for (BankHolder nHolder : panjab.values()) {
            nHolder.printBankCard();   
        }
    }
}
