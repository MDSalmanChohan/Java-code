package halvae.data;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

 





public class Mithai {
    public int price ;
    public String name,state, taste;

    public Mithai(String name, String state, String taste, int price) {

        this.name = name;
        this.price = price;
        this.state = state;
        this.taste = taste;
  

    
        System.out.println(name+" made in "+state+". Taste like "+taste+", price: "+price);
    

    }

    public Mithai() {
    }

    public void printMithai() {
    }






   

}

    


    

