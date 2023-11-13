package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

public class DizaynPage extends  BasePage{


    public DizaynPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[text()='Web : abeyis-web']")
    public WebElement websayfası;


}



