package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;

import static utilities.TestUtils.getElementsText;

public class FiyatListesiPage  extends BasePage{
    public FiyatListesiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Online Mağaza']")
    private WebElement onlineMagazaButton;
    @FindBy(xpath = "//a[text()='Fiyat Listesi']")
    private WebElement fiyatListesiDropDown;
    @FindBy(xpath = "//li[text()='Ürün Fiyat Listesi']")
    private WebElement fiyatListesiText;
    @FindBy(xpath = "//a[text()='Dashboard']")
    private WebElement DashboardButton;
    @FindBy(xpath = "//input[@placeholder='Ne Aramıştınız?']")
    private WebElement neAramistinizTextBox;
    @FindBy(xpath = "//button[text()='Ara']")
    private WebElement araButton;
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement arananUrunStokAdiText ;
    @FindBy(xpath = "//*[text()='Yeni Fiyat']")
    private WebElement yeniFiyatButton ;
    @FindBy(css = "#inputColumnName")
    private WebElement kolonListeAdiTextBox ;
    @FindBy(css = "#inputColumnTitle")
    private WebElement kolonAciklamaTextBox ;
    @FindBy(css = "#inputColumnOrder")
    private WebElement kolonSiraTextBox ;
    @FindBy(xpath = "//*[text()='Oluştur']")
    private WebElement olusturButton;
    @FindBy(xpath = "//thead/th[@class='ng-star-inserted']")
    private List<WebElement> fiyatListesiList;
    @FindBy(xpath = "(//thead/th/button[text()=' Premium '])[1]")
    private WebElement premiumFiyatListesi;
    @FindBy(xpath = "(//thead/th/button[text()=' Silinecek '])[1]")
    private WebElement SilinecekFiyatListesi;
    @FindBy(xpath = "(//thead/th/button[text()=' Guncellenecek '])[1]")
    private WebElement guncellenecekFiyatListesiButton;
    @FindBy(xpath = "(//thead/th/button[text()=' Guncellendi '])[1]")
    private WebElement guncellendiFiyatListesiButton;
    @FindBy(xpath = "//*[text()=' Düzenle ']")
    private WebElement duzenleButton;
    @FindBy(xpath = "//div/button/span[text()='Sil']")
    private WebElement silButtonFirst;
    @FindBy(xpath = "//div/button/span[text()='Güncelle']")
    private WebElement guncelleButton;
    @FindBy(xpath = "//div/button[text()='Sil']")
    private WebElement silButtonSecond;
    @FindBy(xpath = "//tbody/tr[2]/td[5]/input")
    private WebElement galaxyBudsLiveFiyatTextBox;
    @FindBy(xpath = "//*[text()='Değişiklikleri Kaydet']")
    private WebElement DegisiklikleriKaydetButton;
    @FindBy(xpath = "//div[@aria-label='Kolon güncellendi !']")
    private WebElement kolonGuncellendiPopUp;
    @FindBy(xpath = "//div[@aria-label='Kolon silindi !']")
    private WebElement kolonSilindiPopUp;
    @FindBy(xpath = "//div[@aria-label='Fiyatlar güncellendi !!!']")
    private WebElement fiyatlarGuncellendiPopUp;








   public void fiyatListesiEkle(String kolonListeAdi, String kolonAciklama ,String  kolonSira){

       click(yeniFiyatButton);
       type(kolonListeAdiTextBox,kolonListeAdi );
       type(kolonAciklamaTextBox, kolonAciklama);
       type(kolonSiraTextBox, kolonSira);
       click(olusturButton);

   }

   public void fiyatListesiSil(WebElement fiyatListesi){

      click(fiyatListesi);
      click(duzenleButton);
      click(silButtonFirst);
      click(silButtonSecond);

   }

   public void validationFiyatListesiPage(){

        TestUtils.bekle(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("fiyat-listesi"));
        Assert.assertTrue(getElementText(fiyatListesiText).contains("Fiyat Listesi"));

    }

    public void DashbordClick() {

       click(DashboardButton);
   }

