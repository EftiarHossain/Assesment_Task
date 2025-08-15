package objectRepository;

import org.openqa.selenium.By;

public class FlightSearchPageOR {
    public static By fromInput = By.xpath("//input[@value='DAC']");
    public static By fromInputSelect = By.xpath("//body/div[2]");

    public static By toInput = By.xpath("//input[@value='CXB']");
    public static By toInputSelect = By.xpath("//body/div[2]");

    public static By departureDate = By.xpath("//p[normalize-space()='Departure']");
    public static By departureDateRightArrow = By.xpath("//button[contains(@aria-label,'Next Month')]");
    public static By departureDateSeptemberMonth = By.xpath("//div[normalize-space()='September 2025']");
    public static By departureDateSeptemberMonth23 = By.xpath("//div[contains(@aria-label,'Choose Tuesday, September 23rd, 2025')]");


    public static By travelersInput = By.xpath("//p[normalize-space()='Traveller, Class']");
    public static By travelersInputaAdult = By.xpath("//body[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/p[3]/div[1]/img[1]");

    public static By doneButton = By.xpath("//div[contains(text(),'Done')]");

    public static By classDropdown = By.xpath("travelClass");
    public static By searchButton = By.xpath("//button[contains(@data-testid,'search-flight-button')]//div//span");

    public static By FilterButton = By.xpath("(//body/div/section/div/div/div/div/div/div[@aria-hidden='true']/div/img[1]");

    public static By usBanglaFilter = By.xpath("((//p[contains(text(),'US Bangla Airlines')])[30]");
    public static By novoAirFilter = By.xpath("(//p[contains(text(),'Novo Air')])[4]");

    public static By flightPrices = By.cssSelector("(//p[contains(text(),'View Prices')])[2]");

    public static By lastFlight = By.xpath("((//p[contains(text(),'Select')])[54]");

    public static By signInModal = By.xpath("//h3[normalize-space()='Sign In']");
    public static By closeSignIn = By.xpath("//p[@data-testid='signin-back-button']");
}
