package com.cydeo.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {


    public static void waitInvisibilityOfElement(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
