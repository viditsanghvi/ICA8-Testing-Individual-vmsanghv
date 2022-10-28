// Author: Vidit Sanghvi
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
public class urinals {

    public static void main(String[] args) {

       // int a = checkFileExists("urinals.dat");

    }

    public static int checkFileExists(String Filename)
    {
        try {
            File datfile = new File(Filename);

            Scanner myReader = new Scanner(datfile);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine(); }
                return 1;
        }
            catch(FileNotFoundException e)
            {
                System.out.println(e.getMessage());
                return -1; // when file does not exist
            }




    }
    public static int checkFileEmpty(String Filename)
    {

    return 0;
    }
}
