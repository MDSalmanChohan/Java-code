/**
 * Railwae
 */
public class Railwae {

    public static void main(String[] args) {
         Train express[] = new ExpressTrain[2];

        express[0] = new ExpressTrain();
        express[0].name = "Janta Express";
        express[0].start = " Saharanpur   ";
        express[0].end = "new delhi ";
        express[0].trainNum = 74021;
        express[0].rate= 1500;

        express[1] = new ExpressTrain();
        express[1].name = "Gareeebradhh fas express";
        express[1].start = " new delhi   ";
        express[1].end= "panvel";
        express[1].trainNum = 67866;

        MailTrain mailTrain [] = new MailTrain[2];

        mailTrain[0] = new MailTrain();
        mailTrain[0].name = " Sampark Kranti";
        mailTrain[0].start = " Hazrat Nizamudeen ";
        mailTrain[0].end = " Bandra Terminal";
        mailTrain[0].trainNum = 12061;

        mailTrain[1] = new MailTrain();
        mailTrain[1].name = " Kalka Express";
        mailTrain[1].start = " Kolkata ";
        mailTrain[1].end = " kashmir";
        mailTrain[1].trainNum = 15674;
          


        Train rajdhaniExpresss [] = new RajdhaniExpress [2];
        
        rajdhaniExpresss[0] = new RajdhaniExpress();
        rajdhaniExpresss[0].name = " Sampark Kranti";
        rajdhaniExpresss[0].start = " Hazrat Nizamudeen ";
        rajdhaniExpresss[0].end = " Bandra Terminal";
        rajdhaniExpresss[0].trainNum = 12061;

        rajdhaniExpresss[1] = new RajdhaniExpress();
        rajdhaniExpresss[1].name = " Kalka Express";
        rajdhaniExpresss[1].start = " Kolkata ";
        rajdhaniExpresss[1].end = " kashmir";
        rajdhaniExpresss[1].trainNum = 15674;
        rajdhaniExpresss[1].rate = 786;
          



        for (int i = 0; i < express.length; i++) {
            express[i].printTrainCard();
            express[i].printRate();
           
        }
        for (int i = 0; i < mailTrain.length; i++) {
            mailTrain[i].printTrainCard();
            mailTrain[i].printRate();
        }
        for (int i = 0; i < rajdhaniExpresss.length; i++) {
            rajdhaniExpresss[i].printTrainCard();
            rajdhaniExpresss[i].printRate();
        }
    }
}
