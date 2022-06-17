package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgnxLoginPage {

    public UpgnxLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInputBox;


    @FindBy(id = "password")
    public WebElement passwordInputBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

}
