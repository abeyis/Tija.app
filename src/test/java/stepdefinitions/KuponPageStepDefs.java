package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.KuponPage;
import utilities.TestUtils;

import java.util.List;
import java.util.Random;


public class KuponPageStepDefs {

    KuponPage mp = new KuponPage();
    Random random = new Random();

    @Given("Click the Online Magaza button")
    public void clickTheOnlineMagazaButton() {
        mp.clickPanelButton("Online Mağaza");
    }

    @When("Click the Kupon button")
    public void clickTheKuponButton() {
        mp.clickPanelButton("Kupon");
    }

    @And("Enter test data to some required fields")
    public void enterTestDataToSomeRequiredFields() {

        TestUtils.waitAndClick(mp.webSitesiListTri);
        mp.selectdropDownOption("Web : abeyis-web");

        int randomNo = random.nextInt(9);

        if (randomNo != 0)
            TestUtils.waitAndSendText(mp.baslikInputBox, "Kupon-EksikGirisler");

        if (randomNo != 1)
            TestUtils.waitAndSendText(mp.kuponKoduInputBox, "1");

        if (randomNo != 2)
            {TestUtils.waitAndClick(mp.tipListTri);
            mp.selectdropDownOption("Ücretsiz Kargo");}

        if (randomNo != 3)
            {TestUtils.waitAndClick(mp.uygulamaAlaniListTri);
            mp.selectdropDownOption("Mevcut Siparişe");}

        if (randomNo != 4)
            {TestUtils.waitAndClick(mp.minGereksinimListTri);
            mp.selectdropDownOption("Yok");}

        if (randomNo != 5)
            {TestUtils.waitAndClick(mp.musteriUygunluguListTri);
            mp.selectdropDownOption("Herkes");}

        if (randomNo != 6)
            {TestUtils.waitAndClick(mp.kullanimLimitiListTri);
            mp.selectdropDownOption("Toplamda x adet kadar uygulanabilir");}

        if (randomNo != 7)
            TestUtils.waitAndSendText(mp.baslangicTarihiInputBox, "01-12-2023");

        if (randomNo != 8)
            TestUtils.waitAndSendText(mp.baslangicSaatiInputBox, "08:00");

    }

    @Then("Verify that Kaydet button is not clickable")
    public void verifyThatKaydetButtonIsNotClickable() {
        Assert.assertFalse("TC_002 | Eksik veri girildiğinde kayıt yapılamadığı doğrulanamadı",
                mp.kaydetButton.isEnabled());
    }

    @And("Select Web:abeyis-web option from Web sitesi dropdown list")
    public void selectWebAbeyisWebOptionFromWebSitesiDropdownList() {
        TestUtils.waitAndClick(mp.webSitesiListTri);
        mp.selectdropDownOption("Web : abeyis-web");    }

    @Then("Click {string} button for {string} in list")
    public void clickButtonForInList(String butonAdi, String kuponAdi) {
        List<WebElement> kuponList = mp.getElementListfromString("Başlık");
        String siraNo = mp.getIndexNoFromListElement(kuponList, kuponAdi);
        if (siraNo != null){
            int index = Integer.parseInt(siraNo);
            TestUtils.waitAndClick(mp.getElementListfromString(butonAdi).get(index));
        }
    }

    @And("Select {string} option from Uygulama Alanı dropdown list")
    public void selectOptionFromUygulamaAlanıDropdownList(String secimAdi) {
        TestUtils.waitAndClick(mp.uygulamaAlaniListTri);
        mp.selectdropDownOption(secimAdi);
    }

    @And("Click the {string} button")
    public void clickTheButton(String butonAdi) {
        TestUtils.waitAndClick(mp.functionButtonWebElement(butonAdi));
    }

    @Then("Select koleksiyon members on the pop-up window")
    public void selectKoleksiyonMembersOnThePopUpWindow() {
        List<String> checkedList;
        List<String> colectionList;

        checkedList = TestUtils.getAttributeListfromListElement(mp.koleksiyonKayitlariCheckedList, "ng-reflect-model");
        colectionList = TestUtils.getAttributeListfromListElement(mp.koleksiyonKayitlariBaslikList, "textContent");
        String[] koleksiyon = {"Apple Watch", "Xiaomi"};

        for (int i=0; i<checkedList.size(); i++){
            for (int j=0; j<koleksiyon.length ;j++){
                if (colectionList.get(i).equalsIgnoreCase(koleksiyon[j])){
                    TestUtils.scrollToElement(mp.koleksiyonKayitlariCheckedList.get(i));
                    mp.koleksiyonKayitlariCheckedList.get(i).click();
                }
            }
        }

        TestUtils.waitAndClick(mp.koleksiyonKayitlariSecButton);
    }

    @Then("Verify that the selection is recorded")
    public void verifyThatTheSelectionIsRecorded() {
        String expectedText = "Koleksiyon Seç (2 Adet Seçili)";
        String actualText = mp.functionButtonWebElement("Koleksiyon Seç").getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
