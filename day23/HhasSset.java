import java.util.HashSet;
public class HhasSset {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(4);
        number.add(6);
        number.add(9);

        for (int i = 0; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " was found in the set. ");
            } else {
                System.out.println(i + " was not found in the set. ");
            }
                
            }
            
        }
    }

    

