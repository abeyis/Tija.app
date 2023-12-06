package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MedyaPage extends BasePage {
    public MedyaPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//strong[text()='Medya']")
    private WebElement medyaText;
    @FindBy (xpath = "//i[@class='text-35 i-Folders']")
    private WebElement addImageButton;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement seachBox;


    @FindBy(xpath = "(//*[@id='delete-img'])[1]")
    private WebElement deleteButtonForFirstImage;

    @FindBy(xpath = "//div[text()='Evet']")
    private WebElement evetButtonForDelete;

    @FindBy(xpath = "//p[@class='m-0 text-muted text-small w-15 w-sm-100']")
    private List<WebElement> olusturulmaTarihiListesi;



    //  //div[h6[text()='Fax']]/following-sibling::div/button[contains(text(),'Güncelle')]



    public void validationMediaPage() {
        TestUtils.bekle(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("media"));
        Assert.assertTrue(getElementText(medyaText).contains("Medya"));

    }
    @FindBy(xpath = "//div[text()='A.png']")
    private WebElement imageSearch;

    String searchImageText;
    public void searchMedia() {

        searchImageText=getElementText(Driver.getDriver().findElement(By.xpath("(//a[@class='w-40 w-sm-100'])[1]/div")));
        System.out.println(searchImageText);
        type(seachBox, searchImageText);
    }

    public void verifyMediaIsDisplay() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[text()='"+searchImageText+"']")).isDisplayed());
    }

    public void addImage() {}
    public void verifyAddedImage() {}

    String deletedImageText;
    public void deleteImage() {
        deletedImageText=getElementText(Driver.getDriver().findElement(By.xpath("(//a[@class='w-40 w-sm-100'])[1]/div")));
        System.out.println("delete text ="+deletedImageText);
        click(deleteButtonForFirstImage);
    }

    public void verifyDeletedImage() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[text()='"+deletedImageText+"']")).isDisplayed());
    }



    public void sortWithCriterion(String criteria) {
        click(Driver.getDriver().findElement(By.xpath("//select[@class='form-select btn shadow']")));
        TestUtils.wait(2);
        click(Driver.getDriver().findElement(By.xpath("//option[text()='"+criteria+"']")));
        TestUtils.wait(2);


    }
    List<String> olsturulmaTarihleriStringListe =new ArrayList<>();
    List<String> dateOnlyList = new ArrayList<>();

    public void verifyTheOrder(String criteria) {


        olsturulmaTarihleriStringListe = getElementsTexts(olusturulmaTarihiListesi);
        System.out.println("Liste Elemanları:");
        for (String item : olsturulmaTarihleriStringListe) {
            System.out.println(item);
        }

        int length = "Oluşturma tarihi : ".length();

        for (int i = 0; i < olsturulmaTarihleriStringListe.size(); i++) {

            dateOnlyList.add(olsturulmaTarihleriStringListe.get(i).substring(length).substring(0, 19));
        }

        System.out.println("Dates :");
        for (String item : dateOnlyList) {
            System.out.println(item);
        }

        if (criteria == "before"){
            if (isSortedAscendingBefore(dateOnlyList)) {
            System.out.println("Dates are in order, newest first.");
        } else {
            System.out.println("Dates are not in order.");
        }

        }else if (criteria=="after"){


            if (isSortedAscendingAfter(dateOnlyList)) {
                System.out.println("Dates are in order, oldest first.");
            } else {
                System.out.println("Dates are not in order.");
            }

        }


    }


    public static boolean isSortedAscendingAfter(List<String> dateOnlyList) {
        for (int i = 0; i < dateOnlyList.size() - 1; i++) {
            String date1String = dateOnlyList.get(i);
            String date2String = dateOnlyList.get(i + 1);

            LocalDateTime date1 = parseToLocalDateTime(date1String);
            LocalDateTime date2 = parseToLocalDateTime(date2String);

            if (date1.isAfter(date2)) {
                System.out.println("Hata: " + date1String + " > " + date2String);
                return false;
            }
        }
        return true;
    }


    public static boolean isSortedAscendingBefore(List<String> dateOnlyList) {
        for (int i = 0; i < dateOnlyList.size() - 1; i++) {
            String date1String = dateOnlyList.get(i);
            String date2String = dateOnlyList.get(i + 1);

            LocalDateTime date1 = parseToLocalDateTime(date1String);
            LocalDateTime date2 = parseToLocalDateTime(date2String);


            if (date1.isBefore(date2)) {
                System.out.println("Hata: " + date1String + " > " + date2String);
                return false;
            }
        }
        return true;
    }





    private static LocalDateTime parseToLocalDateTime(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return LocalDateTime.parse(dateString, formatter);
    }









}




