package samina.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ReadFileWithClass {
  public static void main(String[] args) {
    try {

      ArrayList<SalesEntry> entryList = new ArrayList<SalesEntry>();

      File myObj = new File("filename copy.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] lineArray = data.split(",");

        int number = Integer.parseInt(lineArray[1]);
        SalesEntry entry = new SalesEntry();
        entry.name = lineArray[0];
        entry.amount = number;
        entryList.add(entry);
      }
      int total = 0;
      for (int i = 0; i < entryList.size(); i++) {
        SalesEntry entry = entryList.get(i);
        if (!entry.name. equalsIgnoreCase("Salman")) {
           continue;
        }
        
        System.out.println(entry.name + " "+ entry.amount);
        total=total+entry.amount;

      }

      System.out.println(total);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
