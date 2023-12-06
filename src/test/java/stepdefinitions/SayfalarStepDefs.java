package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DizaynPage;
import pages.SayfalarPage;

public class SayfalarStepDefs {

    DizaynPage dzynpg = new DizaynPage();
    @Given("Verify information with Customer Service")
    public void verifyInformationWithCustomerService() {
        dzynpg.verifyCustomerService();
    }

    SayfalarPage syfPage=new SayfalarPage();
    @Then("add page with {string} only")
    public void addPageWithTitleOnly(String pageTitle) {
        syfPage.addPageWithTitleOnly(pageTitle);
    }

    @Then("confirm {string} page added")
    public void confirmPageAdded(String pageTitle) {
        syfPage.confirmPageAdded(pageTitle);
    }

    @Then("add page with {string} and content")
    public void addPageWithTitleAndContent(String pageTitle) {
        syfPage.addPageWithTitleAndContent(pageTitle);
    }

    @Then("update saved {string}")
    public void updateSaved(String pageTitle) {
        syfPage.updateAddedPage(pageTitle);
    }

    @Then("confirm page updated")
    public void confirmPageUpdated() {
        syfPage.confirmPageUpdated();
    }

    @Then("delete saved {string}")
    public void deleteSaved(String pageTitle) {
        syfPage.deleteAddedPage(pageTitle);
    }

    @Then("confirm {string} page deleted")
    public void confirmPageDeleted(String pageTitle) {
        syfPage.confirmPageDeleted(pageTitle);
    }

}
