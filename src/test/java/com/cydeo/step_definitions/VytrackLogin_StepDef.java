package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VytrackLogin_StepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }


    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
//        vytrackLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
//        vytrackLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
//        vytrackLoginPage.loginBtn.click();

     //   vytrackLoginPage.login();
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertEquals("Title verification is failed!","Dashboard",Driver.getDriver().getTitle());
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));
    }


    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {

     vytrackLoginPage.login(userType);

    }


    @When("the user login with {string},{string}")
    public void theUserLoginWith(String username, String password) {
        vytrackLoginPage.login(username,password);

    }

    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {

        Assert.assertTrue("Title verification is failed!",Driver.getDriver().getTitle().equals("Login"));

    }


    @When("user enters the store manager information from the environment")
    public void userEntersTheStoreManagerInformationFromTheEnvironment() {
      vytrackLoginPage.envLogin();
    }
}


