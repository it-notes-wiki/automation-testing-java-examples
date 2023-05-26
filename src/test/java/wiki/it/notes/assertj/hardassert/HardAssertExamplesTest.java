package wiki.it.notes.assertj.hardassert;

import org.testng.annotations.Test;
import wiki.it.notes.models.Person;

import static org.assertj.core.api.Assertions.assertThat;

public class HardAssertExamplesTest {

    @Test
    void hardAssert() {
        var person = new Person().setFullName(null).setCity("Boston").setAge(16);

        assertThat(person.getFullName()).as("Check person full name: %s", person.getFullName()).isNotNull();
        assertThat(person.getCity()).as("Check person city: %s", person.getCity()).isNotBlank();
        assertThat(person.getAge()).as("Check person age: %d", person.getAge()).isGreaterThan(18);
    }
}
