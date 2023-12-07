package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;


public class SayfalarPage extends BasePage {

    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//input[@name='Baslik']")
    private WebElement baslik;
    public void  addPageWithTitleOnly(String pageTitle){

        click(baslik);
        actions.sendKeys(pageTitle).perform();
        BasePage.clickKaydetButton();

    }

    @FindBy(xpath = "//input[@name='Sira']")
    private WebElement sira;

    @FindBy(xpath = "//input[@id='flexCheckDefault']")
    private WebElement aktifCheckBox;

    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement aciklama;


    public void addPageWithTitleAndContent(String pageTitle){

        click(baslik);
        actions.sendKeys(pageTitle).perform();
        click(sira);
        actions.sendKeys(ConfigReader.getProperty("sira")).perform();
        click(aktifCheckBox);
        click(aciklama);
        actions.sendKeys(ConfigReader.getProperty("aciklama")).perform();
        BasePage.clickKaydetButton();

    }


    @FindBy(xpath = "(//div[@class='card-body'])[2]")
    private WebElement addedPageList;

    public void confirmPageAdded(String pageTitle){

        WebElement kayitBasariliPopup = Driver.getDriver().findElement(By.xpath("//div[@aria-label='Kayıt başarılı.']"));
        Assert.assertTrue(kayitBasariliPopup.isDisplayed());
        TestUtils.wait(3);
        deletePage(pageTitle);

    };

    public void deletePage(String pageTitle){

        TestUtils.wait(2);
        WebElement addedPageSilButton = Driver.getDriver().findElement(By.xpath(
                "//div[h6[text()='"+pageTitle+"']]/following-sibling::div/button[contains(text(),'Sil')]"));
        TestUtils.clickWithMouse(addedPageSilButton);
        WebElement popupSilButton = Driver.getDriver().findElement(By.xpath("(//button[text()='Sil'])[last()]"));
        TestUtils.waitForVisibility(popupSilButton,1);
        TestUtils.waitAndClick(popupSilButton);

    }

    public void deleteAddedPage(String pageTitle){

       addPageWithTitleOnly(pageTitle);
       deletePage(pageTitle);

    }


    public  void confirmPageDeleted(String pageTitle){

        WebElement kayitSilindiPopup = Driver.getDriver().findElement(By.xpath("//*[@aria-label='Kayıt silindi.']"));
        TestUtils.waitForVisibility(kayitSilindiPopup,1);
        Assert.assertTrue(kayitSilindiPopup.isDisplayed());
        TestUtils.waitForInVisibility(By.xpath("//*[@aria-label='Kayıt silindi.']"),3);
        Assert.assertFalse(getElementText(addedPageList).contains(pageTitle));

    }


    public void updateAddedPage(String pageTitle){

    addPageWithTitleAndContent(pageTitle);
    TestUtils.wait(2);
    WebElement addedPageGuncelleButton = Driver.getDriver().findElement(By.xpath(
                    "//div[h6[text()='" + pageTitle + "']]/following-sibling::div/button[contains(text(),'Güncelle')]"));
    TestUtils.clickWithMouse(addedPageGuncelleButton);
    TestUtils.wait(1);
    baslik.click();
    baslik.clear();
    baslik.sendKeys(ConfigReader.getProperty("updatedBaslik"));
    click(sira);
    sira.clear();
    sira.sendKeys(ConfigReader.getProperty("updatedSira"));
    click(aktifCheckBox);
    click(aciklama);
    TestUtils.wait(2);
    aciklama.clear();
    TestUtils.wait(2);
    aciklama.sendKeys(ConfigReader.getProperty("updatedAciklama"));
    TestUtils.wait(2);

    BasePage.clickKaydetButton();

    }


        public void confirmPageUpdated(){

        WebElement kayitBasariliPopup = Driver.getDriver().findElement(By.xpath("//div[@aria-label='Kayıt başarılı.']"));
        TestUtils.waitForVisibility(kayitBasariliPopup,1);
        Assert.assertTrue(kayitBasariliPopup.isDisplayed());
        String pageTitle=ConfigReader.getProperty("updatedBaslik");
        Assert.assertTrue(getElementText(addedPageList).contains(pageTitle));
        WebElement addedPageGuncelleButton = Driver.getDriver().findElement(By.xpath(
                    "//div[h6[text()='" + pageTitle + "']]/following-sibling::div/button[contains(text(),'Güncelle')]"));
        TestUtils.clickWithMouse(addedPageGuncelleButton);

        Assert.assertEquals(ConfigReader.getProperty("updatedBaslik"),baslik.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("updatedSira"),sira.getAttribute("value"));
        Assert.assertTrue(getElementText(aciklama).contains("Calisma saatleri"));

        deletePage(pageTitle);

        }

}
