package com.HectorWare.step_definitions;

import com.HectorWare.pages.TalkFunctionalityPage;
import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkFunctionalityStepDefs {

    @When("the user should  be able to enter talk functionality page")
    public void the_user_should_be_able_to_enter_talk_functionality_page() {
        new TalkFunctionalityPage().talkButton_HP.click();
    }


    @Then("page should be	{string} as title")
    public void pageShouldBeAsTitle(String expectedTitle) {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals (actualTitle,expectedTitle);
        BrowserUtils.waitFor(2);
    }

    @When("the user able to search any {string} in search box")
    public void theUserAbleToSearchAnyInSearchBox(String Employee) {
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().searchConversationBox_Left.sendKeys(Employee);
        BrowserUtils.waitFor(1);

    }

    @Then("the user is able to select user searched under list")
    public void theUserIsAbleToSelectUserSearchedUnderList() {
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().FirstSelectedUserDirect_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().StartCall_Right.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user should be able to Add and Remove from Favorites the users")
    public void theUserShouldBeAbleToAddAndRemoveFromFavoritesTheUsers() {

        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().FirstSelectedUserPopUp_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().AddToFavorites_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().RemoveFromFavorites_Left.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to Leave from conversation")
    public void theUserShouldBeAbleToLeaveFromConversation() {
        new TalkFunctionalityPage().LeaveConver_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().LeaveConverPopUpClose_Right.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user should be able to Delete conversation")
    public void theUserShouldBeAbleToDeleteConversation() {
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().FirstSelectedUserPopUp_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().DeleteConver_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().DeleteConverNo_Center.click();
        BrowserUtils.waitFor(2);
        //new TalkFunctionalityPage().DeleteConverYes_Center.click();

    }

    @And("the user should be able to create new group conversation")
    public void theUserShouldBeAbleToCreateNewGroupConversation() {
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().CreateNewconver_Btn_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().ConversationNameBox.sendKeys("Emloyee");
        new TalkFunctionalityPage().AddParticipant_Btn.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Participant1_Btn.click();
        new TalkFunctionalityPage().Participant2_Btn.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Createconver_Btn.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().StartCall_Right.click();
        BrowserUtils.waitFor(4);

    }

    @Then("the user is able to mute microphone")
    public void theUserIsAbleToMuteMicrophone() {
        BrowserUtils.waitFor(5);
        new TalkFunctionalityPage().MuteMicrophone_Right.click();
    }

    @Then("the user is able to open camera")
    public void theUserIsAbleToOpenCamera() {
        BrowserUtils.waitFor(3);
        new TalkFunctionalityPage().CameraBtn_Right.click();
    }

    @When("the user should be able to Add and Remove from right panel")
    public void theUserShouldBeAbleToAddAndRemoveFromRightPanel() {
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().CreateNewconver_Btn_Left.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().ConversationNameBox.sendKeys("Emloyee");
        new TalkFunctionalityPage().AddParticipant_Btn.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Createconver_Btn.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().AddParticipant_Right.sendKeys("Employee101");
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().AddedParticipant_Right.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().AddParticipant_Right.sendKeys("Employee102");
        new TalkFunctionalityPage().AddedParticipant_Right.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Participant_Btn2_Right.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().RemoveParticipant_Btn_Right.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to promote and demote participants from right panel")
    public void theUserShouldBeAbleToPromoteAndDemoteParticipantsFromRightPanel() {

        new TalkFunctionalityPage().Participant_Btn1_Right.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Promote_Btn_Right.click();
        BrowserUtils.waitFor(2);
        new TalkFunctionalityPage().Demote_Btn_Right.click();
        BrowserUtils.waitFor(2);
    }


}
