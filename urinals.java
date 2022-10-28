// Author: Vidit Sanghvi
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
public class urinals {

    public static void main(String[] args) {

        int a = openfile("urinals.dat");

    }

    public static int openfile(String Filename)
    {
        try {
            File datfile = new File(Filename);

            Scanner myReader = new Scanner(datfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                return 1;
            }
            }
            catch(FileNotFoundException e)
            {
                System.out.println(e.getMessage());
                return -1;
            }

        return 0;


    }
}
