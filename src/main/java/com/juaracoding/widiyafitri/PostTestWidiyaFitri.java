package com.juaracoding.widiyafitri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestWidiyaFitri {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        int detik = 1;


        String titleName = driver.getTitle();
        System.out.println(titleName);


        WebElement titleForm = driver.findElement(By.xpath("/html/body/div/h1"));
        System.out.println("Title Menu: " + titleForm.getText());

        delay(detik);
        driver.findElement(By.id("first-name")).sendKeys("Widiya");
        System.out.println("input first name");
        delay(detik);
        driver.findElement(By.id("last-name")).sendKeys("Fitri");
        System.out.println("input last name");
        delay(detik);
        driver.findElement(By.id("job-title")).sendKeys("SQA");
        System.out.println("input job title");
        driver.findElement(By.id("radio-button-2")).click();
        System.out.println("College Clicked");
        delay(detik);
        driver.findElement(By.id("checkbox-2")).click();
        System.out.println("Female Checklist");

        delay(detik);
        Select drpOptions = new Select (driver.findElement(By.id("select-menu")));
        drpOptions.selectByIndex(1);
        System.out.println("Select 0-1 years");

        //Date
        delay(detik);
        driver.findElement(By.id("datepicker")).sendKeys("14102022");
        System.out.println("input date");

       //submit

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("button submit clicked");


        delay(3);
        driver.quit();

    }

    static void delay(int detik) {
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}