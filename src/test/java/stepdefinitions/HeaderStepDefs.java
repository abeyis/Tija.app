package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DizaynPage;
import pages.UrunAdiMaskelemePage;

public class HeaderStepDefs {
     DizaynPage dizaynPage = new DizaynPage();


    @Given("Click the + button in the Header section")
    public void clickTheButtonInTheHeaderSection() throws InterruptedException {
            dizaynPage.clickPlus();
    }

    @When("Click on the {string} button")
    public void clickOnTheButton(String string) {
        dizaynPage.clickPanelButton(string);
    }

    @When("Verify collection page has been added")
    public void verifyCollectionPageHasBeenAdded() throws InterruptedException {
        dizaynPage.verifyCollection();


    }

    @When("Verify product detail page has been added")
    public void verifyProductDetailPageHasBeenAdded() throws InterruptedException {
        dizaynPage.verifyProductDetail();
    }

    @Given("Click on the dropdown button")
    public void clickOnTheDropdownButton() {
        dizaynPage.dropMenu();
    }

    @When("Choose a new page")
    public void chooseANewPage() {
        dizaynPage.clickPanelButton(" Anasayfa 29 ");

    }

    @When("verify transition to new page")
    public void verifyTransitionToNewPage() throws InterruptedException {
        dizaynPage.verifyTransition();
    }


}
