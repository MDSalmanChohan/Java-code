import java.util.Scanner;

public class Shadisakj {
    static ShaadiDay wedding[] = new ShaadiDay[31];

    public static void main(String[] args) {
        setupMyShaadiHall();

        while (true) {
            printIVRS();
            Scanner input = new Scanner(System.in);

            int choice = input.nextInt();

            if (choice == 1) {
                bookingWeddingDay(input);

            } else if (choice == 2) {
                showMeRateOfTheDay(input);

            } else if (choice == 3) {
                showMeTotalIncome();
            } else if (choice == 4) {
                System.out.println("****din ki booking check kro******");
                int bookingDay = input.nextInt();
                input.nextLine();
                checkBookingForTheDay(bookingDay);

            } else if (choice == 5) {
                System.out.println("*******    thanks for visiting salman shaadi halll .******* ");
                input.close();
                return;
            }
            Now with Switch case
            switch(choice) 
            {
                case 1: bookingWeddingDay(input);
                        break;
                case 2:showMeRateOfTheDay(input);
                        break;
                case 3:  showMeTotalIncome();
                        break;
                case 4: 
                        System.out.println("****din ki booking check kro******");
                        int bookingDay = input.nextInt();
                        input.nextLine();
                        checkBookingForTheDay(bookingDay);
                        break;
                default: System.out.println("*******    thanks for visiting salman shaadi halll .******* ");
                        input.close();
                        return;
            }
            System.out.println("\nPress any key to continue...1");
            input.nextLine();
        }
    }

    private static void checkBookingForTheDay(int bookingDay) {
        if (wedding[bookingDay - 1].booking == true) {
            // String dulheRaja;
            System.out.println("*    is din " + bookingDay + "    ki booking hai  ***");
        } else {
            System.out.println("   ****is din booking NAHI hai*** Rate: "+wedding[bookingDay-1].rate);
        }
        

    }

    private static void showMeTotalIncome() {
        float total = 0;
        for (int i = 0; i < wedding.length; i++) {
            if (wedding[i].booking == true) {
                total = total + wedding[i].rate;

            }

            
        }
        System.out.println(" today total sales is now " + total);
    }

    private static void showMeRateOfTheDay(Scanner input) {
        System.out.println("*****konse din ka rate chahte ho ****");
        int bookingDay = input.nextInt();
        input.nextLine();
        // if (bookingDay-1 == true);
        System.out.print(wedding[bookingDay - 1].rate + " ****is din ka price hai   ****");
    }

    private static void bookingWeddingDay(Scanner input) {
        System.out.println("  ***aap kis din ki booking chahte ho***   ");

        int bookingDay = input.nextInt();
        input.nextLine();

        System.out.println("  *** apni  booking le***     : " + bookingDay);
        wedding[bookingDay - 1].booking = true;
        System.out.print("***dulhe raja ka name bolo***     ***");
        String dulheRaja = input.nextLine();
        // input.nextLine();
        System.out.println("    ****dulhe ka : ****" + dulheRaja);
        wedding[bookingDay - 1].dulheRaja = dulheRaja;

        wedding[bookingDay - 1].printDayCard();

    }

    private static void printIVRS() {
        System.out.println("**********************************" +
         "\n welcome to salman Shaadi hall ");
        System.out.println("Press 1.  for Booking ");
        System.out.println("Press 2. for Rate");
        System.out.println("Press 3. for Balance");
        System.out.println("Press 4. to check for the Day of Booking");
        System.out.println("Press 5. to exit!\n\n");

    }

    private static void setupMyShaadiHall() {

        for (int i = 0; i < wedding.length; i++) {
            wedding[i] = new ShaadiDay();
            wedding[i].day = i + 1;
            wedding[i].rate = 20000;
            if (wedding[i].day % 5 == 0) {
                wedding[i].rate = wedding[i].rate + 5000;

                System.out.println();

            }

        }
        // for (int i = 0; i < wedding.length; i++) {
        // wedding[i].printDayCard();

        // }
    }

}
