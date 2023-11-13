package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.B2BCPage;
import utilities.ConfigReader;

public class B2BCStepDefn {
    B2BCPage b2bc = new B2BCPage();


    @Given("Click panel BtwoBC")
    public void clickPanelBtwoBC() {
        b2bc.clickPanel("B2BC");
    }


    @Given("Verify that it goes to the BtwoBC Page")
    public void verifyThatItGoesToTheBtwoBCPage() {
        b2bc.validationB2BCPage();
        
    }

    @Given("The firma name is written in the Firma arayin textbox and the click on the Ara button")
    public void theFirmaNameIsWrittenInTheFirmaArayinTextboxAndTheClickOnTheAraButton() {
        b2bc.firmaArayinTextBoxinaFirmaAdiYazAraButonunaTikla(ConfigReader.getProperty("aranacakFirmaAdi"));
    }

    @Given("Verify that firma information is displayed on the page")
    public void verifyThatFirmaInformationIsDisplayedOnThePage() {
        b2bc.arananFirmaBilgilerininSayfadaGoruntulendiginiDogrula();
    }

    @Given("The firma name is written in the Firma arayin textbox and press enter")
    public void theFirmaNameIsWrittenInTheFirmaArayinTextboxAndPressEnter() {
        b2bc.firmaArayinTextBoxinaFirmaAdiYazEnterTusunaBas(ConfigReader.getProperty("aranacakFirmaAdi"));
    }

    @Given("Verify that previously added companies are displayed")
    public void verifyThatPreviouslyAddedCompaniesAreDisplayed() {
        b2bc.EklenmisTumFirmalarinSayfadaGoruntulendiginiDogrula();
    }
}
