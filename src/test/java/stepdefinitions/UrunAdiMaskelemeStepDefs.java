package stepdefinitions;

import io.cucumber.java.en.And;
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


}

