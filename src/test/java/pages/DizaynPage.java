package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;
import java.util.List;

public class DizaynPage extends  BasePage{
  
    public DizaynPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[text()='Web : abeyis-web']/ancestor::div[@class='contents d-flex align-items-center py-2']")
    public WebElement websayfası;
  
    @FindBy(xpath = "//*[text()='Başlık (Header)']")
    private WebElement headerButton ;

    @FindBy(css = "label[for='file-upload0'] mat-icon[role='img']")
    private WebElement logoGorseliEklemeArtiButton ;

    @FindBy(xpath = "(//a[text()='Görseli kaldır'])[2]")
    private WebElement logoGorselKaldirButton ;

    @FindBy(xpath = "(//a[text()='Görseli kaldır'])[1]")
    private WebElement baslikGorselKaldirButton;

    @FindBy(xpath = "//div[text()='Kaydet']")
    private WebElement yesilKaydetButton ;

    @FindBy(xpath = "(//*[@id='vehicle1'])[2]")
    private WebElement loginTitleTextBox;

    @FindBy(xpath = "//div[@aria-label='İşlem başarılı.']")
    private WebElement islemBasariliPopUp ;

    @FindBy(xpath = "(//img[@src='https://cdn.glopark.com/Images/ac4f32c1-0d5e-4cec-b70b-31fad293dcdc/Products/2023/11/13/1.jpg'])[2]")
    private WebElement logoGorseliDogrulama;

    @FindBy(xpath = "//div[normalize-space()='TestLoginTitle']")
    private WebElement loginTitleDogrulama;

    @FindBy(xpath = "//iframe[@class='iframe-web']")
    private WebElement iframe;
  
    @FindBy(xpath = "(//div[@class='text ml-4'])[1]")
    public WebElement websayfasi;
  
    @FindBy(xpath = "//span[text()='Bölüm ekle']")
    private WebElement bolumEkleButon;

    @FindBy(xpath = "(//div[@class='mat-ripple mat-menu-ripple'])[2]")
    private WebElement urunListesiButon;

    @FindBy(xpath = "//div[@class='cdk-drag item_body ng-star-inserted'][1]")
    private WebElement firstProductListBtn;

    @FindBy(xpath = "//span[text()='Ürün listesi']")
    private List<WebElement> tumUrunListesi;

    @FindBy(xpath = "(//span[@class='loader pulse'])[1]")
    private WebElement urunListesiGriDikdortgen;
  
    @FindBy(xpath = "//iframe[@class='iframe-web']")
    private WebElement griDikdortgenIframe ;

    @FindBy(xpath = "//span[@class='loader pulse']")
    private List<WebElement> griDikdortgenIframeler;

    @FindBy(xpath = "(//div[@class='drag'])[7]")
    private WebElement UrunListesiGizlemeIconu;

    @FindBy(xpath = "(//div[@class='drag'])[6]")
    private WebElement urunSil;
  
    @FindBy(xpath = "//div[@class='cdk-drag item_body ng-star-inserted'][1]/descendant::div[@class='drag'][2]")
    private WebElement urunListesiSilmeIconu;

    int ilkUrunListesiSayisi;
    int sonUrunListesiSayisi;
  
    
    public void websayfasitikla() {
        click(websayfasi);
    }
    
    public void bolumEkleButonTikla() {
        click(bolumEkleButon);
    }

    public void headerButtonTikla() {
        click(headerButton);
    }

    public void logoResminiEkleVeKaydetButonunaTikla() {
        TestUtils.bekle(2);
        String filePath = System.getProperty("user.dir") + "/src/test/java/pages/abeyisLogo.jpg";
        TestUtils.hover(logoGorselKaldirButton);
        TestUtils.waitForClickablility(logoGorseliEklemeArtiButton,5);
        logoGorseliEklemeArtiButton.sendKeys(filePath);
        click(yesilKaydetButton);
    }

    public void verifyIslemBasariliPopUpisDisplay() {
        Assert.assertTrue(islemBasariliPopUp.isDisplayed());
    }


    public void FillLoginTitleTextAndClickSave() {
        click(loginTitleTextBox);
        loginTitleTextBox.clear();
        loginTitleTextBox.sendKeys(ConfigReader.getProperty("loginTitle"));
        click(yesilKaydetButton);
        TestUtils.bekle(3);
    }


    public void VerifyUpdatedLoginTitle() {
        Driver.getDriver().navigate().refresh();
        click(websayfası);
        TestUtils.bekle(3);
        Driver.getDriver().switchTo().frame(iframe);
        System.out.println(" updated login Title   "+getElementText(loginTitleDogrulama));
        Assert.assertEquals(ConfigReader.getProperty("loginTitle"),getElementText(loginTitleDogrulama));
        Driver.getDriver().switchTo().defaultContent();
    }


    public void clickLogoGorselKaldirButton() {
        click(logoGorselKaldirButton);
        click(yesilKaydetButton);
    }


    public void VerifyDeletedLogo() {

        TestUtils.bekle(2);
        try {
            Assert.assertFalse(logoGorseliDogrulama.isDisplayed());
        } catch (NoSuchElementException e ) {
            System.out.println("Logo image has been successfully deleted");
        }
    }

    public void clickWebAbeyis() {
        click(websayfası);
    }


    public void UrunListesiButonTikla() {
        ilkUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(ilkUrunListesiSayisi);
        TestUtils.clickWithJS(urunListesiButon);
        TestUtils.wait(2);
    }
  
    public void UrunListesiEklendiginiDogrula() {
        sonUrunListesiSayisi= tumUrunListesi.size();
        Assert.assertEquals(ilkUrunListesiSayisi+1,sonUrunListesiSayisi);
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        Assert.assertTrue(urunListesiGriDikdortgen.isDisplayed());
    }
  
