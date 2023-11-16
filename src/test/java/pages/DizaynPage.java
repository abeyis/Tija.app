package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.util.List;

public class DizaynPage extends  BasePage{


    public DizaynPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

 //   @FindBy(xpath = "//div[text()='Web : abeyis-web']/ancestor::div[@class='contents d-flex align-items-center py-2']")
  //  public WebElement websayfası;
     @FindBy(xpath = "(//div[@class='text ml-4'])[1]")
      public WebElement websayfası;
    public void websayfasitikla() {
        click(websayfası);
    }
    @FindBy(xpath = "//span[text()='Bölüm ekle']")
    private WebElement bolumEkleButon;

    public void bolumEkleButonTikla() {
        click(bolumEkleButon);
    }

    @FindBy(xpath = "(//div[@class='mat-ripple mat-menu-ripple'])[2]")
    private WebElement urunListesiButon;

    @FindBy(xpath = "//div[@class='cdk-drag item_body ng-star-inserted'][1]")
    private WebElement firstProductListBtn;

    @FindBy(xpath = "//span[text()='Ürün listesi']")
    private List<WebElement> tumUrunListesi;

    @FindBy(xpath = "(//span[@class='loader pulse'])[1]")
    private WebElement urunListesiGriDikdortgen;
    @FindBy(xpath = "//iframe[@class='iframe-web']")
    private WebElement griDikdortgenIframe ;

    @FindBy(xpath = "//span[@class='loader pulse']")
    private List<WebElement> griDikdortgenIframeler;
    int ilkUrunListesiSayisi;
    int sonUrunListesiSayisi;
    public void UrunListesiButonTikla() {
        ilkUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(ilkUrunListesiSayisi);
        TestUtils.clickWithJS(urunListesiButon);
        TestUtils.wait(2);
    }
    public void UrunListesiEklendiginiDogrula() {
        sonUrunListesiSayisi= tumUrunListesi.size();
        Assert.assertEquals(ilkUrunListesiSayisi+1,sonUrunListesiSayisi);
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        Assert.assertTrue(urunListesiGriDikdortgen.isDisplayed());

    }
    @FindBy(xpath = "(//div[@class='drag'])[7]")
    private WebElement UrunListesiGizlemeIconu;

    @FindBy(xpath = "(//div[@class='drag'])[6]")
    private WebElement urunSil;
    @FindBy(xpath = "//div[@class='cdk-drag item_body ng-star-inserted'][1]/descendant::div[@class='drag'][2]")
    private WebElement urunListesiSilmeIconu;
    int ilkDeger=0;
    public void UrunListesiGizle() {
        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        System.out.println("listenin ilk size = "+ griDikdortgenIframeler.size());
        ilkDeger=griDikdortgenIframeler.size();
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().navigate().refresh();
        click(websayfası);
        TestUtils.wait(3);
        Actions action= new Actions(Driver.getDriver());
        action.moveToElement(UrunListesiGizlemeIconu).build().perform();
        TestUtils.wait(3);
        UrunListesiGizlemeIconu.click();

    }
    int sonDeger;
    public void UrunListesiGizlediginiDogrula() {

        Driver.getDriver().switchTo().frame(griDikdortgenIframe);
        TestUtils.wait(2);
        System.out.println("Listenin son size ="+(griDikdortgenIframeler).size());
        sonDeger=griDikdortgenIframeler.size();
        Assert.assertEquals(sonDeger,ilkDeger-1);
        // Driver.getDriver().switchTo().defaultContent();
        //  TestUtils.clickWithJS(UrunListesiGizlemeIconu);
    }
    public void UrunListesiSilme() {
        ilkUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(ilkUrunListesiSayisi);
        TestUtils.wait(3);
        Actions action= new Actions(Driver.getDriver());
        action.moveToElement(urunSil).build().perform();
        TestUtils.waitForClickablility(urunSil,3);
         TestUtils.clickWithJS(urunSil);
//        WebElement productList = Driver.getDriver().findElement(By.xpath("//div[@class='cdk-drag item_body ng-star-inserted']["+ilkUrunListesiSayisi+"]"));
      //  action.moveToElement(tumUrunListesi.get(tumUrunListesi.size()-1)).perform();
    //    WebElement delBtn = Driver.getDriver().findElement(By.xpath("//div[@class='cdk-drag item_body ng-star-inserted']["+ilkUrunListesiSayisi+"]/descendant::div[@class='drag'][2]"));
       // TestUtils.clickInCycle(delBtn);


    }
    public void UrunListesiSildiginiDogrula() {
        sonUrunListesiSayisi= tumUrunListesi.size();
        System.out.println(sonUrunListesiSayisi);
        Assert.assertEquals(ilkUrunListesiSayisi-1,sonUrunListesiSayisi);

    }




}



