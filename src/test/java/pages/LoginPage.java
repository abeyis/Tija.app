package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

import java.util.Set;

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

    @FindBy(xpath = "//a[contains(text(), 'Google')]")
    private WebElement googleBtn;


    public void loginWithOtp() {
        type(emailBox, ConfigReader.getProperty("testUser"));
        click(nextBtn);

        type(confirmationBox,
                TestUtils.getOtp(ConfigReader.getProperty("testUser"), ConfigReader.getProperty("testPassword")));

        click(nextBtn);
    }

    public void yanlisemail() {
        type(emailBox,"test@gamil.com");
        click(nextBtn);
        String expected= emailHataMesajı.getText();
        Assert.assertEquals(expected,"Kullanıcı Bulunamadı");
    }

    public void yanlisDogrulamaKodu() {

        type(emailBox, ConfigReader.getProperty("testUser"));
        click(nextBtn);
        type(confirmationBox,"12345");
        click(nextBtn);
        String expected= guvenlıkKoduMesajı.getText();
        Assert.assertEquals(expected,"Güvenlik kodu bulunamadı");

    }



    public void loginWithGoogleAccount() {
        type(emailBox, ConfigReader.getProperty("testUser"));

        click(googleBtn);
        TestUtils.waitForPageToLoad(15);

        setGoogleWindow();
        TestUtils.waitForPageToLoad(15);
    }

    public void setGoogleWindow(){

        WebDriver mainDriver = Driver.getDriver();
        String mainHandle = mainDriver.getWindowHandle();

        Set<String> windowHandles = mainDriver.getWindowHandles();

        do {
            int openWindowsCount = windowHandles.size();
            if (openWindowsCount>1 ){
                break;
            }
        }while(true);

        for (String handle : windowHandles) {
            if (!handle.equals(mainDriver.getWindowHandle())) {
                WebDriver googleDriver = mainDriver.switchTo().window(handle);

                WebElement googleEmailBox = googleDriver.findElement(By.cssSelector("input[type='email']"));
                type(googleEmailBox, ConfigReader.getProperty("testUser"));

                WebElement googleNextBtn = googleDriver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
                click(googleNextBtn);

                TestUtils.wait(3);

                WebElement googlePasswordBox = googleDriver.findElement(By.cssSelector("input[type='password']"));
                type(googlePasswordBox, ConfigReader.getProperty("testPassword"));

                WebElement googleNextBtn2 = googleDriver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
                click(googleNextBtn2);

                // Ana pencereye geri dön
                mainDriver.switchTo().window(mainHandle);
                TestUtils.waitForPageToLoad(15);
            }
        }
    }

}
