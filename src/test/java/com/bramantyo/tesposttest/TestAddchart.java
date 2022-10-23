package com.bramantyo.tesposttest;

import org.example.posttestdelapanbelas.pageobjek.driver.DriverSingleton;
import org.example.posttestdelapanbelas.pageobjek.pages.AddWishlist;
import org.example.posttestdelapanbelas.pageobjek.utils.Contans;
import org.example.posttestdelapanbelas.pageobjek.pages.AddChart;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestAddchart {
    public static WebDriver driver;
    private AddChart addcharttest;

    private AddWishlist addwishlist;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Contans.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Contans.URL);
    }

    @BeforeMethod
    public void pageObject() {
        addcharttest = new AddChart();
        addwishlist = new AddWishlist();
        //recruitment = new Recruitment();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }


    @Test (priority = 1)
    public void testaddChartpage() throws Exception{
        delay(Contans.DETIK);
        // PreCondition

        addcharttest.searchByColor();
        addcharttest.searchandenter();

        //addcharttest.searchByColor("https://shop.demoqa.com/");
        //addcharttest.searchByColor("red");
        Assert.assertEquals(addcharttest.gettextadd(), "Showing all 10 results");

        //addcharttest.toString();
        delay(Contans.DETIK);
        // Step
        //recruitment.menuRecruitment();
        //Assert.assertEquals(recruitment.getTxtRecruitment(), "Recruitment");
        System.out.println("showing search Page");
    }

    @Test (priority = 2)
    public void testaddwishlispage() throws Exception{
        delay(Contans.DETIK);
        // PreCondition

        addwishlist.setklikproduk();
        //addcharttest.searchByColor();

        Assert.assertEquals(addwishlist.setGettextprodukone(), "BROWN POM POM EMBROIDERED GLADIATOR SANDALS");

        //addcharttest.toString();
        delay(Contans.DETIK);

          System.out.println("showing search Page");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
