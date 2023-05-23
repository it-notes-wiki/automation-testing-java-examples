package wiki.it.notes.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.String.format;
import static org.testng.Assert.assertEquals;

public class SimpleDataProviderTest {

    @DataProvider(name = "data")
    public Object[][] getTestData() {
        return new Object[][] {
                {5, 6, 11},
                {-3, -2, -5},
                {7, -3, 4}
        };
    }

    @Test(dataProvider = "data")
    void intSumTest(int first, int second, int expectedResult) {
        int actualResult = first + second;
        System.out.printf("Test data: {%d, %d, %d}%n", first, second, expectedResult);
        assertEquals(actualResult, expectedResult, format("%d not equals %d", actualResult, expectedResult));
    }

    @Test(dataProvider = "data", dataProviderClass = DataClass.class)
    void intProductTest(int first, int second, int expectedResult) {
        int actualResult = first * second;
        System.out.printf("Test data: {%d, %d, %d}%n", first, second, expectedResult);
        assertEquals(actualResult, expectedResult, format("%d not equals %d", actualResult, expectedResult));
    }
}
