import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    // This Junit tests if the file exists or not
    // This particular testcase checks if "urinals.dat" is found or not
    @org.junit.jupiter.api.Test
    void fileexists() {
        urinals testcase = new urinals();
        assertEquals(1,testcase.checkFileExists("urinals.dat"));
    }
    // Misspelled the file name to show it does not exist
    @org.junit.jupiter.api.Test
    void fileDoesNotExists() {
        urinals testcase = new urinals();
        assertEquals(-1,testcase.checkFileExists("urvinals.dat"));
    }

}