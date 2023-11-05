package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.DizaynSayfaAyarlarıPage;

public class DizaynSayfaAyarlarıStepDefs {


    DizaynSayfaAyarlarıPage dzynSyfAyrları= new DizaynSayfaAyarlarıPage();


    @Then("Dizaynda Sayfa Ayarlarını yapar")
    public void dizayndaSayfaAyarlarınıYapar() {

        dzynSyfAyrları.clickToAltBilgiSayfa();
    }
}
