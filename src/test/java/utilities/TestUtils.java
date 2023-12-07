
package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

public class TestUtils {

    static Actions actions = new Actions(Driver.getDriver());
    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
    private static int timeout = 5;

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/raporlar/Screenshots/" + name + date + ".png";

        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);

        return target;
    }

    // ========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    // ========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    // ==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    // ========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        try {
            List<String> elemTexts = new ArrayList<>();
            List<WebElement> elems = wait.
                    until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            for (WebElement el : elems) {
                if (!el.getText().isEmpty()) {
                    elemTexts.add(el.getText());
                }
            }

            return elemTexts;
        } catch (StaleElementReferenceException e) {
            return getElementsText(locator);
        }
    }

    // ===============Thread.sleep Wait==============//
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // ===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    // ======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(timeinsec)).pollingEvery(Duration.ofSeconds(timeinsec))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    /**
     * Performs double click action on an element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     * Selects a random value from a dropdown list and returns the selected Web
     * Element
     *
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();

    }

    public static void waitAndClick(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndClick(WebElement element) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndSendText(WebElement element, String text, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    // Driver.waitANdSendText(Element , "TEXT");
    public static void waitAndSendText(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndSendTextWithDefaultTime(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static String waitAndGetText(WebElement element, int timeout) {
        String text = "";
        for (int i = 0; i < timeout; i++) {
            try {
                text = element.getText();
                return text;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
        return null;
    }

    // Webdriver
    // ChromeDriver
    // Iedriver
    // FirefoxDriver

    public static void wait2(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 5 seconds
    public static void waitAndClickElement(WebElement element, int seconds) {
        for (int i = 0; i < seconds; i++) {

            try {
                element.click();
                break;
            } catch (Exception e) {
                wait2(1);
            }

        }
    }

    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static Boolean waitForInVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }

    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        wait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }

    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param elements
     */

    public static void clickWithJSAsList(List<WebElement> elements) {
        for (WebElement each : elements) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
                    waitForVisibility(each, 5));
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", each);
        }
    }

    // Parameter1 : WebElement
    // Parameter2: String
    // Driver.selectByVisibleText(dropdown element, "CHECKING-91303-116.98$")
    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }

    // Parameter1 : WebElement
    // Parameter2: int
    // Driver.selectByIndex(dropdown element, 1)
    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }

    // Parameter1 : WebElement
    // Parameter2: String
    // Driver.selectByIndex(dropdown element, "91303")
    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }

    public static void sleep(int timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitAndClickLocationText(WebElement element, String value) {
        Driver.getDriver().findElement(By.xpath("//*[text()='" + value + "']")).click();
    }

    // HARD WAIT WITH THREAD.SLEEP
    // waitFor(5); => waits for 5 second
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Sayfayi asagi yukarı kaydirma methodu Kubra ekledi
    public static void scrollDownByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //    Scroll al the way up of a page
    public static void scrollAllUpByJS() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    public static boolean LeavesTitelchec(String data) {
        String[] expectedTitles = data.split(", ");
        List<WebElement> headersList = Driver.getDriver()
                .findElements(By.xpath("//table[@id='DataTables_Table_1']/thead"));
        List<String> actualTitles = new ArrayList<>();
        for (WebElement header : headersList) {
            actualTitles.add(header.getText());
            System.out.println(header.getText());
        }
        int count = 0;
        for (String expectedTitle : expectedTitles) {
            for (String actualTitle : actualTitles) {
                if (actualTitle.contains(expectedTitle)) {
                    count++;
                    break;
                }
            }
        }
        return count == expectedTitles.length;
    }

    public static WebElement DHRclickOnTheHeader(String header) {
        String dinamicXpath = "//*[text()='" + header + "']";
        WebElement searchedHeader = Driver.getDriver().findElement(By.xpath(dinamicXpath));
        return searchedHeader;
    }

    public static boolean drTitlecheck(String data) {
        // String data = "Overview, Medication, Prescription, Consultant Register, Lab
        // Investigation, Operation, Charges, Payment, Live Consultation, Nurse Notes,
        // Timeline, Treatment History, Bed History";
        String[] expectedTitles = data.split(", ");
        List<WebElement> headersList = Driver.getDriver().findElements(By.xpath("//*[@id='DataTables_Table_0']/thead"));
        List<String> actualTitles = new ArrayList<>();
        for (WebElement header : headersList) {
            actualTitles.add(header.getText());
            System.out.println(header.getText());
        }
        int count = 0;
        for (String expectedTitle : expectedTitles) {
            for (String actualTitle : actualTitles) {
                if (actualTitle.contains(expectedTitle)) {
                    count++;
                    break;
                }
            }
        }
        return count == expectedTitles.length;
    }

    public static boolean show(String data) {
        // String data = "Overview, Medication, Prescription, Consultant Register, Lab
        // Investigation, Operation, Charges, Payment, Live Consultation, Nurse Notes,
        // Timeline, Treatment History, Bed History";
        String[] expectedTitles = data.split(", ");
        List<WebElement> headersList = Driver.getDriver()
                .findElements(By.xpath("//ul[@class='nav nav-tabs navlistscroll']"));
        List<String> actualTitles = new ArrayList<>();
        for (WebElement header : headersList) {
            actualTitles.add(header.getText());
            System.out.println(header.getText());
        }
        int count = 0;
        for (String expectedTitle : expectedTitles) {
            for (String actualTitle : actualTitles) {
                if (actualTitle.contains(expectedTitle)) {
                    count++;
                    break;
                }
            }
        }
        return count == expectedTitles.length;
    }

    public static boolean StringListSortTest(int sutunNo, String xpathh) {
        WebElement baslik = Driver.getDriver().findElement(By.xpath(xpathh + "/thead/tr/th[" + sutunNo + "]"));
        baslik.click();
        TestUtils.bekle(3);
        List<WebElement> ActualList = Driver.getDriver()
                .findElements(By.xpath(xpathh + "/tbody/tr/td[" + sutunNo + "]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList) {
            ActualStringList.add(each.getText().toLowerCase().replaceAll("\\d", "").replace(".", " "));
        }
        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        System.out.println(ActualStringList);
        System.out.println(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;
    }


    public static void loginToGmail(String username, String password) {
        waitForClickablility(By.cssSelector("span.gb_Hd"), 15).click();
        waitForClickablility(By.name("identifier"), 15).sendKeys(username);
        waitForClickablility(By.xpath("//span[text()='Sonraki' or text()='Next']"), 15).click();
        waitForClickablility(By.name("Passwd"), 15).sendKeys(password);
        waitForClickablility(By.xpath("//span[text()='Sonraki' or text()='Next']"), 15).click();
    }


    public static String getOtp(String username, String password) {

        String originalWindow = Driver.getDriver().getWindowHandle();

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.google.com/?&hl=tr");

        loginToGmail(username,password);

        waitForClickablility(By.xpath("//a[text()='Gmail']"),15).click();
        waitForClickablility(By.xpath("//span[@class='zF' and @name='Tija']/ancestor::tr"),30).click();
        waitForPageToLoad(30);
        waitFor(3);
        List<String> elmTexts = getElementsText(By.xpath("//a[contains(@id,'clickCode')]//strong"));
        String otp = elmTexts.get(elmTexts.size()-1);

        Driver.getDriver().close();

        Driver.getDriver().switchTo().window(originalWindow);

        return otp;
    }

    public static List<String> getAttributeListFromListElement(List<WebElement> list, String attribute) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getAttribute(attribute));
        }
        return elemTexts;
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
            return false;
        }
    }

    public static void clickInCycle(WebElement el) {
        try {
            clickWithJS(el);
            if (el.isDisplayed())
                throw new RuntimeException();
        } catch (RuntimeException e) {
            clickInCycle(el);
        }
    }


    public static Boolean isElementPresent(By locator) {
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            return Driver.getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void clickWithMouse(WebElement elm) {
        actions.moveToElement(elm).click(elm).build().perform();
    }

    public static void selectFromComboBox(By by, String text) {
        WebElement comboBoxElement = Driver.getDriver().findElement(by);
        Select comboBox = new Select(comboBoxElement);
        comboBox.selectByVisibleText(text);
    }

    public static void selectFromComboBox(WebElement comboBoxElement, String text) {
        Select comboBox = new Select(comboBoxElement);
        comboBox.selectByVisibleText(text);
    }

    /**
     * Waits for element to be not stale
     *
     * @param element
     */
    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }

    public static By waitToBePresent(By by) {
        WebElement element = null;
        for (int i = 0; i < 10; i++) {
            try {
                element = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.presenceOfElementLocated(by));
                break;
            } catch (NoSuchElementException e) {
            }
        }
        return by;
    }

    public static By handleStaleElement(By by) {
        WebElement element = null;
        for (int i = 0; i < 10; i++) {
            try {
                element = Driver.getDriver().findElement(by);
                return by;
            } catch (StaleElementReferenceException e) {
                wait(1);
            }
        }
        throw new StaleElementReferenceException("Element is still stale after multiple attempts.");
    }


}
