package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", 
		strict = true,
		tags = {""}, 
		glue = {"steps"}, 
		snippets = SnippetType.CAMELCASE,
		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports" })

public class RunnerTest {

}


