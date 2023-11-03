package pages;

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

    public void login() {
        type(emailBox, ConfigReader.getProperty("testUser"));
        click(nextBtn);

        type(confirmationBox,
                TestUtils.getOtp(ConfigReader.getProperty("testUser"), ConfigReader.getProperty("testPassword")));
        click(nextBtn);
    }

}
