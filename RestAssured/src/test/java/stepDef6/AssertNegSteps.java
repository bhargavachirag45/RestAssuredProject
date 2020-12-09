package stepDef6;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class AssertNegSteps {
Response response;
	
	@Test
	@Given("API foreign exchange")
	public void api_foreign_exchange() {
	   RestAssured.baseURI="https://api.ratesapi.io";
	}

	@Test
	@When("posted with correct Information")
	public void posted_with_correct_Information() {
	   response=RestAssured.get("/api");
	}

	@Test
	@Then("validate response status code received")
	public void validate_response_status_code_received() {
	   
		int Statcode=response.getStatusCode();
	   Assert.assertEquals(Statcode,400);
	   
	   String txt=response.getStatusLine();
	   Assert.assertTrue(txt.contains("Bad Request"));
	}

}

