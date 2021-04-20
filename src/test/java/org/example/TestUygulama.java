package org.example;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestUygulama {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Selenium/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        assertEquals("https://www.gittigidiyor.com","https://www.gittigidiyor.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div")).click();

        driver.findElement(By.className("sc-12t95ss-3 fDarBX")).click();
    }

    }


