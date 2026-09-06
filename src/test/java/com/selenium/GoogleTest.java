package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void testGoogleTitle() {
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Verify the page title
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");

        // Close the browser
//        driver.quit();
    }
}
