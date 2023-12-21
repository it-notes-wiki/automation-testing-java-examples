package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class DependsOnMethodsTest {

    @Test
    void testA() {
        assertEquals("string A", "string A");
    }

    @Test
    void testB() {
        assertNotEquals("string B", "string B");
    }

    @Test(dependsOnMethods = {"testA", "testB"})
    void testC() {
        assertEquals("string C", "string C");
    }
}
