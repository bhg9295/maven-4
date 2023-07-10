package com.tutorialsninja.pages.desktops;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desktops extends Utility {
    By sortByZtoA = By.id("input-sort");
    By product = By.xpath("//a[contains(text(),'HP LP3065')]");
    By deliveryDate = By.xpath("By.xpath(//div[@class = 'input-group date']//button));");
    By enterQty1 =(By.name("quantity"));
    By addToCart = (By.xpath("//button[@id='button-cart']"));
    By successMessage = By.xpath("//a[contains(text(),'shopping cart')]");

    ArrayList<String> originalProductsName = new ArrayList<>();
    ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();

    public void selectSortByPositionZToA() {
        selectByVisibleTextFromDropDown(sortByZtoA, "Name (Z - A)");
    }

    public void selectSortByPositionAToZ() {
        selectByVisibleTextFromDropDown(sortByZtoA, "Name (A - Z)");
    }

    public void originalProductsName() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println("Product List before filter: " + originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println("Product List before filter in reverse alphabetical order" + originalProductsName);
    }

    public void afterSortByZToAProductsName() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println("Product List after filter: " + afterSortByZToAProductsName);
    }

    public void selectProduct() {
        clickOnElement(product);
    }


    public void selectDate() {
        String year = "2023";
        String month = "November";
        String date = "30";

        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
    }

    public void selectAllDate(){

        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(String.valueOf(deliveryDate))) {
                e.click();
                break;
            }
        }
    }
    public void setEnterqty(){
        clickOnElement(enterQty1);
    }

public void setAddToCart(){
        clickOnElement(addToCart);
}
public void successMessageDisplay(){
        clickOnElement(successMessage);
}



    }

















