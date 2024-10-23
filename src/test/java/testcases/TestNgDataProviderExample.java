package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviderExample {

//Option 1

//    @DataProvider(name = "data-provider-example")
//    public String[] dataProvider(){
//        String [] abc = {"primetech","prime1234","abc1230","xyz123"};
//        return abc;
//    }


//    @Test(dataProvider = "data-provider-example") //you can use the name specified at the attribute level for the dataprovider
//    public void myTest(String username){
//        System.out.println(username);
//    }

//Option 2
    @DataProvider()
    public String[] dataProvider(){
        String [] abc = {"primetech","prime1234","abc1230","xyz123"};
        return abc;
    }

    @Test(dataProvider = "dataProvider") // you can use the method name of the dataprovider
    public void myTest(String username){
        System.out.println(username);
    }


}
