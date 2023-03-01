import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalmaanCMD {

    public static void main(String[] args) {
        Scanner cmdScan = new Scanner(System.in);
        String currDir = "E:\\Java";
        while (true) {
            printAllFileInDir(currDir);
            System.out.println("Tell me what you want, write exit to close.");
            String input = cmdScan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    int number = Integer.parseInt(input);
                
                    File myfile = getFileAtIndex(currDir, number);
                    if (myfile.isDirectory()) {
                        currDir = myfile.getAbsolutePath();
                        continue;
                    } else {
                        printContentOfFile(myfile);
                    }
                } catch (Exception e) {
                    File myfile = new File(currDir + "\\" + input.trim());
                    if (myfile.isDirectory()) {
                        currDir = myfile.getAbsolutePath();

                        continue;
                    } else {
                        printContentOfFile(myfile);
                    }
                }

            }

        }
    }

    private static void printContentOfFile(File myfile) {

        try {
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static File getFileAtIndex( String currdir , int  index ) {
        File dir = new File( currdir);

        File fileNames[] = dir.listFiles();
        if (fileNames == null) {
            return null ;
        }
        return fileNames[index] ;

       }

    private static void printAllFileInDir(String input) {
        File dir = new File(input);

        File fileNames[] = dir.listFiles();
        if (fileNames == null) {
            return;
        }

        for (int i = 0; i < fileNames.length; i++) {
            if (fileNames[i].isHidden() || fileNames[i].getName().contentEquals(".class")) {
                continue;
            }
            if (fileNames[i].isDirectory()) {
                System.out.println(i + "\t" + fileNames[i].getName());
            } else {
                System.out.println(i + "\t" + fileNames[i].getName());
            }

        }
    }
}
