package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlwaysRunTest {

    @Test
    void testA() {
        assertEquals("string A", "string B");
    }

    @Test(alwaysRun = true, dependsOnMethods = "testA")
    void testB() {
        assertEquals("string A", "string A");
    }
}
