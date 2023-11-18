package stepdefinitions;
import io.cucumber.java.en.Given;
import pages.B2BCPage;
import utilities.ConfigReader;

public class B2BCStepDefn {
    B2BCPage b2bc = new B2BCPage();


    @Given("Click panel BtwoBC")
    public void clickPanelBtwoBC() {

        b2bc.clickPanelButton("B2BC");

    }


    @Given("Verify that it goes to the BtwoBC Page")
    public void verifyThatItGoesToTheBtwoBCPage() {
        b2bc.validationB2BCPage();
        
    }

    @Given("Search Company With Ara Button")
    public void Search_Company_With_Ara_Button() {

        b2bc.searchCompanyWithAraButton();
    }

    @Given("Verify that company information is displayed on the page")
    public void Verify_that_company_information_is_displayed_on_the_page() {
        b2bc.verifyCompanyInformation();
    }

    @Given("Search Company With Enter Key")
    public void Search_Company_With_Enter_Key() {
        b2bc.searchCompanyWithEnterKey();
    }

    @Given("Verify that previously added companies are displayed")
    public void verifyThatPreviouslyAddedCompaniesAreDisplayed() {
        b2bc.VerifyaAllCompaniesIsVisible();
    }
}
