import java.lang.String;

public class Main {
  public static void main(String[] args) {
    String name = "Salman ";

    int value = name.length();
    System.out.println(value);
    String lstring = name.toUpperCase();

    System.out.println(name.substring(2));
    System.out.println(name.substring(1, 4));
    System.out.println(name.replace('a', 'o'));
    System.out.println(name.replace("al", "kg"));
    System.out.println(name.startsWith("sal"));
    System.out.println(name.endsWith("man"));
    System.out.println(name.equals("salman"));

  }
}