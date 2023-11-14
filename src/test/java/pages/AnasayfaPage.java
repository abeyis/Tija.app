package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnasayfaPage extends  BasePage{

    public AnasayfaPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='sideicon1']")
    WebElement sideIcon;

    @FindBy(xpath = "//*[text()='Online Mağaza']")
    WebElement onlineMagazaButton;

    @FindBy(xpath = "//*[text()='Dizayn']")
    WebElement dizaynButton;



}
