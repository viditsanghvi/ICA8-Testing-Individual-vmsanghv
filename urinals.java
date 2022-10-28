// Author: Vidit Sanghvi
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
public class urinals {

    public static void main(String[] args) {
        urinals obj = new urinals();
        obj.Readfile("urinals.dat");

    }

    public String Readfile(String Filename)
    {
        try {
            File datfile = new File(Filename);

            Scanner myReader = new Scanner(datfile);
            if (datfile.length() == 0) { return "File Found but File is Empty"; }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
            int sol = countUrinals(data);
            System.out.print(sol);
            }
                return "File Found";
        }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
                return e.getMessage(); // when file does not exist
            }




    }
     Boolean isgoodstring(String urinalstring)
    {
        int n = urinalstring.length();
        for(int i=1; i<n; i++)
        {
            if(urinalstring.charAt(i)=='1' && urinalstring.charAt(i-1)=='1')
            {
                return false;
            }

        }
        return true;
    }

    int countUrinals(String urinalstring )
    {   int urinals=0;
        int len = urinalstring.length();
        if(!isgoodstring(urinalstring)) {
            return -1;
        }
        for(int j=0; j<len; j++)
        {
            if(urinalstring.charAt(j)=='0')
            {
                if((j-1<0 || urinalstring.charAt(j-1)=='0') && (j+1>=len || urinalstring.charAt(j+1)=='0'))
                {
                    urinals++;
                    j++;
                }
            }
        }
        return urinals;

    }
    String outputFileName()
    {

        String filename = "rule.txt";
        int count=0;
        File file = new File(filename);

        while(true)
        {
            if(file.exists())
            {
                count++;
                filename = filename.substring(0,4) + count + ".txt";
                file = new File(filename);
            }
            else
            {
                break;
            }
        }
        return filename;
    }
}

