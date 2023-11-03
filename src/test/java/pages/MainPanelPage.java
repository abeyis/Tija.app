package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPanelPage extends BasePage {
    public MainPanelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

 }


