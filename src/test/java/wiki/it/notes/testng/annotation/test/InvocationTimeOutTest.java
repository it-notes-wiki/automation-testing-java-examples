package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InvocationTimeOutTest {

    @Test(invocationCount = 4, invocationTimeOut = 600)
    void testA() throws InterruptedException {
        Thread.sleep(200);
        assertEquals("string A", "string A");
    }
}
