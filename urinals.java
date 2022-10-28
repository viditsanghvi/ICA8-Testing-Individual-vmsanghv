// Author: Vidit Sanghvi
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
public class urinals {

    public static void main(String[] args) {

       String a = Readfile("urinals.dat");

    }

    public static String Readfile(String Filename)
    {
        try {
            File datfile = new File(Filename);

            Scanner myReader = new Scanner(datfile);
            if (datfile.length() == 0) { return "File Found but File is Empty"; }

//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine(); }
                return "File Found";
        }
            catch(FileNotFoundException e)
            {
                System.out.println(e.getMessage());
                return e.getMessage(); // when file does not exist
            }




    }
    public static int checkFileEmpty(String Filename)
    {

    return 0;
    }
}
