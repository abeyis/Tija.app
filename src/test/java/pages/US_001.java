package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_001 extends BasePage {
    public US_001() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //  Home-->Online Mağaza-->Kupon
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[1]")
    public WebElement webSitesiListTri;
    @FindBy (xpath= "//div/span[contains(text(), 'Web : abeyis-web')]")
    public WebElement webSitesiSelection;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[2]")
    public WebElement tipListTri;
    @FindBy (css = "input[name='Baslik']")
    public   WebElement baslikInputBox;
    @FindBy (css = "input[name='KuponKodu']")
    public   WebElement kuponKoduInputBox;
    @FindBy (xpath= "//div/span[contains(text(), 'Ücretsiz Kargo')]")
    public WebElement tipSelection;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[3]")
    public WebElement uygulamaAlaniListTri;
    @FindBy (xpath= "//div/span[contains(text(), 'Mevcut Siparişe')]")
    public WebElement uygulamaAlaniSelection;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[4]")
    public WebElement minGereksinimListTri;
    @FindBy (xpath= "//div/span[contains(text(), 'Yok')]")
    public WebElement minGereksinimSelection;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[5]")
    public WebElement musteriUygunluguListTri;
    @FindBy (xpath= "//div/span[contains(text(), 'Herkes')]")
    public WebElement musteriUygunluguSelection;
    @FindBy(xpath = "(//div//span[@class = 'ng-arrow-wrapper'])[6]")
    public WebElement kullanimLimitiListTri;
    @FindBy (xpath= "//div/span[contains(text(), 'Toplamda x adet kadar uygulanabilir')]")
    public WebElement kullanimLimitiSelection;
    @FindBy (xpath = "//a[contains(text(), 'Oluştur')]")
    public   WebElement kuponKoduOlusturButton;
    @FindBy (css = "input[name='BaslangicTarihi']")
    public   WebElement baslangicTarihiInputBox;
    @FindBy (css = "input[name='start_time']")
    public   WebElement baslangicSaatiInputBox;
    @FindBy (css = "input[name='BitisTarihi']")
    public   WebElement bitisTarihiInputBox;
    @FindBy (css = "input[name='end_time']")
    public   WebElement bitisSaatiInputBox;
    @FindBy (css = "input[name='Aktif']")
    public   WebElement aktifSwitch;
    @FindBy (css = "input[name='OtoKullan']")
    public   WebElement otoKullanSwitch;
    @FindBy (xpath = "//button[contains(text(), 'Kaydet')]")
    public   WebElement kaydetButton;

}


