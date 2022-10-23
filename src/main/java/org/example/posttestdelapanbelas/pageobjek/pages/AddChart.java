package org.example.posttestdelapanbelas.pageobjek.pages;

import org.example.posttestdelapanbelas.pageobjek.driver.DriverSingleton;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddChart {
    private WebDriver driver;

    public AddChart(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[@class='noo-search']")
    WebElement caribaju;

    @FindBy (xpath = "//input[@type='search']")
    WebElement tknenter;

    @FindBy (xpath = "//p[@class='woocommerce-result-count']")
    WebElement txtaddchart;


        public void searchByColor(){
        caribaju.click();


        //btnSearch.click();
    }

        public void searchandenter(){
            tknenter.sendKeys("Red");
            tknenter.sendKeys(Keys.ENTER);
        }

    public String gettextadd(){
        return txtaddchart.getText();
    }
}
