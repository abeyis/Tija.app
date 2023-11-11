package pages;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DizaynSayfaAyarlarıPage extends BasePage{


    public DizaynSayfaAyarlarıPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Başlık (Header)']")
    public WebElement baslıkButon;

    @FindBy(xpath = "(//*[text()='Görsel'])[1]")
    public WebElement maindenSec;

    @FindBy(xpath = "//*[text()='Alt Bilgi']")
    public  WebElement altBilgiButon;

    @FindBy(xpath ="//*[@class='form-control ng-valid ng-touched ng-dirty']")
    public  WebElement baslıkText;

    @FindBy(xpath = "//*[@id='mat-select-value-11']")
    public  WebElement sayfaGenişligiButon;

    @FindBy(xpath = "//*[text()=' Aktif ']")
    public WebElement aktifButon;

    @FindBy(xpath = "//*[text()='Kopya oluştur']")
    public WebElement kopyaOlusturButon;

    @FindBy(xpath = "//*[text()='Sayfayı sil']")
    public WebElement sayfaSilButon;

    @FindBy(xpath = "(//*[text()='Kaydet'])[1]")
    public WebElement kaydetButon;


    @FindBy(xpath ="//*[text()=' İşlem başarılı. ']")
    public WebElement islemBasarılı;




}



