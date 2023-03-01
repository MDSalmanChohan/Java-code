
import java.io.File;
import java.io.IOException;


public class Wap1PrintFile {

    public static void main(String[] args) {
        try {
            File myObj = new File("E:\\java\\day16");
            myObj.canWrite();
            
            File fileNames []= myObj.listFiles();
            if (fileNames==null) {
                System.out.println(" no obj found ");
                return;
                
            }
              
            for (int i = 0; i < fileNames.length; i++) {
                if (fileNames[i].isDirectory()) {
                    continue;
                    
                }
                int size = (int)fileNames[i].length()/1024;
                if (fileNames[i].isHidden()) {
                    System.out.println((i+1)+": "+fileNames[i].getName()+" "+size+"KB  " + " is a  hidden ."); 
                    
                }else  {
                    System.out.println( (i+1)+": "+fileNames[i].getName()+" "+size+"KB  " + " its are visible..");
                }
                
               
            }

            int choice = 13;
         

           File fileObjobeDeleed = fileNames [choice -1];

           System.out.println(fileObjobeDeleed.getName()+" is going to be deleted");
           //fileObjobeDeleed.delete();
            
        } catch (Exception e) {
            System.out.println(" An error occurred .");
            e.printStackTrace();
        }
    }
}
