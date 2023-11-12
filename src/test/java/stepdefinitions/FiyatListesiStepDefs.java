package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FiyatListesiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestUtils;

public class FiyatListesiStepDefs {

    FiyatListesiPage fl =new FiyatListesiPage();


    @Given("Verify that it goes to the Fiyat Listesi Page")
    public void Verify_that_it_goes_to_the_Fiyat_Listesi_Page() {
        fl.validationFiyatListesiPage();
    }

    @Given("Click on the Dashboard page link")
    public void Click_on_the_Dashboard_page_link() {
        fl.DashbordClick();

    }
    @Given("Verify that it goes to the Dashboard Page")
    public void Verify_that_it_goes_to_the_Dashboard_Page() {
        fl.validationDashboardPage();
    }

    @Given("The product name is written in the Ne Aramistiniz textbox and the click on the Ara button")
    public void The_product_name_is_written_in_the_Ne_Aramistiniz_textbox_and_the_click_on_the_Ara_button() {
        fl.neAramistinizTextBoxinaUrunAdiYazAraButonunaTikla(ConfigReader.getProperty("aranacakUrunAdi"));
    }
    @Given("Verifies that product information is displayed on the page")
    public void Verifies_that_product_information_is_displayed_on_the_page() {
        fl.ilgiliUrunBilgilerininSayfadaGoruntulendigiDogrulanir();
    }
    @Given("Click on the Yeni Fiyat button")
    public void Click_on_the_Yeni_Fiyat_button() {
        fl.yenifiyatbutonunatiklanir();
    }
    @Given("Fill in the relevant fields in the window that opens and click on the Olustur button")
    public void Fill_in_the_relevant_fields_in_the_window_that_opens_and_click_on_the_Olustur_button() {
       fl.fiyatListesiEklemePencereVerilerGirveOlusturButtonTikla();
    }
    @Given("Verify that the Kolon guncellendi pop-up is displayed")
    public void Verify_that_the_Kolon_guncellendi_pop_up_is_displayed() {
        fl.validationKolonGuncellendiPopUp();
    }
    @Given("Verify that the new Fiyat listesi has been added")
    public void Verify_that_the_new_Fiyat_listesi_has_been_added() {
        fl.validationFiyatListesiEkle();
    }


    @Given("Click panel Fiyat Listesi")
    public void click_panell_Fiyat_Listesi() {
        fl.clickPanel("Fiyat Listesi");
        TestUtils.bekle(3);
    }


    @Given("Click on Silinecek Fiyat Listesi")
    public void click_on_silinecek_fiyat_listesi() {
        fl.silinecekFiyatListesineTikla();

    }
    @Given("Click on the Duzenle button")
    public void click_on_the_duzenle_button() {
    fl.DuzenleButonunaTikla();
    }
    @Given("Click on the Sil button")
    public void click_on_the_sil_button() {
        fl.silButonunaTikla();
    }
    @Given("Click on the second Sil button")
    public void click_on_the_second_sil_button() {
        fl.ikinciSilButonunaTikla();
    }
    @Given("Verify that the Kolon Silindi pop-up is displayed")
    public void verify_that_the_kolon_silindi_pop_up_is_displayed() {
        fl.validationKolonSilindiPopUp();

    }
    @Given("Verify that the Silinecek Fiyat listesi has been deleted")
    public void verify_that_the_silinecek_fiyat_listesi_has_been_deleted() {
        fl.silinecekFiyatListesininSilindiginiDogrula();
    }


    @Given("Click on Guncellenecek Fiyat Listesi")
    public void click_on_guncellenecek_fiyat_listesi() {
        fl.guncellenecekFiyatListesineTikla();

    }
    @Given("Fill in the relevant fields in the window that opens and click on the Guncelle button")
    public void fill_in_the_relevant_fields_in_the_window_that_opens_and_click_on_the_guncelle_button() {
        fl.acilanPenceredekiBosluklariDoldurVeGuncelleButonunaTikla();

    }
    @Given("Verify the updates made on the Fiyat Listesi information")
    public void verify_the_updates_made_on_the_fiyat_listesi_information() {
        fl.fiyatListesiBilgilerindeYapilanDegisikliklerinGuncellendigiDogrula();
    }

    @Given("Click on GalaxyBudsLiveFiyatTextBox,delete the old price and enter the new price")
    public void click_on_galaxy_buds_live_fiyat_text_box_delete_the_old_price_and_enter_the_new_price() {
        fl.galaxyBudsLiveFiyatTextBoxinaTiklaEskiFiyatiSilveYeniFiyatBilgisiniGir(ConfigReader.getProperty("urunYeniFiyatBilgisi"));

    }
    @Given("Click on DegisiklikleriKaydet Button")
    public void click_on_degisiklikleri_kaydet_button() {
        fl.degisiklikleriKaydetButonunaTikla();

    }
    @Given("Verify that the Fiyatlar Guncellendi pop-up is displayed")
    public void verify_that_the_fiyatlar_guncellendi_pop_up_is_displayed() {
        fl.validationFiyatlarGuncellendiPopUp();

    }
    @Given("Verify the updates made on the GalaxyBudsLiveFiyat information")
    public void verify_the_updates_made_on_the_galaxy_buds_live_fiyat_information() {
        fl.galaxyBudsLiveUrunFiyatBilgisindeYapilanDegisiklikliginGuncellendigiDogrula();


    }



}
