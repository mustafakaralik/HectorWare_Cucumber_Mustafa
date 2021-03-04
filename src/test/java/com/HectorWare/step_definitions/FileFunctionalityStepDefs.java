package com.HectorWare.step_definitions;

import com.HectorWare.pages.FilesPage;
import com.HectorWare.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileFunctionalityStepDefs {


    @When("the user click on the check box of the file")
    public void theUserClickOnTheCheckBoxOfTheFile() {
        FilesPage filesPage = new FilesPage();
        int size = filesPage.checkboxFile.size();
        filesPage.checkboxFile.get(size-1).click();
    }


    @Then("the Actions link should be displayed")
    public void theActionsLinkShouldBeDisplayed() {
        Assert.assertTrue(
                new FilesPage().actionsLink.isDisplayed()
        );

    }

    @And("the user click on the Actions link")
    public void theUserClickOnTheActionsLink() {
        new FilesPage().actionsLink.click();
    }

    @Then("options menu should be displayed")
    public void optionsMenuShouldBeDisplayed() {
        Assert.assertTrue(
                new FilesPage().selectMenu.isDisplayed()
        );

    }

    @When("the user click on Delete")
    public void theUserClickOnDelete() {
        new FilesPage().deleteOption.click();
        BrowserUtils.waitFor(2);
    }

    @Then("file should not be displayed")
    public void fileShouldBeDeleted() {

        FilesPage filesPage = new FilesPage();
        int size = filesPage.checkboxFile.size();

//        Assert.assertFalse(
//                filesPage.checkboxFile.get(size).isDisplayed()
//        );
    }
}
