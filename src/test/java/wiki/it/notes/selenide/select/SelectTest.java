package wiki.it.notes.selenide.select;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SelectTest {

    private static final String URL = "https://demoqa.com/select-menu";

    @BeforeMethod
    void setup() {
        open(URL);
    }

    @Test
    void selectOptionByIndex() {
        var select = $("#oldSelectMenu");
        select.selectOption(1);
        assertEquals(select.getSelectedOptionText(), "Blue");
    }

    @Test
    void selectOptionByText() {
        var select = $("#oldSelectMenu");
        var optionText = "Blue";
        select.selectOption(optionText);
        assertEquals(select.getSelectedOptionText(), optionText);
    }

    @Test
    void selectOptionByContainingText() {
        var select = $("#oldSelectMenu");
        select.selectOptionContainingText("Pur");
        assertEquals(select.getSelectedOptionText(), "Purple");
    }

    @Test
    void selectOptionByValue() {
        var select = $("#oldSelectMenu");
        var optionValue = "1";
        select.selectOptionByValue(optionValue);
        assertEquals(select.getSelectedOptionValue(), optionValue);
    }

    @Test
    void multipleSelect() {
        var select = $("#cars");
        select.selectOption("Saab", "Opel");
        assertTrue(select.getSelectedOptions().texts().containsAll(List.of("Saab", "Opel")));
    }
}
