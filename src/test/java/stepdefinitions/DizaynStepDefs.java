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
    public void baslikButonunaTikla() {
        dzyn.baslikTikla();

    }

    @When("Sayfa Ayarları butonuna tıkla")
    public void sayfaAyarlariButonunaTikla() {
        dzyn.clickPanelButton(" Sayfa Ayarları ");
    }

    @And("Başlık text box'ına valid bir değer gir")
    public void baslikTextBoxInaValidBirDegerGir() {
        dzyn.yaz();
    }

    @And("Sayfa genişliğini seç")
    public void sayfaGenisliginiSec() {
        dzyn.genislikSec();
    }

    @And("Aktif butonuna tıkla")
    public void aktifButonunaTikla() {
        dzyn.aktifSec();
    }

    @And("Kaydet butonuna tıkla")
    public void kaydetButonunaTikla() {
        dzyn.kaydetTikla();
    }

    @And("İşlem başarılı pop up ının görüldüğünü dogrula")
    public void islemBasariliPopUpIninGoruldugunuDogrula() {
        dzyn.popUpValid();
    }

    @Given("Main bölümünden bir görsel veya bir ürüne tıkla")
    public void mainBolumundenBirGorselVeyaBiruruneTikla() {
        dzyn.tiklaMain();
    }

    @Given("Alt Bilgi butonuna tıkla")
    public void altBilgiButonunaTikla() {
        dzyn.tiklaAltBilgi();
    }

    @And("Kopya oluştur butonuna tıkla")
    public void kopyaOlusturButonunaTikla() {
        dzyn.kopyaOlustur();

    }

    @Then("Sayfanın kopyalandıgını dogrula")
    public void sayfaninKopyalandiginiDogrula() {
        dzyn.kopyaOlustugunuDogrula();

    }

    @And("Sayfayı sil butonuna tıkla")
    public void sayfayiSilButonunaTikla() {
        dzyn.sayfaSil();
    }

    @And("Sayfayı silmek istediğinize emin misiniz? sorusunu görüp evet butonuna tıkla")
    public void sayfayiSilmekIstediginizeEminMisinizSorusunuGorupEvetButonunaTikla() {
        dzyn.dogrulaVeOnayla();
    }

    @Then("Sayfanın silindigini dogrula")
    public void sayfaninSilindiginiDogrula() {
        dzyn.silindiginiDogrula();
    }
    @Given("Bilgileri doğrula")
    public void bilgileriDogrula() {
        dzyn.gorunurluguDogrula();
    }

    @Given("Bilgilerim butonunu dogrula")
    public void bilgilerimButonunuDogrula() {
        dzyn.bilgerimGorunur();
    }

    @Given("Sol üst köşedeki üç çizgiye tıkla")
    public void solUstKosedekiUcCizgiyeTikla() {
        dzyn.ucCizgiTikla();
    }

    @When("Ayarlar butonuna tıkla")
    public void ayarlarButonunaTikla() {
        dzyn.ayarlarTikla();
    }

    @And("Web Sitesi butonuna tıkla")
    public void webSitesiButonunaTikla() {
        dzyn.webSitesiTikla();
    }

    @And("Web sitesinin Düzenle butonuna tıkla")
    public void webSitesininDuzenleButonunaTikla() {
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
    public void etbisLinkTextineLinkGir() {
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
    public void instagramLinkTextineLinkGir() {
        dzyn.instagramText();
    }

    @And("Youtube Link textine link gir")
    public void youtubeLinkTextineLinkGir() {
        dzyn.youtubeText();
    }
    @And("Kaydete tıkla")
    public void kaydeteTikla() {
        dzyn.kaydeteTikla();

    }

    @And("ikonlarının görüldüğünü doğrula")
    public void ikonlarininGoruldugunuDogrula() {
        dzyn.ikonlariDogrula();
    }

}



