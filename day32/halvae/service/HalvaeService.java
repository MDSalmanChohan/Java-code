package halvae.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

import halvae.data.Mithai;

public class HalvaeService {
    //

    private static ArrayList<Mithai> yusuf = new ArrayList<>();

    public void setupHalvaeLibrary() {

        Mithai m = new Mithai("Rasgulla", "UP", "Sweet", 300);
        yusuf.add(m);
        m = new Mithai("Imarti ", "UP", "hot", 790);
        yusuf.add(m);
        m = new Mithai("Chamcham", "Delhi", "Sweet", 1300);
        yusuf.add(m);
        m = new Mithai("Jalebi", "UP", "Amazing", 400);
        yusuf.add(m);
        m = new Mithai("JamunBlack", "Panjab", "Wow", 500);
        yusuf.add(m);
        m = new Mithai("Balushahi", "UP", "super", 800);
        yusuf.add(m);

    }

    public void downloadAll() {
        
        try {
			FileWriter myWriter = new FileWriter( "Halvae_Statement.txt");

			 
			for (Mithai  softing : yusuf) {

				myWriter.write( softing.name + ","+ softing.state + "," +softing.taste+ "," + softing.price+"\n");

			}
			myWriter.close();
			System.out.println(" Succesfull wrote to the file .." +" \n");

		} catch (IOException e) {
			System.out.println(" an error occurred . " +"\n");
			e.printStackTrace();

		}

    }

    public void printAll() {
        for (int i = 0; i < yusuf.size(); i++) {
            Mithai m = yusuf.get(i);
            m.printMithai();
        }
    }

    public void searchByPrice(int price) {
        for (int i = 0; i < yusuf.size(); i++) {
            Mithai m = yusuf.get(i);
            if (m.price <= price) {
                m.printMithai();
            }
        }
    }

    public void searchByTaste(String taste) {
        for (int i = 0; i < yusuf.size(); i++) {
            Mithai m = yusuf.get(i);
            if (m.taste == taste) {
                m.printMithai();
            }
        }
    }

    public void searchByState(String state) {
        for (int i = 0; i < yusuf.size(); i++) {
            Mithai m = yusuf.get(i);
            if (m. state.equalsIgnoreCase(state)) {
                m.printMithai();
            }
        }
    }

}