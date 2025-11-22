package SeleniumChatGpt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenSiteTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        // ChromeDriver'ı başlatıyoruz
        driver = new ChromeDriver();

        // Tarayıcıyı tam ekran açıyoruz
        driver.manage().window().maximize();
    }

    @Test
    public void openSiteAndVerifyTitle() {
        // the-internet.herokuapp.com sitesini açıyoruz
        driver.get("https://the-internet.herokuapp.com/");

        // Sayfanın başlığını alıyoruz
        String title = driver.getTitle();
        System.out.println("Site Title: " + title);

        // Title'ın beklenenle eşleşip eşleşmediğini kontrol ediyoruz
        Assert.assertEquals(title, "The Internet");
    }

    @AfterClass
    public void tearDown() {
        // Test sonunda tarayıcıyı kapatıyoruz
        if (driver != null) {
            driver.quit();
        }
    }
}
