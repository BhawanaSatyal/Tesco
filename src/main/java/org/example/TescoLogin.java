package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TescoLogin {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.tesco.com/groceries/en-GB/");

        driver.manage().window().maximize();
       //driver.findElement(By.linkText("Register")).click();
       // driver.findElement(By.xpath("//a[@id='utility-header-registration-link']/span[@class='styled__Text-sc-1xizymv-1 fvwfIX beans-link__text']")).click();
    }
}
