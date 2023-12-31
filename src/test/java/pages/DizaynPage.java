package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
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
    @FindBy(xpath = "//span[.='Liste']")
    private WebElement menuTipiListe;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement pageComboBox;
    @FindBy(xpath = "//p[.='Menü İsmi']//following::input[1]")
    private WebElement inputMenuIsmi;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
    private WebElement menuTipiDropDown;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement anaMenuComboBox;
    @FindBy(css = "p[class='cp']")
    private WebElement closePanel;
    @FindBy(xpath = "//p[normalize-space()= 'Menü öğesi ekle']")
    private WebElement addMenuItem;


    public void selectPage(String text){
        click(pageComboBox);
        click(Driver.getDriver().findElement(By.xpath(
                "//*[@class='mat-option-text'][contains(text(), '" + text + "')]/..")));
    }

    public void selectAnaMenu(String text){
        click(anaMenuComboBox);
        click(Driver.getDriver().findElement(By.xpath(
                "//*[@class='mat-option-text'][contains(text(), '" + text + "')]/..")));
    }

    public void selectListe(){
        click(menuTipiDropDown);
        click(menuTipiListe);
    }

    public void sendTextFromTitle(String title, String text){
        WebElement element = Driver.getDriver().findElement(By.xpath(
                "( //p[.='" + title + "']//following::input)[1]"));
        element.clear();
        TestUtils.waitAndSendText(element, text);
    }

    public void verifyMenuName(String menuName, String menuCase){
        boolean assertCase = menuCase.equals("created") || menuCase.equals("changed");
        click(anaMenuComboBox);
        try {
            WebElement element = Driver.getDriver().findElement(By.xpath(
                    "//span[normalize-space()='" + menuName + "']"));
            Assert.assertTrue(assertCase);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(!assertCase);
        }
    }

    public void closeThePanel(){
        click(closePanel);
    }

    public void selectTheTab(String tabTitle){
        TestUtils.waitFor(5);
        click(Driver.getDriver().findElement(By.xpath(
                "//div[starts-with(@class, 'banner-')][normalize-space()= '" + tabTitle + "']")));
    }

    public void clickPlus() {
          plusButton.click();
          pageName = collectionButton.getText();
          pageName = productDetailButton.getText();
    }

    public void clickMenuBtn(String btnName){
        click((Driver.getDriver().findElement(By.xpath(
                "//div[@class = 'btn saveBtn mr-2' ][normalize-space()= '"+ btnName +"']"))));
    }

    public void clickOnayBtn(String btnName) {
        click((Driver.getDriver().findElement(By.xpath(
                "//button[@class = 'btn btn-danger' ][.= '" + btnName + "']"))));
    }

    public void addMenuItems(List<List<String>> listItems) {
        String title;
        String guidance;
        String objectName;
        for (int i=0; i<listItems.size(); i++) {
            title = listItems.get(i).get(0);
            guidance = listItems.get(i).get(1);
            objectName = listItems.get(i).get(2);

            clickMenuOgesiEkle();                     //    Then Click the "Menu Ogesi Ekle" selection
            sendTitleToBaslik(title);                 //    Then Send menu title to Baslik
            clickMenulerBtn("Yönlendir");      //    Then Click the "Yönlendir" button
            clickItemSelection(guidance);             //    Then Click guidance button on pop-up window
            clickObjectSelection(objectName);         //    Then Click my object name name in list
            clickKaydet();                            //    Then Click the "Kaydet" button
            clickMenulerBtn("Olustur");        //    Then Click the "Oluştur" button
        }
    }

    public void verifyCollection(){
        click(pageListOpener);
        WebElement option = Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + pageName + "')]"));
        assertTrue(option.isDisplayed());
    }

    public void verifyProductDetail() {
        click(pageListOpener);
        WebElement option = Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + pageName + "')]"));
        assertTrue(option.isDisplayed());
    }

    public void clickMenuOgesiEkle(){
        By by = TestUtils.handleStaleElement(By.xpath(
                "//div[@class='svg']//*[local-name() = 'svg' and @class='Polaris-Icon__Svg_375hu']"));
        click(TestUtils.waitForClickablility(Driver.getDriver().findElement(by), 5));
    }

    WebElement firstOption;
    public void dropMenu() {
        firstOption= Driver.getDriver().findElement(By.xpath("//span[text()='Anasayfa 18']"));
        System.out.println("firstOption = " + firstOption);
        pageListOpener.click();
    }

    public void verifyTransition() {
        WebElement secondOption= Driver.getDriver().findElement(By.xpath("//span[text()='Anasayfa 29']"));
        System.out.println("secondOption = " + secondOption);

        try {
            assertEquals(firstOption,secondOption);

        }catch (AssertionError e) {
            System.out.println("Farklı sayfaya geçiş yapılmıştır");
        }

    }

    public void verifyCustomerService() {
        altBilgiframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='iframe-web']"));
        Driver.getDriver().switchTo().frame(altBilgiframe);
        Assert.assertEquals("İade Koşulları",iadeKosullari);
        Assert.assertEquals("Telefon",telephone);
        Assert.assertEquals("Faks",faks);
        Assert.assertEquals("adres",address);
    }

    public void sendTitleToBaslik(String title){
        By by = TestUtils.handleStaleElement(By.xpath(
                "//h6[normalize-space()= 'Başlık']//following-sibling::input"));
        Driver.getDriver().findElement(by).clear();
        type(Driver.getDriver().findElement(by), title);
    }

    public void clickMenulerBtn(String btnTitle){
        By by = By.xpath("//div[@id='menuCreated']//div[normalize-space()= '" + btnTitle + "']");
        WebElement element = Driver.getDriver().findElement(TestUtils.handleStaleElement(by));
        click(element);
    }

    public void clickItemSelection(String guidance){
        click(Driver.getDriver().findElement(By.xpath(
                "//div[@class='item mt-1 py-2 pl-3 d-flex align-items-center'][normalize-space()=  '"+ guidance +"']")));
    }

    public void clickObjectSelection(String objectName){
        click(Driver.getDriver().findElement(By.xpath(
                "//div[@placement='bottom'][normalize-space()= '"+ objectName +"']")));
    }

    public void clickKaydet(){
        click(Driver.getDriver().findElement(By.xpath(
                "//button[normalize-space()= 'Kaydet']")));
    }

    public void verifyItemInMenu(String itemName){
        Driver.getDriver().switchTo().frame(iframe);
        try {
            WebElement element = Driver.getDriver().findElement(By.xpath(
                    "//div[starts-with(@class,'menuContain')]//button[normalize-space()='"+ itemName +"']"));
            Assert.assertTrue(true);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
        }
        Driver.getDriver().switchTo().defaultContent();
    }

    public void sendLinkAddress(String linkAddress){
        By by = TestUtils.waitToBePresent(By.xpath(
                "//input[@type='text'][contains(@placeholder, 'https://tija.app/')]"));
        type(Driver.getDriver().findElement(by), linkAddress);
    }

    public void changeMenuItems(List<List<String>> listItems){
        String title;
        String newTitle;
        String guidance;
        String objectName;
        for (int i=0; i<listItems.size(); i++) {
            title = listItems.get(i).get(0);
            newTitle = listItems.get(i).get(1);
            guidance = listItems.get(i).get(2);
            objectName = listItems.get(i).get(3);

            clickItemChoise(title, "Düzenle");   //    Then Click the "Düzenle" for related menu item
            sendTitleToBaslik(newTitle);                  //    Then Send menu title to Baslik
            clickMenulerBtn("Yönlendir");          //    Then Click the "Yönlendir" button
            clickItemSelection(guidance);                 //    Then Click guidance button on pop-up window
            clickObjectSelection(objectName);             //    Then Click my object name in list
            clickKaydet();                                //    Then Click the "Kaydet" button
            clickMenulerBtn("Kaydet");             //    Then Click the "Kaydet" button
            TestUtils.waitFor(1);
        }
    }

    public void clickItemChoise(String title, String choiseText){
        By by = TestUtils.handleStaleElement(By.xpath(
                "//span[@class='nodeContent' and normalize-space()='" + title
                              + "']/../following-sibling::div[normalize-space()='" + choiseText + "']"));
        click(Driver.getDriver().findElement(by));
    }

    public void clickItemExpand(String menuName) {
        By by = TestUtils.handleStaleElement(By.xpath(
                "(//span[@class='nodeContent' and normalize-space()='" + menuName + "']/..)/..//button"));
        click(Driver.getDriver().findElement(by));
    }

    public void verifyIslemBasarili(String menuCase){
        if (menuCase.equalsIgnoreCase("created")) {
            verifyIslemBasariliPopUpisDisplay();
        }
    }

    public void createCategoricalMenuItems(List<String> listItems){
        String title;
        for (int i=0; i<listItems.size(); i++) {
            title = listItems.get(i);

            clickMenuOgesiEkle();                     //    Then Click the "Menu Ogesi Ekle" selection
            sendTitleToBaslik(title);                 //    Then Send menu title to Baslik
            clickMenulerBtn("Olustur");        //    Then Click the "Oluştur" button
            moveItemOnto(title, "Markalar");    //    Then Move the new Item on to "Markalar"
        }
    }

    public WebElement elementByItem(String title){
        By by = TestUtils.waitToBePresent(TestUtils.handleStaleElement(By.xpath(
                "//span[@class='nodeContent' and normalize-space()='" + title + "']/..")));
        return (Driver.getDriver().findElement(by));
    }
    public void moveItemOnto(String item, String target){
        Actions actions = new Actions(Driver.getDriver());
        WebElement elementItem = elementByItem(item);
        WebElement elementTarget = elementByItem(target);
        Action action = actions.dragAndDrop(elementItem, elementTarget).build();
        action.perform();
        TestUtils.waitForPageToLoad(15);
    }
    public static boolean mobile = false;
    public void verifyItemsInMenu(List<List<String>> menuList) {
        Driver.getDriver().switchTo().frame(iframe);
        TestUtils.waitForPageToLoad(15);
        TestUtils.waitFor(5);

            By byHamburger = TestUtils.waitToBePresent(By.xpath("//button[@class='mobile-header__menu-button']"));
            try{
                if (Driver.getDriver().findElement(byHamburger).isEnabled()) {
                    Driver.getDriver().findElement(TestUtils.handleStaleElement(byHamburger)).click();
                    mobile = true;
                }
            } catch (ElementNotInteractableException e){
            }

        for (int i = 0; i < menuList.size(); i++) {
            verifyItemInCategorical(menuList.get(i));
            resetWebMenuView(menuList.size());
        }
        Driver.getDriver().switchTo().defaultContent();
    }

    public void resetWebMenuView(int branchCount){
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 0; i < branchCount; i++) {
            actions.sendKeys(Keys.ESCAPE).perform();
        }
    }

    public void verifyItemInCategorical(List<String> itemList) {
        String itemName;
        for (int i = 0; i < itemList.size(); i++) {
            itemName = itemList.get(i);

            if (itemName!=null) {
                verifyMenuItems(itemName, i);
            }
        }
    }

    public void verifyMenuItems(String itemName, int rank) {
      if (mobile) {
          verifyMobileMenu(itemName);
        }else {
          verifyWebMenu(itemName, rank);
        }
    }

    public void verifyMobileMenu(String itemName) {
        WebElement element = null;
        try {
            element = Driver.getDriver().findElement(By.xpath(
                    "//div[@class='mobile-links__item']//a[.='" + itemName + "']"));
            Assert.assertTrue(true);

        } catch (NoSuchElementException e) {
                Assert.assertTrue(false);
        }
    }

    public void verifyWebMenu(String itemName, int rank) {
        WebElement element = null;
        try {
            if (rank==0){
                element = Driver.getDriver().findElement(By.xpath(
                    "//div[contains(@class, 'menuContain')]//button[text()=' " + itemName + " ']"));
                }
            else {
                element = Driver.getDriver().findElement(By.xpath(
                        "//button[@role='menuitem']//span[.='" + itemName + "']"));
            }
            Assert.assertTrue(true);
            click(element);

        } catch (NoSuchElementException e) {
                Assert.assertTrue(false);
        }
    }

    public void verifyPopUpMessage(String msg) {
        By by = TestUtils.waitToBePresent(By.xpath(
                "//div[@aria-label='" + msg + "']"));
        Assert.assertTrue(Driver.getDriver().findElement(by).isDisplayed());
        TestUtils.waitFor(3);
    }


    public void clickMenuOgesiEkle(String menuName) {
        By by = TestUtils.handleStaleElement(By.xpath(
                "//div[@class='svg']//*[local-name() = 'svg' and " +
                        "@class='addMenuElement']//following::b[.='" + menuName + "']"));
        click(TestUtils.waitForClickablility(Driver.getDriver().findElement(by), 5));

    }



    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(), 'Yazı')]")
    private WebElement yaziFromTopbarType;

    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(), 'Görsel')]")
    private WebElement gorselFromTopbarType;

    @FindBy(xpath = "(//input[@name='Metin' and   @type='text' ])[1] ")
    private WebElement metinForTopbar;

    @FindBy(xpath = "(//input[@name='Metin' and   @type='text' ])[3] ")
    private WebElement yonlendirmeLinkiForTopbar;

    @FindBy(xpath = "(//input[@class='w-100'])[1]")
    private WebElement yaziRengiForTopbar;

    @FindBy(xpath = "(//input[@class='w-100'])[2]")
    private WebElement arkaplanRengiForTopbar;

    @FindBy(xpath = "//span[@class='mat-slider-thumb-label-text' and //span[text()='32']]")
    private WebElement fontBoyutuForTopbar;


    public void saveTopbarAsAText(String text){

        TestUtils.waitForPageToLoad(3);
        TestUtils.clickWithJS(dropdownMenu);
        TestUtils.wait(1);
        TestUtils.clickWithJS(yaziFromTopbarType);
        TestUtils.wait(1);
        metinForTopbar.clear();
        metinForTopbar.sendKeys(text);
        yonlendirmeLinkiForTopbar.clear();
        yonlendirmeLinkiForTopbar.sendKeys(ConfigReader.getProperty("yonlendirmeLinkiForTopbar"));
        TestUtils.wait(1);
        TestUtils.clickInCycle(fontBoyutuForTopbar);
        TestUtils.scrollToElement(yaziRengiForTopbar);
        yaziRengiForTopbar.sendKeys(ConfigReader.getProperty("yaziRengiForTopbar"));
        TestUtils.scrollToElement(arkaplanRengiForTopbar);
        arkaplanRengiForTopbar.sendKeys(ConfigReader.getProperty("arkaplanRengiForTopbar"));
        yonlendirmeLinkiForTopbar.click();
        // renk secenekleri kapanmadigi icin kaydet butonu gorunmuyor herhangi bir yere tiklamak gerekiyor
        // diye buraya tiklama koydum
        TestUtils.scrollToElement(kaydetButon);
        TestUtils.waitForVisibility(By.xpath("//div[text()='Kaydet']"),5);
        sayfayiKaydet();

    }

      @FindBy(xpath = "//a[@href='https://abeyis-web.tija.app/' and contains(text(), 'DENEME')]")
      private WebElement topbarTextInWebsite;

    public void confirmTopbarAsAText(String text){

        TestUtils.waitForVisibility(islemBasariliPopUp,1);
        verifyIslemBasariliPopUpisDisplay();
        Driver.getDriver().navigate().refresh();
        DizaynPage dzyn=new DizaynPage();
        dzyn.clickWebAbeyis();
        TestUtils.waitForPageToLoad(5);
        TestUtils.wait(3);

        Driver.getDriver().switchTo().frame(iframe);
        assertEquals(text, getElementText(topbarTextInWebsite));
        Driver.getDriver().switchTo().defaultContent();

    }

    public void deleteTheImageAddedForTopbar(){

        TestUtils.waitForPageToLoad(3);
        TestUtils.clickWithJS(dropdownMenu);
        TestUtils.wait(1);
        TestUtils.clickWithJS(gorselFromTopbarType);
        TestUtils.wait(1);
        WebElement addGorselIconForTopbar = Driver.getDriver().findElement(
                By.xpath("//a[@class='text-danger' and text()='Görseli kaldır']"));
        addGorselIconForTopbar.click();
        TestUtils.scrollToElement(kaydetButon);
        TestUtils.waitForVisibility(By.xpath("//div[text()='Kaydet']"),5);
        sayfayiKaydet();

    }

    public void confirmTheImageDeletedForTopbar(){

        TestUtils.waitForVisibility(islemBasariliPopUp,1);
        verifyIslemBasariliPopUpisDisplay();
        Driver.getDriver().navigate().refresh();
        DizaynPage dzyn=new DizaynPage();
        dzyn.clickWebAbeyis();
        TestUtils.waitForPageToLoad(5);
        TestUtils.wait(3);
        Driver.getDriver().switchTo().frame(iframe);
        WebElement topbarImageInWebsite = Driver.getDriver().findElement(
                By.xpath("//div[@class='headerImg']"));
        Assert.assertTrue(topbarImageInWebsite.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();

    }


    public void saveTopbarAsVisual(){
     /*   TestUtils.waitForPageToLoad(3);
        TestUtils.clickWithJS(dropdownMenu);
        TestUtils.wait(1);
        TestUtils.clickWithJS(gorselFromTopbarType);
        TestUtils.wait(1);
        WebElement addGorselIconForTopbar = Driver.getDriver().findElement(
                By.xpath("//mat-icon[@role='img' and text()='add']"));
        addGorselIconForTopbar.click();
       //???
        arkaplanRengiForTopbar.sendKeys(ConfigReader.getProperty("arkaplanRengiForTopbar"));
        yonlendirmeLinkiForTopbar.click();
        TestUtils.scrollToElement(kaydetButon);
        TestUtils.waitForVisibility(By.xpath("//div[text()='Kaydet']"),5);
        sayfayiKaydet();

         daha sonra bunun ile ilgili calisma yapacagim icin buradan silmedim

      */


    }

    public void gorselSayisi() {
        if (TestUtils.isElementPresent(By.xpath("//*[text()='Görsel']"))) {
            count = Driver.getDriver().findElements(By.xpath("//*[text()='Görsel']")).size();
        }
    }
    @FindBy(xpath = "(//div[@class='drag'])[7]")
    private WebElement gorselGizlemeIconu;
    public void gorselGizleme() {
        TestUtils.wait(3);
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        ilkDeger = griDikdortgenIframeler.size();
        System.out.println(ilkDeger);
        Driver.getDriver().switchTo().defaultContent();
        TestUtils.wait(3);
        TestUtils.clickWithMouse(gorselGizlemeIconu);
        TestUtils.wait(3);
    }
    public void gorselGizleDogrula() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        TestUtils.wait(3);
        sonDeger = griDikdortgenIframeler.size();
        assertEquals(ilkDeger-1,sonDeger);
    }
    public void gorselSilme() {
        TestUtils.waitFor(3);
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        ilkUrunListesiSayisi = griDikdortgenIframeler.size();
        System.out.println(griDikdortgenIframeler.size());
        TestUtils.wait(2);
        Driver.getDriver().switchTo().defaultContent();
        TestUtils.wait(2);
        TestUtils.clickWithMouse(urunSil);
        TestUtils.clickWithMouse(urunSil);
        TestUtils.wait(3);
    }
    public void gorselSildiginiDogrula() {
        TestUtils.waitFor(3);
        sonUrunListesiSayisi = tumUrunListesi.size();
//        sonUrunListesiSayisi= tumUrunListesi.size();
        assertEquals(ilkUrunListesiSayisi - 1, sonUrunListesiSayisi);
    }
    @FindBy(xpath = "//span[normalize-space()='Görsel']")
    private WebElement gorselButton;
    @FindBy(xpath = "//span[normalize-space()='Banner ekle']")
    private WebElement bannerEkleButton;
    @FindBy(xpath = "//div[@class='inpts mt-4 ng-star-inserted']//input[@type='text']")
    private WebElement bannerIsmi;
    @FindBy(xpath = "//span[normalize-space()='Sabit']")
    private WebElement gosterimTipiSabit;
    @FindBy(xpath = "//button[@class='btn ml-2']")
    private WebElement bannerKaydetButon;
    @FindBy(xpath = "//span[@class='slider']")
    private WebElement bannerAktifButon;
    public void bannerEkle() {
        TestUtils.wait(3);
        click(gorselButton);
        TestUtils.wait(2);
        click(bannerEkleButton);
        TestUtils.wait(2);
        actions.click(bannerIsmi).sendKeys("TestBanner").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        TestUtils.wait(2);
        click(gosterimTipiSabit);
        click(bannerAktifButon);
        TestUtils.wait(3);
        click(bannerKaydetButon);
        TestUtils.wait(3);
    }
    public void bannerEkleDogrula() {
        Assert.assertTrue(gorselPopup.isDisplayed());
    }
    @FindBy(xpath = "//span[normalize-space()='Düzenle']")
    private WebElement gorselDuzenleButon;
    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
    private WebElement gorselDuzenleBaslik;
    @FindBy(xpath = "//div[@class='pc']//button[@class='btn btn-primary ladda-button'][normalize-space()='Uygula']")
    private WebElement gorselDuzenleUygula;
    @FindBy(xpath = "//span[normalize-space()='Aktif']")
    private WebElement gorselDuzenleAktif;
    public void gorselDuzenle() {
        TestUtils.wait(3);
        click(gorselButton);
        TestUtils.clickWithJS(bannerKolon);
        TestUtils.wait(2);
        Select select = new Select(bannerKolon);
        select.selectByVisibleText("Test");
        click(gorselDuzenleButon);
        click(gorselDuzenleBaslik);
        gorselDuzenleBaslik.clear();
        actions.sendKeys("DENEME").perform();
        click(gorselDuzenleAktif);
        click(gorselDuzenleUygula);
    }
    @FindBy(xpath = "//div[@aria-label='İşlem başarılı.']")
    private WebElement gorselPopup;
    public void gorselDuzenlendiginiDogrula() {
        Assert.assertTrue(gorselPopup.isDisplayed());
    }
    @FindBy(xpath = "//span[@class='delete-button']//*[name()='svg']")
    private WebElement bannerGorselSilmeIconu;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    private WebElement bannerGorselKaldir;
    @FindBy(xpath = "//div[@class='ng-tns-c49-78 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-success']")
    private WebElement bannerGorselKaldirPopup;
    public void bannerGorselSilme() {
        click(bannerGorselSilmeIconu);
        click(bannerGorselKaldir);
    }
    public void bannerGorselSilDogrula() {
        Assert.assertTrue(bannerGorselKaldirPopup.isDisplayed());
    }
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement bannerSilButon;
    @FindBy(xpath = "//button[text()='Kaldır']")
    private WebElement bannerSilKaldir;
    static int ilkOptionCount =0;
    int sonOptionCount =0;
    public void bannerSilme() {
        TestUtils.wait(2);
        click(bannerSilButon);
        TestUtils.wait(2);
        click(bannerSilKaldir);
    }
    @FindBy(css=("//span[text()='Görsel seçin']"))
    public WebElement bannerKolon;
    public void bannerSilDogrula() {
        click(bannerKolon);
        WebElement dropdown = Driver.getDriver().findElement(By.id("mat-select-4-panel"));
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        sonOptionCount  = options.size();
        Assert.assertEquals(ilkOptionCount-1,sonOptionCount);
    }
    public void bannerDuzenleme() {
        click(bannerIsmi);
        bannerIsmi.clear();
        actions.sendKeys("Deneme").perform();
    }
    public void BannerinDuzenleDogrula() {
        Assert.assertTrue(bannerGorselKaldirPopup.isDisplayed());
    }
    @FindBy(xpath = "//span[normalize-space()='Kolon ekle']")
    private WebElement kolonEkleButon;
    //div[@class='mat-select-arrow-wrapper ng-tns-c268-29']
    @FindBy(xpath = "//div[@id='mat-select-value-13']")
    private WebElement ikinciKolonButon;
    public void bannerKolonEkle() {
        click(kolonEkleButon);
        click(Driver.getDriver().findElement(By.xpath("(//span[text()='Görsel seçin'])[2]")));
        TestUtils.wait(2);
        click(Driver.getDriver().findElement(By.xpath("//span[text()=' TestBanner ']")));
    }
    public void bannerKolonEkleDogrula() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@class='mat-select-value-text ng-tns-c306-22 ng-star-inserted']")).isDisplayed());
    }
    public void bannerEkKolonDuz() {
        //Kalem iconu tıklama
        click(Driver.getDriver().findElement(By.xpath("//div[@class='icon ml-2 ng-star-inserted']")));
        TestUtils.wait(2);
        click(bannerIsmi);
        bannerIsmi.clear();
        actions.sendKeys("DenemeBanner").perform();
        TestUtils.wait(2);
        click(bannerKaydetButon);
        TestUtils.wait(2);
    }
    public void bannerEkKolonDuzDogrula() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@aria-label='İşlem başarılı.']")).isDisplayed());}
    public void clickDuzenleButton() {
        Driver.getDriver().findElement(By.xpath("//span[text()='Görsel']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//span[text()='Görsel seçin']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//span[text()=' Test ']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//div[@class='icon ml-2 ng-star-inserted']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//mat-panel-title[text()=' Görsel ']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//span[text()='Düzenle']")).click();
        TestUtils.wait(2);
        Driver.getDriver().findElement(By.xpath("//div[text()=' Yönlendir ']")).click();
        TestUtils.wait(2);
    }
    public void clicks(String clickOne, String clickTwo) {
        if (clickOne.equals("Link"))  {
            Driver.getDriver().findElement(By.xpath("//*[text()='"+clickOne+"']")).click();
            TestUtils.wait(3);
            Driver.getDriver().findElement(By.xpath("//input[@placeholder='https://tija.app/']")).click();
            TestUtils.wait(2);
            // //input[@placeholder='https://tija.app/']
            type(Driver.getDriver().findElement(By.xpath("//input[@placeholder='https://tija.app/']")),clickTwo);
            // scrollToElement
            TestUtils.clickWithMouse( Driver.getDriver().findElement(By.xpath("//button[text()=' Uygula ']")));
            TestUtils.wait(2);
        }
        else
        {
            Driver.getDriver().findElement(By.xpath("//*[text()='"+clickOne+"']")).click();
            TestUtils.wait(3);
            Driver.getDriver().findElement(By.xpath("//*[text()='"+clickTwo+"']")).click();
            TestUtils.wait(3);
            Driver.getDriver().findElement(By.xpath("//button[text()='Kaydet']")).click();
            TestUtils.wait(3);
            TestUtils.clickWithMouse( Driver.getDriver().findElement(By.xpath("//button[text()=' Uygula ']")));
            TestUtils.wait(2);
        }
    }
    public void verifyRedirect(String clickTwo) {
        Driver.getDriver().findElement(By.xpath("//span[text()='Düzenle']")).click();
        TestUtils.wait(2);
        if (clickTwo.equals("Smart Watch")){
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@placeholder='/collection/Smart-Watch']")).isDisplayed());
        }
        else if (clickTwo.equals("Galaxy Buds2")){
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@placeholder='/product/galaxy-buds2']")).isDisplayed());
        }
        else if (clickTwo.equals("Apple")){
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@placeholder='/brand/2854']")).isDisplayed());
        }
        else if (clickTwo.equals("İade Koşulları")) {
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@placeholder='/site/typography/iade-kosullari']")).isDisplayed());
        }
        else if (clickTwo.equals("Christmas")){
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@placeholder='Christmas']")).isDisplayed());
        }
        Driver.quitDriver();
    }





}