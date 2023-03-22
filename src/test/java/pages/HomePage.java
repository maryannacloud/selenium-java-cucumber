package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//li[@class='active'")
    WebElement welcomeMessage;

    public void verifyWelcomeMessageIsDisplayed() {
        Assert.assertTrue("Welcome message is not displayed", welcomeMessage.isDisplayed());
    }
}
