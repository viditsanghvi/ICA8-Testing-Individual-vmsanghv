// Author: Vidit Sanghvi
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
public class urinals {

    public void main(String[] args) {

        Readfile("urinals.dat");

    }

    public String Readfile(String Filename)
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
     Boolean isgoodstring(String str)
    {
        int n = str.length();
        for(int i=1; i<n; i++)
        {
            if(str.charAt(i)=='1' && str.charAt(i-1)=='1')
            {
                return false;
            }

        }
        return true;
    }
}
