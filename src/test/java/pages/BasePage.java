package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.FindBy;
import utilities.TestUtils;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    /**
     * <h2>Click To Web Element</h2>
     * This method using for clicking to the web element.
     * <p>
     * <h4>Description Of Method :
     * <h4/>
     * It takes 'element' WebElement parameter.
     * <p>
     * Then waits to element clickable within 15 seconds.
     * <p>
     * And click that.
     * <p>
     * 
     * @param element
     * @author Charlie Alpha
     */
    protected static void click(WebElement element) {
        TestUtils.waitForClickablility(element, 15).click();
    }

    /**
     * <h2>Type Text To Web Element</h2>
     * This method using for type text to the web element.
     * <p>
     * <h4>Description Of Method :
     * <h4/>
     * It takes 'element' WebElement and 'text' String parameters.
     * <p>
     * Then waits to element clickable within 15 seconds.
     * <p>
     * And sends the text to the element.
     * <p>
     * 
     * @param element
     * @author Charlie Alpha
     */


    protected static void type(WebElement element, String text) {
        try{
            TestUtils.waitForClickablility(element, 15).sendKeys(text);
        }catch (ElementNotInteractableException e){
            type(element,text);
        }
    }

    /**
     * <h2>Get The Element Text
     * <h2/>
     * <h4>Description Of Method :
     * <h4/>
     * The method for reading element's text/value.
     * <p>
     * Takes 'element' Web Element parameter to define the web element
     * <p>
     * Then checks the text value and title properties
     * 
     * @param element
     */
    protected String getElementText(WebElement element) {
        TestUtils.waitForVisibility(element, 15);
        return !element.getText().isEmpty() ? element.getText()
                : !element.getAttribute("innerText").isEmpty() ? element.getAttribute("innerText")
                        : !element.getAttribute("value").isEmpty() ? element.getAttribute("value")
                                : !element.getAttribute("title").isEmpty() ? element.getAttribute("value") : "";
    }

    /**
     * <h2>Get Elements Texts
     * <h2/>
     * 
     * <h4>Description Of Method :
     * <h4/>
     * This method returns web elements' texts
     * Taking 'elements' parameter to define the elements
     * <p>
     * Then calls getElementText method in stream
     * <p>
     * And collects the each texts to List
     * 
     * @param elements List of Web Elements
     */

    protected List<String> getElementsTexts(List<WebElement> elements) {
        return elements.stream()
                .map(element -> getElementText(element))
                .collect(Collectors.toList());
    }

    /**
     * <h2>Click Button in the Main Panel
     * <h2/>
     *
     * <h4>Description Of Method :
     * <h4/>
     * This method clicks the button
     * taking 'visible button text' parameter
     * <p>
     *
     * @param buttonText Text of the Button
     */
    public void clickPanelButton(String buttonText) {
        WebElement btn = Driver.getDriver().findElement(By.xpath("//*[text()='"+buttonText+"']"));
//        TestUtils.clickWithMouse(btn);
        click(btn);
    }


    public static void verifyPopUpIsDisplayed(String message){
        TestUtils.waitForPageToLoad(10);
        TestUtils.wait(1);
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[starts-with(@aria-label, '"+ message +"')]"));
        Assert.assertTrue(element.isDisplayed());
        TestUtils.waitForInVisibility(By.xpath("//div[starts-with(@aria-label, '"+ message +"')]"),5);
    }

    public static void clickKaydetButton(){
        WebElement btn = Driver.getDriver().findElement(By.xpath("//button[contains(text(), 'Kaydet')]"));
        //TestUtils.clickWithMouse(btn);
        click(btn);
    }

}