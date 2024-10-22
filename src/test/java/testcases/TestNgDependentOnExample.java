package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependentOnExample {
    @Test()
    public void login(){
        Assert.assertTrue(false);

    }
    @Test(dependsOnMethods = "login")
    public void login2(){
        Assert.assertTrue(false);

    }


    @Test(dependsOnMethods = "login2")// this will run only if login test case passed
    public void verifyDashboard(){
        System.out.println("Dashboard is verified successfully");
    }




}
