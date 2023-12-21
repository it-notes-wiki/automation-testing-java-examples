package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class DependsOnGroupsTest {

    @Test(groups = "smoke")
    void testA() {
        assertEquals("string A", "string A");
    }

    @Test(groups = "smoke")
    void testB() {
        assertNotEquals("string B", "string B");
    }

    @Test(dependsOnGroups = "smoke")
    void testC() {
        assertEquals("string C", "string C");
    }
}
