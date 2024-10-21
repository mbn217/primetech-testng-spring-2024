package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChallengeSoftAssert {

    /**
     * Go to sauce Labs
     * Login
     * Verify that {Sauce Labs Backpack}  equal to {Sauce Labs}    --> Should fail
     * Verify that {Sauce Labs Bike Light}  equal {Sauce Labs Bike Light}  --> Should pass
     *
     * -- Use Soft Assert
     */

    @Test
    void verifyLabelsInMainPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);

        //find actualBackPackLabel and assert it against the AC value
        String expectedBackpackLabel = "Sauce Labs";
        //driver.find

        //find actualBikeLightLabel and assert it against the AC value
        String expectedBikeLightLabel = "Sauce Labs Bike Light";
        //driver.find


    }

}
