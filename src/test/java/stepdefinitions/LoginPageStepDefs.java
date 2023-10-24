package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage lp = new LoginPage();
    @Given("login to app")
    public void loginToApp() {
        lp.login();
    }
}
