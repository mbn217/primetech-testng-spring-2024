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

    //--------------------------- Example 2-----------------

    @DataProvider(name = "data-provider-username-password")
    public Object[][] dataProvideForUserNameAndPassword(){
        Object[][] userNameAndPassword = {{"primetech","primepassword", 23}, { "prime2User" , "prime2pass" ,24}  };
        return userNameAndPassword;
    }



    @Test(dataProvider = "data-provider-username-password")
    public void loginUsingUserNameAndPassword(String username, String password , int age){
        System.out.println("Username is " +username);
        System.out.println("Password is " + password);
        System.out.println("age is " + age);

    }


    //--------------------------- Example 3 -----------------


    @DataProvider(name ="data-provider-calculator")
    public Object[][] dataProviderCalculator(){
        Object[][] number = { {3,3}  , { 4,5}  , { 6,8 } , {10,5}  };
        return number;
    }

    @Test(dataProvider = "data-provider-calculator")
    public void calculator(int number1, int number2){
        int total = number1 + number2;
        System.out.println("The total of adding " +number1 + " and " + number2 +" is " + total);

    }




}
