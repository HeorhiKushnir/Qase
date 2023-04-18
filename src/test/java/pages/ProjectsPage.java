package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    public static final SelenideElement NEW_PROJECT_BUTTON = $("#createButton");

    public void projectPageIsOpened() {
        NEW_PROJECT_BUTTON.shouldBe(Condition.visible);
    }

    public void createNewProject() {
        NEW_PROJECT_BUTTON.click();
    }
}
