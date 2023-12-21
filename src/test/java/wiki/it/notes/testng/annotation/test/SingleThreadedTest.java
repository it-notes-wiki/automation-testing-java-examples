package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(singleThreaded = true)
public class SingleThreadedTest {

    public void testA() {
        assertEquals("string A", "string A");
    }

    public void testB() {
        assertEquals("string B", "string B");
    }

    public void testC() {
        assertEquals("string C", "string C");
    }
}
