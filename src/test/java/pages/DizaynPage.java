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

    @FindBy(xpath = "//a[text()='Web : abeyis-web'")
    WebElement websayfası;


    AnasayfaPage anasayf = new AnasayfaPage();


    public void clickToDizayn() throws InterruptedException {

//        anasayf.onlineMagazaButton.click();
//        anasayf.dizaynButton.click();

        goToElement("Online Mağaza");

        goToElement("Dizayn");

        goToElement("Web : abeyis-web");



    }


}
