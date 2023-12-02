package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class DizaynPage extends BasePage {

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
    @FindBy(xpath = "//input[@type='text' and @placeholder='Başlık']")
    private WebElement baslikText;
    @FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c344-8']")
    private WebElement sayfaGenisligiButon;
    @FindBy(xpath = "(//span[text()='Full'])[2]")
    private WebElement fullsec;
    @FindBy(xpath = "//*[text()=' Aktif ']")
    private WebElement aktifButon;
    @FindBy(xpath = "//a[text()='Kopya oluştur']")
    private WebElement kopyaOlusturButon;
    @FindBy(xpath = "//a[text()='Sayfayı sil']")
    private WebElement sayfaSilButon;
    @FindBy(xpath = "//div[text()='Kaydet']")
    private WebElement kaydetButon;
    /*@FindBy(xpath = "//div[@aria-label='İşlem başarılı']")
    private WebElement islemBasarili;*/
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
    @FindBy(xpath = "//button[text()=' KAYDET ']")
    private WebElement sosyalMedyaKaydet;
    @FindBy(xpath = "//div[@aria-label='Bilgiler güncellendi.']")
    private WebElement bilgilerGuncellendi;
    @FindBy(xpath = "//div[@class='col-12 col-md-12 col-lg-2']")
    private WebElement sosyalMedyaIkon;

    @FindBy(xpath = "//footer[@class='site__footer']")
    private WebElement footerSection;
    @FindBy(xpath = "(//div[@class='icon ml-1 mr-2'])[1]")
    private WebElement plusButton;

    @FindBy(xpath = "//button/span[contains(text(),'Koleksiyon')]")
    private WebElement collectionButton;
    @FindBy(xpath = "//button/span[contains(text(),'Ürün Detay')]")
    private WebElement productDetailButton;
    @FindBy(xpath = "// mat-option/span[text()=' Anasayfa 29 ']")
    private WebElement anasayfa29;
    @FindBy(xpath = "//ul/li/a[text()='İade Koşulları']")
    private WebElement iadeKosullari;
    @FindBy(xpath = "//ul/li/a[text()='Telefon']")
    private WebElement telephone;
    @FindBy(xpath = "//ul/li/a[text()='Faks']")
    private WebElement faks;
    @FindBy(xpath = "//ul/li/a[text()='adres']")
    private WebElement address;

    WebElement altBilgiframe;
    List<WebElement> menuListesi;
    int IlkListe;
    int sonListe;

    Actions actions = new Actions(Driver.getDriver());

    public void sayfaDogrulama(String text) {
        String baslikUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(baslikUrl.contains(text));
    }

    public void baslikTikla() {
        baslikButon.click();

    }

    @FindBy(xpath = "//*[text()='Başlık (Header)']")
    private WebElement headerButton;

    public void yaz() {
        click(baslikText);
        baslikText.clear();
        Random rand = new Random();
        type(baslikText, "Abeyis Deneme " + rand.nextInt(100));
    }

    @FindBy(css = "label[for='file-upload0'] mat-icon[role='img']")
    private WebElement logoGorseliEklemeArtiButton;

    @FindBy(xpath = "(//a[text()='Görseli kaldır'])[2]")
    private WebElement logoGorselKaldirButton;

    @FindBy(xpath = "(//a[text()='Görseli kaldır'])[1]")
    private WebElement baslikGorselKaldirButton;

    @FindBy(xpath = "//div[text()='Kaydet']")
    private WebElement yesilKaydetButton;

    @FindBy(xpath = "(//*[@id='vehicle1'])[2]")
    private WebElement loginTitleTextBox;

    @FindBy(xpath = "//div[@aria-label='İşlem başarılı.']")
    private WebElement islemBasariliPopUp;

    @FindBy(xpath = "(//img[@src='https://cdn.glopark.com/Images/ac4f32c1-0d5e-4cec-b70b-31fad293dcdc/Products/2023/11/13/1.jpg'])[2]")
    private WebElement logoGorseliDogrulama;

    @FindBy(xpath = "//div[normalize-space()='TestLoginTitle']")
    private WebElement loginTitleDogrulama;

    @FindBy(xpath = "//iframe[@class='iframe-web']")
    private WebElement iframe;

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

    @FindBy(css = ".flex-grow-1.col-8.px-0>iframe")
    private WebElement griDikdortgenIframe;

    @FindBy(xpath = "//span[@class='loader pulse']")
    private List<WebElement> griDikdortgenIframeler;

    @FindBy(xpath = "(//div[@class='drag'])[7]")
    private WebElement UrunListesiGizlemeIconu;

    @FindBy(xpath = "(//div[@class='drag'])[6]/..")
    private WebElement urunSil;

    @FindBy(xpath = "//div[@class='cdk-drag item_body ng-star-inserted'][1]/descendant::div[@class='drag'][2]")
    private WebElement urunListesiSilmeIconu;

    @FindBy(css = ".pageAdd.mb-2>mat-form-field")
    private WebElement pageListOpener;

    static int ilkUrunListesiSayisi = 0;
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
        TestUtils.waitForClickablility(logoGorseliEklemeArtiButton, 5);
        logoGorseliEklemeArtiButton.sendKeys(filePath);
        click(yesilKaydetButton);
    }

    public void verifyIslemBasariliPopUpisDisplay() {
        assertTrue(islemBasariliPopUp.isDisplayed());
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
        click(websayfasi);
        TestUtils.bekle(3);
        Driver.getDriver().switchTo().frame(iframe);
        System.out.println(" updated login Title   " + getElementText(loginTitleDogrulama));
        assertEquals(ConfigReader.getProperty("loginTitle"), getElementText(loginTitleDogrulama));
        Driver.getDriver().switchTo().defaultContent();
    }


    public void clickLogoGorselKaldirButton() {
        click(logoGorselKaldirButton);
        click(yesilKaydetButton);
    }


    public void VerifyDeletedLogo() {
        TestUtils.bekle(2);
        assertFalse(TestUtils.isElementPresent(logoGorseliDogrulama));
    }

    public void clickWebAbeyis() {
        click(websayfasi);
    }


    public void UrunListesiButonTikla() {
        ilkUrunListesiSayisi = tumUrunListesi.size();
        System.out.println(ilkUrunListesiSayisi);
        TestUtils.clickWithJS(urunListesiButon);
        TestUtils.wait(2);
    }

    public void UrunListesiEklendiginiDogrula() {
        sonUrunListesiSayisi = tumUrunListesi.size();
        assertEquals(ilkUrunListesiSayisi + 1, sonUrunListesiSayisi);
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        assertTrue(urunListesiGriDikdortgen.isDisplayed());
    }

    static int ilkDeger = 0;

    public void urunListesiGizle() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        ilkDeger = griDikdortgenIframeler.size();
        Driver.getDriver().switchTo().defaultContent();
        TestUtils.clickWithMouse(UrunListesiGizlemeIconu);
    }

    int sonDeger;

    public void urunListesiGizlediginiDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        TestUtils.waitForVisibility(By.xpath("//div[@class='site-preloader']"), 15);
        TestUtils.waitForInVisibility(By.xpath("//div[@class='site-preloader']"), 15);
        sonDeger = griDikdortgenIframeler.size();
        assertEquals(sonDeger, ilkDeger - 1);
    }

    public void urunListesiSilme() {
        TestUtils.waitFor(2);
        ilkUrunListesiSayisi = tumUrunListesi.size();
        TestUtils.clickWithMouse(urunSil);
        TestUtils.clickWithMouse(urunSil);
//        TestUtils.clickWithJS(urunSil);
    }

    public void urunListesiSildiginiDogrula() {
        TestUtils.waitFor(3);
        sonUrunListesiSayisi = tumUrunListesi.size();
//        sonUrunListesiSayisi= tumUrunListesi.size();
        assertEquals(ilkUrunListesiSayisi - 1, sonUrunListesiSayisi);
    }

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
        if (dropOzelKoleksiyon.isDisplayed()) {

        } else {
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
    private WebElement koleksiyonSecButon;

    //div[@class='d-flex align-items-center selectItem']//span[contains(text(),'Ürün listesi')
    @FindBy(xpath = "(//div[@class='drag'])[5]")
    private WebElement sagUrunListesi;
    @FindBy(xpath = "//button[normalize-space()='Onay']")
    private WebElement ekranOnayButon;

    public void KoleksiyonSecButonTiklama() {
        TestUtils.wait(2);
        click(koleksiyonSecButon);
    }

    @FindBy(xpath = "//app-collection-select//div[2]")
    private WebElement samsungWButon;

    @FindBy(xpath = "(//span[@class='mat-slider-thumb-label-text'])[2]")
    private WebElement satirUSayisiSlider;
    @FindBy(xpath = "(//span[@class='mat-slider-thumb-label-text'])[1]")
    private WebElement urunSayisiSlider;

    public void EkranKoleksiyonSec() {
        TestUtils.wait(2);
        click(samsungWButon);
        TestUtils.wait(2);
        click(ekranOnayButon);
    }

    public void UrunSSliderSec() {
        TestUtils.wait(2);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(urunSayisiSlider).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).build().perform();
    }

    public void genislikSec() {
        sayfaGenisligiButon.click();
        TestUtils.waitFor(1);
        fullsec.click();

    }

    public void SatirUrunSSliderSec() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(urunSayisiSlider).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).build().perform();
    }

    public void KaydetButonTikla() {
        click(kaydetButon);
    }

    public void aktifSec() {
        aktifButon.click();
    }

    public void ozelKolEklendiginiDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        assertFalse(urunListesiGriDikdortgen.isDisplayed());
    }

    @FindBy(xpath = "//img[@alt='...']")
    private WebElement resimliGriDik;

    public void sayfayiKaydet() {
        kaydetButon.click();
    }

    public void popUpValid() {
        assertTrue(TestUtils.waitForVisibility(By.xpath("//div[@aria-label='İşlem başarılı']/ancestor::div[@id='toast-container']"), 5).isDisplayed());
    }

    public void tiklaMain() {
        maindenSec.click();
    }

    public void tiklaAltBilgi() {
        altBilgiButon.click();
    }

    static String pageName;

    public void kopyaOlustur() {
        pageName = baslikText.getAttribute("value");
        click(kopyaOlusturButon);

    }

    public void kopyaOlustugunuDogrula() {
        WebElement option = Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + pageName + " - Copy')]"));
        assertTrue(option.isDisplayed());
    }

    public void sayfaSil() {
        TestUtils.wait(1);
        pageName = baslikText.getAttribute("value");
        click(sayfaSilButon);
    }

    public void dogrulaVeOnayla() {
        evetButon.click();
        TestUtils.wait(3);
    }

    public void silindiginiDogrula() {
        System.out.println(pageName);
        assertFalse(TestUtils.isElementPresent(By.xpath("//mat-option/span[text()=' " + pageName + " ']")));
    }

    public void gorunurluguDogrula() {
        altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(musteriHizmetleri.isDisplayed());

    }

    public void bilgerimGorunur() {
        try {
            TestUtils.waitForClickablility(By.xpath("//div[@class='site-preloader']"), 5);
            TestUtils.waitForInVisibility(By.xpath("//div[@class='site-preloader']"), 15);
        } catch (TimeoutException e) {
        }
        WebElement altBilgiframe = TestUtils.waitForClickablility(By.xpath("//iframe[@class='iframe-web']"), 20);
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
        TestUtils.waitForClickablility(By.xpath("//div[@class='sidebar-body']//li[contains(text(),'Web Sitesi')]"), 15).click();
    }

    public void clickToEdit(String option) {
        TestUtils.waitForClickablility(By.xpath("//div[contains(text(),'" + option + "')]/ancestor::li//span[text()=' Düzenle ']"), 15).click();
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

    public void kaydeteTikla() {
        TestUtils.scrollToElement(sosyalMedyaKaydet);
        sosyalMedyaKaydet.click();
        clickPanelButton(" × ");
        sideicon.click();
    }

    public void ikonlariDogrula() {
        altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        TestUtils.scrollToElement(footerSection);
        sosyalMedyaIkon.isDisplayed();
    }


    public void EklenenUrunDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        assertTrue(resimliGriDik.isDisplayed());
    }

    public void openPageList() {
        click(pageListOpener);
    }


    static int count = 0;

    public void getProductListCount() {
        if (TestUtils.isElementPresent(By.xpath("//*[text()='Ürün listesi']"))) {
            count = Driver.getDriver().findElements(By.xpath("//*[text()='Ürün listesi']")).size();
        }
    }

    public void verifyProductListAdded() {
        TestUtils.waitFor(2);
        assertEquals(count + 1, Driver.getDriver().findElements(By.xpath("//*[text()='Ürün listesi']")).size());
    }


    // Online Magaza --> Dizayn --> Ana Menu
    @FindBy(xpath = "((//mat-select[@role='combobox'])[1]//div)[3]")
    private WebElement testPageTri;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> testPageList;
    @FindBy(xpath = "//p[.='Menü İsmi']//following::input[1]")
    private WebElement inputMenuIsmi;
    @FindBy(css = "div[class='mat-select-arrow-wrapper ng-tns-c306-13']")
    private WebElement menuTipiDropDown;
    @FindBy(xpath = "//span[.='Liste']")
    private WebElement menuTipiListe;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement pageMatSelect;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement anaMenuMatSelect;


    public void selectPage(String text){
        matSelectFromList(pageMatSelect, text);
    }

    public void selectListe(){
        click(menuTipiDropDown);
        click(menuTipiListe);
    }

    public void sendTextFromTitle(String title, String text){
        WebElement element = Driver.getDriver().findElement(By.xpath(
                "( //p[.='" + title + "']//following::input)[1]"));
        TestUtils.waitAndSendText(element, text);
    }

    public void verifyMenuName(String menuName){
        click(anaMenuMatSelect);
        WebElement optionList = Driver.getDriver().findElement(By.cssSelector("span[class='mat-option-text']"));
        Assert.assertTrue(isOptionPresent(optionList, menuName));
    }

    public void matSelectFromList(WebElement matSelectElement, String text) {
        matSelectElement.click();
        TestUtils.waitForVisibility(matSelectElement, 10);
        WebElement optionList = Driver.getDriver().findElement(By.cssSelector("span[class='mat-option-text']"));
        WebElement menuOption = optionList.findElement(By.xpath(".//*[contains(text(), ' " + text + " ')]"));
        menuOption.click();
    }

    public boolean isOptionPresent(WebElement optionList, String optionText) {
        try {
            optionList.findElement(By.xpath(".//*[contains(text(), '" + optionText + "')]"));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    public void clickPlus() throws InterruptedException {
        wait(5000);
        plusButton.click();
    }


    public void verifyCollection() throws InterruptedException {
        wait(10000);
        click(pageListOpener);
        pageName = collectionButton.getText();
        click(collectionButton);
        WebElement option = Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + pageName + "')]"));
        assertTrue(option.isDisplayed());
    }

    public void verifyProductDetail() throws InterruptedException {
        wait(10000);
        click(pageListOpener);
        pageName = productDetailButton.getText();
        click(productDetailButton);
        WebElement option = Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + pageName + "')]"));
        assertTrue(option.isDisplayed());
    }
      String firstOption;
    public void dropMenu() {
        clickPanelButton(" Sayfa Ayarları ");
        firstOption= baslikText.getText();
        pageListOpener.click();
    }

    public void verifyTransition() throws InterruptedException {
        wait(10000);
        clickPanelButton(" Sayfa Ayarları ");
        String secondOption= baslikText.getText();
        assertNotEquals(firstOption,secondOption);

    }


    public void verifyCustomerService() {
        altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        Assert.assertEquals("İade Koşulları",iadeKosullari);
        Assert.assertEquals("Telefon",telephone);
        Assert.assertEquals("Faks",faks);
        Assert.assertEquals("adres",address);





    }
}