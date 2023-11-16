package com.bdd;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class MobileTest {
    @Test
    public void searchVideo() throws MalformedURLException {

        AppiumDriver<MobileElement> driver;
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();

        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel 3a");
        desiredCapabilities.setCapability("appium:platformVersion","12");
        desiredCapabilities.setCapability("appium:udid","emulator-5554");
        desiredCapabilities.setCapability("appium:appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
        desiredCapabilities.setCapability("appium:appPackage", "com.google.android.youtube");

        //Conexion
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Allow
        MobileElement allowButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        allowButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Lupa
        MobileElement searchButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //Escribir título de video
        MobileElement searchInput = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.youtube:id/search_edit_text\"]"));
        searchInput.sendKeys("Andrés Calamaro");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Enter
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        //Cerrar Driver
        //driver.quit();
    }
}