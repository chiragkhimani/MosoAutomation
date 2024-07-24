package com.automation.steps;

import com.automation.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LandingPageSteps {

    LandingPage landingPage = new LandingPage();

    @Given("user opens website")
    public void user_opens_website() {
        landingPage.openWebsite();
    }

    @Then("verify landing page has title {string}")
    public void verify_landing_page_has_title(String title) {
        System.out.println("Expected Title======>" + title);
        System.out.println("Actual Title======>" + landingPage.getPageTitle());
        Assert.assertTrue(landingPage.getPageTitle().equals(title));
    }
}
