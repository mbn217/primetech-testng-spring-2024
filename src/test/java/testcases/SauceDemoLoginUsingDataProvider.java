package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelUtility;


public class SauceDemoLoginUsingDataProvider {

    @Test(dataProvider = "data-provider-login")
    public void loginWithValidUserNameAndPassword(String username, String pass) throws InterruptedException {
        System.out.println("Im using username " + username + " and password " + pass);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        userName.sendKeys(username);
        password.sendKeys(pass);
        loginButton.click();
        Thread.sleep(4000);
        driver.quit();


    }


    @DataProvider(name = "data-provider-login")
    public Object[][] loginDataProvider(){
        ExcelUtility.getExcelInstance("dataset/data.xlsx","Sheet1");
        Object[][] myUsernamePassword = ExcelUtility.getDataSet();
        return myUsernamePassword;
    }






}
