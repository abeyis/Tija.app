
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target\\cucumber-reports.html", // raporlama icin ekledim
        "json:target\\json-reports\\cucumber.json", // bu satirla da json formatinda rapor yazar
        // bu raporlari devoloperlar kullanır
        "junit:target\\xml-report\\cucumber.xml" }, // bu satirla da xml formatinda rapor yazar
        features = "src/test/resources",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "MaskelemeUpdate")

public class Runner {
}
