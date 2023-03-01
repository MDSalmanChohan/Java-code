//import javax.lang.model.util.ElementScanner14;

public class Halvaie {
    public static void main(String[] args) {
        int price[] = { 500, 470, 275, 255, 220, 190 };
        String[] mithae = { "imarti", "laddu", "rasgulla", "patasa", "chamcham", "halwa" };
        String[] taste = { "cold", " sweet ", "hot", "nice ", "wow", "fabulous" };

        String[] state = { "gujrat", "maharst", "delhi", "panjab", "up", "goa" };

        for (int i = 0; i < 6; i++) {
            
            if (state[i] == "up") {
                System.out.println("UP "+mithae[i]);
            }
             if (price[i] <= 400) {

                System.out.println("400 <s "+mithae[i]);
            } 
             if (price[i] >= 500) {
                System.out.println("500 >" +mithae[i]);
            }       

            System.out.println(mithae[i] + "  " + "  " + " " +
                    price[i] + "  ka halwa  hai " + " ye " + taste[i] + "   hai   " + " aur   " + state[i]
                    + " mai sbse jada milta hai");
        }

        int total = 0;

        for (int i = 0; i < price.length; i++) {
            total = total + price[i];
        }
        System.out.println("Total: "+total);

    }

}
