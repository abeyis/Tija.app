package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;

public class UrunAdiMaskelemePage extends BasePage{
        public UrunAdiMaskelemePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //  Home -->Online Mağaza -->Ürün Adı Maskeleme
    @FindBy (xpath = "(//input[@placeholder='Maske değerini buraya girin'])[1]")
    public WebElement maskeDegeriInputBox;
    @FindBy (xpath = "(//input[@placeholder='Yeni ürün adını buraya girin'])[1]")
    public WebElement maskeYeniUrunAdiInputBox;
    @FindBy (xpath = "(//input[@placeholder='KDV oranını buraya girin'])[1]")
    public WebElement maskeKDVOraniInputBox;
    @FindBy (xpath = "//button[.='Ekle']")
    public WebElement maskeDegeriEkleButton;
    @FindBy (xpath = "//button[.='Sil']")
    public List<WebElement> maskeSilButtonList;
    @FindBy(xpath = "(//div[@class='col-md-3 p-0'])[2]")
    private WebElement eskiMaskeDegeri;
    @FindBy(xpath = "(//div[@class='col-md-4 my-auto'])[1]")
    private WebElement eskiYeniUrunDegeri;
    @FindBy(xpath = "(//div[@class='col-md-2 my-auto'])[1]")
    private WebElement eskiKdvDegeri;

    public void saveMaskeData(String yeniUrunAdi, String kdv, String maskeDegeri){
        TestUtils.waitAndSendText(maskeDegeriInputBox, maskeDegeri);
        TestUtils.waitAndSendText(maskeYeniUrunAdiInputBox, yeniUrunAdi);
        TestUtils.waitAndSendText(maskeKDVOraniInputBox, kdv);
        TestUtils.waitAndClick(maskeDegeriEkleButton);
    }
    public void verifyNewDataSaved(){
        TestUtils.waitFor(3);
        List<WebElement> maskeGuncelleButtonList = Driver.getDriver().findElements(By.xpath(
                "//button[.='Güncelle']"));
        List<WebElement> maskeDegeriList = Driver.getDriver().findElements(By.xpath(
                "//input[@placeholder='Maske değerini buraya girin']"));
        List<WebElement> maskeYeniUrunAdiList = Driver.getDriver().findElements(By.xpath(
                "//input[@placeholder='Yeni ürün adını buraya girin']"));
        List<WebElement> maskeKDVOraniList = Driver.getDriver().findElements(By.xpath(
                "//input[@placeholder='KDV oranını buraya girin']"));

        TestUtils.waitForClickablility(maskeGuncelleButtonList.get(0),15);
        Assert.assertEquals("Galaxy Buds Live", maskeDegeriList.get(1).getAttribute("value"));
        Assert.assertEquals("Galaksi Bads Live", maskeYeniUrunAdiList.get(1).getAttribute("value"));
        Assert.assertEquals("15", maskeKDVOraniList.get(1).getAttribute("value"));
    }


    public void newData() {

        eskiMaskeDegeri.clear();
        eskiMaskeDegeri.sendKeys("degisen maske degeri");
        eskiYeniUrunDegeri.clear();
        eskiYeniUrunDegeri.sendKeys("degisen yeni urun degeri");
        eskiKdvDegeri.clear();
        eskiKdvDegeri.sendKeys("5");
    }

    public void update() {
        clickPanelButton("Güncelle");
    }

    public void delete() {
        clickPanelButton("Sil");
    }

    public void yesButton() {
        clickPanelButton("Evet");
    }
}