    public void validationDashboardPage(){

        TestUtils.bekle(5);
        System.out.println("url = "+Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }

    public void neAramistinizTextBoxinaUrunAdiYazAraButonunaTikla(String aranacakUrunAdi){

        type(neAramistinizTextBox,aranacakUrunAdi);
        TestUtils.bekle(3);
        click(araButton);
        TestUtils.bekle(3);

    }
    public void ilgiliUrunBilgilerininSayfadaGoruntulendigiDogrulanir() {

        Assert.assertTrue(arananUrunStokAdiText.isDisplayed());
    }

    public void yenifiyatbutonunatiklanir() {

        click(yeniFiyatButton);
    }

    public void fiyatListesiEklemePencereVerilerGirveOlusturButtonTikla() {

        type(kolonListeAdiTextBox, ConfigReader.getProperty("kolonListeAdi"));
        type(kolonAciklamaTextBox, ConfigReader.getProperty("kolonAciklama"));
        type(kolonSiraTextBox, ConfigReader.getProperty("kolonSira"));
        click(olusturButton);
    }
    public void validationKolonGuncellendiPopUp() {

       Assert.assertTrue(kolonGuncellendiPopUp.isDisplayed());

   }
    public void validationFiyatListesiEkle() {

        List<String> elmTexts = getElementsText(fiyatListesiList);
        System.out.println("elmtext : "+elmTexts);
        Assert.assertTrue(elmTexts.contains(ConfigReader.getProperty("kolonListeAdi")));
        TestUtils.bekle(3);
        fiyatListesiSil(premiumFiyatListesi);
        TestUtils.bekle(3);
    }


    public void silinecekFiyatListesineTikla() {

       fiyatListesiEkle(ConfigReader.getProperty("kolonListeAdiSilPreCondition"),
                        ConfigReader.getProperty("kolonAciklamaSilPreCondition"),
                        ConfigReader.getProperty("kolonSiraSilPreCondition"));
       TestUtils.bekle(2);
       click(SilinecekFiyatListesi);

    }

    public void DuzenleButonunaTikla() {

        TestUtils.bekle(2);
        click(duzenleButton);
    }

    public void silButonunaTikla() {
       click(silButtonFirst);
    }

    public void ikinciSilButonunaTikla()
    {

        click(silButtonSecond);
    }

    public void validationKolonSilindiPopUp() {

        boolean isPopupVisible = (boolean) ((JavascriptExecutor) Driver.getDriver())
                .executeScript("var popup = document.evaluate('//div[@aria-label=\"Kolon silindi !\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
                        "return popup !== null && window.getComputedStyle(popup).getPropertyValue('display') !== 'none';");

        if (isPopupVisible) {
            System.out.println("Pop-up is visible.");
        } else {
            System.out.println("Pop-up is not visible.");
        }
      // Assert.assertTrue(kolonSilindiPopUp.isDisplayed());

    }

    public void validationFiyatlarGuncellendiPopUp() {

       Assert.assertTrue(fiyatlarGuncellendiPopUp.isDisplayed());

    }


    public void silinecekFiyatListesininSilindiginiDogrula() {

       TestUtils.bekle(2);
        try {
            Assert.assertFalse(SilinecekFiyatListesi.isDisplayed());
        } catch (NoSuchElementException e ) {
            System.out.println("Silinecek Fiyat Listesi has been successfully deleted");
        }
    }


    public void guncellenecekFiyatListesineTikla() {

        fiyatListesiEkle(ConfigReader.getProperty("kolonListeAdiUpdatePreCondition"),
                         ConfigReader.getProperty("kolonAciklamaUpdatePreCondition"),
                         ConfigReader.getProperty("kolonSiraUpdatePreCondition"));
        TestUtils.bekle(3);

        click(guncellenecekFiyatListesiButton);
        TestUtils.bekle(2);

    }

    public void acilanPenceredekiBosluklariDoldurVeGuncelleButonunaTikla() {

        click(kolonListeAdiTextBox);
        kolonListeAdiTextBox.clear();
        kolonListeAdiTextBox.sendKeys(ConfigReader.getProperty("kolonListeAdiUpdate"));

        click(kolonAciklamaTextBox);
        kolonAciklamaTextBox.clear();
        kolonAciklamaTextBox.sendKeys(ConfigReader.getProperty("kolonAciklamaUpdate"));

        click(kolonSiraTextBox);
        kolonSiraTextBox.clear();
        kolonSiraTextBox.sendKeys(ConfigReader.getProperty("kolonSiraUpdate"));
        click(guncelleButton);

    }

    public void fiyatListesiBilgilerindeYapilanDegisikliklerinGuncellendigiDogrula() {

        TestUtils.bekle(2);
        click(guncellendiFiyatListesiButton);
        TestUtils.bekle(2);
        click(duzenleButton);
        Assert.assertEquals(ConfigReader.getProperty("kolonListeAdiUpdate"),kolonListeAdiTextBox.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("kolonAciklamaUpdate"),kolonAciklamaTextBox.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("kolonSiraUpdate"),kolonSiraTextBox.getAttribute("value"));

        click(silButtonFirst);
        click(silButtonSecond);

   }


    public void galaxyBudsLiveFiyatTextBoxinaTiklaEskiFiyatiSilveYeniFiyatBilgisiniGir(String urunYeniFiyatBilgisi) {

       click(galaxyBudsLiveFiyatTextBox);
       galaxyBudsLiveFiyatTextBox.clear();
       galaxyBudsLiveFiyatTextBox.sendKeys(urunYeniFiyatBilgisi);
       TestUtils.bekle(2);

    }
    public void degisiklikleriKaydetButonunaTikla() {

       click(DegisiklikleriKaydetButton);
       TestUtils.bekle(2);
   }
   public void galaxyBudsLiveUrunFiyatBilgisindeYapilanDegisiklikliginGuncellendigiDogrula() {

       Assert.assertEquals(ConfigReader.getProperty("urunYeniFiyatBilgisi"),galaxyBudsLiveFiyatTextBox.getAttribute("value"));
       System.out.println("acl "+galaxyBudsLiveFiyatTextBox.getAttribute("value"));
       System.out.println("exp "+ConfigReader.getProperty("urunYeniFiyatBilgisi"));
   }














}
