import java.util.Scanner;

public class Iinput {

    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println(" EnterNAME , age and salary ");

        String name = myObj.nextLine ();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();



        System.out.println(" Name :" + name);
        System.out.println("Age : "+ age);
        System.out.println("Salary: " + salary);

        

    }
    
}
