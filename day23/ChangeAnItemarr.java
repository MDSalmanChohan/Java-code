import java.util.ArrayList;
/**
 * ChangeAnItemarr
 */
public class ChangeAnItemarr {

    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Bmw");
        cars.add("ford");
        cars.add("mazda");
        cars.set(1, "lion");
        System.out.println(cars);
    }
}