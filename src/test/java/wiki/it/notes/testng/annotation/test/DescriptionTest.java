package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DescriptionTest {

    @Test(description = "simple test")
    void testA() {
        assertEquals("string A", "string A");
    }
}
