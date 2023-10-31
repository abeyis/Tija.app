package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage lp = new LoginPage();
    @Given("login to app")
    public void loginToApp() {
        lp.login();
    }

//    @Given("login to app with {string}")
//    public void loginToAppWith(String name) {
//        lp.login(name);
//    }
}
