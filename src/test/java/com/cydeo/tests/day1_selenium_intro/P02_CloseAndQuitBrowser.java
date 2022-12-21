package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuitBrowser {
    public static void main(String[] args) {

        //set up Chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //Navigate to a practice page that open new tab
        // this practice url will open and wait 3 seconds and open new tab
        driver.get("http://pratice.cydeo.com/open_new_tab");

        //wait 5 sec.

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //closing any current tab
      //  driver.close();

        // close all browser window opened by driver
        driver.quit();




    }
}
