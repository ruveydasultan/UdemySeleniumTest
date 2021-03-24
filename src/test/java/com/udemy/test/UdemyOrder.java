package com.udemy.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class UdemyOrder extends BaseTest {


    @Test
    public void UdemyTest(){

        HomePage homePage = new HomePage(webDriver);
        String s = "test";

        ResultPage resultPage = homePage.search(s);
        OrderPage orderPage = resultPage.goToOrder();

        orderPage.closePopUp();
        orderPage.addToBasket();

        Basket basket = orderPage.goToBasket();
        boolean isDisplayed = basket.coureseIsDisplayed();
        assertEquals(isDisplayed , true);



    }

}
//TODO PAGE OBJECT
/* BASE test
*HOME PAGE
* RESULT PAGE
* order page
* basket
 */
