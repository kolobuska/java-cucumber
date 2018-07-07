package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;

public class MyStepdefs {

    HomePage homePage;
    WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","c:\\Docs\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    
    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String firstName){
       homePage.setFirstName(firstName);
    }

    @When("^user fills last name with value \"([^\"]*)\"$")
    public void userFillsFirstNameForValue(String lastName) {
        homePage.setLastName(lastName);
    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {
        Assert.assertTrue(false);
    }
}
