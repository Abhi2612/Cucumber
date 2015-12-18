package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by abhishek on 10/12/15.
 */
public class MyStepdefs
{
       private WebDriver driver;

    {
        driver = new FirefoxDriver();

    }
    @Given("^Navigate to www\\.redbus\\.com$")
        public void navigate_to_www_redbus_com ()throws Throwable

       {
           driver.get("https://www.redbus.in");

       }

        @When("^User clicks on Signup/SignIN button$")
        public void user_clicks_on_Signup_SignIN_button ()throws Throwable
        {
            driver.findElement(By.id("signInLink")).click();

        }

        @When("^User Cliks on SignUp button$")
        public void user_Cliks_on_SignUp_button ()throws Throwable

        {
            driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
            driver.findElement(By.xpath(".//*[@id='signInView']/div[2]/div/div[3]/button")).click();
        }
    @And("^User Enter Username and Password$")
    public void userEnterUsernameAndPassword() throws Throwable
    {
        Thread.sleep(200);
        driver.findElement(By.xpath(".//*[@id='emailID']")).sendKeys("abhisheksharma2091@gmail.com");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div[1]/div[3]/input")).sendKeys("Abhi2012");
        driver.findElement(By.xpath(".//*[@id='createAccountLink']")).click();

    }


    @And("^User Clicks on SignUp button$")
    public void userClicksOnSignUpButton() throws Throwable
    {
        System.out.println("Step Implemented");
    }

    @And("^User Enters Mobile Number$")
    public void userEntersMobileNumber() throws Throwable
    {

        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[5]/div/div[4]/input")).sendKeys("9003291152");
        driver.findElement(By.xpath(".//*[@id='sendOTP']")).click();
    }

    @Then("^User should successfully SignedUp$")
    public void userShouldSuccessfullySignedUp() throws Throwable
    {

        System.out.println("Successful");
    }


}