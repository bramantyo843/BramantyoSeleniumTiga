package org.example.posttestdelapanbelas.pageobjek.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
