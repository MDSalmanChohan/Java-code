public class Parivaar {
    public static void main(String[] args) {

        int age[] = { 52, 47, 27, 25, 22, 19 };
        String[] name = { "Islam", "Samina", "Imran", "Imrana", "Sayra", "Salman" };
        String[] professionol = { "Bike Machenic", " House wife ", "S.O in marketing", "House wife ", "collage Student",
                "CS Engineer" };
        // String [] gender = {"male","female","male", "female", "female","male"};
        String[] relation = { "Baap", "Maa", "Bhai", "Behen", "Behen", "Salman" };

        int yearOfBirth[] = new int[6];

        boolean[] gender = { true, false, true, false, false, true };
        // System.out.println(age[0]);
        // System.out.println(age[0] + " " + name[0]);
        for (int i = 0; i < 6; i++) {
            if (age[i] <= 30) {
                continue;
            }
            yearOfBirth[i] = 2022 - age[i];

            System.out.println(
                    "mera  name " + name[i].toUpperCase() + " hain " + "  " +
                            "meri umar " + age[i] + " saaal hai ");
            System.out.println("meri " + yearOfBirth[i] + " me paida hua tha ");
            System.out.println("mere " + professionol[i] + "  ki length  " + professionol[i].length() + "   hai  ");
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