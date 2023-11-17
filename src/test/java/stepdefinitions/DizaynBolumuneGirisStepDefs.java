package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AnasayfaPage;
import pages.DizaynPage;
import utilities.Driver;

public class DizaynBolumuneGirisStepDefs {

    DizaynPage dzyn = new DizaynPage();
    AnasayfaPage anasayf = new AnasayfaPage();


    @Given("Kullanıcı Online Magaza butonuna tıklar")
    public void kullanici_online_magaza_butonuna_tiklar() {

        dzyn.clickPanelButton("Online Mağaza");
    }
    @When("Kullanıcı Dizayn butonuna tıklar")
    public void kullanici_dizayn_butonuna_tiklar() {
        dzyn.clickPanelButton("Dizayn");

    }
    @When("Kullanıcı dizayn etmek istediği sayfaya tıklar")
    public void kullanici_dizayn_etmek_istedigi_sayfaya_tiklar() {
        //      clickPanelButton("Web : abeyis-web");
           dzyn.websayfasi.click();

    }
    @Then("Kullanıcı Dizayn sayfasında oldugunu dogrular")
    public void kullanici_dizayn_sayfasinda_oldugunu_dogrular() {
        String baslikUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(baslikUrl.contains("b2c/theme"));

    }

    @Given("Kullanıcı Bolum Ekle butonuna tıklar")
    public void kullanici_bolum_ekle_butonuna_tiklar() {
        dzyn.bolumEkleButonTikla();
    }

    @Given("Kullanıcı Urun Listesi butonuna tıklar")
    public void kullanici_urun_listesi_butonuna_tiklar() {
        dzyn.UrunListesiButonTikla();
    }

    @Given("Kullanıcı Urun Listesi butonunun eklendigini dogrular")
    public void kullanici_urun_listesi_butonunun_eklendigini_dogrular() {
        dzyn.UrunListesiEklendiginiDogrula();
    }
    @Given("Kullanici Urun Listesini gizler")
    public void kullanici_urun_listesini_gizler() {
        dzyn.UrunListesiGizle();
    }

    @Given("Kullanici Urun Listesini gizledigini dogrular")
    public void kullanici_urun_listesini_gizlendigini_dogrular() {
        dzyn.UrunListesiGizlediginiDogrula();
    }

    @Given("Kullanici Urun Listesini siler")
    public void kullanici_urun_listesini_siler() {
        dzyn.UrunListesiSilme();
    }

    @Given("Kullanici Urun Listesini sildigini dogrular")
    public void kullanici_urun_listesini_sildigini_dogrular() {
        dzyn.UrunListesiSildiginiDogrula();
    }
}







