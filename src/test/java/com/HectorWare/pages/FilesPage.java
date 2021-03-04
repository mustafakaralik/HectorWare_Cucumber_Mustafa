package com.HectorWare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(xpath = "//label[starts-with(@for,'select-files')]")
    public List<WebElement> checkboxFile;

    @FindBy (css = "a.actions-selected")
    public WebElement actionsLink;

    @FindBy (xpath = "//div[contains(@class,'filesSelectMenu')]")
    public WebElement selectMenu;

    @FindBy (xpath = "//span[text()='Delete']")
    public WebElement deleteOption;

}
