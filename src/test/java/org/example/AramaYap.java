package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AramaYap {

    public static void Aramayap(){

        System.setProperty("webdriver.chrome.driver","C:/Selenium/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        driver.manage().window().maximize();



         driver.findElement(By.xpath("//input[@name='k']")).clear();
         driver.findElement(By.xpath("//input[@name='k']")).sendKeys("Bilgisayar");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         //driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a")).click();
         //2. Sayfaya tıklama kısmını gerçekleştiremedim. Bu nedenle 1. sayfadan ürün seçtim.
         driver.findElement(By.id("item-info-block-630946783")).click();
         driver.findElement(By.xpath("//button[@class='control-button gg-ui-button plr10 gg-ui-btn-default']")).click();
         //sepete ekle butonuna tıklayamadım.
    }


}
