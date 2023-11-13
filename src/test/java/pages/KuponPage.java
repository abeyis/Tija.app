package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class KuponPage extends BasePage {
    public KuponPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //  Home-->Online Mağaza-->Kupon
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[1]")
    public WebElement webSitesiListTri;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[2]")
    public WebElement tipListTri;
    @FindBy(css = "input[name='Baslik']")
    public WebElement baslikInputBox;
    @FindBy(css = "input[name='KuponKodu']")
    public WebElement kuponKoduInputBox;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[3]")
    public WebElement uygulamaAlaniListTri;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[4]")
    public WebElement minGereksinimListTri;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[5]")
    public WebElement musteriUygunluguListTri;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[6]")
    public WebElement kullanimLimitiListTri;
    @FindBy(xpath = "//a[contains(text(), 'Oluştur')]")
    public WebElement kuponKoduOlusturButton;
    @FindBy(css = "input[name='BaslangicTarihi']")
    public WebElement baslangicTarihiInputBox;
    @FindBy(css = "input[name='start_time']")
    public WebElement baslangicSaatiInputBox;
    @FindBy(css = "input[name='BitisTarihi']")
    public WebElement bitisTarihiInputBox;
    @FindBy(css = "input[name='end_time']")
    public WebElement bitisSaatiInputBox;
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

    public WebElement functionButtonWebElement(String buttonName) {
        return Driver.getDriver().findElement(By.xpath(
                "//button[contains(text(), '" + buttonName + "')]"));
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
}

