package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running. . .");

        // ASSORT EQUALS: compare 2 of the same things
        String  actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 2)
    public void test2 (){
        System.out.println("Test 2 is running. . .");

        // ASSORT True
        String  actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here!");
    }

    @BeforeClass    // ---> Runs first before other test. Just one time!
    public void setupMethod(){
        System.out.println("---> BeforeClass is running!");
    }


    @AfterClass     // ---> Runs after all the test. Just one time!
    public void tearDownClass(){
        System.out.println("---> AfterClass is running!");
    }

    @BeforeMethod      // ---> Runs before every single method that you have
    public  void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod   // ---> Runs after every single method that you have
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }


}
