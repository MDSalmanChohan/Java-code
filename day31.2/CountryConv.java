import java.util.Scanner;
public class CountryConv {
   static float USD=75 ;
   static float INR=1;
   static float POUND = 70;

   public static void main(String[] args) {
       while (true) {
           printCPL();
           Scanner input = new Scanner (System.in);
           int choice = input.nextInt();
           input.nextLine();


            if (choice==1) {
                System.out.print("How much? ");
                int money = input.nextInt();
                input.nextLine();

                float converedMoney = money * USD;

                System.out.println("Your money "+converedMoney);
                
            } else if (choice==2) {
                System.out.print("How much? ");
                int money = input.nextInt();
                input.nextLine();

                float converedMoney = money / USD;

                System.out.println("Your money "+converedMoney);
                
            } else if (choice==3) {
                System.out.print("How much? ");
                int money = input.nextInt();
                input.nextLine();

                float converedMoney = money * POUND;

                System.out.println("Your money "+converedMoney);
                
            } else if (choice==4) {
                System.out.print("How much? ");
                int money = input.nextInt();
                input.nextLine();

                float converedMoney = money / POUND;

                System.out.println("Your money "+converedMoney);
                
            } else if (choice==5) {
                
             System.out.println( " Thanks for known convert country price..");
                input.close();
                return;
            }
           
       }
       
   }

private static void printCPL() {
    System.out.println(" Welcome know for your Convert Currency Country");
    System.out.println("press 1 for USD to INR");
    System.out.println(" press 2 for INR to USD.");
    System.out.println(" press 3 for POUND to INR.");
    System.out.println(" press 4 for INR to POUND ");
    System.out.println(" press 5 for Exit..");
}
}

