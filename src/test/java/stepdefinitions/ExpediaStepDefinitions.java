package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ExpediaPages;
import utilities.ConfigReader;
import utilities.Driver;

public class ExpediaStepDefinitions {

    ExpediaPages expediaPages= new ExpediaPages();

    @Given("The user opens the Expedia website")
    public void the_user_opens_the_expedia_website() {
        Driver.getDriver().get(ConfigReader.getProperty("expediaurl"));
    }
    @And("The user sees Expedia's home page is visible")
    public void theUserSeesExpediaSHomePageIsVisible() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://www.expedia.com/"));
    }
    @Given("The user clicks on the flights")
    public void the_user_clicks_on_the_flights() {
        expediaPages.flightsButton.click();

    }
    @Given("The user clicks on the Roundtrip")
    public void the_user_clicks_on_the_roundtrip() {
    expediaPages.roundTripButton.click();
    }
    @Then("The user verifies that returning text appears")
    public void the_user_verifies_that_returning_text_appears() {
        expediaPages.roundTripReturningText.isDisplayed();
    }


    @And("The user clicks on the One-way")
    public void theUserClicksOnTheOneWay() {
expediaPages.oneWayButton.click();
    }

    @Then("The user verifies that returning text does not appears")
    public void theUserVerifiesThatReturningTextDoesNotAppears() {

        Assert.assertFalse(expediaPages.roundTripReturningButton.isDisplayed());
    }

    @And("The user clicks on the Multi-city")
    public void theUserClicksOnTheMultiCity() {
        expediaPages.multiCityButton.click();
    }

    @Then("The user confirms that there is a {string} button")
    public void theUserConfirmsThatThereIsAButton(String arg0) {


    }

    @Then("The user confirms that there is a Add Another Flight button")
    public void theUserConfirmsThatThereIsAAddAnotherFlightButton() {
       expediaPages.addAnotherFlight.isDisplayed();
    }

    @And("The user clicks on the Search button")
    public void theUserClicksOnTheSearchButton() {
        expediaPages.searchButton2.click();
    }

    @Then("The user checks if the error message is for the Round Trip displayed")
    public void theUserChecksIfTheErrorMessageIsDisplayedForRoundTrip() {
    expediaPages.errorWhenEmptyInfo.isDisplayed();
    }

    @Then("The user checks if the error message is displayed for the one way trip")
    public void theUserChecksIfTheErrorMessageIsDisplayedForTheOneWayTrip() {
        expediaPages.ErrorWhenEmptyOneWay.isDisplayed();
    }

    @Then("The user checks if the error message is displayed for the multi way trip")
    public void theUserChecksIfTheErrorMessageIsDisplayedForTheMultiWayTrip() {
        expediaPages.errorWhenEmptyMultiWay.isDisplayed();
    }

    @And("The user adds a leaving flight for Roundtrip")
    public void theUserAddsALeavingFlightForRoundtrip() {
        expediaPages.LeavingFromRoundTripText.sendKeys("Istanbul");
        expediaPages.RoundTripSearchForIstanbul.click();

    }

    @And("The user clicks on the Roundtrip leaving from")
    public void theUserClicksOnTheRoundtripLeavingFrom() {
        expediaPages.LeavingFromRoundTrip.click();
    }

    @Then("The user checks if the error message is for the Round Trip displayed when the boxes are half empty")
    public void theUserChecksIfTheErrorMessageIsForTheRoundTripDisplayedWhenTheBoxesAreHalfEmpty() {
        expediaPages.RoundTripHalfEmptyError.isDisplayed();
    }
    @Given("The user clicks on the One-way leaving from")
    public void the_user_clicks_on_the_one_way_leaving_from() {
    expediaPages.OneWayLeavingFrom.click();
    }
    @Given("The user adds a leaving flight for Oneway")
    public void the_user_adds_a_leaving_flight_for_oneway() {
        expediaPages.OneWayLeavingFromText.sendKeys("Istanbul");
        expediaPages.OneWayLeavingFromSearchForIstanbul.click();

    }
    @Then("The user checks if the error message is displayed for the one way trip when boxes are half empty")
    public void the_user_checks_if_the_error_message_is_displayed_for_the_one_way_trip_when_boxes_are_half_empty() {
expediaPages.OneWayHalfEmptyErrorMessage.isDisplayed();
    }

    @Then("The user clicks on the Multiway leaving from")
    public void the_user_clicks_on_the_multiway_leaving_from() {
    expediaPages.MultiWayLeavingFrom.click();
    }
    @Then("The user adds a leaving flight for MultiWay")
    public void the_user_adds_a_leaving_flight_for_multi_way() {
        expediaPages.MultiWayLeavingFromText.sendKeys("Istanbul");
        expediaPages.MultiWayLeavingFromSearchForIstanbul.click();
    }
    @Then("The user checks if the error message is displayed for the multi way trip when it is half empty")
    public void the_user_checks_if_the_error_message_is_displayed_for_the_multi_way_trip_when_it_is_half_empty() {
       expediaPages.MultiWayLeavingHalfEmptyErrorMessage.isDisplayed();
    }

    @Given("The user clicks on the Sign In button")
    public void the_user_clicks_on_the_sign_ın_button() {
       expediaPages.MainScreenSignInButton.click();

    }
    @Given("The user cliks on the Sign In button in the Sign In options menu")
    public void the_user_cliks_on_the_sign_ın_button_in_the_sign_ın_options_menu() {
       expediaPages.SignInInsideTheSignIn.click();
    }
    @Given("The user writes an email and a password")
    public void the_user_writes_an_email_and_a_password() {
        expediaPages.SignInEmail.sendKeys("randommailtest@gmail.com");
        expediaPages.SignInPassword.sendKeys("12345");
    }
    @Given("The user clicks on the Sign In button in the Sign In")
    public void the_user_clicks_on_the_sign_ın_button_in_the_sign_ın() {

        expediaPages.SignInButtonInSignInScreen.click();
    }
    @Given("The user checks if the error message for no match is displayed")
    public void the_user_checks_if_the_error_message_for_no_match_is_displayed() {
expediaPages.EmailAndPasswordDontMatchText.isDisplayed();
    }

    @And("The user checks if the user in the sign in menu")
    public void theUserChecksIfTheUserInTheSignInMenu() {
  expediaPages.SignInMenu.isDisplayed();
    }

    @Given("The user clicks on the list of favorites")
    public void the_user_clicks_on_the_list_of_favorites() {
   expediaPages.SigninMenuFavorites.click();
    }
    @Given("The user checks if there is a heart icon")
    public void the_user_checks_if_there_is_a_heart_icon() {
        expediaPages.AllSavedItems.isDisplayed();
    }
}
