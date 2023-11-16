package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;
import java.util.Random;

public class KuponPage extends BasePage {
    public KuponPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Random random = new Random();

    //  Home-->Online Mağaza-->Kupon
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])")
    public List<WebElement> dropDownList;
    @FindBy(css = "input[name='KuponKodu']")
    public WebElement kuponKoduInputBox;
    @FindBy(css = "input[name='Aktif']")
    public WebElement aktifSwitch;
    @FindBy(css = "input[name='OtoKullan']")
    public WebElement otoKullanSwitch;
    @FindBy(xpath = "//button[contains(text(), 'Kaydet')]")
    public WebElement kaydetButton;
    @FindBy(xpath = "//button[.='Seç']")
    public  WebElement koleksiyonKayitlariSecButton;
    @FindBy(xpath = "//div[@class='modal-content']//button[contains(text(), 'Sil')]")
    public  WebElement kuponKayitlariSilOnayButton;
    @FindBy(xpath = "//table//tr//td[.='Kupon-ZorunluGirişler']")
    public  WebElement kuponKayitlariSilinenKupon;
    @FindBy(xpath = "(//table[contains(@class, 'table-borderless')])//tr/td[1]")
    public List<WebElement> kuponKayitlariBaslikList;
    @FindBy(xpath = "//tbody/tr/td/button[.='Güncelle']")
    public List<WebElement> kuponKayitlariGuncelleButtonList;
    @FindBy(xpath = "//tbody/tr/td/button[.='Sil']")
    public List<WebElement> kuponKayitlariSilButtonList;
    @FindBy(xpath = "(//table[@class='table table-borderless'])[2]//tr/td[2]")
    public List<WebElement> koleksiyonKayitlariBaslikList;
    @FindBy(xpath = "(//table[@class='table table-borderless'])[2]//tr//span")
    public List<WebElement> koleksiyonKayitlariCheckedList;


    public void selectdropDownOption(String dropDownOption) {
        WebElement element = Driver.getDriver().findElement(By.xpath(
                "//div/span[contains(text(), '" + dropDownOption + "')]"));
        TestUtils.waitAndClick(element);
    }

    public String getIndexNoFromListElement(List<WebElement> list, String value) {
        TestUtils.waitForVisibility(list.get(list.size()-1), 5);
        String strNo = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAttribute("textContent").equals(value)) {
                strNo = "" + i;
            }
        }
        return strNo;
    }

    public List<WebElement> getElementListfromString(String listName) {
        switch (listName) {
            case "Güncelle": return kuponKayitlariGuncelleButtonList;
            case "Sil": return kuponKayitlariSilButtonList;
            case "Başlık" : return kuponKayitlariBaslikList;
        }
        return null;
    }

    public void verifyRecordIsDeleted(){
        Assert.assertFalse(TestUtils.isElementPresent(kuponKayitlariSilinenKupon));
    }

    public void enterKuponDataWithRandom(){

        clickInputArea("Web Sitesi");
        selectdropDownOption("Web : abeyis-web");

        int randomNo = random.nextInt(9);

        if (randomNo != 0)
            sendTextByTitle("Başlık", "Kupon-EksikGirisler");

        if (randomNo != 1)
            TestUtils.waitAndSendText(kuponKoduInputBox, "1");

        if (randomNo != 2)
        {clickInputArea("Tip");
            selectdropDownOption("Ücretsiz Kargo");}

        if (randomNo != 3)
        {clickInputArea("Uygulama Alanı");
            selectdropDownOption("Mevcut Siparişe");}

        if (randomNo != 4)
        {clickInputArea("Minimum Gereksinimler");
            selectdropDownOption("Yok");}

        if (randomNo != 5)
        {clickInputArea("Müşteri Uygunluğu");
            selectdropDownOption("Herkes");}

        if (randomNo != 6)
        {clickInputArea("Kullanım Limiti");
            selectdropDownOption("Toplamda x adet kadar uygulanabilir");}

        if (randomNo != 7)
            sendTextByTitle("Başlangıç Tarihi", "01-12-2023");

        if (randomNo != 8)
            sendTextByTitle("Başlangıç Saati", "08:00");
    }

    public void verifyButtonNotEnabled(){
        Assert.assertFalse("TC_002 | Eksik veri girildiğinde kayıt yapılamadığı doğrulanamadı",
                kaydetButton.isEnabled());
    }
    public void selectWebSite(String webSite){
        clickInputArea("Web Sitesi");
        selectdropDownOption(webSite);
    }

    public void clickButtonInKuponList(String butonAdi, String kuponAdi) {
        List<WebElement> kuponList = getElementListfromString("Başlık");
        String siraNo = getIndexNoFromListElement(kuponList, kuponAdi);
        if (siraNo != null) {
            int index = Integer.parseInt(siraNo);
            TestUtils.waitAndClick(getElementListfromString(butonAdi).get(index));
        }
    }

    public void selectKoleksiyonMembers() {
        List<String> checkedList;
        List<String> colectionList;

        checkedList = TestUtils.getAttributeListFromListElement(koleksiyonKayitlariCheckedList, "ng-reflect-model");
        colectionList = TestUtils.getAttributeListFromListElement(koleksiyonKayitlariBaslikList, "textContent");
        String[] koleksiyon = {"Apple Watch", "Xiaomi"};

        for (int i = 0; i < checkedList.size(); i++) {
            for (int j = 0; j < koleksiyon.length; j++) {
                if (colectionList.get(i).equalsIgnoreCase(koleksiyon[j])) {
                    TestUtils.scrollToElement(koleksiyonKayitlariCheckedList.get(i));
                    koleksiyonKayitlariCheckedList.get(i).click();
                }
            }
        }

        TestUtils.waitAndClick(koleksiyonKayitlariSecButton);
    }

    public void clickInputArea(String dropDownOption) {
        int sira=0;
        switch (dropDownOption){
            case "Web Sitesi" : sira=0; break;
            case "Tip" : sira=1; break;
            case "Uygulama Alanı" : sira=2; break;
            case "Minimum Gereksinimler" : sira=3; break;
            case "Müşteri Uygunluğu" : sira=4; break;
            case "Kullanım Limiti" : sira=5; break;
        }
        TestUtils.waitAndClick(dropDownList.get(sira));
    }

    public void verifySelection(String buttonTitle, String expected){
        String actual = functionButtonWebElement(buttonTitle).getText();
        Assert.assertEquals(expected, actual);
    }

    public void sendTextByTitle(String inputTitle, String text){
        WebElement element = Driver.getDriver().findElement(By.xpath(
                "//label[@for='picker1'][.='" + inputTitle + "']//following::input[1]"));
        TestUtils.waitAndSendText(element, text);
    }

    public void clickTheButtonFunc(String buttonName){
        WebElement element = functionButtonWebElement(buttonName);
        TestUtils.waitAndClick(element);
    }

    public WebElement functionButtonWebElement(String buttonName) {
        return Driver.getDriver().findElement(By.xpath(
                "//button[contains(text(), '" + buttonName + "')]"));
    }


}

