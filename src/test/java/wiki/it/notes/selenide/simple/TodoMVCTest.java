package wiki.it.notes.selenide.simple;

import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.exactTextsCaseSensitive;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class TodoMVCTest {

    @Test
    void addTwoTodos() {
        open("https://todomvc.com/examples/kotlin-react/");
        var firstTodo = "first todo";
        var secondTodo = "second todo";
        $(".new-todo")
                .setValue(firstTodo).pressEnter()
                .setValue(secondTodo).pressEnter();
        $$(".todo-list label")
                .shouldHave(size(2), exactTextsCaseSensitive(firstTodo, secondTodo.toUpperCase()));
    }
}
