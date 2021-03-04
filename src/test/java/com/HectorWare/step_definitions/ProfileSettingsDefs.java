package com.HectorWare.step_definitions;

import com.HectorWare.pages.ProfileSettingsPage;
import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class ProfileSettingsDefs {

    ProfileSettingsPage profileSettingsPage=new ProfileSettingsPage();

    @When("the user is able click the profile icon or picture button at the top right")
    public void the_user_is_able_click_the_profile_icon_or_picture_button_at_the_top_right() {
        BrowserUtils.waitFor(3);
        profileSettingsPage.profileIcon.click();

    }
    @When("the user is able to click the Settings button under the profile icon or picture button")
    public void the_user_is_able_to_click_the_Settings_button_under_the_profile_icon_or_picture_button() {
        BrowserUtils.waitFor(3);
       profileSettingsPage.settingsButton.click();
    }

    @Then("the user is able to see the profile settings page")
    public void the_user_is_able_to_see_the_profile_settings_page() {
        BrowserUtils.waitFor(2);
        String expectedTitle="Settings - Hectorware - QA";
        String actualTitle = Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals (actualTitle,expectedTitle);

    }
    @When("the user is able to write or assign following full name to this text box")
    public void the_user_is_able_to_write_or_assign_following_full_name_to_this_text_box(Map<String,String> FullName ) {
        BrowserUtils.waitFor(1);
        profileSettingsPage.fullName.clear();
        BrowserUtils.waitFor(1);
        profileSettingsPage.fullName.sendKeys(FullName.get("Full Name"));
        BrowserUtils.waitFor(1);
        String actualName = profileSettingsPage.fullName.getAttribute("value");
        String expectedName = FullName.get("Full Name");

            Assert.assertEquals(expectedName,actualName);
            System.out.println("expectedName = " + expectedName);
            System.out.println("actualName = " + actualName);
        }


    @When("the user is able to write or assign following email address to this text box")
    public void the_user_is_able_to_write_or_assign_following_email_address_to_this_text_box(Map<String,String> Email ) {
        BrowserUtils.waitFor(1);
        profileSettingsPage.email.clear();
        BrowserUtils.waitFor(1);
        profileSettingsPage.email.sendKeys(Email.get("Email"));
        BrowserUtils.waitFor(1);
        String actualEmail = profileSettingsPage.email.getAttribute("value");
        String expectedEmail = Email.get("Email");

        Assert.assertEquals(expectedEmail,actualEmail);
        System.out.println("expectedName = " + expectedEmail);
        System.out.println("actualName = " + actualEmail);
    }


}
