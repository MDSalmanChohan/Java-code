
public class Family {
    public static void main(String[] args) {

        int age[] = { 52, 47, 27, 25, 22, 19 };
        String[] name = { "Islam", "Samina", "Imran", "Imrana", "Sayra", "Salman" };
        String[] professionol = { "Bike Machenic", " House wife ", "S.O in marketing", "House wife ", "collage Student",
                "CS Engineer" };
        // String [] gender = {"male","female","male", "female", "female","male"};
        String[] relation = { "Baap", "Maa", "Bhai", "Behen", "Behen", "Salman" };

        boolean[] gender = { true, false, true, false, false, true };
        // System.out.println(age[0]);
        // System.out.println(age[0] + " " + name[0]);
        for (int i = 0; i < 6; i++) {
            if (relation[i] == "Maa") {
                continue;
            }
            System.out.println("mera  name " + name[i] + " hain " + "  " + "meri umar " + age[i] + " saaal hai " +
                    "mai " + professionol[i] + " hu ");
            if (gender[i]) {
                System.out.println(" mai Male hu. " + " Main Salman ka " + relation[i] + " hu. \n\n");
            } else {
                System.out.println(" mai Female hu. " + " Main Salman ki " + relation[i] + " hu. \n\n");

            }

            if (relation[i] == "Bhai") {
        
                break;
            }
        }
    }
}