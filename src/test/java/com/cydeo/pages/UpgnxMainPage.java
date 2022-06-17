package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgnxMainPage extends UpgnxLoginPage {

    public UpgnxMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']")
    public WebElement loginVerification;

    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement calendar;

    @FindBy(className = "o_loading")
    public WebElement loadingAlert;


}
