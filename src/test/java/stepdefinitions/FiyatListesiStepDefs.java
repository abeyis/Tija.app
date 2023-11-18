package stepdefinitions;
import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.FiyatListesiPage;
import utilities.ConfigReader;

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

    @Given("Search Product With Ara Button")
    public void Search_Product_With_Ara_Button() {
        fl.SearchProductWithAraButton(ConfigReader.getProperty("aranacakUrunAdi"));
    }
    @Given("Verifies that product information is displayed on the page")
    public void Verifies_that_product_information_is_displayed_on_the_page() {

        fl.verifyProductInformation();
    }

    @Given("Add New Price List")
    public void Add_New_Price_List() {
        fl.addNewPriceList();
    }
    @Given("Verify that the Kolon guncellendi pop-up is displayed")
    public void Verify_that_the_Kolon_guncellendi_pop_up_is_displayed() {

        fl.VerifyKolonGuncellendiPopUp();
    }
    @Given("Verify that the new Price list has been added")
    public void Verify_that_the_new_Price_list_has_been_added() {
        fl.verifyNewPriceAdded();
    }


    @Given("Click panel Fiyat Listesi")
    public void click_panell_Fiyat_Listesi() {

        fl.clickPanelButton("Fiyat Listesi");
    }


    @Given("Delete price list")
    public void Delete_price_list() {

        fl.deletePriceList();

    }

    @Given("Verify that the Kolon Silindi pop-up is displayed")
    public void verify_that_the_kolon_silindi_pop_up_is_displayed() {
        fl.validationKolonSilindiPopUp();

    }
    @Given("Verify that the new Price list has been deleted")
    public void Verify_that_the_new_Price_list_has_been_deleted() {
        fl.verifyPriceListDeleted();
    }


    @Given("Update price list information")
    public void Update_price_list_information() {

        fl.UpdatePriceList();

    }

    @Given("Verify that the Price list has been updated")
    public void Verify_that_the_Price_list_has_been_updated() {

        fl.verifyPriceListInformationUpdate();
    }

    @Given("Update product price")
    public void Update_product_price() {

        fl.updateProductPrice(  ConfigReader.getProperty("urunYeniFiyatBilgisi")  );

    }

    @Given("Verify that the Fiyatlar Guncellendi pop-up is displayed")
    public void verify_that_the_fiyatlar_guncellendi_pop_up_is_displayed() {
        fl.validationFiyatlarGuncellendiPopUp();

    }
    @Given("Verify that the product price has been updated")
    public void Verify_that_the_product_price_has_been_updated() {
        fl.verifyProductPriceUpdated();


    }



}
