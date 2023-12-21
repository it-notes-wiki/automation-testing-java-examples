package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GroupsTest {

    @Test(groups = "smoke_tests")
    void testA() {
        assertEquals("string A", "string A");
    }

    @Test(groups = "smoke_tests")
    void testB() {
        assertEquals("string B", "string B");
    }

    @Test
    void testC() {
        assertEquals("string C", "string C");
    }
}
