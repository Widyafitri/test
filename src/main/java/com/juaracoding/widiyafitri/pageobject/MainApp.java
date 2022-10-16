package com.juaracoding.widiyafitri.pageobject;

import com.juaracoding.widiyafitri.pageobject.UjianMingguKetiga.MyAccount;
import com.juaracoding.widiyafitri.pageobject.drivers.DriverSingleton;
import com.juaracoding.widiyafitri.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        MyAccount regForm = new MyAccount();
        regForm.registerForm();

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driverOne = DriverSingleton.getDriver();
        driver.get(Constants.LOGURL);

        MyAccount logForm = new MyAccount();
        logForm.loginForm();

        MyAccount orderForm = new MyAccount();
        orderForm.orderForm();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
