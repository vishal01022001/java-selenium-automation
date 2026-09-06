package com.selenium.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class GoogleSteps {
    WebDriver driver;

    @Given("I open the Google homepage")
    public void i_open_google_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Given("Type Cars image")
    public void car_image() {
        driver = new ChromeDriver();
//        driver.findElement(By.xpath("//*[@id=\"ti6dpd\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ti6dpd\"]")).sendKeys("Cars Image");
        driver.findElement(By.xpath("//div[@jsname='gLFyf']//textarea")).sendKeys("Cars Image");
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
//        driver.quit();
    }

}
