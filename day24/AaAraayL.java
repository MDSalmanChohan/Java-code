
import java.util.ArrayList;

public class AaAraayL {

    public static void main(String[] args) {

        ArrayList<ExpressTrain> express = new ArrayList<ExpressTrain>();

        ExpressTrain eTObj = new ExpressTrain();
        eTObj.name = "Janta Express";
        eTObj.start = " Saharanpur   ";
        eTObj.end = "new delhi ";
        eTObj.trainNum = 74021;
        eTObj.rate = 1500;

        express.add(eTObj);

        eTObj = new ExpressTrain();
        eTObj.name = "Gareeebradhh fas express";
        eTObj.start = " new delhi   ";
        eTObj.end = "panvel";
        eTObj.trainNum = 67866;

        express.add(eTObj);

        ArrayList<MailTrain> expresses = new ArrayList<MailTrain>();

        MailTrain sAlobj = new MailTrain();
        sAlobj.name = " Sampark Kranti";
        sAlobj.start = " Hazrat Nizamudeen ";
        sAlobj.end = " Bandra Terminal";
        sAlobj.trainNum = 12061;

        expresses.add(sAlobj);

        sAlobj = new MailTrain();
        sAlobj.name = " Kalka Express";
        sAlobj.start = " Kolkata ";
        sAlobj.end = " kashmir";
        sAlobj.trainNum = 15674;

        expresses.add(sAlobj);

        ArrayList<RajdhaniExpress> expres = new ArrayList<RajdhaniExpress>();
        RajdhaniExpress fASTOBJ = new RajdhaniExpress();

        fASTOBJ = new RajdhaniExpress();
        fASTOBJ.name = " Sampark Kranti";
        fASTOBJ.start = " Hazrat Nizamudeen ";
        fASTOBJ.end = " Bandra Terminal";
        fASTOBJ.trainNum = 12061;

        fASTOBJ = new RajdhaniExpress();
        fASTOBJ.name = " Kalka Express";
        fASTOBJ.start = " Kolkata ";
        fASTOBJ.end = " kashmir";
        fASTOBJ.trainNum = 15674;
        fASTOBJ.rate = 786;

        for (int i = 0; i < express.size(); i++) {
            ExpressTrain eTrain = express.get(i);
            eTrain.printTrainCard();
            eTrain.printRate();
        }

        for (int i = 0; i < expresses.size(); i++) {
            MailTrain mTrain = expresses.get(i);
            mTrain.printTrainCard();
            mTrain.printRate();

        }

        for (int i = 0; i < expres.size(); i++) {
            RajdhaniExpress rTrain = expres.get(i);
            rTrain.printTrainCard();
            rTrain.printRate();

        }

        // for (ExpressTrain eTrain : express) {
        // eTrain.printTrainCard();
        // eTrain.printRate();
        // }
        // for (MailTrain mTrain : expresses) {
        // mTrain.printTrainCard();
        // mTrain.printRate();

        // }

        // for (RajdhaniExpress rTrain : expres) {
        // rTrain.printTrainCard();
        // rTrain.printRate();

        // }

    }
}
