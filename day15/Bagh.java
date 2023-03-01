public class Bagh {
public static void main(String[] args) {
    String [] cars = { "Volvo", "BMW"," Ford", "mazda"};
    for ( int i = 0; i < cars.length; i++) {
        System.out.println(cars [i] );
       

    }
    System.out.println(" sari car ki counting "+cars.length  +  "  hai")  ;

    String [] mars = { "Volvo", "BMW"," Ford", "mazda"};  
    for (String j : mars) {
        System.out.println(j);
    }
}

}