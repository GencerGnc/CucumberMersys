package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationality;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement fees;

    @FindBy(xpath = "//span[text()='Inventory']")
    public WebElement inventory;
    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    public WebElement inventorySetup;
    @FindBy(xpath = "(//span[text()='Item Categories'])[1]")
    public WebElement ItemCategories;

    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "setup" : return this.setup;
            case "parameters" : return this.parameters;
            case "countries" : return this.countries;
            case "citizenship" : return this.citizenship;
            case "nationality": return this.nationality;
            case "fees":return this.fees;
            case "inventory":return this.inventory;
            case "inventorySetup":return this.inventorySetup;
            case "ItemCategories":return this.ItemCategories;

        }

        return null;
    }


}
