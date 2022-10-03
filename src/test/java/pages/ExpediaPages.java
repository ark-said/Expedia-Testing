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

   @FindBy (xpath = "//button[normalize-space()='Add another flight']")
    public WebElement addAnotherFlight;



   @FindBy (xpath =" //div[@data-testid='submit-button']")
   public WebElement searchButton;

    @FindBy (xpath ="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchButton2;

   @FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/h3")
    public WebElement errorWhenEmptyInfo;

@FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
public WebElement ErrorWhenEmptyOneWay;

@FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
public WebElement errorWhenEmptyMultiWay;

@FindBy (xpath = "//button[@aria-label='Leaving from']")
    public WebElement LeavingFromRoundTrip;

@FindBy (xpath = "//input[@id='location-field-leg1-origin']")
    public WebElement LeavingFromRoundTripText;

@FindBy (xpath = "//*[@id=\"app-layer-origin-flight\"]/div[2]/div/div[2]/div[1]/ul/li[1]/button")
    public WebElement RoundTripIstanbulAllAirports;

@FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
    public WebElement RoundTripHalfEmptyError;

@FindBy (xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/div[2]/ul/li[6]/button")
    public WebElement RoundTripSearchForIstanbul;

@FindBy (xpath = "//button[@aria-label='Leaving from']")
public WebElement OneWayLeavingFrom;

@FindBy (xpath = "//input[@id='location-field-leg1-origin']")
public WebElement OneWayLeavingFromText;

@FindBy (xpath = "//span[contains(text(),'Search for “Istanbul”')]")
public WebElement OneWayLeavingFromSearchForIstanbul;

@FindBy (xpath = "//div[@class='uitk-error-summary']")
    public WebElement OneWayHalfEmptyErrorMessage;

    @FindBy (xpath = "//div[@id='location-field-leg1-origin-menu']//button[@aria-label='Leaving from']")
    public WebElement MultiWayLeavingFrom;

    @FindBy (xpath = "//input[@id='location-field-leg1-origin']")
    public WebElement MultiWayLeavingFromText;

    @FindBy (xpath = "//span[contains(text(),'Search for “Istanbul”')]")
    public WebElement MultiWayLeavingFromSearchForIstanbul;

    @FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
    public WebElement MultiWayLeavingHalfEmptyErrorMessage;

    @FindBy (xpath = "//div[contains(text(),'Sign in')]")
    public WebElement MainScreenSignInButton;

    @FindBy (xpath = "//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")
    public WebElement SignInInsideTheSignIn;

    @FindBy (xpath = "//input[@id='loginFormEmailInput']")
    public WebElement SignInEmail;

    @FindBy (xpath = "//input[@id='loginFormPasswordInput']")
    public WebElement SignInPassword;

    @FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
    public WebElement EmailAndPasswordDontMatchText;

    @FindBy (xpath = "//button[@id='loginFormSubmitButton']")
    public WebElement SignInButtonInSignInScreen;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/div/div/div[1]")
    public WebElement SignInMenu;

    @FindBy (xpath = "//button[@id='loginFormSubmitButton']")
    public WebElement SigninMenuFavorites;

    @FindBy (xpath = "//span[normalize-space()='All Saved Items']")
    public WebElement AllSavedItems;

    @FindBy (xpath = "//div[contains(text(),'Expedia Rewards')]")
    public WebElement SigninMenuExpediaRewards;

    @FindBy (xpath = "//p[contains(text(),'Collect points on eligible bookings and gain acces')]")
    public WebElement ExpediaRewardsEarn;

    @FindBy (xpath = "//div[contains(text(),'Feedback')]")
    public WebElement ExpediaSigninMenuFeedbackButton;

    @FindBy (xpath = "//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-tertiary']")
    public WebElement ExpediaSigninMenuSignUp;

    @FindBy (xpath = "//h1[@class='uitk-heading uitk-heading-3 uitk-flex-item']")
    public WebElement ExpediaSignUpCreateAnAccountConditions;


    @FindBy (xpath = "//*[@id=\"headerFeedback\"]/div[5]/button/span[1]")
    public WebElement ExpediFeedBackExit;

    @FindBy (xpath = "//input[@id='signupFormEmailInput']")
    public WebElement SignupEmailBox;

    @FindBy (xpath = "//input[@id='signupFormFirstNameInput']")
    public WebElement SignupFirstNameBox;

    @FindBy (xpath = "//input[@id='signupFormLastNameInput']")
    public WebElement SignupLastNameBox;

    @FindBy (xpath = "//input[@id='signupFormPasswordInput']")
    public WebElement SignupPasswordBox;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div/main/form/div[2]/div[5]/div/div")
    public WebElement SignupKeepMeSignInBox;

    @FindBy (xpath = "//div[@id='signupFormEmailInput-error']")
    public WebElement SignupEmailBoxError;

    @FindBy (xpath = "//div[@id='signupFormFirstNameInput-error']")
    public WebElement SignupFirstNameBoxError;

    @FindBy (xpath = "//div[@id='signupFormLastNameInput-error']")
    public WebElement SignupLastNameBoxError;

    @FindBy (xpath = "//div[@id='signupFormPasswordInput-error']")
    public WebElement SignupPasswordBoxError;

    @FindBy (xpath = "//div[@id='signupFormEmailInput-error']")
    public WebElement SignupInvalidEmailError;

    @FindBy (xpath = "//div[@class='uitk-flex-item uitk-flex-grow-1 uitk-progress-bar-title']")
    public WebElement SignupPasswordStrength;

    @FindBy (xpath = "//div[@class='uitk-flex-item uitk-type-right uitk-progress-bar-description uitk-type-bold']")
    public WebElement SignupPasswordWeak;

    @FindBy (xpath = "//li[normalize-space()='Includes 8-64 characters']")
    public WebElement SignupPasswordWarningLessThanEight;

    @FindBy (xpath = "//li[normalize-space()='Uses at least one symbol (~ ! @ # $ % ^ & * - _ ?)']")
    public WebElement SignupPasswordWarningSymbol;

    @FindBy(xpath = "//li[normalize-space()='Combines letters and numbers']")
    public WebElement SignupPasswordWarningCombine;


    @FindBy(xpath = "//div[@class='uitk-flex-item uitk-type-right uitk-progress-bar-description uitk-type-bold']")
    public WebElement SignupPasswordStrong;

    @FindBy(xpath = "//div[@class='uitk-flex-item uitk-type-right uitk-progress-bar-description uitk-type-bold']")
    public WebElement SignupPasswordVeryStrong;

    @FindBy(xpath = "//a[normalize-space()='Terms and Conditions']")
    public WebElement SignupPageTermsAndConditions;

    @FindBy(xpath = "//a[normalize-space()='Privacy Statement']")
    public WebElement SignupPagePrivacy;

    @FindBy(xpath = "//a[normalize-space()='Expedia Rewards Terms and Conditions']")
    public WebElement SignupPageRewardTermsAndConditions;

    @FindBy(xpath = "//h5[@class='bold']")
    public WebElement WebsiteTermsConfirmObject;

    @FindBy(xpath = "//section[@id='editorial-1']//div[@class='flex-app-content']//h2[1]")
    public WebElement PrivacyPageConfirmObject;

    @FindBy(xpath = "//h1[@class='uitk-heading-4']")
    public WebElement RewardsTermsAndConditionsConfirmObject;

    @FindBy (xpath = "//img[@src='https://a.travel-assets.com/egds/marks/apple.svg']")
    public WebElement SignupPageAppleLogin;

    @FindBy (xpath = "//img[@src='https://a.travel-assets.com/egds/marks/facebook.svg']")
    public WebElement SignupPageFacebookLogin;

    @FindBy (xpath = "//img[@src='https://a.travel-assets.com/egds/marks/google.svg']")
    public WebElement SignupPageGoogleLogin;

    @FindBy (xpath = "//div[@class='label-small text-centered centered tk-caption privacy-wrapper']")
    public WebElement SignupPageAppleLoginConfirm;

    @FindBy (xpath = "//input[@id='signUpFormRememberMeCheck']")
    public WebElement SignupPageKeepMeSignedIn;

    @FindBy (xpath = "//div[@class='uitk-text uitk-type-200 uitk-text-default-theme']")
    public WebElement SignupPageKeepMeSignedInText;

    @FindBy (xpath = "//a[@id='signinRedirectLink']")
    public WebElement SignupPageSignInButton;

    @FindBy (xpath = "//h1[@class='uitk-heading uitk-heading-3 uitk-flex-item']")
    public WebElement SignupPageSignInRedirectConfirmation;

    @FindBy (xpath = "//input[@id='loginFormRememberMeCheck']")
    public WebElement SigninPageKeepSignedInButton;

    @FindBy (xpath = "//div[@class='uitk-text uitk-type-200 uitk-text-default-theme']")
    public WebElement SigninPageKeepSignedInButtonText;




}
