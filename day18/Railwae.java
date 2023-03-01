/**
 * Railwae
 */
public class Railwae {

    public static void main(String[] args) {

        if (args.length!=2) {
            System.out.println("Please tell me start and end of ur journey " );
            return;
        }

        String kahaJanaHain = args[0];
        String kahaTakJanaHain= args[1];
        Train express[] = new Train[4];

        express[0] = new Train();
        express[0].name = "Janta Express";
        express[0].start = " Saharanpur   ";
        express[0].end = "new delhi ";
        express[0].trainNum = 74021;

        express[1] = new Train();
        express[1].name = "Gareeebradhh fas express";
        express[1].start = " new delhi   ";
        express[1].end= "panvel";
        express[1].trainNum = 67866;

        express[2] = new Train();
        express[2].name = " Sampark Kranti";
        express[2].start = " Hazrat Nizamudeen ";
        express[2].end = " Bandra Terminal";
        express[2].trainNum = 12061;

        express[3] = new Train();
        express[3].name = " Kalka Express";
        express[3].start = " Kolkata ";
        express[3].end = " kashmir";
        express[3].trainNum = 15674;

        for (int i = 0; i < express.length; i++) {
            if (express[i].start.contains(kahaJanaHain)
               && (express[i].end.contains(kahaTakJanaHain))) {
                express[i].printTraindetails();

            }
        }
    }
}
