import javax.lang.model.util.ElementScanner14;

public class Ffamily {

    public static void main(String[] args) {

        // int YearOfBirth [] = {1967,1970,1975,1980,1985};
        // for (int i=0; i<6; i++);
        // System.out.println( YearOfBirth []);

        int age[] = { 60, 55, 43, 27, 25, 20 };
        String name[] = { "yamin ", " hanifa ", " Irshad", "Sahar", "Shabnam", "Shama" };
        String relation[] = { " baap", " maa", "bhai ", "bhabhi", "bhen", "bhen" };
        for (int i = 0; i < 6; i++) {
            if (age[i] >= 30) {
            continue;
            } else if (relation[i] ){
                System.out.println(name[i].toUpperCase());

            }
            System.out.println(name.length);

        }
    }
}