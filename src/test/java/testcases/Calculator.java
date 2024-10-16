package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void calculatorTest(){
        System.out.println("Hey");
    }

    @Test
    public void test2(){
        System.out.println("Hello");
    }

    @Test
    public void loginWithValidCredentials(){
        /**
         * 1.	Navigate to the login page.
         * 2.	Enter a valid email address “entityadmin@primetechschool.com”.
         * 3.	Enter a valid password “primetech@school”.
         * 4.	Click on the Login button.
         * 5.	Verify the user is redirected to the dashboard.
         * 6.	Verify a success message is displayed.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("sauce demo url");
        WebElement username = driver.findElement(By.xpath("xpath"));
    }

}
