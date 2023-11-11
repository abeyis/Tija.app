package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DizaynSayfaAyarlarıPage;

public class DizaynSayfaAyarlarıStepDefs {


    DizaynSayfaAyarlarıPage dzynSyfAyrları= new DizaynSayfaAyarlarıPage();


    @Given("Kullanıcı Başlık butonuna tıklar")
    public void kullanıcı_başlık_butonuna_tıklar() {
        dzynSyfAyrları.clickPanelButton("Başlık (Header)");

    }

    @When("Kullanıcı Sayfa Ayarları butonuna tıklar")
    public void kullanıcıSayfaAyarlarıButonunaTıklar() {
        dzynSyfAyrları.clickPanelButton(" Sayfa Ayarları ");


    }
    @When("Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden oluşturacağı sayfanın başlığı için Başlık text box'ına valid bir değer girer")
    public void kullanıcı_dizayn_sayfasının_sağ_tarafında_bulunan_sayfa_ayarları_bölümünden_oluşturacağı_sayfanın_başlığı_için_başlık_text_box_ına_valid_bir_değer_girer() {

        dzynSyfAyrları.baslıkText.sendKeys("AbeyisDeneme");

    }
    @When("Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden Sayfa genişliğini seçer")
    public void kullanıcı_dizayn_sayfasının_sağ_tarafında_bulunan_sayfa_ayarları_bölümünden_sayfa_genişliğini_seçer() {

        dzynSyfAyrları.sayfaGenişligiButon.click();
        dzynSyfAyrları.clickPanelButton("Full");
    }
    @When("Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümündeki Aktif butonunu aktif hale getirir")
    public void kullanıcı_dizayn_sayfasının_sağ_tarafında_bulunan_sayfa_ayarları_bölümündeki_aktif_butonunu_aktif_hale_getirir() {
            dzynSyfAyrları.aktifButon.click();
    }
    @When("Kullanıcı Sayfa Ayarlarını kaydetmek için Kaydet butonuna tıklar")
    public void kullanıcı_sayfa_ayarlarını_kaydetmek_için_kaydet_butonuna_tıklar() {
        dzynSyfAyrları.kaydetButon.click();
    }
    @When("Kullanıcı {string} yazısının görüldüğünü dogrular")
    public void kullanıcı_yazısının_görüldüğünü_dogrular(String string) {
        Assert.assertTrue(string.equals(dzynSyfAyrları.islemBasarılı.getText()));

    }


    @Given("Kullanıcı Main bölümünden bir görsel veya bir ürüne tıklar")
    public void kullanıcıMainBölümündenBirGörselVeyaBirÜrüneTıklar() {

    }

    @Given("Kullanıcı Alt Bilgi butonuna tıklar")
    public void kullanıcıAltBilgiButonunaTıklar() {

    }
    @And("Kullanıcı silmek istediği sayfanın bilgileriyle Sayfayı sil butonuna tıklar")
    public void kullanıcıSilmekIstediğiSayfanınBilgileriyleSayfayıSilButonunaTıklar() {
    }

    @And("Kullanıcı açılan pencerede {string} sorusunu görüp evet butonuna tıklar")
    public void kullanıcıAçılanPenceredeSorusunuGörüpEvetButonunaTıklar(String arg0) {


    }


    @Then("Kullanıcı sayfanın silindigini dogrular")
    public void kullanıcıSayfanınSilindiginiDogrular() {
        
    }

    @And("Kullanıcı kopyasını oluşturmak istediği sayfanın bilgileriyle Kopya oluştur butonuna tıklar")
    public void kullanıcıKopyasınıOluşturmakIstediğiSayfanınBilgileriyleKopyaOluşturButonunaTıklar() {
        
    }

    @Then("Kullanıcı sayfanın kopylandıgını dogrular")
    public void kullanıcıSayfanınKopylandıgınıDogrular() {
    }
}
