import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class SalCommandprom {

    public static void main(String[] args) {
       
           
        
            while (true) {
                try {
            printAllInDirectory(String dirName);
    
            File myObj = new File("E:\\java\\day16");
            
            
            File fileNames []= myObj.listFiles();
            if (fileNames==null) {
                System.out.println(" no obj found ");
                return;
                
            }
              
            for (int i = 0; i < fileNames.length; i++) {
                // if (fileNames[i].isDirectory()) {
                //     continue;
                
                
                    
                // }
                
                int size = (int)fileNames[i].length()/1024;
                if (fileNames[i].isDirectory()) {
                    System.out.println((i+1)+": "+fileNames[i].getName()+" "+size+"KB  " + " is a  hidden ."); 
                    
                }else  {
                   System.out.println( (i+1)+": "+fileNames[i].getName()+" "+size+"KB  " + " its are visible..");
               
               
               
                }    myWriter.write("File in Java might be tricky , but it is fun enough! ");
                 myWriter.close();
                 System.out.println(" Succesfull wrote to the file ..");
                }
                {  
                    File myObj = new File("ReadFile.java");
                    Scanner myReader = new Scanner (myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                        
                    }
                    myReader.close();
                //( shoe  )
                if (myObj.delete( )) {
                    
                    System.out.println("Deleted the file : "+ myObj.getName());
                    
                } else {
                    System.out.println(" Failed to delete the filed...");
                    
                }
                
               
            }

            int choice = 13;
         

           File fileObjobeDeleed = fileNames [choice -1];



           
           System.out.println(fileObjobeDeleed.getName()+" is going to be deleted");
          
           
     } catch (Exception e) {
            System.out.println(" An error occurred .");
            e.printStackTrace();
        }
    }

    private static void printSKD() {
        System.out.println(" . konsi Directory se shuru kre....");
        System.out.println("Press 1 .   Show   E >>>>>  drive in   Java ....");
        System.out.println("Press 2 . Show all visible ");
        System.out.println("Press 3 . Show  File  ");
        System.out.println("Press 4 .Show Folder ");
        System.out.println("Press 5 for exit");
    }
}




