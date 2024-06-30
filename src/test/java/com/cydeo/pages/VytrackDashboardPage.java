package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VytrackDashboardPage {

     public VytrackDashboardPage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

     @FindBy(css="li.dropdown.dropdown-level-1")
     public List<WebElement> allModules;


}
