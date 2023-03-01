import java.io.File;
import java.io.IOException;
/**
 * CreateFile
 */
public class CreateFile {

    public static void main(String[]argss){

        try {
            
            File myObj = new File (" salmankhandabangg.txt");
            if (myObj.createNewFile()) {
                System.out.println(" File created :" + myObj.getName());
            } else {
                System.out.println(" File already exist ..");
                
            }
        } catch (IOException e) {
            System.out.println("An error occurred....");
            
            e.printStackTrace();
        }
    }
