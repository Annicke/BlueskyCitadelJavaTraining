package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forsaleSteps {

        WebDriver driver;

    @When("^I click on for sale link$")
    public void i_click_on_for_sale_link() throws Throwable {
       driver.findElement(By.xpath("//a[@class='link ph1 f6 f7-m Google-sans-bold white-90 ttu cursor tracked'][contains(text(),'for sale')]")).click();
    }

    @When("^I select Property Category \"([^\"]*)\"$")
    public void i_select_Property_Category(String arg1) throws Throwable {
        driver.findElement(By.xpath(" //select[@name='category']")).click();

    }

    @When("^I select Property Type \"([^\"]*)\"$")
    public void i_select_Property_Type(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^enter a Property Name \"([^\"]*)\"$")
    public void enter_a_Property_Name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select a Number of bedroom \"([^\"]*)\"$")
    public void i_select_a_Number_of_bedroom(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select Min Price \"([^\"]*)\"$")
    public void i_select_Min_Price(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select Max Price \"([^\"]*)\"$")
    public void i_select_Max_Price(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click Search button$")
    public void i_click_Search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I find the property$")
    public void i_find_the_property() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
