package com.HectorWare.step_definitions;

import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefs {

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        new LoginPage().loginWithValid();
        BrowserUtils.waitFor(2);
    }

    @When("the user should not be able to login with invalid credentials")
    public void the_user_should_not_be_able_to_login_with_invalid_credentials() {
        new LoginPage().loginWithInvalid("Mike","123456");
        BrowserUtils.waitFor(3);
    }

    @When("the user should not be able to login with invalid {string} valid {string}")
    public void the_user_should_not_be_able_to_login_with_invalid_valid(String username, String password) {
        new LoginPage().login("Mike", "Userpass123");
        BrowserUtils.waitFor(3);
    }

    @When("the user should not be able to login with valid {string} invalid {string}")
    public void the_user_should_not_be_able_to_login_with_valid_invalid(String string, String string2) {
       new LoginPage().login("User1", "123456");
       BrowserUtils.waitFor(3);
    }

    // with scenario outline
    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println(userInfo);
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
    }

    @Given("the user should not be able to login with blank {string}")
    public void the_user_should_not_be_able_to_login_with_blank(String inputBox) {
        switch (inputBox){
            case "username and password":
                new LoginPage().loginWithInvalid("","");
                BrowserUtils.waitFor(3);
                break;
            case "username":
                new LoginPage().loginWithInvalid("", "Userpass123");
                BrowserUtils.waitFor(3);
                break;
            case "password":
                new LoginPage().loginWithInvalid("User1", "");
                BrowserUtils.waitFor(3);
                break;
        }
    }

    @Then("Hectorware - QA page should be	Account {string} as title")
    public void hectorware_QA_page_should_be_Account_as_title(String expectedTitle){
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals (actualTitle,expectedTitle);
        BrowserUtils.waitFor(2);
        System.out.println("username : " + new LoginPage().getUserName());
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
       Assert.assertTrue(new LoginPage().warningMsg.isDisplayed());
        System.out.println("actual message : " + new LoginPage().warningMsg.getText());
        BrowserUtils.waitFor(3);
    }

    @Then("should not be blanked message should be displayed on {string} textBox")
    public void should_not_be_blanked_message_should_be_displayed_on_textBox(String inputBox) {
        switch (inputBox){
            case "username":
                String expectedMessage = "Please fill out this field.";
                String actualMessage = new LoginPage().usernameInput.getAttribute("validationMessage");
                System.out.println("actual message = " + actualMessage);
                Assert.assertEquals(expectedMessage,actualMessage);
                BrowserUtils.waitFor(3);
                break;

            case "password":
                expectedMessage = "Please fill out this field.";
                actualMessage = new LoginPage().passwordInput.getAttribute("validationMessage");
                System.out.println("actual message = " + actualMessage);
                Assert.assertEquals(expectedMessage,actualMessage);
                BrowserUtils.waitFor(3);
                break;
        }
    }
}
