package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AltBilgiPage;
import utilities.Driver;
import utilities.TestUtils;

import javax.swing.text.Utilities;

public class AltBilgiStepDefs {
    AltBilgiPage altbilgiPage = new AltBilgiPage();




    @Given("Kullanıcı Müşteri Hizmetleri bölümündeki bilgileri doğrular")
    public void kullanıcıMüşteriHizmetleriBölümündekiBilgileriDoğrular() {

        Driver.getDriver().switchTo().frame(0);
        TestUtils.scrollAllUpByJS();



    }


    @Given("Kullanıcı Hesabım bölümündeki Bilgilerim butonuna tıklar")
    public void kullanıcıHesabımBölümündekiBilgilerimButonunaTıklar() {
        altbilgiPage.clickPanelButton("Bilgilerim");

    }

    @Then("Kullanıcı Bilgilerini doğrular")
    public void kullanıcıBilgileriniDoğrular() {
        Assert.assertEquals("merve can", altbilgiPage.isimSoyisimTextbox.getText());
        Assert.assertEquals("merve.can@", altbilgiPage.emailTextbox.getText());
        Assert.assertEquals("0589456253", altbilgiPage.telefonTextbox.getText());
        Assert.assertEquals("11111111111", altbilgiPage.kimlikTextbox.getText());

    }


    @Given("Kullanıcı Sosyal Medya bölümüne ikonlar ekleyebilmek için sol üst köşedeki üç çizgiye tıklar")
    public void kullanıcıSosyalMedyaBölümüneIkonlarEkleyebilmekIçinSolÜstKöşedekiÜçÇizgiyeTıklar() {
        Driver.getDriver().switchTo().parentFrame();
        altbilgiPage.sideicon.click();

    }


    @When("Kullanıcı Ayarlar butonuna tıklar")
    public void kullanıcıAyarlarButonunaTıklar() {
        altbilgiPage.clickPanelButton(" Ayarlar ");
    }

    @And("Kullanıcı Web Sitesi butonuna tıklar")
    public void kullanıcıWebSitesiButonunaTıklar() {
        altbilgiPage.clickPanelButton(" Web Sitesi ");

    }

    @And("Kullanıcı düzenleme yapmak istediği web sitesinin Düzenle butonuna tıklar")
    public void kullanıcıDüzenlemeYapmakIstediğiWebSitesininDüzenleButonunaTıklar() {
        altbilgiPage.düzenleButon.click();

    }

    @And("Kullanıcı bağlantı bilgilerinin altında olan Sosyal Medya butonuna tıklar")
    public void kullanıcıBağlantıBilgilerininAltındaOlanSosyalMedyaButonunaTıklar() {
        altbilgiPage.clickPanelButton(" Sosyal Medya");
    }
    @And("Kullanıcı Huawei AppGallery Link textine link girer")
    public void kullanıcıHuaweiAppGalleryLinkTextineLinkGirer() {
        altbilgiPage.huaweiTextBox.sendKeys("wwww.huawai.com");


    }
    @And("Kullanıcı App Store Link textine link girer")
    public void kullanıcıAppStoreLinkTextineLinkGirer() {
        altbilgiPage.appStoreTextBox.sendKeys("www.appsore.com");

    }

    @And("Kullanıcı Google Play Store Link textine link girer")
    public void kullanıcıGooglePlayStoreLinkTextineLinkGirer() {
        altbilgiPage.googlePlayStoreTextBox.sendKeys("www.googleplay.com");

    }

    @And("Kullanıcı ETBIS Link textine link girer")
    public void kullanıcıETBISLinkTextineLinkGirer() {
        altbilgiPage.etbisTextBox.sendKeys("www.etbis.com");

    }

    @And("Kullanıcı Twitter Link textine link girer")
    public void kullanıcıTwitterLinkTextineLinkGirer() {
        altbilgiPage.twitterTextBox.sendKeys("www.twitter.com");

    }

    @And("Kullanıcı Facebook Link textine link girer")
    public void kullanıcıFacebookLinkTextineLinkGirer() {
        altbilgiPage.facebookTextBox.sendKeys("www.facebook.com");

    }

    @And("Kullanıcı Instagram Link textine link girer")
    public void kullanıcıInstagramLinkTextineLinkGirer() {
        altbilgiPage.instagramTextBox.sendKeys("www.instagram.com");

    }

    @And("Kullanıcı Youtube Link textine link girer")
    public void kullanıcıYoutubeLinkTextineLinkGirer() {
        altbilgiPage.youtubeTextBox.sendKeys("www.youtube.com");

    }


    @And("Kullanıcı Kaydet butonuna tıklar")
    public void kullanıcıKaydetButonunaTıklar() {
        TestUtils.scrollAllUpByJS();
        altbilgiPage.clickPanelButton(" KAYDET ");

    }

    @And("Kullanıcı Dizayn sayfasında Alt Bilgi kısmındaki Sosyal Medya bölümünde girelen linklerin ikonlarının görüldüğünü doğrular")
    public void kullanıcıDizaynSayfasındaAltBilgiKısmındakiSosyalMedyaBölümündeGirelenLinklerinIkonlarınınGörüldüğünüDoğrular() {
    }



}
