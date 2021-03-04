package com.HectorWare.pages;

import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#user")
    public WebElement usernameInput;

    @FindBy (css = "#password")
    public WebElement passwordInput;

    @FindBy (css = "#submit-form")
    public WebElement loginBtn;

    @FindBy (css = ".warning")
    public WebElement warningMsg;

    @FindBy (css = "#lost-password")
    public WebElement forgetPassword;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        BrowserUtils.waitFor(3);
        loginBtn.click();
    }

    public void loginWithValid(){
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginWithInvalid(String username , String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}


