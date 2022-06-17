package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpgnxCalendarPage extends UpgnxMainPage{

    public UpgnxCalendarPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekButton;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//tr[@data-time='14:00:00']")
    public WebElement timeBox;

    @FindBy(xpath = "//h4")
    public WebElement createBox;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement inputCreateBox;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createButton;

    @FindAll({
            @FindBy(xpath = "//div[@class='o_field_name o_field_type_char']")
    })
    public List<WebElement> events;

    @FindBy(xpath = "//a[@style='inset: 450.5px 0% -532.5px; z-index: 1;']")
    public WebElement eventBox;

    @FindBy(xpath = "//h4")
    public WebElement eventBoxTitle;

    @FindBy(xpath = "//span[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//h1/input[@placeholder]")
    public WebElement meetingSubjectInbox;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_field_name o_field_type_char']")
    public WebElement nameOfEvent;






    public void userGoesToTheLoginPage(){

        Driver.getDriver().get("https://qa.upgenix.net/web/login");

        emailInputBox.sendKeys("posmanager15@info.com");
        passwordInputBox.sendKeys("posmanager" + Keys.ENTER);

        WaitUtils.waitInvisibilityOfElement(loadingAlert);

        calendar.click();
    }


}
