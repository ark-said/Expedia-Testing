package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class ExpediaPages {

    public ExpediaPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Flights')]")
    public WebElement flightsButton;

    @FindBy(xpath = "//span[contains(text(), 'Roundtrip')]")
    public WebElement roundTripButton;

    @FindBy(xpath = "//input[@placeholder=\"Returning\"]")
    public WebElement roundTripReturningText;

    @FindBy(xpath = "//span[contains(text(), 'One-way')]")
    public WebElement oneWayButton;

    @FindBy(xpath = "(//div[@class='uitk-layout-flex-item uitk-layout-flex-item-flex-basis-zero uitk-layout-flex-item-flex-grow-1 uitk-date-field-wrapper'])[2]")
    public WebElement roundTripReturningButton;

    @FindBy(xpath = "//span[contains(text(), 'Multi-city')]")
    public WebElement multiCityButton;

   @FindBy (xpath = "//div[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan uitk-layout-grid-item-columnspan-small-1 uitk-layout-grid-item-columnspan-medium-12 uitk-type-right']")
    public WebElement addAnotherFlight;

   @FindBy (xpath =" //div[@data-testid='submit-button']")
   public WebElement searchButton;

    @FindBy (xpath ="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchButton2;

   @FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/h3")
    public WebElement errorWhenEmptyInfo;

@FindBy (xpath = "//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[1]/div/h3")
public WebElement ErrorWhenEmptyOneWay;

@FindBy (xpath = "//*[@id=\"wizard-flight-tab-multicity\"]/div[2]/div[1]/div/h3")
public WebElement errorWhenEmptyMultiWay;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[2]/button")
    public WebElement LeavingFromRoundTrip;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement LeavingFromRoundTripText;

@FindBy (xpath = "//*[@id=\"app-layer-origin-flight\"]/div[2]/div/div[2]/div[1]/ul/li[1]/button")
    public WebElement RoundTripIstanbulAllAirports;

@FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div")
    public WebElement RoundTripHalfEmptyError;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/div[2]/ul/li[6]/button")
    public WebElement RoundTripSearchForIstanbul;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[2]/button")
public WebElement OneWayLeavingFrom;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin\"]")
public WebElement OneWayLeavingFromText;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/div[2]/ul/li[6]/button/div/span")
public WebElement OneWayLeavingFromSearchForIstanbul;

@FindBy (xpath = "//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[1]/div")
    public WebElement OneWayHalfEmptyErrorMessage;

    @FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[2]/button")
    public WebElement MultiWayLeavingFrom;

    @FindBy (xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement MultiWayLeavingFromText;

    @FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/div[2]/ul/li[6]/button")
    public WebElement MultiWayLeavingFromSearchForIstanbul;

    @FindBy (xpath = "//*[@id=\"wizard-flight-tab-multicity\"]/div[2]/div[1]/div")
    public WebElement MultiWayLeavingHalfEmptyErrorMessage;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/button/div")
    public WebElement MainScreenSignInButton;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[2]/a")
    public WebElement SignInInsideTheSignIn;

    @FindBy (xpath = "//*[@id=\"loginFormEmailInput\"]")
    public WebElement SignInEmail;

@FindBy (xpath = "//*[@id=\"loginFormPasswordInput\"]")
    public WebElement SignInPassword;

@FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div/h3")
    public WebElement EmailAndPasswordDontMatchText;

@FindBy (xpath = "//*[@id=\"loginFormSubmitButton\"]")
    public WebElement SignInButtonInSignInScreen;

@FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[1]")
    public WebElement SignInMenu;

@FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[4]/a")
public WebElement SigninMenuFavorites;

    @FindBy (xpath = "//*[@id=\"uitk-tabs-container\"]/div/div[1]/div/div/div/div/div/div/div[1]")
    public WebElement AllSavedItems;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[5]/a")
    public WebElement SigninMenuExpediaRewards;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]")
    public WebElement ExpediaRewardsEarn;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[6]/a")
    public WebElement ExpediaSigninMenuFeedbackButton;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[3]/a")
    public WebElement ExpediaSigninMenuSignUp;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[7]/div/p")
    public WebElement ExpediaSignUpCreateAnAccountConditions;


    @FindBy (xpath = "//*[@id=\"headerFeedback\"]/div[5]/button/span[1]")
    public WebElement ExpediFeedBackExit;


    @FindBy (xpath = "//*[@id=\"signupFormEmailInput\"]")
    public WebElement SignupEmailBox;

    @FindBy (xpath = "//*[@id=\"signupFormFirstNameInput\"]")
    public WebElement SignupFirstNameBox;

    @FindBy (xpath = "//*[@id=\"signupFormLastNameInput\"]")
    public WebElement SignupLastNameBox;

    @FindBy (xpath = "//*[@id=\"signupFormPasswordInput\"]")
    public WebElement SignupPasswordBox;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[5]/div/div")
    public WebElement SignupKeepMeSignInBox;

    @FindBy (xpath = "//*[@id=\"signupFormEmailInput-error\"]")
    public WebElement SignupEmailBoxError;

    @FindBy (xpath = "//*[@id=\"signupFormFirstNameInput-error\"]")
    public WebElement SignupFirstNameBoxError;

    @FindBy (xpath = "//*[@id=\"signupFormLastNameInput-error\"]")
    public WebElement SignupLastNameBoxError;

    @FindBy (xpath = "//*[@id=\"signupFormPasswordInput-error\"]")
    public WebElement SignupPasswordBoxError;



    @FindBy (xpath = "//*[@id=\"signupFormEmailInput-error\"]")
    public WebElement SignupInvalidEmailError;


    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[5]/div/div[1]/div[1]")
    public WebElement SignupPasswordStrength;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[5]/div/div[1]/div[2]")
    public WebElement SignupPasswordWeak;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/ul/li[1]")
    public WebElement SignupPasswordWarningLessThanEight;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/ul/li[2]")
    public WebElement SignupPasswordWarningSymbol;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/ul/li[3]")
    public WebElement SignupPasswordWarningCombine;


    @FindBy(xpath = "//*[ text() = ‘Strong’ ]")
    public WebElement SignupPasswordStrong;

    @FindBy(xpath = "//*[ text() = ‘Very Strong’ ]")
    public WebElement SignupPasswordVeryStrong;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[9]/div/p/a[1]")
    public WebElement SignupPageTermsAndConditions;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[9]/div/p/a[2]")
    public WebElement SignupPagePrivacy;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[9]/div/p/a[3]")
    public WebElement SignupPageRewardTermsAndConditions;

    @FindBy(xpath = "//*[@id=\"editorial-1\"]/div/div/div/div/div/div/div/h5[1]")
    public WebElement WebsiteTermsConfirmObject;

    @FindBy(xpath = "//*[@id=\"editorial-1\"]/div/div/div/div/div/div/div/h2[1]")
    public WebElement PrivacyPageConfirmObject;

    @FindBy(xpath = "//*[@id=\"60668133\"]/div/h1")
    public WebElement RewardsTermsAndConditionsConfirmObject;

    @FindBy (xpath = "//*[@id=\"social-auth-provider-apple-web\"]/img")
    public WebElement SignupPageAppleLogin;

    @FindBy (xpath = "//*[@id=\"social-auth-provider-facebook-web\"]/img")
    public WebElement SignupPageFacebookLogin;

    @FindBy (xpath = "//*[@id=\"social-auth-provider-google-web\"]/img")
    public WebElement SignupPageGoogleLogin;

    @FindBy (xpath = "//h1[text()=’Use your Apple ID to sign in to Expedia.]")
    public WebElement SignupPageAppleLoginConfirm;

}
