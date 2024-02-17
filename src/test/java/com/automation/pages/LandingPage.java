package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    @FindBy(xpath = "//h1")
    WebElement pageTitle;

    public void openWebsite() {
        driver.get(ConfigReader.getProperty("application.url"));
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }
}
