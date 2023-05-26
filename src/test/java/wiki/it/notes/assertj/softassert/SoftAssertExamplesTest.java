package wiki.it.notes.assertj.softassert;

import org.assertj.core.api.AutoCloseableSoftAssertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wiki.it.notes.models.Person;

public class SoftAssertExamplesTest {

    private Person person;

    @BeforeClass
    void setupClass() {
        person = new Person().setFullName(null).setCity("Boston").setAge(16);
    }

    @Test
    void assertAllTest() {
        var softAssertions = new SoftAssertions();

        softAssertions.assertThat(person.getFullName())
                .as("Check person full name: %s", person.getFullName()).isNotNull();
        softAssertions.assertThat(person.getCity())
                .as("Check person city: %s", person.getCity()).isNotBlank();
        softAssertions.assertThat(person.getAge())
                .as("Check person age: %d", person.getAge()).isGreaterThan(18);

        softAssertions.assertAll();
    }

    @Test
    void autoCloseableSoftAssertionsTest() {
        try(var autoCloseableSoftAssertions = new AutoCloseableSoftAssertions()) {
            autoCloseableSoftAssertions.assertThat(person.getFullName()).isNotNull();
            autoCloseableSoftAssertions.assertThat(person.getCity()).isNotBlank();
            autoCloseableSoftAssertions.assertThat(person.getAge()).isGreaterThan(18);
        }
    }

    @Test
    void assertSoftlyTest() {
        SoftAssertions.assertSoftly(softAssertions -> {
            softAssertions.assertThat(person.getFullName()).isNotNull();
            softAssertions.assertThat(person.getCity()).isNotBlank();
            softAssertions.assertThat(person.getAge()).isGreaterThan(18);
        });
    }
}
