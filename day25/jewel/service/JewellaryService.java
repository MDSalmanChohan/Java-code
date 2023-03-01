package jewel.service;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import jewel.data.Jewel;


/**
 * JewellersShop
 */
public class JewellaryService {

    private ArrayList<Jewel> jewellory = new ArrayList<Jewel>();
    private HashMap<String, Integer> metalRate = new HashMap<>();


    public void tellMePriceForJewel(Scanner input) {
        for (int i = 0; i < jewellory.size(); i++) {
            Jewel eSobj = jewellory.get(i);
            System.out.print((i + 1) + "::");
            eSobj.printJewelCard();
        }
        System.out.println(" jis jewel ka price jaanna chae ho uska number daalo.");
        int choice = input.nextInt();
        input.nextLine();
        
        

        if(choice>=1 && choice <=jewellory.size()) {
            Jewel eSobj = jewellory.get(choice - 1);
            float rateOfJewel = eSobj.weight *metalRate.get(eSobj.metal.trim().toLowerCase());

            System.out.println("your rate: "+rateOfJewel);
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

    public void setupJewellerShopLibrary() {

        Jewel eSobj = new Jewel();

        eSobj = new Jewel();
        eSobj.design = " neckless";
        eSobj.metal = "Gold";
        eSobj.type = " simple";
        eSobj.weight = 2.51f;

        jewellory.add(eSobj);

        eSobj = new Jewel();
        eSobj.design = " Earing ";
        eSobj.metal = " Gold";
        eSobj.type = " simple";
        eSobj.weight = 1.51f;

        jewellory.add(eSobj);

        eSobj = new Jewel();
        eSobj.design = " Nosepin";
        eSobj.metal = " Silver";
        eSobj.type = " simple";
        eSobj.weight = 1.01f;

        jewellory.add(eSobj);

        eSobj = new Jewel();
        eSobj.design = " Handflower";
        eSobj.metal = " Diamond";
        eSobj.type = " simple";
        eSobj.weight = 4.51f;

        jewellory.add(eSobj);

        metalRate.put("gold", 55000);
        metalRate.put("silver", 5000);
        metalRate.put("diamond", 25000);
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
}
