package com.compAssignment.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/main/driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");

        try {
            if (driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']")).isDisplayed()) {
                System.out.println("Logo is present.");
            } else {
                System.out.println("Logo is not present.");
            }
        } catch (Exception e) {
            System.out.println("Logo is not present: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
