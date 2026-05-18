package org.example.ex05_Test_AssertionOrValidation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AP023_TestNG_Assertion {



//    @Test
//    public void test_hardAssertExample() {
//        System.out.println("Start of the program");
//        Assert.assertEquals("pramod", "Pramod");
//        System.out.println("End of the program");
//    }


    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        System.out.println("End of program");
        softAssert.assertAll();
    }

}
