package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.DizaynPage;
import io.cucumber.java.en.Given;
import utilities.TestUtils;

public class DizaynStepDefs {


    DizaynPage dzyn=new DizaynPage();

    @Given("Click panel Dizayn")
    public void clickPanelDizayn() {

        dzyn.clickPanelButton("Dizayn");
        TestUtils.bekle(3);
    }


    @Given("Click panel abeyisWeb")
    public void clickPanelAbeyisWeb() {
        dzyn.clickWebAbeyis();

    }

    @Given("Click on the header button")
    public void clickOnTheHeaderButton() {
        dzyn.headerButtonTikla();

    }

    @Then("Verify that the Islem basarili PupUp is displayed")
    public void verifyThatTheIslemBasariliPupUpIsDisplayed() {
        dzyn.verifyIslemBasariliPopUpisDisplay();
    }
    @Given("Click on the gorseli kaldir button for LOGO")
    public void clickOnTheGorseliKaldirButtonForLOGO() {
        dzyn.clickLogoGorselKaldirButton();
    }
    @Given("Verify that the new Logo Image has been deleted")
    public void verifyThatTheNewLogoImageHasBeenDeleted() {
        dzyn.VerifyDeletedLogo();

    }


    @Given("Fill in the login title textbox and click the Kaydet button.")
    public void fillInTheLoginTitleTextboxAndClickTheKaydetButton() {
        dzyn.FillLoginTitleTextAndClickSave();
    }

    @Given("Verify that the login title has changed")
    public void verifyThatTheLoginTitleHasChanged() {
        dzyn.VerifyUpdatedLoginTitle();

    }







}
