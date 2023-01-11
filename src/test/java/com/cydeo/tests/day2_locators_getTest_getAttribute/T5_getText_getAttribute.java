package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {


      //  TC #5: getText() and getAttribute() method practice
      //  1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2- Go to: https://practice.cydeo.com/registration_form
        driver.get(" https://practice.cydeo.com/registration_form");

      //  3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

      //  Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText(); // Wil return "Registration form" as String

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text Verification PASSED!");
        }else {
            System.out.println("Header text Verification FAILED!");
        }


      //  4- Locate “First name” input box
        //we are locating web element using "name" locator
        // name attribute has "firstname" value
        // name attribute has
       // WebElement firsNameInput = driver.findElement(By.name("firstname"));
        WebElement firsNameInput = driver.findElement(By.className("form-control"));


      //  5- Verify placeholder attribute’s value is as expected:
      //  Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firsNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else {
            System.out.println("Placeholder text verification FAILED!");
            driver.close();
        }
    }
}
