package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_SoftAssertDemo {

    @Test
    public void hardAssertExample(){
        /**
         * Hard Assert Example ( This is possible using the Assert Class)
         * If the Assertion fails, then the rest of the code wont get executed
         */
        //Verification 1
        Assert.assertTrue(4==3); //false --> this assertion should fail
        //Verification 2
        System.out.println("This line will not execute because previous assertion failed");
        Assert.assertTrue(6>5); //true --> this assertion should pass
    }

    @Test
    public void softAssertExample(){
        /**
         * Soft Assert example (Using SoftAssert class)
         */
        SoftAssert softAssert = new SoftAssert();


        softAssert.assertTrue(4==3 , "verifying 4 is equal to 3"); //false --> this assertion should fail
        //Verification 2
        System.out.println("This line will  execute even after previous assertion failed");
        softAssert.assertTrue(6>5 , "verifying 6 greater than 5"); //true --> this assertion should pass

        softAssert.assertEquals("PrimeTech", "Prime" , "verifying primetech is equal to prime"); //fail

        softAssert.assertAll();//This is very Important !!!! You need this line to aggregate all the assertion together and get what failed and what passed

    }


}
