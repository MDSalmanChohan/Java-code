import java.io.File;
import java.io.IOException;


public class CreateFileDir {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\hp\\PycharmProjects\\mfile.x");
            if (myObj.createNewFile()) {
                System.out.println("File created : " + myObj.getName());
                System.out.println(" Absloutly path :"+ myObj.getAbsolutePath());
                
            } else {
                System.out.println(" File Already exist ...");
                
            }
        } catch (IOException e) {
            System.out.println(" An error occurred ..");
            e. printStackTrace();
            
        }
        
    }
    
}
