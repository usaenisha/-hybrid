package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\biren\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\features\\login.feature",glue= {"stepdefinations"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports"}
)

public class Testrunner {  
	
}
	
	

 