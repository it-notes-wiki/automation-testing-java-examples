package wiki.it.notes.selenide.pageobject.bookstore.pages;

import wiki.it.notes.selenide.pageobject.bookstore.models.User;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public final static String URL = "login";

    private final String USERNAME_FIELD = "#userName";
    private final String PASSWORD_FIELD = "#password";
    private final String LOGIN_BUTTON = "#login";

    public ProfilePage loginToProfile(User user) {
        $(USERNAME_FIELD).setValue(user.username());
        $(PASSWORD_FIELD).setValue(user.password());
        $(LOGIN_BUTTON).click();
        return page(ProfilePage.class);
    }
}
