 package car.webfront;
 import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

import car.service.BookingService;

public class CarShowroom {
    private static BookingService service = new BookingService();

    public static void main ( String []asman){
        service.setupCarBookingserviceFromFile();
       
        while (true) {

            printSalAsm();
            
             
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();


            if (choice==1 ) {
                service.setupCarBookingserviceFromFile();
                
            } else if (choice==2) {
                System.out.println( " please  Search  by  company ");
                String company = input.nextLine();
                service.searchByCompany(company);

                
            } else if (choice==3) {
                System.out.println(" your search in year..");
                int year = input.nextInt();
                input.nextLine();
                service.searchByYear(year);
                
            } else if (choice==4 ) {
                System.out.println(" you are Search in Colour..");
                String colour = input.nextLine();
                service.searchByColour(colour);
                
            } else if (choice==5) {
                System.out.println(" Show  all carShowroom quality...");
                service.showAll();
                
            } else if (choice==6) {
                System.out.println("your choice in Download all ");
                service.downloadAll();
                     
            } else if (choice==7) {
                System.out.println("Create New Caars objects.. ");


                System.out.println(" aapka konsa model hai ");
                String model = input.nextLine();
                
                System.out.println(" aapko konsi company ki chahiye");
                String company =input.nextLine();

                System.out.println(" konse year ki leni hai ");
                 int year = input.nextInt();
                 input.nextLine();

                 System.out.println(" aapko  kis rate ki Chahiye..");
                 Float rate = input.nextFloat();
                 input.nextLine();

                 System.out.println(" aapko konse Colour ki Chahiye");
                 String colour = input.nextLine();

 
                service.createNewCarObject(model,company,year,rate,colour);
                

                
            } else if (choice==8) {
                System.out.println("** Thanks for visiting my Car Showroom ...");
                input.close();
                return;
        
                
            } 
        }
    }

    private static void printSalAsm() {
        System.out.println(" ***\n Welcome in Car Showroom its open in 24/7 everyday for your ...**");
        System.out.println(" press 1 for Load from File..");
        System.out.println(" press 2 ....for Search by Company..");
        System.out.println(" press 3 ....for Serach by Year");
        System.out.println(" press 4.... for  Serach by Colour");
        System.out.println(" press 5... for Show All ... ");
        System.out.println(" press 6 ... for Download All...");
        System.out.println(" press 7 ....for crate new Car Object");
        System.out.println(" press 8... for ..Exit...<>");
    }
    
}
