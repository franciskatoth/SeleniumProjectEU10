package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {
    public static void main(String[] args) throws InterruptedException {

      //  Practice: Checkboxes


      //  1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");


        // We have to locate checkBoxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));


      //  2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected(), expecting False = " + checkbox1.isSelected());

        //   3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting True = " + checkbox2.isSelected());

        //   4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();


     //   5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();



     //   6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected(), expecting True = " + checkbox1.isSelected());

        // OR YOU CAN DO IT LIKE THIS
        if (checkbox1.isSelected()){
            System.out.println("Verification PASSED!");
        }else {
            System.out.println("Verification FAILED!");
        }




        //   7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected(), expecting False = " + checkbox2.isSelected());

        // OR YOU CAN DO IT LIKE THIS
        if (!checkbox2.isSelected()){
            System.out.println("Verification PASSED!");
        }else {
            System.out.println("Verification FAILED!");
        }

    }
}
