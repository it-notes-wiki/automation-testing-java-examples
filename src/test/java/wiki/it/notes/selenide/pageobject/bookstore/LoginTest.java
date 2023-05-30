package wiki.it.notes.selenide.pageobject.bookstore;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wiki.it.notes.selenide.pageobject.bookstore.models.User;
import wiki.it.notes.selenide.pageobject.bookstore.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    private User user;

    @BeforeClass
    void setupClass() {
        user = new User("it-notes", "Aqa12345*");
    }

    @Test
    void successLoginTest() {
        var profilePage = open(LoginPage.URL, LoginPage.class).loginToProfile(user);

        assertThat(profilePage.getUsername())
                .as("Check username on profile page")
                .isEqualTo(user.username());
    }
}
