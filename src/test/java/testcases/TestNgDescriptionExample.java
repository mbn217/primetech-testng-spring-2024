package testcases;

import org.testng.annotations.Test;

public class TestNgDescriptionExample {

    @Test(priority = 1 , description = "Positive test case for the login scenario")
    public void test(){
        System.out.println("Dummy test");
    }
}
