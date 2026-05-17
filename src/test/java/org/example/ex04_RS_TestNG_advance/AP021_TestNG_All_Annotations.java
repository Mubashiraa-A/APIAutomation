package org.example.ex04_RS_TestNG_advance;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AP021_TestNG_All_Annotations {
    @BeforeTest
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterTest
    void demo6(){
        System.out.println("AfterMethod");
    }
}
