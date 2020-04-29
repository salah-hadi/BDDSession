package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\automation\\eclipse workspace\\BDD-session\\src\\main\\resources\\"
		,glue={"stepDefination"}
		)
public class testRunner {

}
