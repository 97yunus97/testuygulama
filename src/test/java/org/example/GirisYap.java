package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class GirisYap {



    public static void Girisyap(){
        System.setProperty("webdriver.chrome.driver","C:/Selenium/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.manage().window().maximize();


        driver.findElement(By.id("L-UserNameField")).clear();
        driver.findElement(By.id("L-UserNameField")).sendKeys("ynsbllynsbll");
        driver.findElement(By.id("L-PasswordField")).clear();
        driver.findElement(By.id("L-PasswordField")).sendKeys("Yb427042-");
        driver.findElement(By.id("gg-login-enter")).click();
    }


}
