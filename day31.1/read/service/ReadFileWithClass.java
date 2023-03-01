package read.service;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import read.data.SalesEntry;

public class ReadFileWithClass {

  private ArrayList<SalesEntry> entryList = new ArrayList<SalesEntry>();

  public void setupReadLibrary() {
    try {
      File myObj = new File("Salman_Statement.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {

        String data = myReader.nextLine();
        String[] lineArray = data.split(",");

        int number = Integer.parseInt(lineArray[1]);
        SalesEntry entry = new SalesEntry();
        entry.name = lineArray[0];
        entry.amount = number;
        entry.date = lineArray[2];
        entryList.add(entry);

      }
      myReader.close();
    } catch (Exception e) {
      System.out.println("Some error " + e);
    }
  }

  public void searchByName(String name) {
    int total = 0;

    for (int i = 0; i < entryList.size(); i++) {
      SalesEntry entry = entryList.get(i);

      if (entry.name.equalsIgnoreCase(name)) {

        System.out.println(entry.date + "\t" + entry.date + "\t" + entry.amount);
        total += entry.amount;
      }
    }
    System.out.println("Total: " + total);
  }

  public void searchByDate(String date) {
    int total = 0;

    for (int i = 0; i < entryList.size(); i++) {
      SalesEntry entry = entryList.get(i);

      if (entry.date.equalsIgnoreCase(date)) {

        System.out.println(entry.date + "\t" + entry.date + "\t" + entry.amount);
        total += entry.amount;
      }
    }
    System.out.println("Total: " + total);
  }

  public void printAll() {

    int total = 0;

    for (int i = 0; i < entryList.size(); i++) {
      SalesEntry entry = entryList.get(i);
      System.out.println(entry.name + "\t" + entry.date + "\t" + entry.amount);
      total += entry.amount;
    }
    System.out.println("Total: " + total);
  }

  public void addNewEntry(String name, String date, int amount) {
    try {
      FileWriter myWriter = new FileWriter("Salman_Statement.txt");
     
      //to write old entry
      for (SalesEntry salesEntry : entryList) {
        myWriter.write(salesEntry.name + "," + salesEntry.amount + "," + salesEntry.date+"\n");
      }

      myWriter.write(name + "," + amount + "," + date+"\n");
      myWriter.close();
      setupReadLibrary();
    } catch (Exception e) {
      System.out.println(" an occured ." +e);
    }
  }
}