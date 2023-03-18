package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[text()=' Sign Up Here']")
    WebElement signUpHereLink;

    @FindBy(xpath = "//span[text()='Registration Successful. Please Login.']")
    WebElement confirmationMessage;

    public void verifyUserIsOnLoginPage(){
        Assert.assertTrue("user is not on the login page", signUpHereLink.isDisplayed());
    }

    public void clickOnSignUpHereLink(){
        signUpHereLink.click();
    }

    public void verifyUserAccountIsCreatedSuccessfully(){
        Assert.assertTrue("the account was not created", confirmationMessage.isDisplayed() );
    }

}
