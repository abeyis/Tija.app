package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.MedyaPage;

public class MedyaStepDefn {
    MedyaPage media =new MedyaPage();


    @Then("verify that it goes to the media Page")
    public void verifyThatItGoesToTheMediaPage() {
        media.validationMediaPage();
    }
    @Then("search media with searchbox")
    public void searchMediaWithSearchbox() {
        media.searchMedia();
    }

    @Then("verify that image is displayed on the page")
    public void verifyThatImageIsDisplayedOnThePage() {
        media.verifyMediaIsDisplay();
    }

    @Then("add image")
    public void addImage() {

        media.addImage();
    }

    @Then("verify that the image has been added")
    public void verifyThatTheImageHasBeenAdded() {
        media.verifyAddedImage();
    }

    @Then("delete image")
    public void deleteImage() {
        media.deleteImage();
        
    }

    @Then("verify that the image has been deleted")
    public void verifyThatTheImageHasBeenDeleted() {

        media.verifyDeletedImage();

    }

    @Then("sort with {string} criterion")
    public void sortWithCriterion(String criteria) {
        media.sortWithCriterion(criteria);

    }

    @Then("verify that it is sorted by criterion once en yeni")
    public void verifyThatItIsSortedByCriterionOnceEnYeni() {
        media.verifyTheOrder("before");

    }

    @Then("verify that it is sorted by criterion once en eski")
    public void verifyThatItIsSortedByCriterionOnceEnEski() {
        media.verifyTheOrder("after");
    }


}
