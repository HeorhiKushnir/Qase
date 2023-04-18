package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CreateNewProjectPage {

    public void fillInProjectFields(String name, String code) {
        $("#project-name").setValue(name);
        $("#project-code").setValue(code);
        $(byText("Public")).click();
    }

    public void createProject() {
        $(byText("Create project")).click();
        $(byText("Create project")).shouldNotBe(Condition.visible);
    }
}
