package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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



    // B2BC-2
    @Then("click yeni firma button")
    public void clickYeniFirmaButton() {
        b2bc.clickYeniFirmaButton();
    }

    @Then("add new company with noPhone information")
    public void addNewCompanyWithNoPhoneInformation() {
        b2bc.addCompanyNoPhone();

    }

    @Then("verify that the company could not be added")
    public void verifyThatTheCompanyCouldNotBeAdded() {
        b2bc.verifyNotAddedCompany();
    }

    @Then("delete company")
    public void deleteCompany() {
        b2bc.deleteCompany();

    }

    @Then("verify that the company has been deleted")
    public void verifyThatTheCompanyHasBeenDeleted() {
        b2bc.verifyDeletedCompany();

    }

    @Then("update company information")
    public void updateCompanyInformation() {
        b2bc.updateCompany();

    }

    @Then("verify that the company information has been updated")
    public void verifyThatTheCompanyInformationHasBeenUpdated() {
        b2bc.verifyUpdatedCompany();
    }


    @Then("delete code of company")
    public void deleteCodeOfCompany() {
        b2bc.deleteCodeOfCompany();
    }

    @Then("verify that the code has been deleted")
    public void verifyThatTheCodeHasBeenDeleted() {
        b2bc.verifyDeletedCode();
    }


}
