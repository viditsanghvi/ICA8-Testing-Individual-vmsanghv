// Author: Vidit Sanghvi
import java.io.*;

import java.util.Scanner;
public class urinals {

    public static void main(String[] args) {
        System.out.println("Please copy paste the input in urinals.dat file and run the code.");
        System.out.println("Press 1 to continue and 0 to exit");
        Scanner myObj = new Scanner(System.in);
        String inputs = myObj.nextLine();  // Read user input
        if (inputs.equals("1")) {

            urinals obj = new urinals();
            obj.Readfile("urinals.dat");
            System.out.println("Check rule[].txt file for output");
        }
        else if (inputs.equals("0"))
            System.out.println("Exiting");
        else
        {
            System.out.println("Please enter a valid input");
        }
    }


    public String Readfile(String Filename)
    {

        String fname= this.outputFileName();
        try {
            File datfile = new File(Filename);

            Scanner myReader = new Scanner(datfile);
            if (datfile.length() == 0) { return "File Found but File is Empty"; }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
            int sol = countUrinals(data);

                writeinFile(sol,fname);
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
    void writeinFile(int sol, String nameoffile)
    {
        try
        {

            FileWriter fw = new FileWriter(nameoffile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            int ans = sol;
            bw.write(Integer.toString(ans));
            bw.newLine();
            bw.close();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

