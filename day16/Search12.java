public class Search12 {
    public static void main(String args []) {
         
        searchArray();

    }
    public static void searchArray(){
        int arr[]= getMeArray(15);

        int copyArr[] = new int[15];

        int oddIndex=0  , evenIndex=0;  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]) ;
            copyArr[i] = arr[i] * 2;
            if(arr[i]%2!=0) {
                oddIndex++;
            } else  {     
                evenIndex++;
            }
        }

        
        int oddArr[] = new int[oddIndex];
        for (int i = 0, j=0; i < arr.length; i++) {
            if(arr[i]%2!=0) {
                oddArr[j] = arr[i];
                j++;
            }
        }
        int evenArr[]=new int [evenIndex];
        for (int i= 0;  i<evenArr.length; i++)  {
            if (arr[i]%2==0) {
                evenArr[j]=arr[i];
                j++;
                
                
            }
        }
        
        System.out.print ("\n*\n");
          int h= 0;
         while ( h<oddArr.length) {
             //System.out.print ( copyArr[h] +" ");
             System.out.print ( oddArr[h] +" ");
             h++;
        }
    }
        
    
    private static int[] getMeArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}

