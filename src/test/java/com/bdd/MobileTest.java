package com.bdd;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

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

        /*Lupa
        MobileElement searchButton = driver.findElement(By.id("menu_search"));
        searchButton.click();

        //Escribir título de video
        MobileElement searchInput = driver.findElement(By.xpath("menu_search"));*/

    }
}