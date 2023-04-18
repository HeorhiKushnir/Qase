package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SettingsPage {

    public void openProjectSettings(String projectName) {
        open("/project/" + projectName + "/settings/general");
    }

    public void validate(String projectName, String projectCode) {
        $("#project-name").shouldHave(exactValue(projectName));
        $("#project-code").shouldHave(exactValue(projectCode));
    }
}
