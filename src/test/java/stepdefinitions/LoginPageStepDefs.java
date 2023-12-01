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
        lp.loginWithOtp();
    }

    @Given("Yanlıs emaille hata dogrula")
    public void yanlısEmailleHataDogrula() {
        lp.yanlisEmail();
    }

    @Given("Yanlıs dogrulama koduyla hata dogrula")
    public void yanlısDogrulamaKoduylaHataDogrula() {
        lp.yanlisDogrulamaKodu();
    }

//    @Given("login to app with {string}")
//    public void loginToAppWith(String name) {
//        lp.login(name);
//    }

}