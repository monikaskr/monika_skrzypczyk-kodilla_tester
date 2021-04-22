package pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
    WebDriver driver;

    @BeforeEach
    public void testSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\Kodilla\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"zV9nZe\"]/div")).click();
    }

    //@AfterEach
    //public void tearDown() {
    //    driver.close();
    //}

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
}
