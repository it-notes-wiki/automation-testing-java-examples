package wiki.it.notes.selenide.pageobject.bookstore.pages;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private final String USERNAME_VALUE = "#userName-value";

    public String getUsername() {
        return $(USERNAME_VALUE).text();
    }
}
