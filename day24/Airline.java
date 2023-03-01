import java.util.Scanner;
import java.util.ArrayList;

//import javax.naming.directory.Attribute;

/**
 * Airline
 */
public class Airline {

   // static Flight airplane[] = new Flight[10];
   static  ArrayList<Flight> airplane = new ArrayList<Flight>();

//      Flight  eTObj = new  Flight();


    public static void main(String[] args) {
        setupAirlineLibrary();

        while (true) {
            printIKR();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    searchByCompany(input);
                    break;
                case 2:
                    searchFlight(input);
                    break;
                case 3:
                    searchByRate(input);
                    break;
                case 4:
                    System.out.println("****Book flight ******");
                    int bookingDay = input.nextInt();
                    input.nextLine();
                    bookFlight(bookingDay);
                    break;
                default:
                    System.out.println("*******    thanks for  indian airline  .******* ");
                    input.close();
                    return;
            }

        }

    }

    private static void searchByCompany(Scanner input) {
        System.out.println("  ***aap kis company ki flight mai jana chahte ho***   ");

        String company = input.nextLine();

        for (int i = 0; i < airplane.size(); i++) {
            Flight  eTObj =  airplane.get(i) ;
            if (eTObj.company.trim().equalsIgnoreCase(company)) {
                eTObj.printFlightCard();
            }
        }

    }

    private static void searchFlight(Scanner input) {
        System.out.println(" aap kha se jana hai   ");
        String source = input.nextLine();
        System.out.println("  kha tk jana hai  ");
        String dest = input.nextLine();

        for (int i = 0; i < airplane.size(); i++) {
            Flight  eTObj =  airplane.get(i) ;
            if (eTObj.source.contains(source)
                    && (eTObj.dest.contains(dest))) {
                eTObj.printFlightCard();

            }
        }
    }

    private static void searchByRate(Scanner input) {

        System.out.println("  ***aapka  kitne rupees tk ka budget hai  ***   ");

        float rate = input.nextFloat();
        input.nextLine();

        for (int i = 0; i < airplane.size(); i++) {
            Flight  eTObj =  airplane.get(i) ;
            if (eTObj.rate <= rate) {
                // if (airplane[i].rate.trim().equalsIgnoreCase(rate)) {
                eTObj.printFlightCard();
            }
        }
    }

    // }
//Mehod overloading
    // search(Sring compan)
    // search(Sring src, Sring ds)
    // search(floa rae)
    // Search(Sring counr)

    private static void bookFlight(int bookingDay) {
    }

    private static void printIKR() {
        System.out.println("hyyy ... Welcome in india Airline ");
        System.out.println(" please tell me can i help u");
        System.out.println("press 1 ::; for search by which  indian Airline company");
        System.out.println("Press 2 ::: for Search indian Flight ...where u gone away");
        System.out.println(" press 3::: for know u flight rate ");
        System.out.println(" press 4 :: for Book flight :: Enjoy your journey ");
        System.out.println(" press 5 ::: for exit :: Thanks for visiting indian Airline : I hope you happy journey");
    }

    public static void setupAirlineLibrary() {

        Flight  eTObj = new  Flight();
   
        eTObj  = new Flight();
        eTObj .company = "Relience";
        eTObj.rate = 8000;
        eTObj.timing = 8;
        eTObj.source = " bom";
        eTObj.dest = "del";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Adani ";
        eTObj.rate = 7530;
        eTObj.timing = 9;
        eTObj.source = "del";
        eTObj.dest = "bom";

        airplane.add(eTObj);


        eTObj = new Flight();
        eTObj.company = " Airindia ";
        eTObj.rate = 8530;
        eTObj.timing = 10;
        eTObj.source = "Goi";
        eTObj.dest = "Lukhnow";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = "  Indigo ";
        eTObj.rate = 6550;
        eTObj.timing = 11;
        eTObj.source = "del";
        eTObj.dest = "Gorakhpur";


        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Cargo ";
        eTObj.rate = 7050;
        eTObj.timing = 12;
        eTObj.source = "Jewar";
        eTObj.dest = "Gurgaun";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Tata ";
        eTObj.rate = 6530;
        eTObj.timing = 1;
        eTObj.source = "del";
        eTObj.dest = "Kolkata";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Redknight ";
        eTObj.rate = 6030;
        eTObj.timing = 2;
        eTObj.source = "del";
        eTObj.dest = "Jaipur";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Air Express ";
        eTObj.rate = 5530;
        eTObj.timing = 3;
        eTObj.source = "Channai";
        eTObj.dest = "Rajsh";

        airplane.add(eTObj);

        eTObj = new Flight();
        eTObj.company = " Aksha Air ";
        eTObj.rate = 5030;
        eTObj.timing = 4;
        eTObj.source = "Asam";
        eTObj.dest = "Bangal";
        airplane.add(eTObj);

        eTObj = new Flight();

        eTObj.company = " Air Rajdhani ";
        eTObj.rate = 4000;
        eTObj.timing = 5;
        eTObj.source = " Surat";
        eTObj.dest = "Del";
         
        airplane.add(eTObj);

        for (int i = 0; i < airplane.size(); i++) {
            Flight eFlight =  airplane.get(i);
                  eFlight.printFlightCard();
        }    

    }
    
                 
    }
