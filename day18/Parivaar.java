public class Parivaar {
    
//import javax.print.attribute.standard.PresentationDirection;



    String name;
    String gender = "Male";
    int age;
    int yearOfBirth = 0;

    public static void main(String[] args) {

        Parivaar family[] = new Parivaar[3];

        family[0] = new Parivaar();
        family[0].name = "Salman khan";
        family[0].age = 19;
        family[0].yearOfBirth = 2022 - family[0].age;


        family[1] = new Parivaar();
        family[1].name = "Islam khan ";
        family[1].age = 53;
        family[1].yearOfBirth = 2022 - family[1].age;


        family[2] = new Parivaar();
        family[2].name = "Samina";
        family[2].age = 47;
        family[2].yearOfBirth = 2022 - family[2].age;

         
      
      

    
        for (int i = 0; i < family.length; i++){
            family[i].printPersonalCard();
        }
    }

    private void printPersonalCard() {

        System.out.println(" i am  " + name + "  i m " + age + "  year oldd " +  "  mai tatiri mai " +    yearOfBirth + " paida hai..... ");
    }
}

