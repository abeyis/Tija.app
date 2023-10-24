
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

    /*
     * String getScreenshot(String name) 68.satır
     * void switchToWindow(String targetTitle) 87.satir
     * void hover(WebElement element) 100.satir
     * List<String> getElementsText(List<WebElement> list) 107.satir
     * List<String> getElementsText(By locator) 119. satir
     * void waitFor(int sec) 132.satir
     * WebElement waitForVisibility(WebElement element, int timeToWaitInSec) 142.
     * satir
     * WebElement waitForVisibility(WebElement element, int timeToWaitInSec)
     * 148.satir
     * void waitForPageToLoad(long timeOutInSeconds) 166.satir
     * WebElement fluentWait(final WebElement webElement, int timeinsec) 184.satir
     * void doubleClick(WebElement element) 193.satir
     * void selectCheckBox(WebElement element, boolean check) 212.satir
     * WebElement selectRandomTextFromDropdown(Select select) 220.satir
     * void waitAndClick(WebElement element, int timeout) 232.satir
     * void waitAndClick(WebElement element) 244.satir
     * void waitAndSendText(WebElement element, String text, int timeout) 257.satir
     * void waitAndSendText(WebElement element, String text) 269.satir
     * void waitAndSendTextWithDefaultTime(WebElement element, String text)
     * 281.satir
     * String waitAndGetText(WebElement element, int timeout) 300.satir
     * void wait2(int sec) 319.satir
     * void waitAndClickElement(WebElement element, int seconds) 333.satir
     * void wait(int secs) 351.satir
     * WebElement waitForVisibility(By locator, int timeout) 356.satir
     * Boolean waitForInVisibility(By locator, int timeout) 361.satir
     * WebElement waitForClickablility(WebElement element, int timeout) 366.satir
     * WebElement waitForClickablility(By locator, int timeout) 372.satir
     * void executeJScommand(WebElement element, String command) 378.satir
     * void selectAnItemFromDropdown(WebElement item, String selectableItem)
     * 396.satir
     * void clickWithJS(WebElement element) 407.satir
     * void clickWithJSAsList(List<WebElement> elements) 418.satir
     * void selectByVisibleText(WebElement element, String text) 427.satir
     * void selectByIndex(WebElement element, int index) 436.satir
     * void selectByValue(WebElement element, String value) 444.satir
     * void sleep(int timeOut) 453.satir
     * void waitAndClickLocationText(WebElement element, String value) 459.satir
     * 
     * 
     * 
     * 
     */

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
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
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
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    // ======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(15))
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

    // Sayfayi asagi kaydirma methodu Kubra ekledi
    public static void scrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
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


    public static void loginToGmail(String username,String password){
        waitForClickablility(By.cssSelector("span.gb_Hd"),15).click();
        waitForClickablility(By.name("identifier"),15).sendKeys(username);
        waitForClickablility(By.xpath("//span[text()='Sonraki' or text()='Next']"),15).click();
        waitForClickablility(By.name("Passwd"),15).sendKeys(password);
        waitForClickablility(By.xpath("//span[text()='Sonraki' or text()='Next']"),15).click();
    }


    public static String getOtp(String username,String password){

        String originalWindow = Driver.getDriver().getWindowHandle();

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.google.com/");

        loginToGmail(username,password);

        waitForClickablility(By.xpath("//a[text()='Gmail']"),15).click();
        waitForClickablility(By.xpath("(//span[@name='Tija'])[2]"),30).click();

        waitForPageToLoad(30);

        List<String> elmTexts = getElementsText(By.xpath("//a[contains(@id,'clickCode')]//strong"));
        String otp = elmTexts.get(elmTexts.size()-1);

        Driver.getDriver().close();

        Driver.getDriver().switchTo().window(originalWindow);

        return otp;
    }

}
