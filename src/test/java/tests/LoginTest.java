
package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void createNewProject() {
        loginPage.open();
        loginPage.login("reiybhujif@mail.ru", "4da8db88");
        projectsPage.projectPageIsOpened();
        projectsPage.createNewProject();
        createNewProjectPage.fillInProjectFields("Test19" , "Test19");
        createNewProjectPage.createProject();
        settingsPage.openProjectSettings("TEST19");
        settingsPage.validate("Test19", "TEST19");
    }
}