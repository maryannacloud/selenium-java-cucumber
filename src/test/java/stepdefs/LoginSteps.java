package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("when user enters a valid {string} and valid {string}")
    public void when_user_enters_a_valid_and_valid(String username, String password) {
        loginPage.enterValidUserNameAndPassword(username, password);
    }

    @And("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        loginPage.clickSignInButton();
    }

    @Then("user is logged on")
    public void user_is_logged_on() {
        homePage.verifyWelcomeMessageIsDisplayed();
    }
}
