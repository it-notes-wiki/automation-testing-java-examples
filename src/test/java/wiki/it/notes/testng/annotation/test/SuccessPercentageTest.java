package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SuccessPercentageTest {

    int count = 0;

    @Test(invocationCount = 5, successPercentage = 60)
    void testA() {
        count ++;
        assertTrue(count < 4);
    }
}
