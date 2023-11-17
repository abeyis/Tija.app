package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.DizaynPage;
import io.cucumber.java.en.Given;
import utilities.TestUtils;

public class DizaynStepDefs {


    DizaynPage dzyn=new DizaynPage();

    @Given("Click panel Dizayn")
    public void clickPanelDizayn() {

        dzyn.clickPanelButton("Dizayn");
        TestUtils.bekle(3);
    }


    @Given("Click panel abeyisWeb")
    public void clickPanelAbeyisWeb() {
        dzyn.clickWebAbeyis();

    }

    @Given("Click on the header button")
    public void clickOnTheHeaderButton() {
        dzyn.headerButtonTikla();

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

    // eda


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



































}
