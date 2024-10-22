package testcases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterExample {


    @Test
    @Parameters({"aaa", "bbb"})
    public void demoTest(@Optional String firstname, @Optional String lastname){
        System.out.println(firstname);
        System.out.println(lastname);
    }


}
