package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DizaynSayfaAyarlarıPage extends BasePage{


    public DizaynSayfaAyarlarıPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()='Alt Bilgi']")
    WebElement altBilgiButon;

    @FindBy(xpath ="//*[@class='form-control ng-valid ng-touched ng-dirty']")
    WebElement baslıkText;

    @FindBy(xpath ="//*[text()=' İşlem başarılı. ']")
    WebElement islemBasarılı;




}



