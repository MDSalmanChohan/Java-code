public class Train {
    protected String name;
    int rate;
    String start;
    String end;
    int trainNum;

    protected void printTrainCard() {

        System.out.println("ye Train " + name + " hai . ye " + start + end + "tak jati hai " + " jiska  number "
                + trainNum + " hai...");

    }

    protected void printRate() {
        System.out.println("  iska price " + rate + "hai .....");

    }
}

/**
 * ExpressTrain
 */
class ExpressTrain extends Train {

    protected int expressRate = 100;

    protected void printRate() {
        System.out.println("  iska price " + (rate + expressRate) + "hai .....");

    }

    protected void printTrainCard() {
        super.printTrainCard();
        System.out.println(" i am expresss...");

    }
}

class RajdhaniExpress extends ExpressTrain {

    protected void printTrainCard() {
        super.printTrainCard();
        System.out.println(" i am RajdhaniExpress...");

    }

}

class MailTrain extends Train {
    private int speedLimit = 80;

    protected void printTrainCard() {

        System.out.println(" I am slow..." + speedLimit);

    }
}