    int ilkDeger=0;
    public void UrunListesiGizle() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        System.out.println("listenin ilk size = "+ griDikdortgenIframeler.size());
        ilkDeger=griDikdortgenIframeler.size();
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().navigate().refresh();
        click(websayfasi);
        TestUtils.wait(3);
        Actions action= new Actions(Driver.getDriver());
        action.moveToElement(UrunListesiGizlemeIconu).build().perform();
        TestUtils.wait(3);
        UrunListesiGizlemeIconu.click();
    }
  
    int sonDeger;
    public void UrunListesiGizlediginiDogrula() {

        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        TestUtils.wait(2);
        System.out.println("Listenin son size ="+(griDikdortgenIframeler).size());
        sonDeger=griDikdortgenIframeler.size();
        Assert.assertEquals(sonDeger,ilkDeger-1);
    }
  
    public void UrunListesiSilme() {
        ilkUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(ilkUrunListesiSayisi);
        TestUtils.wait(3);
        Actions action= new Actions(Driver.getDriver());
        action.moveToElement(urunSil).build().perform();
        TestUtils.waitForClickablility(urunSil,3);
        TestUtils.clickWithJS(urunSil);

    }
  
    public void UrunListesiSildiginiDogrula() {
        sonUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(sonUrunListesiSayisi);
        Assert.assertEquals(ilkUrunListesiSayisi-1,sonUrunListesiSayisi);

    }

/// eda


    public void deleteLogoImage() {
        click(logoGorselKaldirButton);
        click(yesilKaydetButton);
    }


    public void updateLoginTitle() {

        click(loginTitleTextBox);
        loginTitleTextBox.clear();
        loginTitleTextBox.sendKeys(ConfigReader.getProperty("loginTitle"));
        click(yesilKaydetButton);
        TestUtils.bekle(3);

    }


    @FindBy(xpath = "//span[normalize-space()='Özel Koleksiyon']")
    private WebElement dropOzelKoleksiyon;


    public void OzelKoleksiyonSec() {
        TestUtils.clickWithJS(sagUrunListesi);
        TestUtils.wait(2);
        if (dropOzelKoleksiyon.isDisplayed()){

        }else {
            TestUtils.clickWithJS(dropdownMenu);
            TestUtils.wait(2);
            TestUtils.clickWithJS(dropOzelKoleksiyon);
        }
    }

    @FindBy(xpath = "//span[normalize-space()='Ürün Seç']")
    private WebElement dropUrunSec;

    @FindBy(xpath = "//a[contains(text(),'Ürün seçmek için tıklayın')]")
    private WebElement urunSecmekIcinTiklayinButonu;
    @FindBy(xpath = "(//div[contains(@class, 'mat-select-arrow-wrapper')])[3]")
    private WebElement dropdownMenu;
    public void DropUrunSec() {
        TestUtils.clickWithJS(sagUrunListesi);
        TestUtils.wait(2);

        TestUtils.clickWithJS(dropdownMenu);
        TestUtils.wait(2);
        TestUtils.clickWithJS(dropUrunSec);
    }
    public void UrunSecTiklayinButon() {
        TestUtils.wait(2);
        click(urunSecmekIcinTiklayinButonu);
    }

    @FindBy(xpath = "//div[3]//div[2]//p[1]")
    private WebElement ekranUrunGalaxyButonu;
    @FindBy(xpath = "//div[@class='column-add mt-3 mb-5 ng-star-inserted']")
    private WebElement dahaFazlaEkleButonu;
    public void EkranUrunSecGalaxyButon() {
        TestUtils.wait(2);
        click(ekranUrunGalaxyButonu);
    }
    public void DahaFazlaEkleButon() {
        TestUtils.wait(2);
        click(dahaFazlaEkleButonu);
    }
    @FindBy(xpath = "//div[@class='theme-text mt-3 page productSelect text-truncate ng-star-inserted']")
    private WebElement koleksiyonSecButon ;

    //div[@class='d-flex align-items-center selectItem']//span[contains(text(),'Ürün listesi')
    @FindBy(xpath = "(//div[@class='drag'])[5]")
    private WebElement sagUrunListesi;
    @FindBy(xpath = "//button[normalize-space()='Onay']")
    private WebElement ekranOnayButon ;
    public void KoleksiyonSecButonTiklama() {
        TestUtils.wait(2);
        click(koleksiyonSecButon);
    }
    @FindBy(xpath = "//app-collection-select//div[2]")
    private WebElement samsungWButon ;

    @FindBy(xpath = "(//span[@class='mat-slider-thumb-label-text'])[2]")
    private WebElement satirUSayisiSlider;
    @FindBy( xpath = "(//span[@class='mat-slider-thumb-label-text'])[1]")
    private WebElement urunSayisiSlider;
    public void EkranKoleksiyonSec() {
        TestUtils.wait(2);
        click(samsungWButon);
        TestUtils.wait(2);
        click(ekranOnayButon);
    }
    public void UrunSSliderSec() {
        TestUtils.wait(2);
        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(urunSayisiSlider).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).build().perform();

    }
    public void SatirUrunSSliderSec() {
        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(urunSayisiSlider).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).build().perform();
    }
    @FindBy(xpath = "//div[@class='btn saveBtn mr-2']")
    private WebElement kaydetButon;
    public void KaydetButonTikla() {
        click(kaydetButon);
    }

    public void OzelKolEklendiginiDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        Assert.assertFalse(urunListesiGriDikdortgen.isDisplayed());
    }
    @FindBy(xpath = "//img[@alt='...']")
    private WebElement resimliGriDik;

    public void EklenenUrunDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        Assert.assertTrue(resimliGriDik.isDisplayed());
    }
  
}