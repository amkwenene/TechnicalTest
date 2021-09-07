package stepdefination;

import Utilities.BuildJsonFile;
import Utilities.RestInteractionPoint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;


public class ApiStepDef {
    BuildJsonFile buildJsonFile= new BuildJsonFile();
    RestInteractionPoint restInterctionPoint =new RestInteractionPoint();
    Response response;


    @Then("I Assert the response {string} {string}")
    public void iAssertTheResponse(String code, String city) {
        String responseCode = response.getBody().path("cod").toString();
        Assert.assertEquals(responseCode,code);
        String resultCity = response.getBody().path("name").toString();
        Assert.assertEquals(resultCity,city);
    }

    @Given("I get a request  {string} {string} {string}")
    public void iGetARequest(String endpoint, String city, String apikey) {
        String endPoint=endpoint+city+"&appid="+apikey;
        response = restInterctionPoint.get(endPoint);
        response.getBody().prettyPrint();
    }

    @Given("I get a request {string}  {string}")
    public void iGetARequest(String endpoint, String name) throws Exception {
        response = restInterctionPoint.post(endpoint,buildJsonFile.Json(name));
        response.prettyPrint();
        System.setProperty("PetId",response.body().path("id").toString());
    }

    @Then("I add a new pet and status available {string}")
    public void iAddANewPetAndStatusAvailable(String expectedResults) {
        String result = response.getBody().path("name").toString();
        Assert.assertEquals(result,expectedResults);
    }

    @Then("I Assert the response Negative {string} {string}")
    public void iAssertTheResponseNegative(String code, String city) {
        String responseCode = response.getBody().path("cod").toString();
        Assert.assertEquals(responseCode,code);
        String resultCity = response.getBody().path("message").toString();
        Assert.assertEquals(resultCity,city);
    }
}
