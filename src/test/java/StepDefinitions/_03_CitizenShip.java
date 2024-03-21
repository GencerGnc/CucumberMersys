package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

public class _03_CitizenShip  {
    LeftNav ln = new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create CitizenShip")
    public void createCitizenShip() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(8);//8 harf
        String citizenshipShortName = RandomStringUtils.randomAlphanumeric(4); // 4 rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortName, citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create CitizenShip name as {string} code as {string}")
    public void createCitizenShipNameAsCodeAs(String name, String surname) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.shortName, surname);
        dc.myClick(dc.saveButton);

    }

    @Then("Already message should be displayed")
    public void alreadyMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExist,"already exist");

    }


    @When("User delete as name as {string}")
    public void userDeleteAsNameAs(String deletename) {

        dc.deleteItem(deletename);
    }
}
