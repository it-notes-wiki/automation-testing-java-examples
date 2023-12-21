package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PriorityTest {

    @Test(priority = 3)
    void testA() {
        assertEquals("string A", "string A");
    }

    @Test(priority = 2)
    void testB() {
        assertEquals("string B", "string B");
    }

    @Test(priority = 1)
    void testC() {
        assertEquals("string C", "string C");
    }
}
