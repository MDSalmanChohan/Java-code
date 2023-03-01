
// import java.io.File;
// File myobj = new File
/**
 * FileHandling
 */
import java.io.File;
import java.io.IOException;

public class createFile {

    public static void main(String[] args) {
        try {
            File myObj = new File("e:/filenamedfff.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created : " + myObj.getName());
            } else {
                System.out.println(" File already exist .");

            }
        } catch (IOException e) {
            System.out.println(" An error occurred .");
            e.printStackTrace();
        }
    }
}