package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.MainPanelPage;
import utilities.TestUtils;

public class KuponPageStepDefs {

    MainPanelPage mp = new MainPanelPage();
    @Given("User click the Online Magaza button")
    public void userClickTheOnlineMagazaButton() {
        mp.clickPanelButton("Online Mağaza");
    }

    @When("User click the Kupon button")
    public void userClickTheKuponButton() {
        mp.clickPanelButton("Kupon");
    }

    @And("Enter test data to some required fields")
    public void enterTestDataToSomeRequiredFields() {

    }

    @Then("Verify that Kaydet button is not clickable")
    public void verifyThatKaydetButtonIsNotClickable() {
    }
}
