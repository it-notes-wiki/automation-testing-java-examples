package wiki.it.notes.selenide.pageobject.bookstore;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {

    @BeforeSuite
    void setupSuite() {
        Configuration.baseUrl = "https://demoqa.com/";
    }
}
