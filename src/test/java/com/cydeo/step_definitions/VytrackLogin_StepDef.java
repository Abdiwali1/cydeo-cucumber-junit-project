package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

        vytrackLoginPage.login();

    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

    }

}
