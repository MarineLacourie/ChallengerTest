package com.example.challenger;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import static junit.framework.Assert.assertTrue;

public class FirstTest {

    public void testDriver() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.challenger.com.sg");
        assertTrue(driver.getTitle().contentEquals("Challenger Singapore"));
    }
}

//HOW DO I KNOW IT PASSED?