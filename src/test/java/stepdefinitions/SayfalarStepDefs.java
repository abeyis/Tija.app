package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DizaynPage;

public class SayfalarStepDefs {

    DizaynPage dzynpg = new DizaynPage();
    @Given("Verify information with Customer Service")
    public void verifyInformationWithCustomerService() {
        dzynpg.verifyCustomerService();
    }
}
