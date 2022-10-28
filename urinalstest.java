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

}