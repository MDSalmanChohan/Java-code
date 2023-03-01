package jewel.webfront;
import java.util.Scanner;

import jewel.service.JewellaryService;



/**
 * JewellersShop
 */
public class JewelleryShop {

    private static JewellaryService service = new JewellaryService();

    public static void main(String[] args) {
        service.setupJewellerShopLibrary();

        while (true) {
            printASMAN();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                service.searchJewelByType(input);
                    break;

                case 2:
                service.searchJewelByMetal(input);
                    break;

                case 3:
                service.rateSetForMetal(input);
                    break;
                case 4:
                service.tellMePriceForJewel(input);
                    break;
                    case 5 : service.printAllStatment();
                    break;
                    case 6 : service.downloadStatement();
                    break;
                default:
                    System.out.println("**** Thanks for comming my Jewel Shop ");
                    input.close();
                    return;
            } 

        }

    }

  

    private static void printASMAN() {
        System.out.println(" hyy welcome in my low budget jewellory shop ... ");
        System.out.println("press 1 for .. Search Jewel by type ..");
        System.out.println(" press 2 for ... Search Jewel by metal .");
        System.out.println(" press 3 for .... rate Set for metal . ");
        System.out.println(" press 4 for ... tell me price for Jewel  .");
        System.out.println(" press 5 for ....print all Statement..");
        System.out.println("press 6 for .... Download Statement... ");
        System.out.println(" press 7 for exit ... Thanks for visiting my shop ");
    }

   
}
