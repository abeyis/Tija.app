package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UrunAdiMaskelemePage;

public class UrunAdiMaskelemeStepDefs {

    UrunAdiMaskelemePage up = new UrunAdiMaskelemePage();

    @And("Enter {string} and {string} for {string} to Mask fields")
    public void enterAndForToMaskFields(String yeniUrunAdi, String kdv, String maskeDegeri) {
        up.saveMaskeData(yeniUrunAdi, kdv, maskeDegeri);
    }

    @Then("Verify that Urun Adi Maskeleme Data is recorded")
    public void verifyThatUrunAdiMaskelemeDataIsRecorded() {
        up.verifyPopUpIsDisplayed("İşlem başarılı");
        up.verifyNewDataSaved();
    }




    @Given("Enter new test data")
    public void enterNewTestData() {
        up.newData();
    }

    @When("Click the Update button")
    public void clickTheUpdateButton() {
        up.update();
    }

    @Given("Click on the delete button")
    public void clickOnTheDeleteButton() {
        up.delete();
    }

    @When("Click the Yes button")
    public void clickTheYesButton() {
        up.yesButton();
    }

    @When("Verify the transaction is successful pop up")
    public void verifyTheTransactionIsSuccessfulPopUp() {
        up.verifyPopUpIsDisplayed("İşlem başarılı");
    }
}

