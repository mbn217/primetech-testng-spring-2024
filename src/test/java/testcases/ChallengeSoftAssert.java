package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
        Thread.sleep(1000);
        SoftAssert softAssert = new SoftAssert();
        //find actualBackPackLabel and assert it against the AC value
        String expectedBackpackLabel = "Sauce Labs";
        String actualBackPackLabel = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();

        softAssert.assertEquals(actualBackPackLabel , expectedBackpackLabel);

        //find actualBikeLightLabel and assert it against the AC value
        String expectedBikeLightLabel = "Sauce Labs Bike Light";
        String actualBikeLightLabel = driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']")).getText();

        softAssert.assertEquals(actualBikeLightLabel , expectedBikeLightLabel);

        driver.close();


        softAssert.assertAll();// put this line all the way at the end of your execution

    }

}
