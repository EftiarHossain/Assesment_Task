package objectRepository;

import org.openqa.selenium.By;

public class FlightSearchPageOR {
    public static By fromInput = By.xpath("//input[@value='DAC']");
    public static By fromInputSelect = By.xpath("//p[normalize-space()='Chattogram, Bangladesh']");

    public static By toInput = By.xpath("//input[@value='CXB']");
    public static By toInputSelect = By.xpath("//p[normalize-space()='Dhaka, Bangladesh']");

    public static By departureDate = By.xpath("//p[normalize-space()='Departure']");
    public static By departureDateRightArrow = By.xpath("//button[contains(@aria-label,'Next Month')]");
    public static By departureDateSeptemberMonth = By.xpath("//div[normalize-space()='September 2025']");
    public static By departureDateSeptemberMonth23 = By.xpath("//div[contains(@aria-label,'Choose Tuesday, September 23rd, 2025')]");


    public static By travelersInput = By.xpath("//p[normalize-space()='Traveller, Class']");
    public static By travelersInputaAdult = By.xpath("//p[@data-testid='adult-number-add-button']//img[@alt='image']");

    public static By doneButton = By.xpath("//div[contains(text(),'Done')]");

    public static By classDropdown = By.xpath("travelClass");
    public static By searchButton = By.xpath("//button[@data-testid='search-flight-button']");


    public static By usBanglaFilter = By.xpath("//div[@aria-hidden='true']//div//p[contains(text(),'US Bangla Airlines')]");

    public static By novoAirFilter = By.xpath("//div[@aria-hidden='true']//div//p[contains(text(),'Novo Air')]");

    public static By cheapestPrice = By.xpath("//div[contains(@data-testid,'CHEAPEST-sort')]");

    public static By endOfPage = By.xpath("//p[normalize-space()='End of Search Results']");

    public static By viewDetails = By.xpath("(//button[@data-testid='show-hide-button'][normalize-space()='View Details'])[1]");

    public static By select = By.xpath("(//p[contains(text(),'Select')])[1]");

    public static By signInModal = By.xpath("//h3[normalize-space()='Sign In']");

}
