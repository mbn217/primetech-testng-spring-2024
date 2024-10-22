package testcases;

import org.testng.annotations.Test;

public class TestNgPrioritiesExample {



    @Test(priority = 1)
    public void test2(){
        System.out.println("This is test 2");
    }
    @Test(priority = 2)
    public void abc(){
        System.out.println("This is test 3");
    }

    @Test(priority = 3)
    public void test1(){
        System.out.println("This is test 1");
    }

}
