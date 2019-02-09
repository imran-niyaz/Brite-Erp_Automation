package com.briteErp.tests.point_Of_Sale.dashBoard;

import com.briteErp.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;
public class LoginTest extends TestBase {


    //open the application
    //enter login information

    @Test
    public void logintest(){
        // if we don't create a test
        extentLogger = report.createTest("Login Test");
        pages.loginpage.BriteErPDemo.click();
       // pages.loginpage.email.sendKeys(ConfigurationReader.getProperty("email"));
    }


    public void anOtherlogintest(){

        extentLogger = report.createTest("Login Test two");

      fail();
    }



}
