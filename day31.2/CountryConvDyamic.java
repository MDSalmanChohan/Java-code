import java.util.HashMap;
import java.util.Scanner;
public class CountryConvDyamic {
   static HashMap<String, Float> convMap = new HashMap<>();
   public static void main(String[] args) {
    convMap.put("USD", 75f);
    convMap.put("INR", 1f);
    convMap.put("POUND", 70f);
    convMap.put("DIRHAM", 25f);
    convMap.put("DINAR", 300f);

       while (true) {
           printCPL();
           Scanner input = new Scanner (System.in);
           int choice = input.nextInt();
           input.nextLine();


            if (choice==1) {
                System.out.print("How much? ");
                int money = input.nextInt();
                input.nextLine();

                System.out.print("From which currency? ");
                String fromCurr = input.nextLine();

                System.out.print("To which currency? ");
                String toCurr = input.nextLine();


                float converedMoney = money * convMap.get(fromCurr) / convMap.get(toCurr);

                System.out.println("Your money "+converedMoney);
            } else if (choice==2) {
                
             System.out.println( " Thanks for known convert country price..");
                input.close();
                return;
            }
           
       }
       
   }

private static void printCPL() {
    System.out.println(" Welcome know for your Convert Currency Country");
    System.out.println("press 1 for conversion ");
    System.out.println(" press 2 for Exit..");
}
}

