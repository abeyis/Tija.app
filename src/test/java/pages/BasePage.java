package pages;

import org.openqa.selenium.By;
import utilities.TestUtils;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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
        TestUtils.waitForClickablility(element, 15).sendKeys(text);
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
<<<<<<< HEAD
     * <h2>Clicks on Buttons Common to Text</h2>
     * This method using for clicking to the web element.
     * <p>
     * <h4>Description Of Method :
     * <h4/>
     * It takes 'element' WebElement parameter.
     *
     * And click that.
     * <p>
     *
     * @param moduleName

     */

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
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='"+ buttonText + "']"));
        TestUtils.waitForClickablility(element, 15).click();
    }


}
