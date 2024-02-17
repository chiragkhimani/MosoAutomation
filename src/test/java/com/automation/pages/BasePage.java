package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver = DriverManager.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isPresent(WebElement element){
        try{
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
