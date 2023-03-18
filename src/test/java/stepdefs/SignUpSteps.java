package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DBQueriesPage;
import pages.FirstSignUpPage;
import pages.LoginPage;
import pages.SecondSignUpPage;
import utilities.DBUtils;

public class SignUpSteps {

    FirstSignUpPage firstSignUpPage = new FirstSignUpPage ();
    SecondSignUpPage secondSignUpPage = new SecondSignUpPage();
    LoginPage loginPage = new LoginPage();
    DBQueriesPage dbQueriesPage = new DBQueriesPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.verifyUserIsOnLoginPage();
    }

    @When("user clicks on sign up here link")
    public void user_clicks_on_sign_up_here_link() {
        loginPage.clickOnSignUpHereLink();
    }

    @When("user fills out the first registration page")
    public void user_fills_out_the_first_registration_page() {
        firstSignUpPage.fillOutFirstSignUpPage();
    }

    @When("user fills out the second registration page")
    public void user_fills_out_the_second_registration_page() {
        secondSignUpPage.fillOutSecondSignUpPage();
    }

    @Then("the user account is created successfully")
    public void the_user_account_is_created_successfully() {
        loginPage.verifyUserAccountIsCreatedSuccessfully();
    }

    @Then("the {string} is created in the database")
    public void the_user_record_is_created_in_the_database(String userRecord) {
        dbQueriesPage.verifyUserRecordIsCreatedInDB(userRecord);
    }
}
