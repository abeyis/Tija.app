package pages;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static utilities.TestUtils.waitForClickablility;

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
    @FindBy(xpath = "//input[@id='inputFirmaTelefon']")
    private WebElement telephoneTextBox;
    @FindBy(xpath = "//span[text()='Ekle']")
    private WebElement ekleButton;
    @FindBy(xpath = "//table//tr[1]/td[2]")
    private WebElement firstCompanyFromTable;
    @FindBy(xpath = "//div[@aria-label='Kayıt silindi.']")
    private WebElement kayitSilindiPopUp;
    @FindBy(xpath = "//div[@aria-label='Kayıt başarılı.']")
    private WebElement kayitBasariliPopUp;
    @FindBy(xpath = "//div[@aria-label='Silindi']")
    private WebElement silindiPopUp;
    @FindBy(xpath = "//tr/td[text()='Company Name For Delete']")
    private WebElement silinecekFirma;
    @FindBy(xpath = "//input[@placeholder='Kod Liste Adı']")
    private WebElement kodListeAdiTextBox;
    @FindBy(xpath = "//input[@placeholder='Oluşturulacak Kod Adedi']")
    private WebElement kodAdetTextBox;
    @FindBy(xpath = "//tbody/tr[1]/td[text()='Test Code Name']")
    private WebElement deletedCode;

    public void validationB2BCPage() {

        TestUtils.bekle(5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("/b2bc"));
        Assert.assertTrue(getElementText(fiyatListesiText).contains("Firma Listesi"));
    }

    static String companyName;
    public void searchCompanyWithAraButton() {
        companyName = getElementText(firstCompanyFromTable);
        type(firmaArayinTextbox,companyName);
        TestUtils.bekle(3);
        click(araButton);
        TestUtils.bekle(3);
    }

    public void verifyCompanyInformation() {
        String actualCompanyName = getElementText(Driver.getDriver().findElement(By.xpath("//table//tr[1]/td[2]")));
        Assert.assertEquals(companyName,actualCompanyName);
    }


    public void searchCompanyWithEnterKey() {
        companyName = getElementText(firstCompanyFromTable);
        type(firmaArayinTextbox,companyName);
        firmaArayinTextbox.sendKeys(Keys.ENTER);
        TestUtils.bekle(3);
    }


    public void VerifyaAllCompaniesIsVisible() {

        for (WebElement firma: tumFirmalarinListesi) {
            Assert.assertTrue(firma.isDisplayed());
        }

    }




    public void addCompany(String firmaAdi,String firmaKodu,String telephone){
        click(yeniFirmaButton);
        type(firmaAdiTextBox, firmaAdi);
        type(firmaKoduTextBox, firmaKodu);
        type(telephoneTextBox,telephone);
        click(ekleButton);

    }

    public void clickYeniFirmaButton() {
        click(yeniFirmaButton);

    }

    public void addCompanyNoPhone() {
        type(firmaAdiTextBox, ConfigReader.getProperty("companyName"));
        type(firmaKoduTextBox, ConfigReader.getProperty("companyCode"));

    }

    public void verifyNotAddedCompany() {

        TestUtils.bekle(2);
        TestUtils.scrollToElement(ekleButton);
        try {
            Assert.assertFalse(ekleButton.isEnabled());
        } catch (AssertionError e ) {
            System.out.println(" Could not add new company when phone information is missing ");
        }


    }

    public void deleteCompany() {
        addCompany(ConfigReader.getProperty("companyNameForDelete"),
                   ConfigReader.getProperty("companyCode"),
                   ConfigReader.getProperty("telephone"));

        TestUtils.wait(3);
        waitForClickablility(By.xpath("(//tr/td/button[text()='Sil'])["+tumFirmalarinListesi.size()+"]"),3).click();
        waitForClickablility(By.xpath("//div/button[text()='Sil']"),3).click();

    }




    public void verifyDeletedCompany() {
        Assert.assertTrue(kayitSilindiPopUp.isDisplayed());

        try {
            Assert.assertFalse(silinecekFirma.isDisplayed());
        } catch (NoSuchElementException e ) {
            System.out.println("Company has been successfully deleted");
        }

    }


    public void updateCompany() {
        addCompany(ConfigReader.getProperty("companyNameforUpdate"),
                   ConfigReader.getProperty("companyCode"),
                   ConfigReader.getProperty("telephone"));
        TestUtils.wait(3);

        waitForClickablility(By.xpath("(//button[text()='Güncelle'])[last()]"),3).click();


        click(firmaAdiTextBox);
        firmaAdiTextBox.clear();
        firmaAdiTextBox.sendKeys(ConfigReader.getProperty("updatedCompanyName"));

        click(firmaKoduTextBox);
        firmaKoduTextBox.clear();
        firmaKoduTextBox.sendKeys(ConfigReader.getProperty("updatedCompanyCode"));

        click(telephoneTextBox);
        telephoneTextBox.clear();
        telephoneTextBox.sendKeys(ConfigReader.getProperty("updatedTelephone"));

        waitForClickablility(By.xpath("//span[text()='Kaydet']"),3).click();


    }


    public void verifyUpdatedCompany() {
        Assert.assertTrue(kayitBasariliPopUp.isDisplayed());

        waitForClickablility(By.xpath("(//button[text()='Güncelle'])[last()]"),3).click();

        Assert.assertEquals(ConfigReader.getProperty("updatedCompanyName"),firmaAdiTextBox.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("updatedCompanyCode"),firmaKoduTextBox.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("updatedTelephone"),telephoneTextBox.getAttribute("value"));
        waitForClickablility(By.xpath("//button[text()='Kapat']"),3).click();

        TestUtils.wait(3);
        waitForClickablility(By.xpath("(//tr/td/button[text()='Sil'])["+tumFirmalarinListesi.size()+"]"),3).click();
        waitForClickablility(By.xpath("//div/button[text()='Sil']"),3).click();
        TestUtils.wait(3);

    }




    public void deleteCodeOfCompany() {
        addCompany(ConfigReader.getProperty("companyNameforGenerateCode"),
                   ConfigReader.getProperty("companyCode"),
                   ConfigReader.getProperty("telephone"));
        TestUtils.wait(2);

        waitForClickablility(By.xpath("(//button[text()='Kod Üret'])[last()]"),3).click();
        type(kodListeAdiTextBox,ConfigReader.getProperty("codeListName"));
        type(kodAdetTextBox,ConfigReader.getProperty("numberOfCodes"));
        TestUtils.wait(2);
        waitForClickablility(By.xpath("//span[text()='Oluştur']"),2).click();
        TestUtils.wait(2);
        waitForClickablility(By.xpath("//button[text()='Kapat']"),2).click();
        TestUtils.wait(2);

        waitForClickablility(By.xpath("(//button[text()='Kod Üret'])[last()]"),3).click();
        TestUtils.wait(2);
        waitForClickablility(By.xpath("(//button[text()='Sil'])[last()]"),3).click();
        waitForClickablility(By.xpath("(//button[text()='Sil'])[last()] "),3).click();




    }


    public void verifyDeletedCode() {

        Assert.assertTrue(silindiPopUp.isDisplayed());

        try {
            Assert.assertFalse(deletedCode.isDisplayed());
        } catch (NoSuchElementException e ) {
            System.out.println(" Code has been successfully deleted");
        }

        waitForClickablility(By.xpath("//button[text()='Kapat']"),3).click();
        TestUtils.wait(3);
        waitForClickablility(By.xpath("(//tr/td/button[text()='Sil'])["+tumFirmalarinListesi.size()+"]"),3).click();
        waitForClickablility(By.xpath("//div/button[text()='Sil']"),3).click();
        TestUtils.wait(3);

    }




}

