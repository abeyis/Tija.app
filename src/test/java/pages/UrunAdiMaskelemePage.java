package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UrunAdiMaskelemePage extends BasePage{
        public UrunAdiMaskelemePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //  Home -->Online Mağaza -->Ürün Adı Maskeleme
    @FindBy (xpath = "(//input[@placeholder='Maske değerini buraya girin'])[1]")
    public WebElement maskeDegeriInputBox;
    @FindBy (xpath = "(//input[@placeholder='Yeni ürün adını buraya girin'])[1]")
    public WebElement maskeYeniUrunAdiInputBox;
    @FindBy (xpath = "(//input[@placeholder='KDV oranını buraya girin'])[1]")
    public WebElement maskeKDVOraniInputBox;
    @FindBy (xpath = "//button[.='Ekle']")
    public WebElement maskeDegeriEkleButton;
    @FindBy (xpath = "//input[@placeholder='Maske değerini buraya girin']")
    public List<WebElement> maskeDegeriList;
    @FindBy (xpath = "//input[@placeholder='Yeni ürün adını buraya girin']")
    public List<WebElement> maskeYeniUrunAdiList;
    @FindBy (xpath = "//input[@placeholder='KDV oranını buraya girin']")
    public List<WebElement> maskeKDVOraniList;
    @FindBy (xpath = "//button[.='Güncelle']")
    public List<WebElement> maskeGuncelleButtonList;
    @FindBy (xpath = "//button[.='Sil']")
    public List<WebElement> maskeSilButtonList;


}
