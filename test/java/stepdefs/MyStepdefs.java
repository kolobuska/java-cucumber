package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepdefs {

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        System.out.println("user navigates to the app url");
    }
    
    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String firstName) throws Throwable {
        System.out.println(firstName);
    }

}
