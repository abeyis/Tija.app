package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DizaynPage;
import utilities.TestUtils;

import java.util.List;


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
    public void sendTextTo(String text, String title) {
        dzyn.sendTextFromTitle(title, text);
    }

    @And("Select Liste for Menu Tipi")
    public void selectListeForMenuTipi() {
        dzyn.selectListe();
    }

    @Then("Verify that the {string} has been {string}")
    public void verifyThatTheHasBeen(String menuName, String menuCase) {
        dzyn.verifyIslemBasarili(menuCase);
        dzyn.verifyMenuName(menuName, menuCase);
    }

    @And("Close the Menuler Panel")
    public void closeTheMenulerPanel() {
        dzyn.closeThePanel();
    }

    @Then("Select {string} option from Ana Menu list")
    public void selectOptionFromAnaMenuList(String menuName) {
        dzyn.selectAnaMenu(menuName);
    }

    @Then("Click the {string} tab")
    public void clickTheTab(String tabTitle) {
        dzyn.selectTheTab(tabTitle);
    }

    @Then("Click the {string} Button")
    public void clickTheButton(String btnName) {
        dzyn.clickMenuBtn(btnName);
    }

    @Then("Verify that the menu items have been created")
    public void verifyThatTheMenuItemsHaveBeenCreated() {
        TestUtils.waitForPageToLoad(15);
        dzyn.verifyItemInMenu("Koleksiyon");
        dzyn.verifyItemInMenu("Ürün");
        dzyn.verifyItemInMenu("Marka");
        dzyn.verifyItemInMenu("Mağazamız");
    }

    @Then("Create menu items for koleksiyon, urun, marka and sayfa")
    public void createMenuItemsForKoleksiyonUrunMarkaAndSayfa(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        dzyn.addMenuItems(listItems);
    }

    @Then("Click menu ogesi ekle icon")
    public void clickMenuOgesiEkleIcon() {
        dzyn.clickMenuOgesiEkle();
    }

    @Then("Send title {string} to Baslik")
    public void sendTitleToBaslik(String menuTitle) {
        dzyn.sendTitleToBaslik(menuTitle);
    }

    @Then("Click the {string} button in Menuler")
    public void clickTheButtonInMenuler(String btnTitle) {
        dzyn.clickMenulerBtn(btnTitle);
    }

    @Then("Select {string} option as Item")
    public void selectOptionAsItem(String guidance) {
        dzyn.clickItemSelection(guidance);
    }

    @Then("Send {string} as web address")
    public void sendAsWebAddress(String linkAddress) {
        dzyn.sendLinkAddress(linkAddress);
    }

    @Then("Click the Kaydet button")
    public void clickTheKaydetButton() {
        dzyn.clickKaydet();
    }

    @Then("Click the Olustur button")
    public void clickTheOlusturButton() {
        dzyn.clickMenulerBtn("Olustur");
    }

    @Then("Verify that the link item {string} has been created")
    public void verifyThatTheLinkItemHasBeenCreated(String linkName) {
        TestUtils.waitForPageToLoad(15);
        dzyn.verifyItemInMenu(linkName);
    }

    @Then("Change menu items for koleksiyon, urun, marka and sayfa")
    public void changeMenuItemsForKoleksiyonUrunMarkaAndSayfa(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        dzyn.changeMenuItems(listItems);
    }

    @Then("Verify that the menu items have been changed")
    public void verifyThatTheMenuItemsHaveBeenChanged() {
        TestUtils.waitForPageToLoad(15);
        dzyn.verifyItemInMenu("Seri Sonu");
        dzyn.verifyItemInMenu("Sezonluk");
        dzyn.verifyItemInMenu("Markalar");
        dzyn.verifyItemInMenu("İletişim");
    }

    @Then("Click {string} icon for our item {string}")
    public void clickIconForOurItem(String title, String choiseText) {
        dzyn.clickItemChoise(choiseText, title);
    }

    @Then("Verify that the link item has been changed as {string}")
    public void verifyThatTheLinkItemHasBeenChangedAs(String linkName) {
        TestUtils.waitForPageToLoad(15);
        dzyn.verifyItemInMenu(linkName);
    }

    @Given("Click the + button in the Header section")
    public void clickTheButtonInTheHeaderSection()  {
        dzyn.clickPlus();
    }

    @When("Click on the {string} button")
    public void clickOnTheButton(String string) {
        dzyn.clickPanelButton(string);
    }

    @When("Verify collection page has been added")
    public void verifyCollectionPageHasBeenAdded()  {
        dzyn.verifyCollection();


    }

    @When("Verify product detail page has been added")
    public void verifyProductDetailPageHasBeenAdded(){
        dzyn.verifyProductDetail();
    }

    @Given("Click on the dropdown button")
    public void clickOnTheDropdownButton() {
        dzyn.dropMenu();
    }

    @When("Choose a new page")
    public void chooseANewPage() {
        dzyn.clickPanelButton(" Anasayfa 29 ");

    }

    @When("verify transition to new page")
    public void verifyTransitionToNewPage(){
        dzyn.verifyTransition();
    }



    @Then("Verify that the name has been {string} as {string}")
    public void verifyThatTheNameHasBeenAs(String menuCase, String menuName) {
        dzyn.verifyMenuName(menuName, menuCase);
    }

    @Then("Create categorical menu items")
    public void createCategoricalMenuItems(DataTable dataTable) {
        List<String> listItems = dataTable.asList(String.class);
        dzyn.createCategoricalMenuItems(listItems);
    }

    @Then("Verify that all menu items have been created")
    public void verifyThatAllMenuItemsHaveBeenCreated(DataTable dataTable) {
        List<List<String>> menuList = dataTable.asLists(String.class);
        dzyn.verifyItemsInMenu(menuList);
    }

    @Then("Verify that the {string} pop-up is displayed")
    public void verifyThatThePopUpIsDisplayed(String msg) {
        dzyn.verifyPopUpMessage(msg);
    }

    @Then("Click the expand icon for {string}")
    public void clickTheExpandIconFor(String menuName) {
        dzyn.clickItemExpand(menuName);
    }

    @Then("Move {string} on to {string}")
    public void moveOnTo(String menuName, String targetName) {
        dzyn.moveItemOnto(menuName, targetName);
    }

    @Then("Click the add button for {string}")
    public void clickTheAddButtonFor(String menuName) {
        dzyn.clickMenuOgesiEkle(menuName);
        dzyn.sendTitleToBaslik("Philips Ürünleri");
        dzyn.clickMenulerBtn("Olustur");
    }

    @And("Approve the {string} button")
    public void approveTheButton(String title) {
        dzyn.clickOnayBtn(title);
    }

    @Then("Verify that all categorical menu items is available")
    public void verifyThatAllCategoricalMenuItemsIsAvailable(DataTable dataTable) {
        List<List<String>> menuList = dataTable.asLists(String.class);
        dzyn.verifyItemsInMenu(menuList);
    }

    @Then("save topbar type as a text: {string}")
    public void saveTopbarTypeAsAText(String text) {
        dzyn.saveTopbarAsAText(text);
    }

    @Then("confirm topbar type as a text: {string}")
    public void confirmTopbarTypeAsAText(String text) {
        dzyn.confirmTopbarAsAText(text);
    }


    @Then("delete the image")
    public void deleteTheImage() {
        dzyn.deleteTheImageAddedForTopbar();
    }

    @Then("confirm the image deleted")
    public void confirmTheImageDeleted() {
        dzyn.confirmTheImageDeletedForTopbar();
    }


    @Then("save topbar type as visual")
    public void saveTopbarTypeAsVisual() {
        dzyn.saveTopbarAsVisual();
    }

    @Then("confirm topbar type as visual added")
    public void confirmTopbarTypeAsVisualAdded() {
    }
}