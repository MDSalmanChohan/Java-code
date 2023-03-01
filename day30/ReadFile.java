import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ReadFile {
  public static void main(String[] args) {
    try {

      ArrayList<Integer> numbers = new ArrayList<Integer>();
      ArrayList<String> names = new ArrayList<String>();

      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] lineArray = data.split(",");

        int number = Integer.parseInt(lineArray[0]);
        numbers.add(number);
        names.add(lineArray[1]);

        numbers.add(number);
      }
      int total = 0;
      for (int i = 0; i < names.size(); i++) {
        if (!names.get(i).equalsIgnoreCase("Salman")) {
           continue;
        }
        total = total + numbers.get(i);
        System.out.println(numbers.get(i) + " " + names.get(i));

      }

      System.out.println(total);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
