package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[text()=' Sign Up Here']")
    WebElement signUpHereLink;
    @FindBy(xpath = "//span[text()='Registration Successful. Please Login.']")
    WebElement confirmationMessage;
    @FindBy (id = "username")
    WebElement usernameInputField;
    @FindBy (id = "password")
    WebElement passwordInputField;
    @FindBy(id = "submit")
    WebElement signInButton;

    public void verifyUserIsOnLoginPage(){
        Assert.assertTrue("user is not on the login page", signUpHereLink.isDisplayed());
    }

    public void clickOnSignUpHereLink(){
        signUpHereLink.click();
    }

    public void verifyUserAccountIsCreatedSuccessfully(){
        Assert.assertTrue("the account was not created", confirmationMessage.isDisplayed());
    }

    public void enterValidUserNameAndPassword(String username, String password){
        usernameInputField.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInputField.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSignInButton() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
    }

}
