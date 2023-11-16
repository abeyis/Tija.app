package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AnasayfaPage;
import pages.BasePage;
import pages.DizaynPage;
import utilities.Driver;

public class DizaynBolumuneGirisStepDefs {

    DizaynPage dzyn = new DizaynPage();
    AnasayfaPage anasayf = new AnasayfaPage();


    @Given("Kullanıcı Online Magaza butonuna tıklar")
    public void kullanıcı_online_magaza_butonuna_tıklar() {

        dzyn.clickPanelButton("Online Mağaza");
    }
    @When("Kullanıcı Dizayn butonuna tıklar")
    public void kullanıcı_dizayn_butonuna_tıklar() {
        dzyn.clickPanelButton("Dizayn");

    }
    @When("Kullanıcı dizayn etmek istediği sayfaya tıklar")
    public void kullanıcı_dizayn_etmek_istediği_sayfaya_tıklar() {
        //      clickPanelButton("Web : abeyis-web");
           dzyn.websayfası.click();

    }
    @Then("Kullanıcı Dizayn sayfasında oldugunu dogrular")
    public void kullanıcı_dizayn_sayfasında_oldugunu_dogrular() {
        String baslıkUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(baslıkUrl.contains("b2c/theme"));

    }

    @Given("Kullanıcı Bolum Ekle butonuna tıklar")
    public void kullanıcı_bolum_ekle_butonuna_tıklar() {
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







