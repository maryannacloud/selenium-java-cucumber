package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FirstSignUpPage extends BasePage {

    @FindBy(xpath = "//select[@id='title']")
    WebElement titleDropdown;
    @FindBy(id = "firstName")
    WebElement firstNameInputField;
    @FindBy(id = "lastName")
    WebElement lastNameInputField;
    @FindBy(xpath = "//input[@value='M']")
    WebElement maleOption;
    @FindBy(xpath = "//input[@value='F']")
    WebElement femaleOption;
    @FindBy(id = "dob")
    WebElement dobInputField;
    @FindBy(id = "ssn")
    WebElement ssnInputField;
    @FindBy(id = "emailAddress")
    WebElement emailInputField;
    @FindBy(id = "password")
    WebElement passwordInputField;
    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextButton;

    public void fillOutFirstSignUpPage (){
        new Select(titleDropdown).selectByVisibleText("Ms.");
        firstNameInputField.sendKeys("Meghan");
        lastNameInputField.sendKeys("Peterson");
        femaleOption.click();
        dobInputField.sendKeys("01/01/1990");
        ssnInputField.sendKeys(dataFaker.idNumber().ssnValid());
        emailInputField.sendKeys("meghan.peterson@gmail.com");
        passwordInputField.sendKeys("Lp%LyBP8DsRKE*jC");
        confirmPassword.sendKeys("Lp%LyBP8DsRKE*jC");
        nextButton.click();
    }

}
