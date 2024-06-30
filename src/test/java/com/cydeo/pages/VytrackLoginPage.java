package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

      public VytrackLoginPage(){
          PageFactory.initElements(Driver.getDriver(),this);
      }

      @FindBy(id = "prependedInput")
      public WebElement usernameInput;

      @FindBy(id = "prependedInput2")
      public WebElement passwordInput;

      @FindBy(id = "_submit")
      public WebElement loginBtn;


      public void login(){
            usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
            loginBtn.click();
      }

      public void login(String username,String password){
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
      }

      public void login(String userType){ //userType= "sales manager"

            userType= userType.replace(" ","_");
            usernameInput.sendKeys(ConfigurationReader.getProperty(userType+"_username"));
            passwordInput.sendKeys(ConfigurationReader.getProperty(userType+"_password"));
            loginBtn.click();
      }

}
