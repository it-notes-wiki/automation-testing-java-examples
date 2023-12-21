package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InvocationCountTest {

    @Test(invocationCount = 3)
    void testA() {
        assertEquals("string A", "string A");
    }
}
