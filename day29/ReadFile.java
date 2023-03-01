
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ReadFile {
  public static void main(String[] args) {
    try {

      ArrayList<Integer> numbers = new ArrayList<Integer>();

      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        int number = Integer.parseInt(data);
        numbers.add(number);
      }
      int total = 0;
     for (int i = 0; i < numbers.size(); i++) {
       total= total+ numbers.get(i) ;
        
     }
     System.out.println(total);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
