package org.example.ex04_RS_TestNG_advance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AP018_TestNG_AlwaysRun {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }

}
