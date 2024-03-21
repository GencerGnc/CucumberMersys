package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create country")
    public void createAccounter() {

        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8);//8 harf ver
        String ulkeKod= RandomStringUtils.randomNumeric(4);//4 rakam ver
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);
        dc.mySendKeys(dc.codeInput,ulkeKod);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }
}
