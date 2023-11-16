package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class DizaynPage extends  BasePage {

    public DizaynPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[text()='Web : abeyis-web']/ancestor::div[@class='contents d-flex align-items-center py-2']")
    private WebElement websayfasi;
    @FindBy(xpath = "(//div[@class='item ng-star-inserted'])[1]")
    private WebElement baslikButon;

    @FindBy(xpath = "(//div[@class='text'])[3]")
    private WebElement maindenSec;
    @FindBy(xpath = "//*[text()='Alt Bilgi']")
    private WebElement altBilgiButon;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement baslikText;
    @FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c344-8']")
    private WebElement sayfaGenisligiButon;
    @FindBy(xpath = "(//*[text()='Full'])[2]")
    private WebElement fullsec;
    @FindBy(xpath = "//*[text()=' Aktif ']")
    private WebElement aktifButon;
    @FindBy(xpath = "//a[text()='Kopya oluştur']")
    private WebElement kopyaOlusturButon;
    @FindBy(xpath = "//*[text()='Sayfayı sil']")
    private WebElement sayfaSilButon;
    @FindBy(xpath = "(//*[text()='Kaydet'])[1]")
    private WebElement kaydetButon;
    @FindBy(xpath = "//div[@aria-label='İşlem başarılı.']")
    private WebElement islemBasarili;
    @FindBy(xpath = "(//*[text()='Ürün listesi'])[1]")
    private WebElement mainList;
    @FindBy(xpath = "//div[@role='listbox']//span")
    private WebElement magazalist;
    @FindBy(xpath = "//div[@class='pageAdd mb-2']")
    private WebElement magazalarselectbuton;
    @FindBy(xpath = "//div[@class='modal-header']")
    private WebElement silmeMesaji;
    @FindBy(xpath = "//div[@class='btn btn-primary']")
    private WebElement evetButon;
    @FindBy(xpath = "(//ul[@class='footer-links__list'])[2]")
    private WebElement bilgilerimButon;
    @FindBy(xpath = "(//h5[@class='footer-links__title'])[1]")
    private WebElement musteriHizmetleri;
    @FindBy(xpath = "//*[@id='sideicon1']")
    private WebElement sideicon;
    @FindBy(xpath = "//li[@class='px-3 item border-top position-relative ng-star-inserted active text-primary']")
    private WebElement webSitesi;
    @FindBy(xpath = "//span[@class='link hover-line ng-tns-c178-14'][1]")
    private WebElement duzenleButon;
    @FindBy(xpath = "//input[@id='exampleInput18']")
    private WebElement huaweiTextBox;
    @FindBy(xpath = "//input[@id='exampleInput19']")
    private WebElement appStoreTextBox;
    @FindBy(xpath = "//input[@id='exampleInput20']")
    private WebElement googlePlayStoreTextBox;
    @FindBy(xpath = "//input[@id='exampleInput21']")
    private WebElement etbisTextBox;
    @FindBy(xpath = "//input[@id='exampleInput24']")
    private WebElement twitterTextBox;
    @FindBy(xpath = "//input[@id='exampleInput25']")
    private WebElement facebookTextBox;
    @FindBy(xpath = "//input[@id='exampleInput26']")
    private WebElement instagramTextBox;
    @FindBy(xpath = "//input[@id='exampleInput27']")
    private WebElement youtubeTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sosyalMedyaKaydet;
    @FindBy(xpath = "//div[@aria-label='Bilgiler güncellendi.']")
    private WebElement bilgilerGuncellendi;
    @FindBy(xpath = "//div[@class='col-12 col-md-12 col-lg-2']")
    private WebElement sosyalMedyaIkon;

    WebElement altBilgiframe;
    List<WebElement> menuListesi;
    int IlkListe;
    int sonListe;

    Actions actions = new Actions(Driver.getDriver());

    public void clickWebAbeyis() {
        click(websayfasi);

    }

    public void sayfaDogrulama(String text) {
        String baslikUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(baslikUrl.contains(text));
    }

    public void baslikTikla() {
        baslikButon.click();

    }

    public void yaz() {
        baslikText.clear();
        baslikText.sendKeys("Abeyis Deneme");
    }

    public void genislikSec() {
        sayfaGenisligiButon.click();
        fullsec.click();
    }

    public void aktifSec() {
        aktifButon.click();
    }

    public void kaydeteTikla() {
        kaydetButon.click();
    }

    public void popUpValid() {
        TestUtils.wait(3000);
        Assert.assertTrue(islemBasarili.isDisplayed());
    }

    public void tiklaMain() {
        maindenSec.click();
    }

    public void tiklaAltBilgi() {
        altBilgiButon.click();
    }

    public void kopyaOlustur() {
        magazalarselectbuton.click();
        menuListesi = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']//span"));
        IlkListe = menuListesi.size();
        kopyaOlusturButon.click();

    }

    public void kopyaOlustugunuDogrula() {
        magazalarselectbuton.click();
        menuListesi = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']//span"));
        sonListe = menuListesi.size();
        Assert.assertEquals(IlkListe + 1, sonListe);
    }

    public void sayfaSil() {
        magazalarselectbuton.click();
        menuListesi = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']//span"));
        IlkListe = menuListesi.size();
        sayfaSilButon.click();
    }

    public void dogrulaVeOnayla() {
        String expected = silmeMesaji.getText();
        Assert.assertEquals(expected, "Sayfayı silmek istediğinize emin misiniz?");
        evetButon.click();
    }

    public void silindiginiDogrula() {
        magazalist.click();
        menuListesi = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']//span"));
        sonListe = menuListesi.size();
        Assert.assertEquals(IlkListe, sonListe + 1);

    }

    public void gorunurluguDogrula() {
        altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(musteriHizmetleri.isDisplayed());

    }

    public void bilgerimGorunur() {
        WebElement altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        actions.moveToElement(bilgilerimButon).perform();
        bilgilerimButon.click();

    }

    public void ucCizgiTikla() {
        Driver.getDriver().switchTo().parentFrame();
        sideicon.click();
    }

    public void ayarlarTikla() {
        clickPanelButton(" Ayarlar ");
    }

    public void webSitesiTikla() {

        webSitesi.click();
    }

    public void duzenleTıkla() {
        duzenleButon.click();
    }

    public void huaweiText() {
        huaweiTextBox.click();
        huaweiTextBox.clear();
        huaweiTextBox.sendKeys("wwww.huawai.com");
    }

    public void appStoreText() {
        appStoreTextBox.click();
        appStoreTextBox.clear();
        appStoreTextBox.sendKeys("www.appsore.com");
    }

    public void playStoreText() {
        googlePlayStoreTextBox.click();
        googlePlayStoreTextBox.clear();
        googlePlayStoreTextBox.sendKeys("www.googleplay.com");
    }

    public void etbisText() {
        etbisTextBox.click();
        etbisTextBox.clear();
        etbisTextBox.sendKeys("www.etbis.com");
    }

    public void twitterText() {
        twitterTextBox.click();
        twitterTextBox.clear();
        twitterTextBox.sendKeys("www.twitter.com");
    }

    public void facebookText() {
        facebookTextBox.click();
        facebookTextBox.clear();
        facebookTextBox.sendKeys("www.facebook.com");
    }

    public void instagramText() {
        instagramTextBox.click();
        instagramTextBox.clear();
        instagramTextBox.sendKeys("www.instagram.com");
    }

    public void youtubeText() {
        youtubeTextBox.click();
        youtubeTextBox.clear();
        youtubeTextBox.sendKeys("www.youtube.com");
    }

    public void kaydetTikla() {

        actions.sendKeys(Keys.PAGE_DOWN);
        sosyalMedyaKaydet.click();
        clickPanelButton(" × ");
        sideicon.click();
        Driver.getDriver().switchTo().frame(altBilgiframe);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP);

    }

    public void ikonlariDogrula() {
        sosyalMedyaIkon.isDisplayed();
    }
}
