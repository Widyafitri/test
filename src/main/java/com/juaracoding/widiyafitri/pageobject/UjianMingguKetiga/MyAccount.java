package com.juaracoding.widiyafitri.pageobject.UjianMingguKetiga;

import com.juaracoding.widiyafitri.pageobject.drivers.DriverSingleton;
import com.juaracoding.widiyafitri.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.juaracoding.widiyafitri.pageobject.utils.Constants.LOGURL;

public class MyAccount {

    int detik = 3;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private static WebDriver driver;

    public MyAccount() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    //Register
    @FindBy(id = "reg_username")
    static
    WebElement username;

    @FindBy(id = "reg_email")
    static
    WebElement email;

    @FindBy(id = "reg_password")
    static
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    static
    WebElement btnRegister;

    //Login
    @FindBy(id = "user_login")
    static
    WebElement inputUsername;

    @FindBy(id = "user_pass")
    static
    WebElement inputPassword;

    @FindBy(id = "wp-submit")
    static
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/nav/ul/li[2]/a")
    WebElement order;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/div[2]/a")
    WebElement browseProducts;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
    WebElement chooseProduct;


            //page object
    public void registerForm(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        username.sendKeys("Suciha");
        email.sendKeys("suciha@gmail.com");
        password.sendKeys("$Itsmesuci27");
        js.executeScript("window.scrollBy(0,300)");
        js.executeScript("arguments[0].click();", btnRegister);


    }

    public void loginForm() {
        inputUsername.sendKeys("suciha@gmail.com");
        inputPassword.sendKeys("$Itsmesuci27");
        js.executeScript("arguments[0].click();", btnLogin);
    }

    public void orderForm() {
        delay(detik);
        js.executeScript("window.scrollBy(0,300)");
        order.click();
        js.executeScript("window.scrollBy(0,300)");
        delay(detik);
        browseProducts.click();
        chooseProduct.click();
        js.executeScript("window.scrollBy(0,300)");


        WebElement elementSelect = driver.findElement(By.id("pa_color"));
        Select colorOption = new Select(elementSelect);
        colorOption.selectByIndex(1);


    }

    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
