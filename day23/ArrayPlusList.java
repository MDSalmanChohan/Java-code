import java.util.ArrayList;

/**
 * ArrayList
 */
public class ArrayPlusList {

    public static void main(String[] args) {
        
        ArrayList<String>cars =new ArrayList<String>();
        cars.add ("Volvo");
        cars.add ("BMW");
        cars.add ("Ford");
        cars.add ("Mazda");
       // cars.remove(1);
        for (int i = 0; i < cars.size(); i++) {
            
      
        System.out.println(cars.get(i));
    }
}  }