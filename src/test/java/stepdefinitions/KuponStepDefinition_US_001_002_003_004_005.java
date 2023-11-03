package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_001;
import utilities.TestUtils;

import java.util.Random;


public class KuponStepDefinition_US_001_002_003_004_005 {

    US_001 mp = new US_001();
    Random random = new Random();

    @Given("User click the Online Magaza button")
    public void userClickTheOnlineMagazaButton() {
        mp.clickPanelButton("Online Mağaza");
    }

    @When("User click the Kupon button")
    public void userClickTheKuponButton() {
        mp.clickPanelButton("Kupon");
    }

    @And("Enter test data to some required fields")
    public void enterTestDataToSomeRequiredFields() {

        TestUtils.waitAndClick(mp.webSitesiListTri);
        TestUtils.waitAndClick(mp.webSitesiSelection);

        int randomNo = random.nextInt(9);

        if (randomNo != 0)
            TestUtils.waitAndSendText(mp.baslikInputBox, "Kupon-EksikGirisler");

        if (randomNo != 1)
            TestUtils.waitAndSendText(mp.kuponKoduInputBox, "1");

        if (randomNo != 2)
            {TestUtils.waitAndClick(mp.tipListTri);
             TestUtils.waitAndClick(mp.tipSelection);}

        if (randomNo != 3)
            {TestUtils.waitAndClick(mp.uygulamaAlaniListTri);
            TestUtils.waitAndClick(mp.uygulamaAlaniSelection);}

        if (randomNo != 4)
            {TestUtils.waitAndClick(mp.minGereksinimListTri);
            TestUtils.waitAndClick(mp.minGereksinimSelection);}

        if (randomNo != 5)
            {TestUtils.waitAndClick(mp.musteriUygunluguListTri);
            TestUtils.waitAndClick(mp.musteriUygunluguSelection);}

        if (randomNo != 6)
            {TestUtils.waitAndClick(mp.kullanimLimitiListTri);
            TestUtils.waitAndClick(mp.kullanimLimitiSelection);}

        if (randomNo != 7)
            TestUtils.waitAndSendText(mp.baslangicTarihiInputBox, "01-12-2023");

        if (randomNo != 8)
            TestUtils.waitAndSendText(mp.baslangicSaatiInputBox, "08:00");

    }

    @Then("Verify that Kaydet button is not clickable")
    public void verifyThatKaydetButtonIsNotClickable() {
        Assert.assertFalse("TC_002 | Eksik veri girildiğinde kayıt yapılamadığı doğrulandı", 
                mp.kaydetButton.isEnabled());
    }
}
