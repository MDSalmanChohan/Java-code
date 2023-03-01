public class Mmediffel {
  //  public class MethodeWith_If_Else {
        static void checkAge ( int age   ){
                if (age < 18) {
                    System.out.println("Acces denied - you are not old enough!");
                    
                } else {
                    System.out.println(" Access granted - u are old enough!");
                }
        }
        public static void main(String[] args) {
            checkAge( 22);
        }
    }

