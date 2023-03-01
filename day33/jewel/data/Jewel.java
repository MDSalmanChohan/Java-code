package jewel.data;
public class Jewel {
   

    public int  weight ;
    public String metal , design, type;

    public Jewel ( String type, String metal, String design , int weight ){
        this.metal=metal;
        this.design=design;
        this.type=type;
        this.weight=weight;
    }
    public Jewel() {
    }
    public void printJewelCard() {
        
        System.out.println(" ye >>>" +metal + " ye vala  " +design  + " mai hai  ...or yeh " +  type
                + " hai ...  jiska Weight " + weight + " gm hai.");

    }

}
