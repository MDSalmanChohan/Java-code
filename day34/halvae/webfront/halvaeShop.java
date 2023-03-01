package halvae.webfront;

import java.lang.Thread.State;
import java.util.Scanner;

import halvae.service.HalvaeService;

public class halvaeShop {

    private static HalvaeService service = new HalvaeService();

    public static void main(String[] args) {
      //  service.setupHalvaeLibrary();
         service.setupHalvaeFromFile();

        while (true) {

            printASK();

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("  please tll me Your State ...");
                String state = input.nextLine();
                System.out.println(" \n");
                service.searchByState(state);

            } else if (choice == 2) {

                System.out.println(" please tell me your taste..");
                String taste = input.nextLine();
                service.searchByTaste(taste);

            } else if (choice == 3) {
                System.out.println(" your  Search in  price of Mithae .. ");
                int price = input.nextInt();
                input.nextLine();
                service.searchByPrice(price);

            } else if (choice == 4) {
                System.out.println(" print  all Statement ..");
                service.printAll();

            } else if (choice == 5) {
                System.out.println(" print  Download  all Statement ..");
                service.downloadAll();

            }else if (choice==6) {
                
            System.out.println( "**** Thanks for visit in my swwet shop..***");
                input.close();
                return;
            }

        }  }


    

    private static void printASK() {
        System.out.println(" ***\n Welcome in Halvae shop in All india Permit..");
        System.out.println(" press 1 ... for Search by State ...");
        System.out.println(" press 2 ...for Search in taste ... ");
        System.out.println(" press 3 ...for Search by price ...");
        System.out.println(" press 4 ....for print All Mithai ...");
        System.out.println(" press 5 ... for Download all Mithai in txt..");
        System.out.println(" press 6 for Exit ");
    }

}
