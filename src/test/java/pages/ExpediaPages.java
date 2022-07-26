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
}
