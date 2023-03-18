package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondSignUpPage extends BasePage{

    @FindBy(id = "address")
    WebElement addressInputField;
    @FindBy(id = "locality")
    WebElement localityInputField;
    @FindBy(id = "region")
    WebElement regionInputField;
    @FindBy(id = "postalCode")
    WebElement postalCodeInputField;
    @FindBy(id = "country")
    WebElement countryInputField;
    @FindBy(id = "homePhone")
    WebElement homePhoneInputField;
    @FindBy(id = "mobilePhone")
    WebElement mobilePhoneInputField;
    @FindBy(id = "workPhone")
    WebElement workPhoneInputField;
    @FindBy(id = "agree-terms")
    WebElement termsAndPolicyCheckBox;
    @FindBy(xpath = "//button[text()='Register']")
    WebElement registerButton;

    public void fillOutSecondSignUpPage() {
        addressInputField.sendKeys("3708 Pearl Street");
        localityInputField.sendKeys("Sacramento");
        regionInputField.sendKeys("CA");
        postalCodeInputField.sendKeys("95823");
        countryInputField.sendKeys("USA");
        homePhoneInputField.sendKeys("(916) 392-0425");
        mobilePhoneInputField.sendKeys("(920) 588-4521");
        workPhoneInputField.sendKeys("(916)528-9482");
        termsAndPolicyCheckBox.click();
        registerButton.click();
        }
}
