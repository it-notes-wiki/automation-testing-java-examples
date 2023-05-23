package wiki.it.notes.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleTest {

    private String expectedString;

    @BeforeClass
    void setupClass() {
        System.out.println("Start tests");
        expectedString = "string";
    }

    @Test
    void firstTest() {
        assertEquals("string".toUpperCase(), expectedString);
    }

    @Test
    void secondTest() {
        assertEquals("string", expectedString);
    }

    @AfterClass
    void tearDownClass() {
        System.out.println("End tests");
    }
}
