import java.util.Scanner;

public class Ffffamily {
    public static void main(String[] args) {

        Scanner reader   = new Scanner (System.in );


        
    Family family[] = new Family[3];

       for (int i = 0; i < family.length; i++) {
           
        System.out.println( "Enter family details : name ; age ; yearOfBirth " );

        family[i] = new Family();
        family[i].name = reader.nextLine();
        family[i].age =  reader.nextInt();
        family[i].yearOfBirth =  reader.nextInt();
         
        reader.nextLine();
        family[i].printFamilydetails();
       }
       System.out.println(" name  ");

        String kahaJanaHain = reader.nextLine();

        System.out.println("age    ");
        
        String kahaTakJanaHain = reader.nextLine();

        reader.close();

        for (int i = 0; i < family.length; i++) {
          
            family[i].printPersonalCard();



        // family[0] = new Person();
        // family[0].name = "Salman khan";
        // family[0].age = 19;
        // family[0].yearOfBirth = 2022 - family[0].age;

        // family[1] = new Person();
        // family[1].name = "Islam khan ";
        // family[1].age = 53;
        // family[1].yearOfBirth = 2022 - family[1].age;

        // family[2] = new Person();
        // family[2].name = "Samina";
        // family[2].age = 47;
        // family[2].yearOfBirth = 2022 - family[2].age;

        
    }
    
}}
