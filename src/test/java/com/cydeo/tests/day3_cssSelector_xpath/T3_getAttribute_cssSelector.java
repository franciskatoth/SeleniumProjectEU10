package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //   TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
      //  1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

      //  2- Go to:https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


      //  3- Verify “Log in” button text is as expected:
      //  Expected: Log In

       //   --> WebElement signInButton = driver.findElement(By.className("login-btn"));

        // LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
        // LOCATED USING CLASS ATTRIBUTE
        // tagName[attribute='value']
        // input[class='login-btn']
       // WebElement singInButton = driver.findElement(By.cssSelector(" input[class='login-btn']"));
        //WebElement singInButton = driver.findElement(By.cssSelector(" input[type='submit']"));

        WebElement singInButton = driver.findElement(By.cssSelector(" input[value='Log In']"));

        String signInButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = singInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(actualButtonText)){
            System.out.println("Log In button text verification PASSED!");
        }else {
            System.out.println("Log In button text verification FAILED!");
        }


      //  PS: Inspect and decide which locator you should be using to locate web
      //  elements.
          //      PS2: Pay attention to where to get the text of this button from
    }
}
