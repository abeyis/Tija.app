package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DizaynPage;
import utilities.TestUtils;

import static org.junit.Assert.assertTrue;


public class DizaynStepDefs {


    DizaynPage dzyn = new DizaynPage();

    @Then("Get product list count")
    public void getProductListCount() {
        dzyn.getProductListCount();
    }

    @And("Kullanıcı Urun Listesi butonunun eklendigini dogrular")
    public void verifyProductListAdded() {
        dzyn.verifyProductListAdded();
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
        dzyn.sayfayiKaydet();
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

    @And("Web Sitesi butonuna tıkla")
    public void webSitesiButonunaTikla() {
        dzyn.webSitesiTikla();
    }

    @And("{string} Düzenle butonuna tıkla")
    public void webSitesininDuzenleButonunaTikla(String option) {
        dzyn.clickToEdit(option);
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

    @Then("Verify that the Islem basarili PupUp is displayed")
    public void verifyThatTheIslemBasariliPupUpIsDisplayed() {
        dzyn.verifyIslemBasariliPopUpisDisplay();
    }

    @Given("Click on the gorseli kaldir button for LOGO")
    public void clickOnTheGorseliKaldirButtonForLOGO() {
        dzyn.clickLogoGorselKaldirButton();
    }

    @Given("Verify that the new Logo Image has been deleted")
    public void verifyThatTheNewLogoImageHasBeenDeleted() {
        dzyn.VerifyDeletedLogo();

    }

    @Given("Fill in the login title textbox and click the Kaydet button.")
    public void fillInTheLoginTitleTextboxAndClickTheKaydetButton() {
        dzyn.FillLoginTitleTextAndClickSave();
    }

    @Given("Verify that the login title has changed")
    public void verifyThatTheLoginTitleHasChanged() {
        dzyn.VerifyUpdatedLoginTitle();

    }

    @Given("Delete logo image")

    public void Delete_logo_image() {
        dzyn.deleteLogoImage();
    }

    @Given("Verify that the Logo Image has been deleted")
    public void verifyThatTheLogoImageHasBeenDeleted() {
        dzyn.VerifyDeletedLogo();

    }

    @Given("Update Login Title")
    public void Update_Login_Title() {
        dzyn.updateLoginTitle();
    }


    @Given("Verify that the login title has updated")
    public void Verify_that_the_login_title_has_updated() {
        dzyn.VerifyUpdatedLoginTitle();
    }

    @Given("Dropdown menuden Ozel Koleksiyon secilir")
    public void dropdown_menuden_ozel_koleksiyon_secilir() {
        dzyn.OzelKoleksiyonSec();
    }

    @Given("Koleksiyon sec butonuna tiklanir")
    public void koleksiyon_sec_butonuna_tiklanir() {
        dzyn.KoleksiyonSecButonTiklama();
    }

    @Given("Acilan ekranda herhangi bir koleksiyon secilir")
    public void acilan_ekranda_herhangi_bir_koleksiyon_secilir() {
        dzyn.EkranKoleksiyonSec();
    }

    @Given("Urun Sayisi sliderindan urun sayisi secilir")
    public void urun_sayisi_sliderindan_urun_sayisi_secilir() {
        dzyn.UrunSSliderSec();
    }

    @Given("Satir Urun Sayisi sliderindan urun sayisi secilir")
    public void satir_urun_sayisi_sliderindan_urun_sayisi_secilir() {
        dzyn.SatirUrunSSliderSec();
    }

    @Given("Ekranin sag ust tarafinda bulunan Kaydet secenegine tiklanir")
    public void ekranin_sag_ust_tarafinda_bulunan_kaydet_secenegine_tiklanir() {
        dzyn.KaydetButonTikla();
    }

    @Given("Eklenen Ozel Koleksiyonun eklendigi dogrulanir")
    public void eklenen_ozel_koleksiyonun_eklendigi_dogrulanir() {
    }

    @Given("Dropdown menuden Urun Sec secilir")
    public void dropdown_menuden_urun_sec_secilir() {
        dzyn.DropUrunSec();
    }

    @Given("Urun secmek icin tiklayin butonuna tiklanir")
    public void urun_secmek_icin_tiklayin_butonuna_tiklanir() {
        dzyn.UrunSecTiklayinButon();
    }

    @Given("Acilan ekranda herhangi bir urun secilir")
    public void acilan_ekranda_herhangi_bir_urun_secilir() {
        dzyn.EkranUrunSecGalaxyButon();
    }

    @Given("Daha fazla ekle butonuna tiklanir")
    public void daha_fazla_ekle_butonuna_tiklanir() {
        dzyn.DahaFazlaEkleButon();
    }

    @Given("Eklenen urunlerin eklendigi dogrulanir")
    public void eklenen_urunlerin_eklendigi_dogrulanir() {
        dzyn.EklenenUrunDogrula();
    }

    @Then("Open Page List")
    public void openPageList() {
        dzyn.openPageList();
    }

    @Given("Kullanici Urun Listesini gizler")
    public void kullanici_urun_listesini_gizler() {
        dzyn.urunListesiGizle();
    }

    @Given("Kullanici Urun Listesini gizledigini dogrular")
    public void kullanici_urun_listesini_gizlendigini_dogrular() {
        dzyn.urunListesiGizlediginiDogrula();
    }

    @Given("Kullanici Urun Listesini siler")
    public void kullanici_urun_listesini_siler() {
        dzyn.urunListesiSilme();
    }

    @Given("Kullanici Urun Listesini sildigini dogrular")
    public void kullanici_urun_listesini_sildigini_dogrular() {
        dzyn.urunListesiSildiginiDogrula();
    }

    @Then("Select the website to work on")
    public void selectTheWebsiteToWorkOn() {
        dzyn.clickWebAbeyis();
    }

    @Then("Select {string} option from page list")
    public void selectOptionFromPageList(String pageName) {
        dzyn.selectPage(pageName);
    }
    @Then("Send {string} text to {string}")
    public void sendTextTo(String title, String text) {
        dzyn.sendTextFromTitle(title, text);
    }

    @And("Select Liste for Menu Tipi")
    public void selectListeForMenuTipi() {
        dzyn.selectListe();
    }

    @Then("Verify that the {string} has been created")
    public void verifyThatTheHasBeenCreated(String menuName) {
        dzyn.popUpValid();
        dzyn.verifyMenuName(menuName);

    }

}