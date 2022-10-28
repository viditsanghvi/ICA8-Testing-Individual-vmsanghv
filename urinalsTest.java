import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    // This Junit tests if the file exists or not
    // This particular testcase checks if "urinals.dat" is found or not
    @org.junit.jupiter.api.Test
    void openfile() {
        urinals testcase = new urinals();
        assertEquals(1,testcase.openfile("urinals.dat"));
    }

}