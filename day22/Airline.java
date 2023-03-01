import java.util.Scanner;

import javax.naming.directory.Attribute;

/**
 * Airline
 */
public class Airline {

    static Flight airplane[] = new Flight[10];

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
                    System.out.println("****din ki booking check kro******");
                    int bookingDay = input.nextInt();
                    input.nextLine();
                    bookFlight(bookingDay);
                    break;
                default:
                    System.out.println("*******    thanks for visiting   indian Airline .******* ");
                    input.close();
                    return;
            }

        }

    }

    private static void searchByCompany(Scanner input) {
        System.out.println("  ***aap kis company ki flight mai jana chahte ho***   ");

        String company = input.nextLine();

        for (int i = 0; i < airplane.length; i++) {

            if (airplane[i].company.trim().equalsIgnoreCase(company)) {
                airplane[i].printFlightCard();
            }
        }

    }

    private static void searchFlight(Scanner input) {
        System.out.println(" aap kha se jana hai   ");
        String source = input.nextLine();
        System.out.println("  kha tk jana hai  ");
        String dest = input.nextLine();

        for (int i = 0; i < airplane.length; i++) {

            if (airplane[i].source.contains(source)
                    && (airplane[i].dest.contains(dest))) {
                airplane[i].printFlightCard();

            }
        }
    }

    private static void searchByRate(Scanner input) {

        System.out.println("  ***aapka  kitne rupees tk ka budget hai  ***   ");

        float rate = input.nextFloat();
        input.nextLine();

        for (int i = 0; i < airplane.length; i++) {

            if (airplane[i].rate <= rate) {
                // if (airplane[i].rate.trim().equalsIgnoreCase(rate)) {
                airplane[i].printFlightCard();
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

    private static void setupAirlineLibrary() {

        airplane[0] = new Flight();
        airplane[0].company = "Relience";
        airplane[0].rate = 8000;
        airplane[0].timing = 8;
        airplane[0].source = " bom";
        airplane[0].dest = "del";

        airplane[1] = new Flight();
        airplane[1].company = " Adani ";
        airplane[1].rate = 7530;
        airplane[1].timing = 9;
        airplane[1].source = "del";
        airplane[1].dest = "bom";

        airplane[2] = new Flight();
        airplane[2].company = " Airindia ";
        airplane[2].rate = 8530;
        airplane[2].timing = 10;
        airplane[2].source = "Goi";
        airplane[2].dest = "Lukhnow";

        airplane[3] = new Flight();
        airplane[3].company = "  Indigo ";
        airplane[3].rate = 6550;
        airplane[3].timing = 11;
        airplane[3].source = "del";
        airplane[3].dest = "Gorakhpur";

        airplane[4] = new Flight();
        airplane[4].company = " Cargo ";
        airplane[4].rate = 7050;
        airplane[4].timing = 12;
        airplane[4].source = "Jewar";
        airplane[4].dest = "Gurgaun";

        airplane[5] = new Flight();
        airplane[5].company = " Tata ";
        airplane[5].rate = 6530;
        airplane[5].timing = 1;
        airplane[5].source = "del";
        airplane[5].dest = "Kolkata";

        airplane[6] = new Flight();
        airplane[6].company = " Redknight ";
        airplane[6].rate = 6030;
        airplane[6].timing = 2;
        airplane[6].source = "del";
        airplane[6].dest = "Jaipur";

        airplane[7] = new Flight();
        airplane[7].company = " Air Express ";
        airplane[7].rate = 5530;
        airplane[7].timing = 3;
        airplane[7].source = "Channai";
        airplane[7].dest = "Rajsh";

        airplane[8] = new Flight();
        airplane[8].company = " Aksha Air ";
        airplane[8].rate = 5030;
        airplane[8].timing = 4;
        airplane[8].source = "Asam";
        airplane[8].dest = "Bangal";

        airplane[9] = new Flight();
        airplane[9].company = " Air Rajdhani ";
        airplane[9].rate = 4000;
        airplane[9].timing = 5;
        airplane[9].source = " Surat";
        airplane[9].dest = "Del";

    }
}