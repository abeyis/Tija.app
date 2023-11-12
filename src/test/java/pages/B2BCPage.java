package pages;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;

public class B2BCPage extends BasePage{

    public B2BCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[text()='Firma Listesi']")
    private WebElement fiyatListesiText;
    @FindBy(xpath = "//div/input[@placeholder='Firma arayın']")
    private WebElement firmaArayinTextbox;
    @FindBy(xpath = "//button[text()='Ara']")
    private WebElement araButton;
    @FindBy(xpath = "//tbody/tr")
    private WebElement arananFirma;
    @FindBy(xpath = "//table/tbody/tr")
    private List<WebElement> tumFirmalarinListesi;
    @FindBy(xpath = "//button[text()='Yeni Firma']")
    private WebElement yeniFirmaButton;
    @FindBy(xpath = "//input[@name='FirmaAdi']")
    private WebElement firmaAdiTextBox ;
    @FindBy(xpath = "//input[@name='FirmaKodu']")
    private WebElement firmaKoduTextBox;
    @FindBy(xpath = "//input[@name='Adres']")
    private WebElement firmaAdresTextBox ;
    @FindBy(xpath = "//input[@name='Telefon']")
    private WebElement firmaTelefonTextBox;
    @FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
    private WebElement fiyatListesiSecDropDownMenu;
    @FindBy(xpath = "(//input[@aria-autocomplete='list'])[2]")
    private WebElement sehirSecDropDownMenu;
    @FindBy(xpath = "(//input[@aria-autocomplete='list'])[3]")
    private WebElement ilceSecDropDownMenu;


    public void validationB2BCPage() {

        TestUtils.bekle(5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("/b2bc"));
        Assert.assertTrue(getElementText(fiyatListesiText).contains("Firma Listesi"));
    }


    public void firmaArayinTextBoxinaFirmaAdiYazAraButonunaTikla(String aranacakFirmaAdi) {

        type(firmaArayinTextbox,aranacakFirmaAdi);
        TestUtils.bekle(3);
        click(araButton);
        TestUtils.bekle(3);
    }

    public void arananFirmaBilgilerininSayfadaGoruntulendiginiDogrula() {

        Assert.assertTrue(arananFirma.isDisplayed());
    }


    public void firmaArayinTextBoxinaFirmaAdiYazEnterTusunaBas(String aranacakFirmaAdi) {
        type(firmaArayinTextbox,aranacakFirmaAdi);
        firmaArayinTextbox.sendKeys(Keys.ENTER);
        TestUtils.bekle(3);

    }


    public void EklenmisTumFirmalarinSayfadaGoruntulendiginiDogrula() {

        for (WebElement firma: tumFirmalarinListesi) {
            Assert.assertTrue(firma.isDisplayed());
        }





    }
}
