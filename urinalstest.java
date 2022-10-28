import static org.junit.jupiter.api.Assertions.*;

class urinalstest {
    // This Junit tests if the file exists or not
    // This particular testcase checks if "urinals.dat" is found or not
    @org.junit.jupiter.api.Test
    void fileexists() {
        urinals testcase = new urinals();
        assertEquals("File Found",testcase.Readfile("urinals.dat"));
    }
    // Misspelled the file name to show it does not exist
    @org.junit.jupiter.api.Test
    void fileDoesNotExists() {
        urinals testcase = new urinals();
        assertEquals("urvinals.dat (The system cannot find the file specified)",testcase.Readfile("urvinals.dat"));
    }
    // Created a dummy file to check if it throws "File empty"
    @org.junit.jupiter.api.Test
    void FileFoundBuEmpty() {
        urinals testcase = new urinals();
        assertEquals("File Found but File is Empty",testcase.Readfile("EmptyFile.dat"));
    }
    @org.junit.jupiter.api.Test
    void Checkingbadstring() {
        urinals testcase = new urinals();
        assertEquals(false,testcase.isgoodstring("1011"));
    }
    @org.junit.jupiter.api.Test
    void CheckingGoodString1() {
        urinals testcase = new urinals();
        assertEquals(true,testcase.isgoodstring("1001"));
    }
    @org.junit.jupiter.api.Test
    void CheckingCountUrinals1() {
        urinals testcase = new urinals();
        assertEquals(1,testcase.countUrinals("10001"));
    }
    @org.junit.jupiter.api.Test
    void CheckingCountUrinals2() {
        urinals testcase = new urinals();
        assertEquals(0,testcase.countUrinals("1001"));
    }
    @org.junit.jupiter.api.Test
    void CheckingCountUrinals3() {
        urinals testcase = new urinals();
        assertEquals(-1,testcase.countUrinals("11"));
    }



}