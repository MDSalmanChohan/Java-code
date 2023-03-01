public class Search11 {
    public static void main(String[] args) {
        SearchSalman();
    }

    public static void SearchSalman() {

        int arr[] = letMeArray(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
        // 1. search number great than 63

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 63) {
                System.out.println("search number great than 63 " + arr[i]);
            }
        }

        // 2. print b/w 15 and 70

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 15 && arr[i] <= 70) {
                System.out.println(" prin b/w 15 qnd 70         " + arr[i]);
            }
        }
            //3. prin total sum of  all number 
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total= total+ arr[i]; 
                 }
            System.out.println("prin sum of all number   "   + total );


                //4. sum of  all odd number

                total = 0;
                for (int i = 0; i < arr.length; i++) {
                    if ( arr[i] %2!= 0 ) {
                        total= total+arr[i];
                        
                    }
                    
                }
                        System.out.println( " total number " + total );

        // 5. searh number less than 38

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 38) {
                System.out.println(" searh number less than 38 " + arr[i]);

            }
        }
        // 7. prin sum of all even number
                total=0;
         for (int i = 0; i < arr.length; i++) {
                      if ( arr[i]%2==0) {
                          
                        total= arr[i]+ total;
                      }
                         
                    System.out.println("sum of even number" + total);
         }

              //prin odd but more than 40
                    total=0;
                    for (int i = 0; i < arr.length; i++) {
                        if ( arr[i]%2==0 || arr[i]>=40 ) {
                            
                        }
                        System.out.println(" odd but more than 40 " + arr[i] );
                        
                    }
              
              
        // 6. prin all odd and even number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(" prin odd number" + arr[i]);

            }
            if (arr[i] % 2 == 0) {
                System.out.println(" prin even number" + arr[i]);

            }

        }
    }

    private static int[] letMeArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}