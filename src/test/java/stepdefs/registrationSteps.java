package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class registrationSteps {

    WebDriver driver;

    @Given("^I navigate to the site \"([^\"]*)\"$")

    public void i_navigate_to_the_site(String arg1) throws Throwable {
        System.setProperty("webdriver.gecko.driver","C:\\BlueskycitadelP\\Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.propertyrete.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter first Name \"([^\"]*)\"$")
    public void i_enter_first_Name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter last Name \"([^\"]*)\"$")
    public void i_enter_last_Name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter Email Address \"([^\"]*)\"$")
    public void i_enter_Email_Address(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter Valid Mobile Number \"([^\"]*)\"$")
    public void i_enter_Valid_Mobile_Number(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter Password \"([^\"]*)\"$")
    public void i_enter_Password(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I Confirm Password \"([^\"]*)\"$")
    public void i_Confirm_Password(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click valid the Captcha$")
    public void i_click_valid_the_Captcha() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on create account button$")
    public void i_click_on_create_account_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on activation account$")
    public void i_click_on_activation_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am registered$")
    public void i_am_registered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
