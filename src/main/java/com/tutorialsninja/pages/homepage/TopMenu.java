package com.tutorialsninja.pages.homepage;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenu extends Utility {
    By desktop = By.linkText("Desktops");
    By showAllDesktops = By.linkText("Show AllDesktops");
    By getDesktopTextWebelement = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopandnotebook = (By.linkText("Laptops & Notebooks"));
    By ShowAllLaptopsNotebooks = By.linkText("Show AllLaptops & Notebooks");

    By Components = (By.linkText("Components"));
    By ShowAllComponents = By.linkText("Show AllComponents");


    public void clickonDesktopTab() {
        clickOnElement(desktop);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public String getLaptopandNotebookText() {
        return getTextFromElement(getDesktopTextWebelement);

    }

    public void clickonLaptopsNotebooks() {
        clickOnElement(laptopandnotebook);
    }

    public void getlaptopandnotebook() {
        clickOnElement(ShowAllLaptopsNotebooks);
    }

    public void getcomponent() {
        clickOnElement(Components);

    }

    public void getcomonentelement() {
        clickOnElement(ShowAllComponents);
    }


}


