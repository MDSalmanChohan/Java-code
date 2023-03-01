import java.util.Scanner;

public class Bank {
    static BankHolder panjab[] = new BankHolder[500];

    public static void main(String[] args) {
        setupBankLibrary();
        while (true) {

            printSKD();

            Scanner input = new Scanner(System.in);

            int choice = input.nextInt();

            if (choice == 1) {
                int accountNumber = getAccountNumber(input);
                if (accountNumber >= 1 && accountNumber <= 500) {
                    if(panjab[accountNumber - 1].customer.isEmpty()) {
                        panjab[accountNumber - 1].balance = 0;
                        System.out.println("account holder ka naam bolo");
                        String customar = input.nextLine();
                        System.out.println("    ****customar ka naam : ****" + customar);
                        panjab[accountNumber - 1].customer = customar;

                        panjab[accountNumber - 1].printBankCard();
                    } else {
                        System.out.println("his account already fixed to "+panjab[accountNumber-1].customer);
                    }

                } else {
                    System.out.println(" your account number shoiuld be 1 to 500....");
                }

            } else if (choice == 2) {
                int accountNumber = getAccountNumber(input);
                if (accountNumber >= 1 && accountNumber <= 500) {
                if(panjab[accountNumber - 1].customer.isEmpty()) {
                    System.out.println("yeh account ka koi customer nahi hain.");
                } else {
                    System.out.println("aapko kitna paisa jma krna hai  ");

                    float depositAmount = input.nextFloat();
                    input.nextLine();
                    panjab[accountNumber - 1].deposit(depositAmount);
                }
            }
            } else if (choice == 3) {
                int accountNumber = getAccountNumber(input);
                if (accountNumber >= 1 && accountNumber <= 500) {
                    if(panjab[accountNumber - 1].customer.isEmpty()) {
                        System.out.println("yeh account ka koi customer nahi hain.");
                    } else {
                System.out.println(" aapko kitna paisa nikaaalna hai ");

                float withdrawAmount = input.nextFloat();
                input.nextLine();

                panjab[accountNumber - 1].withdraw(withdrawAmount);
                }
            }
            } else if (choice == 4) {
                int accountNumber = getAccountNumber(input);
                panjab[accountNumber - 1].showBalance();

            } else if (choice == 5) {
                System.out.println("*******    thanks for visiting  panjab national bank  .******* ");
                input.close();
                return;
            }
        }
    }

    // }

    private static int getAccountNumber(Scanner input) {
        System.out.println("  aapka account number kya hai  ");
        int accountNumber = input.nextInt();
        input.nextLine();
        return accountNumber;
    }

    private static void printSKD() {
        System.out.println("***************\n welcome in panjab naitional bank ");
        System.out.println("Press 1 . for Open Account");
        System.out.println("Press 2 . for add ammount");
        System.out.println("Press 3 . for ammount Nikalo ");
        System.out.println("Press 4 . FOR Show balance");
        System.out.println("Press 5 for exit");
    }

    private static void setupBankLibrary() {
        for (int i = 0; i < panjab.length; i++) {
            panjab[i] = new BankHolder();
        }
    }
}
