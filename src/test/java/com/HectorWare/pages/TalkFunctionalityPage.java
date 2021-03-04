package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkFunctionalityPage extends BasePage{
    public TalkFunctionalityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkButton_HP;

    @FindBy (xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchConversationBox_Left;

    @FindBy (xpath = "//a[@aria-label='Conversation, searchConversation_Left']")
    public WebElement selectedUserFromTextBox;

    @FindBy (xpath = "(//button[@aria-haspopup='true'])[1]")
    public WebElement FirstSelectedUserPopUp_Left;

    @FindBy (xpath = "(//*[@class='acli'])[1]")
    public WebElement FirstSelectedUserDirect_Left;

    @FindBy (xpath = "//*[text()='Add to favorites']")
    public WebElement AddToFavorites_Left;

    @FindBy (xpath = "//*[text()='Remove from favorites']")
    public WebElement RemoveFromFavorites_Left;

    @FindBy (xpath = "//*[text()='Leave conversation']")
    public WebElement LeaveConver_Left;

    @FindBy (xpath = "//span[@class='toast-close']")
    public WebElement LeaveConverPopUpClose_Right;

    @FindBy (xpath = "//*[text()='Delete conversation']")
    public WebElement DeleteConver_Left;

    @FindBy (xpath = "//*[text()='No']")
    public WebElement DeleteConverNo_Center;

    @FindBy (xpath = "//*[text()='Yes']")
    public WebElement DeleteConverYes_Center;

    @FindBy (xpath = "//*[contains(text(),'Start call')]")
    public WebElement StartCall_Right;

    @FindBy (xpath = "//*[contains(text(),'Leave call')]")
    public WebElement LeaveCall_Right;

    @FindBy (xpath = "//span[@class='toast-close']")
    public WebElement LeaveCallPopUpClose_Right;

    @FindBy (xpath = "//*[@aria-label='Mute audio']")
    public WebElement MuteMicrophone_Right;


    @FindBy (xpath = "//*[@id='hideVideo']")
    public WebElement CameraBtn_Right;


    @FindBy (xpath = "//*[@aria-label='Enable screensharing']")
    public WebElement ScreenShare_Right;

    @FindBy (xpath = "//*[@class='conversation-name']")
    public WebElement ConversationNameBox;

    @FindBy (xpath = "//button[contains(text(),'Add participants')]")
    public WebElement AddParticipant_Btn;

    @FindBy (xpath = "(//div[@class='avatar-wrapper'])[1]")
    public WebElement Participant1_Btn;

    @FindBy (xpath = "(//div[@class='avatar-wrapper'])[2]")
    public WebElement Participant2_Btn;

    @FindBy (xpath = "//button[contains(text(),'Create conversation')]")
    public WebElement Createconver_Btn;

    @FindBy (xpath = "//*[@class='toggle has-tooltip']")
    public WebElement CreateNewconver_Btn_Left;

    @FindBy (xpath = "//*[@close-after-click='true']")
    public WebElement ChatAfterCall_Btn;

    @FindBy (xpath = "//*[@class='atwho-wrap']")
    public WebElement ChatSendText_Box;

    @FindBy (xpath = "//button[@aria-controls='menu-qezin']")
    public WebElement AddFileAtac_Btn;

    @FindBy (xpath = "(//*[@class='material-design-icon__svg'])[4]")
    public WebElement Emoji_Btn;

    @FindBy (xpath = "(//button[@aria-label='Participant settings'])[1]")
    public WebElement Participant_Btn1_Right;

    @FindBy (xpath = "//span[@class='icon icon-favorite']")
    public WebElement StarIcon_Left;


    @FindBy (xpath = "(//button[@aria-label='Participant settings'])[2]")
    public WebElement Participant_Btn2_Right;

    @FindBy (xpath = "//span[text()='Promote to moderator']")
    public WebElement Promote_Btn_Right;


    @FindBy (xpath = "//p[text()='Demote from moderator']")
    public WebElement Demote_Btn_Right;

    @FindBy (xpath = "//span[text()='Remove participant']")
    public WebElement RemoveParticipant_Btn_Right;

    @FindBy (xpath = "//div[text()='You removed ']")
    public WebElement Remove_Txt;

    @FindBy (xpath = "//input[@placeholder='Add participants to the conversation']")
    public WebElement AddParticipant_Right;

    @FindBy (xpath = "//button[@rel='noreferrer noopener']")
    public WebElement ActivateParticipant_Right;

    @FindBy (xpath = "//span[@class='participant-row__user-name']")
    public WebElement AddedParticipant_Right;





















}
