package com.virtusa.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeMyTripAutomationTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = launchBrowser("https://www.makemytrip.com/");
    }

    public static WebDriver launchBrowser(String url) {
        System.setProperty("webdriver.chrome.driver",
                "JAVA\\src\\main\\driver\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

    public static void interactWithElement(WebDriver driver, By locator, String action, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        if (action.equals("click")) {
            element.click();
        } else if (action.equals("sendKeys")) {
            element.sendKeys(text);
        }
    }

    public static void closeLoginPopup(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeButton);
            System.out.println("Login popup closed.");
        } catch (Exception e) {
            System.out.println("No login popup displayed or failed to close.");
        }
    }

    @Test
    public void testMakeMyTripAutomation() throws InterruptedException {
        // Close the login popup if it appears
        closeLoginPopup(driver);

        // Validate that the "Flights" option is displayed and clickable
        WebElement flightsTab = driver.findElement(By.xpath("//span[text()='Flights']"));
        Assert.assertTrue(flightsTab.isDisplayed(), "Flights tab is not displayed");
        Assert.assertTrue(flightsTab.isEnabled(), "Flights tab is not clickable");
        interactWithElement(driver, By.xpath("//span[text()='Flights']"), "click", null);

        // Validate that flight search options are displayed and clickable
        WebElement fromCityInput = driver.findElement(By.xpath("//input[@placeholder='From']"));
        WebElement toCityInput = driver.findElement(By.xpath("//input[@placeholder='To']"));
        Assert.assertTrue(fromCityInput.isDisplayed(), "From city input is not displayed");
        Assert.assertTrue(toCityInput.isDisplayed(), "To city input is not displayed");

        // Interact with the flight search form
        interactWithElement(driver, By.xpath("//input[@placeholder='From']"), "sendKeys", "Delhi");
        interactWithElement(driver, By.xpath("//input[@placeholder='To']"), "sendKeys", "Mumbai");

        // Validate that the "Delhi" and "Mumbai" are entered correctly
        Assert.assertEquals(fromCityInput.getDomProperty("value"), "Delhi", "From city is not entered correctly");
        Assert.assertEquals(toCityInput.getDomProperty("value"), "Mumbai", "To city is not entered correctly");

        // Verify if flight search options are now populated
        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
        Assert.assertTrue(searchButton.isDisplayed(), "Search button is not displayed");
        Assert.assertTrue(searchButton.isEnabled(), "Search button is not clickable");

        // Final assertion to check if everything is in place
        Assert.assertTrue(driver.getTitle().contains("MakeMyTrip"), "Page title does not contain 'MakeMyTrip'");

        System.out.println("Test Passed Successfully");
        Thread.sleep(2000); // Adding a small wait for demo purpose
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
