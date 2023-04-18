package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public static final SelenideElement USERNAME_INPUT = $("#inputEmail");
    public static final SelenideElement PASSWORD_INPUT = $("#inputPassword");
    public static final SelenideElement LOGIN_BUTTON = $("#btnLogin");

    public void open() {
        Selenide.open("/login");
    }
    public void login(String login, String password) {
        USERNAME_INPUT.setValue(login);
        PASSWORD_INPUT.setValue(password);
        LOGIN_BUTTON.click();
    }
}
