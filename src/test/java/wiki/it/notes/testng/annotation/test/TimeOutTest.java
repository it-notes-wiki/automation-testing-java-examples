package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeOutTest {

    @Test(timeOut = 500)
    void testA() throws InterruptedException {
        Thread.sleep(600);
        assertEquals("string A", "string A");
    }
}
