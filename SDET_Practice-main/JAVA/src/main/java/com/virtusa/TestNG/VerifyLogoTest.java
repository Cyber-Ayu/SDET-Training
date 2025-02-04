package com.virtusa.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLogoTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set up the GeckoDriver for Firefox
        System.setProperty("webdriver.gecko.driver", "JAVA/src/main/driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void verifyLogoPresence() {
        try {
            // Verify that the logo is displayed on the homepage
            boolean isLogoDisplayed = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']")).isDisplayed();

            // Assert that the logo is displayed
            Assert.assertTrue(isLogoDisplayed, "Logo is not displayed on the MakeMyTrip homepage.");

            // Verify the logo's alt attribute for more validation
            String altText = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']")).getDomProperty("alt");
            Assert.assertNotNull(altText, "The alt attribute of the logo is missing.");
            Assert.assertTrue(altText.contains("MakeMyTrip"),
                    "The alt attribute of the logo does not contain the expected value.");

            // Verify the page title contains 'MakeMyTrip' to ensure correct page
            String pageTitle = driver.getTitle();
            Assert.assertTrue(pageTitle.contains("MakeMyTrip"), "Page title does not contain 'MakeMyTrip'.");

            // Optionally, verify the page URL to ensure we are on the correct website
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "https://www.makemytrip.com/",
                    "URL is incorrect, expected: https://www.makemytrip.com/");

        } catch (Exception e) {
            // If an exception occurs, the test will fail with the exception message
            Assert.fail("An exception occurred while verifying the logo: " + e.getMessage());
        }
    }

    @AfterMethod
    public void teardown() {
        // Close the browser after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
