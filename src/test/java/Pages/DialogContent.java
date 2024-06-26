package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//ms-text-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='control-full']/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priority;
    @FindBy(xpath = "//ms-save-button[2]")
    public WebElement saveAndclose;
    @FindBy(xpath = "//*[@id=\"mat-mdc-slide-toggle-11-label\"]")
    public WebElement spaceClick;
    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles' ]//input")
    public WebElement userType;
    @FindBy(xpath = "//span[@class=\"mat-option-text\"]")
    public WebElement studentClick;


    public void deleteItem(String deleteName) {
        mySendKeys(searchInput, deleteName);
        myClick(searchButton);

        //search butonun tıklanabilir olana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public Object getWebElement(String strElement) {

        switch (strElement) {
            case "addButton":
                return this.addButton;
            case "nameInput":
                return this.nameInput;
            case "codeInput":
                return this.codeInput;
            case "saveButton":
                return this.saveButton;
            case "shortName" :return this.shortName;
            case "integrationCode":return this.integrationCode;
            case "priority":return this.priority;
            case "saveAndclose":return this.saveAndclose;
            case "spaceClick":return this.spaceClick;
            case "studentClick":return this.studentClick;
            case "userType":return this.userType;



        }

        return null;

    }

}