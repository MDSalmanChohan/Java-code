
package read.webFront;
import java.util.Scanner;

import read.service.ReadFileWithClass;



public class ReadShopMain {
    private static  ReadFileWithClass service = new    ReadFileWithClass();
    
    public static void main(String[] args) {
        service.setupReadLibrary();
        while (true) {
            printRCR();
            Scanner input = new Scanner(System.in);

            int choice = input.nextInt();
            input.nextLine();

            if ( choice ==1){
                System.out.println( " Please tell me Our Name ...");
                String name = input.nextLine();
                System.out.println(" aapka " + name +  " ye hai  ."  );
                service.searchByName(name);

            } else if (choice==2 ) {
                System.out.println( " please tell me your date YYYY-MM-DD");
                String date = input.nextLine();
                System.out.println(" aapka " + date + " hai ");
                service.searchByDate(date);
            } else if (choice==3 ) {
                service.printAll();
            } else if (choice==4) {
               
                System.out.println( " Please tell me Our Name ...");
                String name = input.nextLine();
                System.out.println( " please tell me your date YYYY-MM-DD");
                String date = input.nextLine();
                System.out.println( " Please tell me amount ...");
                int amount =  input.nextInt();
                input.nextLine();

               service.addNewEntry(name,date, amount);
            } else if (choice==5) {
                System.out.println(" Thanks for how your data and plaan..");
                input.close();
                return;
            } 
        }
        
    }

    private static void printRCR() {

        System.out.println("**** \n Welcome in read File of all Reader ..****");
        System.out.println(" press 1 for name ");
        System.out.println(" press 2 for number ");
        System.out.println(" press 3 for All everyhing ..");
        System.out.println(" press 4 for new entry");
        System.out.println(" press 5 for Exit the File ...   " + " Thanks for your ....");
    }
}
