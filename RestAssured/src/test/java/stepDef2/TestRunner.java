package stepDef2;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\chirag.bhargava\\eclipse-workspace\\RestAssured\\src\\test\\resources\\features\\responseAssertion.feature",
glue={"stepDef3"})
public class TestRunner extends ResponseAssSteps {

}

