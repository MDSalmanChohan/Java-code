package car.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import car.data.Car;

public class BookingService {

    private static ArrayList<Car> cars = new ArrayList<>();



    public void setupCarBookingserviceFromFile() {

        try {

            File myObj = new File("CarShowroom_Statement.txt");
            cars = new ArrayList<>();
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] lineArray = data.split(",");

                float rate = Float.parseFloat(lineArray[3]);
                int year = Integer.parseInt(lineArray[2]);
                Car  sallu = new Car();
                sallu.model = lineArray[0];
                sallu.rate =rate;
                sallu.company = lineArray[1];
                sallu.colour = lineArray[4];
                sallu.year= year;

                //Car sallu = new Car(lineArray[0],lineArray[1], lineArray[4], year, rate);

                cars.add(sallu);
            }
            myReader.close();

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }



    public void searchByCompany(String company) {
        for (int i = 0; i < cars.size(); i++) {
            Car sallu = cars.get(i);
            if (sallu.company.equalsIgnoreCase(company)) {
                sallu.printCar();
            }
        }
    }

    public void searchByYear(int year) {
        for (int i = 0; i < cars.size(); i++) {
            Car sallu = cars.get(i);
            if (sallu.year >= year) {
                sallu.printCar();
            }
        }
    }

    public void searchByColour(String colour) {
        for (int i = 0; i < cars.size(); i++) {
            Car sallu = cars.get(i);
            if (sallu.colour.equalsIgnoreCase(colour)) {
                sallu.printCar();
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < cars.size(); i++) {
            Car sallu = cars.get(i);
            sallu.printCar();
        }
    }

    public void downloadAll() {
        try {
            FileWriter myWriter = new FileWriter("CarShowroom_Statement.txt");

            for (Car softing : cars) {

                myWriter.write(softing.model + "," + softing.company+ "," + softing.year+ "," + softing.rate+ "," + softing.colour +"\n");

            }
            myWriter.close();
            System.out.println(" Succesfull wrote to the file .." + " \n");

        } catch (IOException e) {
            System.out.println(" an error occurred . " + "\n");
            e.printStackTrace();

        }
    }



    public void createNewCarObject(String model, String company, int year, Float rate, String colour) {
        Car sallu = new Car ();
        sallu.model= model;
        sallu.company=company;
        sallu.year=year;
        sallu.rate= rate;
        sallu.colour=colour;
        cars.add(sallu);

    }

}
