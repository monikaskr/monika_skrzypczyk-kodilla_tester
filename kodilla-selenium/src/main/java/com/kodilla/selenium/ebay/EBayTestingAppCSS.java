package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingAppCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.navigate().to("http://www.ebay.com");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();

        WebElement searchInput = driver.findElement(By.className("gh-tb"));
        searchInput.sendKeys("trousers");
    }
}
