import java.io.File;
import java.io.IOException;

public class FileFolder {

    public static void main(String[] args) {

        File myObj   = new File (" C:\\Users\\hp\\Pictures\\2018-07");
        if (myObj.delete( )) {
            
            System.out.println("Deleted the file : "+ myObj.getName());
            
        } else {
            System.out.println(" Failed to delete the filed...");
            
        }


        



    }
    
}
