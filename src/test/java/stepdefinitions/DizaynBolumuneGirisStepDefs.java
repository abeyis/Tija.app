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





}
