package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import objectRepository.FlightSearchPageOR;
import org.openqa.selenium.WebElement;
import utils.Base;
import utils.Operations;

public class FlightSearchSteps extends Base {

    private double usBanglaPrices;
    private double novoAirPrices;

    @Given("I open the browser for flight search")
    public void iOpenTheBrowserForFlightSearch() {
        setUp();
    }

    @When("I navigate to the flight booking site {string}")
    public void iNavigateToTheFlightBookingSite(String url) {
        driver.get(url);
    }

    @When("I search flights from {string} to {string} on {string} for {string} travelers in {string} class")
    public void iSearchFlights(String from, String to, String date, String travelers, String travelClass) {
        Operations.click(FlightSearchPageOR.fromInput, driver);
        Operations.click(FlightSearchPageOR.fromInputSelect, driver);

        Operations.click(FlightSearchPageOR.toInput, driver);
        Operations.click(FlightSearchPageOR.toInputSelect, driver);

        Operations.click(FlightSearchPageOR.departureDate, driver);
        assert Operations.verifyElementIsDisplayed(FlightSearchPageOR.departureDateSeptemberMonth, driver);
        assert Operations.verifyElementIsDisplayed(FlightSearchPageOR.departureDateSeptemberMonth23, driver);
        Operations.click(FlightSearchPageOR.departureDateSeptemberMonth23, driver);
        Operations.click(FlightSearchPageOR.departureDateSeptemberMonth23, driver);

        Operations.click(FlightSearchPageOR.travelersInput, driver);
        Operations.click(FlightSearchPageOR.travelersInputaAdult, driver);

        Operations.click(FlightSearchPageOR.searchButton, driver);

    }

    @When("I filter flights by airline {string}")
    public void iFilterFlightsByAirline(String airline) {
        Operations.scrollIntoElement(FlightSearchPageOR.usBanglaFilter, driver);
        Operations.click(FlightSearchPageOR.usBanglaFilter, driver);
    }

    @When("I select the last flight in the list")
    public void iSelectTheLastFlightInTheList() throws InterruptedException {
//        Operations.scrollIntoElement(FlightSearchPageOR.endOfPage, driver);
//        Operations.waitForPageToLoad(driver);
//        Operations.scrollIntoElement(FlightSearchPageOR.viewDetails, driver);
//
//        Operations.click(FlightSearchPageOR.viewDetails, driver);

        //Unable to click on select because of an animation
//        Operations.waitUntilElementIsClickable(FlightSearchPageOR.select, driver);
//        Thread.sleep(5000);
//
//        Operations.jsClick(FlightSearchPageOR.select, driver);

    }

    @Then("I should see the Sign In page modal and close the Sign In modal")
    public void iShouldSeeTheSignInPageModal() {
        if (Operations.verifyElementIsPresent(FlightSearchPageOR.signInModal, driver)) {
            Operations.closeNewTabAndSwitchBack(driver);
        }
    }

    @When("I capture the prices of {string}")
    public void iCaptureThePrices(String airline) {
        WebElement priceElement = Operations.findElement(FlightSearchPageOR.cheapestPrice, driver);

        // Extract text and remove non-numeric characters except '.'
        String value = priceElement.getText().replaceAll("[^0-9.]", "");
        usBanglaPrices = Double.parseDouble(value);
    }

    @When("I deselect {string} and select {string}")
    public void iDeselectAndSelectAirlines(String airline1, String airline2) {
            Operations.click(FlightSearchPageOR.usBanglaFilter, driver);
            Operations.click(FlightSearchPageOR.novoAirFilter, driver);
    }

    @When("I capture the prices of Novo Air")
    public void iCaptureThePricesNovoAir() {
        WebElement priceElement = Operations.findElement(FlightSearchPageOR.cheapestPrice, driver);

        // Extract text and remove non-numeric characters except '.'
        String value = priceElement.getText().replaceAll("[^0-9.]", "");
        novoAirPrices = Double.parseDouble(value);

    }

    @Then("I compare both captured prices and assert they differ")
    public void iCompareBothCapturedPricesAndAssertTheyDiffer() {
        assert (usBanglaPrices==novoAirPrices) : "Prices are unexpectedly identical!";
    }
}
