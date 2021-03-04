package com.HectorWare.pages;

import com.HectorWare.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSettingsPage extends  BasePage {

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']/img")
    public WebElement profileIcon;

    @FindBy (xpath = "//li[@data-id='settings']/a")
    public WebElement settingsButton;

    @FindBy (css = "#displayname")
    public WebElement fullName;

    @FindBy (css = "#email")
    public WebElement email;

    public String getFullName(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(fullName, 5);
        return fullName.getText();
    }
}
