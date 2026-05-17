package org.example.ex04_RS_TestNG_advance;

import org.testng.annotations.Test;

public class AP019_TestNG_InvoacationCount {
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }
}
