//import java.util.jar.Attributes.Name;

public class Person {
   
      String name;
       String gender ="Male";
       int age;
      int yearOfBirth=0;

    

     public  void printJanamtithi() { 
        System.out.println( " mera janam "+  yearOfBirth +"   mai hua hai  ");
         

     }


    public void printPersonalCard()  {

        System.out.println("Hi! my name is "+name + ". I am "+gender + ". My age is "+age );

    }



}
