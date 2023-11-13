package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UrunAdiMaskelemePage;
import utilities.TestUtils;

public class UrunAdiMaskelemeStepDefs {

    UrunAdiMaskelemePage up = new UrunAdiMaskelemePage();
    @When("Click Urun Adi Maskeleme button")
    public void clickUrunAdiMaskelemeButton() {
        up.clickPanelButton("Ürün Adı Maskeleme");
    }

    @And("Enter {string} and {string} for {string} to Mask fields")
    public void enterAndForToMaskFields(String yeniUrunAdi, String kDV, String maskeDegeri) {
        TestUtils.waitAndSendText(up.maskeDegeriInputBox, maskeDegeri);
        TestUtils.waitAndSendText(up.maskeYeniUrunAdiInputBox, yeniUrunAdi);
        TestUtils.waitAndSendText(up.maskeKDVOraniInputBox, kDV);
        TestUtils.waitAndClick(up.maskeDegeriEkleButton);
    }

    @Then("Verify that Urun Adi Maskeleme Data is recorded")
    public void verifyThatUrunAdiMaskelemeDataIsRecorded() {
        UrunAdiMaskelemePage gup = new UrunAdiMaskelemePage();
        TestUtils.waitForClickablility(gup.maskeGuncelleButtonList.get(0),15);
        Assert.assertEquals("Galaxy Buds Live", gup.maskeDegeriList.get(1).getAttribute("value"));
        Assert.assertEquals("Galaksi Bads Live", gup.maskeYeniUrunAdiList.get(1).getAttribute("value"));
        Assert.assertEquals("15", gup.maskeKDVOraniList.get(1).getAttribute("value"));

    }
}