package org.example.posttestdelapanbelas.pageobjek.driver;


import org.example.posttestdelapanbelas.pageobjek.driver.strategies.DriverStrategy;
import org.example.posttestdelapanbelas.pageobjek.driver.strategies.DriverStrategyImplemantor;

import org.example.posttestdelapanbelas.pageobjek.utils.Contans;



import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) {
        instantiate(driver);
    }

    public void instantiate(String strategy) {
        DriverStrategy driverStrategy = DriverStrategyImplemantor.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Contans.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static DriverSingleton getInstance(String driver) {
        if(instance == null) {
            instance = new DriverSingleton(driver);
        }

        return instance;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

}
