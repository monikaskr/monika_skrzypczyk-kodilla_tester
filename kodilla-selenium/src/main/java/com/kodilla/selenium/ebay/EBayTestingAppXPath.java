package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EBayTestingAppXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();

        WebElement categoryCombo = driver.findElement(
                By.xpath("//*[@id=\"gh-cat\"]"));

        Select yearSelect = new Select(categoryCombo);
        yearSelect = new Select(categoryCombo);
        yearSelect.selectByIndex(3);
    }
}
