package wiki.it.notes.testng.annotation.test;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ExpectedExceptionsTest {

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    void testA() {
        List<String> strings = List.of("A", "B", "C");
        assertEquals(strings.get(3), "D");
    }
}
