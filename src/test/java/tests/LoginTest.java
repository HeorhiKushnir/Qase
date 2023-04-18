package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exactValue;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        open("/login");
        $("#inputEmail").setValue("");
        $("#inputPassword").setValue("");
        $("#btnLogin").click();
        $("#createButton").shouldBe(Condition.visible);
        $("#createButton").click();
        //TODO generate name
        $("#project-name").setValue("Test");
        //TODO generate random code (10 characters)
        $("#project-code").setValue("Test");
        $(byText("Public")).click();
        $(byText("Create project")).click();
        $(byText("Create project")).shouldNotBe(Condition.visible);
        open("/project/Test/settings/general");
        $("#project-name").shouldHave(exactValue("Test"));
    }
}
