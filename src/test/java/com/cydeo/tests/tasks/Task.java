package com.cydeo.tests.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task {

    public static void main(String[] args) {


        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://todomvc.com/");

        //  WebElement JavaScriptTab = driver.findElement(By.xpath());
        List<WebElement> allLinks = driver.findElements(By.className("JavaScript"));


    }


}
