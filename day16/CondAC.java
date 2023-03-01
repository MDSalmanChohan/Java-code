/**
 * CondAC
 */
public class CondAC {

    public static void main(String[] args) {
       // int j=10;
    //    int =0;
    //  int []  = { 3 ,4,5,6,16};
       for (int j = 10; j < args.length; j++) {
           System.out.println(j + " ye for loop ka hai "); 
        }
        int i=0;
        while ( i<6) {
            System.out.println(i + " ye while loop ka  hai ");
            i++;
        }
         i = 0;
        while (i < 5) {
            System.out.println(i + "ye while loop ka hai or do loop ka hai ");
          i++;
         i=0;
        do {
            System.out.println(i + " ye do   loop ka hai or while  loop ka hai");
            i++;

        }
        while (i<5);
        }  
         
        for ( i=0; i <8; i++) {
            System.out.println(i );
            System.out.println(" iske aage agle vale ka hai ");
        }
        i=0;
        do {
            System.out.println(i);
           // System.out.println(i);
            i++;

        }
       while (i<5);
    for (i = 0; i < 5; i++) {
        System.out.println(i +  " e while for loop ka hai ");
      }  
    for ( i = 0; i<=10; i=i+2) {
        System.out.println(i);

        
    }
    for ( i = 0; i <10; i++) {
        if (i==4 || i==5) {
            continue;
        }
        System.out.println(i);
    }
   

 i=0;
while ( i<10) {
    //System.out.println(i);
    
    if (i==4) {
        i++;
        continue;
    }
    

System.out.println(i);
  
i++;
    }

}
}