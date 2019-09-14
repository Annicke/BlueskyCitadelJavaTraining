package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

        WebDriver driver;

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {

        System.setProperty("webdriver.gecko.driver","C:\\BlueskycitadelP\\Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.propertyrete.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@class='white ml2 bw0 f6-ns f7 fw3 bg-sec br1 pv2-5-ns pv2-5 ph3 ttu tracked outline-0 bw0 link']")).click();
    }

    @When("^I enter my email address \"([^\"]*)\"$")
    public void i_enter_my_email_address(String arg1) throws Throwable {
       driver.findElement(By.id("user_email")).sendKeys("prop@myautomation.33mail.com");
    }

    @When("^I enter my Password \"([^\"]*)\"$")
    public void i_enter_my_Password(String arg1) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("12345hs");
    }

    @When("^I click on Sign In button$")
    public void i_click_on_Sign_In_button() throws Throwable {
        driver.findElement(By.id("btn_signin")).click();
    }

    @Then("^I am signed in$")
    public void i_am_signed_in() throws Throwable {
        Assert.assertEquals(driver.findElement(By.id("")).getText(),"");
    }

}
