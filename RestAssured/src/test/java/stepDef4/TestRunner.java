package stepDef4;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\chirag.bhargava\\eclipse-workspace\\RestAssured\\src\\test\\resources\\features\\testNGReport.feature",
glue={"stepDef4"},
plugin= {"pretty","testng:target/testNG_Report/testng.html"},
monochrome = true)


public class TestRunner extends TestNGRep {

}
