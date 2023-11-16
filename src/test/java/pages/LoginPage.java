package pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#mat-input-0")
    private WebElement emailBox;

    @FindBy(xpath = "//div[text()='İleri' or text()='Next']")
    private WebElement nextBtn;

    @FindBy(css = "#mat-input-1")
    private WebElement confirmationBox;

    @FindBy(xpath = "//*[@class='falsePass ng-star-inserted']")
    private WebElement emailHataMesajı;

    @FindBy(xpath = "//*[@class='falsePass ng-star-inserted']")
    private WebElement guvenlıkKoduMesajı;

    public void login() {
        type(emailBox, ConfigReader.getProperty("testUser"));
        click(nextBtn);

        type(confirmationBox,
                TestUtils.getOtp(ConfigReader.getProperty("testUser"), ConfigReader.getProperty("testPassword")));

        click(nextBtn);
    }

    public void yanlısemail() {
        type(emailBox,"test@gamil.com");
        click(nextBtn);
        String expected= emailHataMesajı.getText();
        Assert.assertEquals(expected,"Kullanıcı Bulunamadı");
    }

    public void yanlısdogrulamakodu() {

        type(emailBox, ConfigReader.getProperty("testUser"));
        click(nextBtn);
        type(confirmationBox,"12345");
        click(nextBtn);
        String expected= guvenlıkKoduMesajı.getText();
        Assert.assertEquals(expected,"Güvenlik kodu bulunamadı");

    }

}