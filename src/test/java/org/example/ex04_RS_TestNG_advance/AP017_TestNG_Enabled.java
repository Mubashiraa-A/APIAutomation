package org.example.ex04_RS_TestNG_advance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AP017_TestNG_Enabled {
    @Test
    public void test01() {
        Assert.assertTrue(false);
    }
    @Test(enabled = false)
    public void test02() {
        Assert.assertTrue(true);
    }
    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}
