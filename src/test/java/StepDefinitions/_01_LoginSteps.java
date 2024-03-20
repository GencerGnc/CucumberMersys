package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {


    DialogContent dc=new DialogContent();

    @Given("Navigate to campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io/");

    }
    @When("Enter user name and password and click login button")
    public void enter_user_name_and_password_and_click_login_button() {
//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginBtn.click();
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
    }
    @Then("User should successfully")
    public void user_should_successfully() {
//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.textToBePresentInElement(dc.headText,"Internship"));
//
//        Assert.assertTrue(dc.headText.getText().equalsIgnoreCase("Internship"));

        dc.verifyContainsText(dc.headText,"Internship");

    }



}
