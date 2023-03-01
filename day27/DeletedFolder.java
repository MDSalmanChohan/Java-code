 import java.io.File ;
public class DeletedFolder {
    public static void main(String[] args) { 
        File myObj = new File("C:\\Users\\hp\\deleme"); 
        if (myObj.delete()) { 
          System.out.println("Deleted the folder: " + myObj.getName());
        } else {
          System.out.println("Failed to delete the folder.");
        } 
      } 
    
}




