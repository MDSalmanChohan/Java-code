public class Flight {
    String source ;
    String dest ;
    int timing ;
    String company ;
    float rate ;
 

    public void printFlightCard() {
        System.out.println(rate + "/-"   +" >>>" + source+ ">>>>" + " <<<" + dest + "::::" + timing + "*****" + " ----" +  company);
    }

   
    
}
