public class Halwaie {
    public static void main(String[] args) {
        int price[] = { 500, 470, 275, 255, 220, 190 };
        String[] mithae = { "imarti", "laddu", "rasgulla", "patasa", "chamcham", "halwa" };
        String[] professionol = { "cold", " sweet ", "hot", "nice ", "wow", "fabulous" };

        String[] state = { "gujrat", "maharst", "delhi", "panjab", "up", "goa" };

        for (int i = 0; i < 6; i++) {

            System.out.println(mithae[i] + "  " + "  " + " " +
                    price[i] + "  ka halwa  hai " + " ye " + professionol[i] + "   hai   " + " aur   " + state[i]
                    + " mai sbse jada milta hai");
        }

    }

}
