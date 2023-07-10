package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.myaccounts.MyAccounts;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    MyAccounts account = new MyAccounts();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        account.clickMyAcount();
        account.clickOnRegister();
        String actualRegister = "Register Account";
        String expectedRegister = getTextFromElement(By.xpath("//h1[contains(text(),'Register Account')]"));
        Assert.assertEquals(actualRegister, expectedRegister, "Register page Dispaly");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        account.clickMyAcount();
        account.clickOnLogin();
        String actualReturning = "Returning Customer";
        String expectedReturning = getTextFromElement(By.xpath("//h2[contains(text(),'Returning Customer')]"));
        Assert.assertEquals(actualReturning, expectedReturning, "Returning is not Display");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        account.clickMyAcount();
        account.clickOnRegister();
        account.enterFirstname();
        account.enterLastName();
        account.enteremail();
        account.enterTelephone();
        account.enterPassword();
        account.enterConformPassword();
        account.clickRadioButton();
        account.selectPrivacyButton();
        String actualverifyMessage = "Your Account Has Been Created!";
        String expectedVerifyMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
        Assert.assertEquals(actualverifyMessage, expectedVerifyMessage, "Your Account Has Been Created");
        account.clickOnContinueButton();
        account.setClickonElement();
        String actualMessage = "Account Logout";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMessage, "Account LogOut");
        account.setClickcontinueButton();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        account.clickMyAcount();
        account.clickOnLogin();
        account.clickEmailAddress();
        account.clickpassword();
        account.clickOnLoginButton();
        account.clickOnMyAccount();
        String actualMessage = "Account Logout";
        String expectedMesage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMesage, "Not logged out");
        account.clickonLogOut();
        account.setClickCheckout();

    }
}
