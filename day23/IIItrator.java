import java.util.ArrayList;
import java.util.Iterator;

public class IIItrator {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("Bmw");
        cars.add("dbkjd");
        cars.add("hvjdfh");


        Iterator<String>it = cars.iterator();

        System.out.println(it.next());
    }
    
}
