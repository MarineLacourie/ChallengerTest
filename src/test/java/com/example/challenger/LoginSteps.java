package com.example.challenger;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import static junit.framework.Assert.assertTrue;
import cucumber.api.java.en.Given;

public class LoginSteps {


    @Given("I am on the homepage of the website")
    public void I_am_on_the_homepage_of_the_website() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.challenger.com.sg");
        assertTrue(driver.getTitle().contentEquals("Challenger Singapore"));
    }
}