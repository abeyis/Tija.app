package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KuponPage;
import utilities.TestUtils;


public class KuponPageStepDefs {

    KuponPage mp = new KuponPage();

    @When("Click the {string} module button")
    public void clickTheKuponButton(String panelBtn) {
        mp.clickPanelButton(panelBtn);
    }

    @And("Enter test data to some required fields")
    public void enterTestDataToSomeRequiredFields() {
        mp.enterKuponDataWithRandom();
    }

    @Then("Verify that Kaydet button is not clickable")
    public void verifyThatKaydetButtonIsNotClickable() {
        mp.verifyButtonNotEnabled();
    }

    @And("Select Web:abeyis-web option from Web sitesi dropdown list")
    public void selectWebAbeyisWebOptionFromWebSitesiDropdownList() {
        mp.selectWebSite("Web : abeyis-web");
    }
    @Then("Click {string} button for {string} in list")
    public void clickButtonForInList(String butonAdi, String kuponAdi) {
        mp.clickButtonInKuponList(butonAdi, kuponAdi);
    }

    @And("Select {string} option from {string} dropdown list")
    public void selectOptionFromUygulamaAlanıDropdownList(String secimAdi, String title) {
        mp.clickInputArea(title);
        mp.selectdropDownOption(secimAdi);
    }

    @And("Click the {string} button")
    public void clickTheButton(String butonAdi) {
        mp.clickTheButtonFunc(butonAdi);
    }

    @Then("Select koleksiyon members on the pop-up window")
    public void selectKoleksiyonMembersOnThePopUpWindow() {
        mp.selectKoleksiyonMembers();
    }

    @Then("Verify that the selection is complete")
    public void verifyThatTheSelectionIsComplete() {
        mp.verifySelection("Koleksiyon Seç","Koleksiyon Seç (2 Adet Seçili)");
    }

    @And("Click {string} confirmation button")
    public void clickConfirmationButton(String butonName) {
        TestUtils.waitAndClick(mp.kuponKayitlariSilOnayButton);
        TestUtils.waitFor(1);
    }

    @Then("Verify that the deletion is complete")
    public void verifyThatTheDeletionIsComplete() {
        mp.verifyPopUpIsDisplayed("Kupon silindi");
        mp.verifyRecordIsDeleted();
    }

}