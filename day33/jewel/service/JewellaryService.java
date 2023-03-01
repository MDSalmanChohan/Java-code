package jewel.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import jewel.data.Jewel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * JewellersShop
 */
public class JewellaryService {

    private ArrayList<Jewel> jewellory = new ArrayList<Jewel>();
    private HashMap<String, Integer> metalRate = new HashMap<>();

    public void setupJewellerShopLibrary() {

        Jewel eSobj = new Jewel(" Neckless", " Gold ", " Simple ", 25);
        jewellory.add(eSobj);

        eSobj = new Jewel("Earning", "Gold", "Simple", 12);
        jewellory.add(eSobj);
        eSobj = new Jewel("Nosepin", "Silver", "Simple", 18);
        jewellory.add(eSobj);
        eSobj = new Jewel("HandFlower", "Diomond", "Simple", 14);
        jewellory.add(eSobj);

        eSobj = new Jewel("Breslate", "Gold", "Simple", 13);
        jewellory.add(eSobj);
        eSobj = new Jewel("BoysChain", "Diomond", "Simple", 8);
        jewellory.add(eSobj);

        eSobj = new Jewel("Pajeb", "Silver", "Simple", 30);
        jewellory.add(eSobj);


        metalRate.put("gold", 55000);
        metalRate.put("silver", 5000);
        metalRate.put("diamond", 25000);
    }

        public void setupJewellerShopFromFile(){
            try {
                
        
            File myObj =  new File ("jewelloryList_Statement.txt");
            Scanner myReader =  new Scanner (myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] lineArray = data.split(",");

                 int employ = Integer.parseInt(lineArray[3]);
                 Jewel chiku = new Jewel();
                 chiku.metal= lineArray[0];
                 chiku.weight= employ;
                 chiku.design=lineArray[2];
                 chiku.type= lineArray[1];
                 jewellory.add(chiku);
                 myReader.close();

            }


        } catch (Exception e) {
             
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        }

      

    public void tellMePriceForJewel(Scanner input) {
        for (int i = 0; i < jewellory.size(); i++) {
            Jewel eSobj = jewellory.get(i);
            System.out.print((i + 1) + "::");
            eSobj.printJewelCard();
        }
        System.out.println(" jis jewel ka price jaanna chae ho uska number daalo.");
        int choice = input.nextInt();
        input.nextLine();

        if (choice >= 1 && choice <= jewellory.size()) {
            Jewel eSobj = jewellory.get(choice - 1);
            float rateOfJewel = eSobj.weight * metalRate.get(eSobj.metal.trim().toLowerCase());

            System.out.println("your rate: " + rateOfJewel);
        } else {
            System.out.println("Sorry this jewellary  does not exist.");
        }

    }

    public void searchJewelByMetal(Scanner input) {
        System.out.println(" Aapko konse metal ka javel chahieye  ");
        String metal = input.nextLine();

        for (int i = 0; i < jewellory.size(); i++) {
            Jewel eSobj = jewellory.get(i);
            if (eSobj.metal.trim().equalsIgnoreCase(metal)) {
                System.out.print((i + 1) + "::");
                eSobj.printJewelCard();
            }

        }

    }

    public void searchJewelByType(Scanner input) {
        System.out.println(" Aapko kis type ka Jewel lena  hai ");
        String type = input.nextLine();

        for (int i = 0; i < jewellory.size(); i++) {
            Jewel eSobj = jewellory.get(i);
            if (eSobj.type.trim().equalsIgnoreCase(type)) {
                System.out.print((i + 1) + "::");
                eSobj.printJewelCard();
            }

        }

    }

    public void rateSetForMetal(Scanner input) {
        System.out.println("Gold ka rate kitna chahte ho?");
        int rate = input.nextInt();
        input.nextLine();
        metalRate.put("gold", rate);

        System.out.println("silver ka rate kitna chahte ho?");
        rate = input.nextInt();
        input.nextLine();
        metalRate.put("silver", rate);

        System.out.println("Diamond ka rate kitna chahte ho?");
        rate = input.nextInt();
        input.nextLine();
        metalRate.put("diamond", rate);

    }

    public void printAllStatment() {

        System.out.println(" print your  Statement ");
         

        for (int i = 0; i < jewellory.size(); i++) {
        Jewel eSobj = jewellory.get(i);
                   eSobj.printJewelCard();
        }


    }

    public void downloadStatement() {
        System.out.println( "Download your Statement.. ");
        
        try {
    
            FileWriter myWriter = new FileWriter("jewelloryList_Statement.txt");

			myWriter.write("Your jewellory Statement: "+" \n" );
			for (Jewel level : jewellory) {

				myWriter.write(  level.design + "  ,  " + level.metal+ "," + "\t" + level.type + "," +level.weight+ "\n");

			}
			myWriter.close();
			System.out.println(" Succesfull wrote to the file .." +" \n");

		} catch (IOException e) {
			System.out.println(" an error occurred . " +"\n");
			e.printStackTrace();

		}
	}
        //   for (int i = 0; i <  jewellory.size(); i++) {
        //     Jewel esobj = jewellory.get(i);
        //     esobj.printJewelCard();;
        
}
