package com.tutorialsninja.pages.laptopsandnotebooks;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooks extends Utility {
 By productmacbook = By.xpath("//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]");
By clickcart = (By.xpath("//button[@id='button-cart']"));
By  shoppingcart = By.xpath("//div[@id='content']//h1");
By changeQty2 = (By.xpath("//input[contains(@name, 'quantity')]"));
By updateTab = (By.xpath("//button[contains(@data-original-title, 'Update')]"));
By clickCheckoutbutton = By.xpath("//a[contains(text(),'Checkout')]");
By guestButton = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");
By continueButton =By.xpath("//input[@id='button-account']");

    ArrayList<String> originalProductsPrice = new ArrayList<>();


    public void sortByPrise(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
    }
    public void reverseOrder(){
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }
    public void setProductMacbook(){
        clickOnElement(productmacbook);
    }
public void clickCartButton(){
clickOnElement(clickcart);
}
public void clickShoppingCart(){
        clickOnElement(shoppingcart);
}
public void setChangeQty2(){
        clickOnElement(changeQty2);
}
public void setUpdateTab(){
        clickOnElement(updateTab);
}
public void verifyClickOnCheckOutButton(){
        clickOnElement(clickCheckoutbutton);
}
public void clickOnGuestButton(){
        clickOnElement(guestButton);
    }
    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
    }