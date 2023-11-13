package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AltBilgiPage extends BasePage{


    public AltBilgiPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='profile-first-name']")
    public WebElement isimSoyisimTextbox;

    @FindBy(xpath = "//*[@id='profile-email']")
    public  WebElement emailTextbox;

    @FindBy(xpath = "(//*[@id='profile-phone'])[1]")
    public  WebElement telefonTextbox;

    @FindBy(xpath = "(//*[@id='profile-phone'])[2]")
    public  WebElement kimlikTextbox;

    @FindBy(xpath = "//*[@id='sideicon1']")
    public WebElement sideicon;

    @FindBy(xpath = "(//*[text()=' Düzenle '])[1]")
    public WebElement düzenleButon;

    @FindBy(xpath = "//*[text()='Huawei AppGallery Link']")
    public WebElement huaweiTextBox;

    @FindBy(xpath = "//*[text()='App Store Link']")
    public WebElement appStoreTextBox;

    @FindBy(xpath = "//*[text()='Google Play Store Link']")
    public WebElement googlePlayStoreTextBox;

    @FindBy(xpath = "//*[text()='ETBIS Link']")
    public WebElement etbisTextBox;

    @FindBy(xpath = "//*[text()='Twitter Link']")
    public WebElement twitterTextBox;

    @FindBy(xpath = "//*[text()='Facebook Link']")
    public WebElement facebookTextBox;

    @FindBy(xpath = "//*[text()='Instagram Link']")
    public WebElement instagramTextBox;

    @FindBy(xpath = "//*[text()='Youtube Link']")
    public WebElement youtubeTextBox;



}
