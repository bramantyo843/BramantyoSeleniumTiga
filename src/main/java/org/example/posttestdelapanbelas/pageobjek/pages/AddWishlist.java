package org.example.posttestdelapanbelas.pageobjek.pages;

import org.example.posttestdelapanbelas.pageobjek.driver.DriverSingleton;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishlist {

    private WebDriver driver;

    public AddWishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/h3/a")
    WebElement klikproduk;

    @FindBy (xpath = "//h1[@class='product_title entry-title']")
    WebElement gettextprodukone;

    public void setklikproduk() {
        klikproduk.click();

    }

    public String setGettextprodukone(){
        return gettextprodukone.getText();

    }
}


