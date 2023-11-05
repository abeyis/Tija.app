package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.DizaynPage;

public class DizaynPageStepDefs {

    DizaynPage dzyn = new DizaynPage();

    @When("Dizayn Button Tıklar")
    public void dizayn_button_tıklar() throws InterruptedException {
        dzyn.clickToDizaynSayfa();

    }



}
