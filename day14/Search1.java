import java.lang.String;
public class Search1 {

    public static void main(String irs[]) {

        searchArray();
    }

    public static void searchArray() {
        int arr[] = getMeArray(15);

       for (int i = 0; i < arr.length; i++) {
           System.out.print(" " + arr[i]);
        }
      //  CODE here

        System.out.println("\n******1. search number great than 45");
       // 1. search number great than 45

        for (int i = 0; i < arr.length; i++) {

           if (arr[i] > 45) {
                System.out.println("search number great than 45 " + arr[i]);
            }
        }
      //  2. searh number less than 33

        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 33) {
                System.out.println(" searh number less than 33 " + arr[i]);
            }

        }
       // 3. search number between 20 an 80
        for (int i = 0; i < arr.length; i++) {

           if (arr[i] >= 20 && arr[i] <= 80) {
                System.out.println(" search number between 20 an 80 ," + arr[i]);
           }
        }

       // 4. Print all odd number and even number

        for (int i = 0; i < arr.length; i++) {

          //  even number
           if (arr[i] % 2 == 0) {
                System.out.println(" Print all even number" + arr[i]);
            }
           // odd number
            if (arr[i] % 2 != 0) {
                System.out.println(" Print all odd number" + arr[i]);
           }
        }

    //    % -- Mod 5/2 --> 2.5 (int) --> 2

        // 5. Total sum of all number
        int total = 0;
        for (int i = 0; i < arr.length; i++) {

            total = total + arr[i];
        }
        System.out.println(" Total sum of all number:" + total);

       System.out.println("\n______________");

      //  6. total all odd number
        total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                  total = total + arr[i];             
            }
        }
        //System.out.println("total all odd number" + total);
        // 7. total all even number
        total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                  total = total + arr[i];             
            }
        }

        //odd but mor than 50 ; total 
        total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 ||arr[i]>=70 )  {
                  total = total + arr[i];             
            }
        }
        System.out.println("total number" + total);
        //  

    }

    private static int[] getMeArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
