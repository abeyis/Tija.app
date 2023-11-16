package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

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
    WebElement iframe;


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










}



