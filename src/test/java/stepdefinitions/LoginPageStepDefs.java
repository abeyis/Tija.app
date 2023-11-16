package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage lp = new LoginPage();

    @Given("login to app")
    public void loginToApp() {
        lp.login();
    }

    @Given("Yanlıs emaille hata dogrula")
    public void yanlısEmailleHataDogrula() {
        lp.yanlısemail();
    }

    @Given("Yanlıs dogrulama koduyla hata dogrula")
    public void yanlısDogrulamaKoduylaHataDogrula() {
        lp.yanlısdogrulamakodu();
    }

        //    @Given("login to app with {string}")
//    public void loginToAppWith(String name) {
//        lp.login(name);
//    }

}