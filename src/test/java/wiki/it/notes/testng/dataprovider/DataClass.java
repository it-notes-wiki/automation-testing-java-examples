package wiki.it.notes.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataClass {

    @DataProvider(name = "data")
    public Object[][] getTestData() {
        return new Object[][] {
                {5, 6, 30},
                {-3, -2, 6},
                {7, -3, -21}
        };
    }
}
