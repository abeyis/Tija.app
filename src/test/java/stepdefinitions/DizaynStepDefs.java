package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DizaynPage;


public class DizaynStepDefs  {


    DizaynPage dzyn = new DizaynPage();

    @When("Online Magaza butonuna tıkla")
    public void onlineMagazaButonunaTıkla() {
        dzyn.clickPanelButton("Online Mağaza");

    }

    @When("Dizayn butonuna tıkla")
    public void dizaynButonunaTıkla() {
        dzyn.clickPanelButton("Dizayn");
    }

    @And("Dizayn etmek istediği sayfaya tıkla")
    public void dizaynEtmekIstediğiSayfayaTıkla() {

        dzyn.clickWebAbeyis();
    }


    @And("Dizayn sayfasında oldugunu dogrula")
    public void dizaynSayfasındaOldugunuDogrula() {
        dzyn.sayfaDogrulama("b2c/theme");

    }

    @Given("Başlık butonuna tıkla")
    public void başlıkButonunaTıkla() {
        dzyn.baslıkTıkla();

    }

    @When("Sayfa Ayarları butonuna tıkla")
    public void sayfaAyarlarıButonunaTıkla() {
        dzyn.clickPanelButton(" Sayfa Ayarları ");
    }

    @And("Başlık text box'ına valid bir değer gir")
    public void başlıkTextBoxInaValidBirDeğerGir() {
        dzyn.yaz();
    }

    @And("Sayfa genişliğini seç")
    public void sayfaGenişliğiniSeç() {
        dzyn.genislikSec();
    }

    @And("Aktif butonuna tıkla")
    public void aktifButonunaTıkla() {
        dzyn.aktifSec();
    }

    @And("Kaydet butonuna tıkla")
    public void kaydetButonunaTıkla() {
        dzyn.kaydetTıkla();
    }

    @And("İşlem başarılı pop up ının görüldüğünü dogrula")
    public void işlemBaşarılıPopUpInınGörüldüğünüDogrula() {
        dzyn.popUpValid();
    }

    @Given("Main bölümünden bir görsel veya bir ürüne tıkla")
    public void mainBölümündenBirGörselVeyaBirÜrüneTıkla() {
        dzyn.tıklaMain();
    }

    @Given("Alt Bilgi butonuna tıkla")
    public void altBilgiButonunaTıkla() {
        dzyn.tıklaAltBilgi();
    }

    @And("Kopya oluştur butonuna tıkla")
    public void kopyaOluşturButonunaTıkla() {
        dzyn.kopyaOlustur();

    }

    @Then("Sayfanın kopyalandıgını dogrula")
    public void sayfanınKopyalandıgınıDogrula() {
        dzyn.kopyaOlustugunuDogrula();

    }

    @And("Sayfayı sil butonuna tıkla")
    public void sayfayıSilButonunaTıkla() {
        dzyn.sayfaSil();
    }

    @And("Sayfayı silmek istediğinize emin misiniz? sorusunu görüp evet butonuna tıkla")
    public void sayfayıSilmekIstediğinizeEminMisinizSorusunuGörüpEvetButonunaTıkla() {
        dzyn.dogrulaVeOnayla();
    }

    @Then("Sayfanın silindigini dogrula")
    public void sayfanınSilindiginiDogrula() {
        dzyn.silindiginiDogrula();
    }
    @Given("Bilgileri doğrula")
    public void bilgileriDoğrula() {
        dzyn.gorunurluguDogrula();
    }

    @Given("Bilgilerim butonunu dogrula")
    public void bilgilerimButonunuDogrula() {
        dzyn.bilgerimGorunur();
    }

    @Given("Sol üst köşedeki üç çizgiye tıkla")
    public void solÜstKöşedekiÜçÇizgiyeTıkla() {
        dzyn.ucCızgiTıkla();
    }

    @When("Ayarlar butonuna tıkla")
    public void ayarlarButonunaTıkla() {
        dzyn.ayarlarTıkla();
    }

    @And("Web Sitesi butonuna tıkla")
    public void webSitesiButonunaTıkla() {
        dzyn.webSitesiTıkla();
    }

    @And("Web sitesinin Düzenle butonuna tıkla")
    public void webSitesininDüzenleButonunaTıkla() {
        dzyn.duzenleTıkla();
    }

    @And("Sosyal Medya butonuna tıkla")
    public void sosyalMedyaButonunaTıkla() {
        dzyn.clickPanelButton(" Sosyal Medya");
    }

    @And("Huawei AppGallery Link textine link gir")
    public void huaweiAppGalleryLinkTextineLinkGir() {
        dzyn.huaweiText();

    }

    @And("App Store Link textine link gire")
    public void appStoreLinkTextineLinkGire() {
        dzyn.appStoreText();
    }

    @And("Google Play Store Link textine link gir")
    public void googlePlayStoreLinkTextineLinkGir() {
        dzyn.playStoreText();
    }

    @And("ETBIS Link textine link gir")
    public void etbısLinkTextineLinkGir() {
        dzyn.etbisText();
    }

    @And("Twitter Link textine link gir")
    public void twitterLinkTextineLinkGir() {
        dzyn.twitterText();
    }

    @And("Facebook Link textine link gir")
    public void facebookLinkTextineLinkGir() {
        dzyn.facebookText();
    }

    @And("Instagram Link textine link gir")
    public void ınstagramLinkTextineLinkGir() {
        dzyn.instagramText();
    }

    @And("Youtube Link textine link gir")
    public void youtubeLinkTextineLinkGir() {
        dzyn.youtubeText();
    }
    @And("Kaydete tıkla")
    public void kaydeteTıkla() {
        dzyn.kaydeteTıkla();

    }

    @And("ikonlarının görüldüğünü doğrula")
    public void ikonlarınınGörüldüğünüDoğrula() {
        dzyn.ikonlarıDogrula();
    }

}



