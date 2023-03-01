//import java
import java.util.Scanner;
 
public class IinputRailwae{

    public static void main(String[] args) {
        Scanner reader   = new Scanner (System.in );
        

        Train express[] = new Train[4];

        for (int i = 0; i < express.length; i++) {
            System.out.println("Ener rail deails: Name; Sar ; End ; number: ");
        
        
            express[i] = new Train();
            express[i].name = reader.nextLine();
            express[i].start =  reader.nextLine();
            express[i].end =  reader.nextLine();
            express[i].trainNum = reader.nextInt();
            reader.nextLine();
            express[i].printTraindetails();
        
        }
        

        System.out.println("kaha se jana hain   ");

        String kahaJanaHain = reader.nextLine();

        System.out.println("kaha tak jana hain   ");
        
        String kahaTakJanaHain = reader.nextLine();

        reader.close();

        for (int i = 0; i < express.length; i++) {
          
                express[i].printTraindetails();

            
        }
    }
} 
