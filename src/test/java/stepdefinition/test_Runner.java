package stepdefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\balra\\eclipse-workspace\\CucumberLime\\src\\test\\resources\\features\\cucumber.feature", glue = {
		"stepdefinition" }, plugin = { "pretty", "junit:target/JunitReports/report.xml",
				"json:target/JSONRports/report.json", "html:target/HtmlReports" })




public class test_Runner {

}
