package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import objectRepository.FlightSearchPageOR;
import org.openqa.selenium.WebElement;
import utils.Base;
import utils.Operations;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchSteps extends Base {

    private List<Double> usBanglaPrices = new ArrayList<>();
    private List<Double> novoAirPrices = new ArrayList<>();

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
        Operations.click(FlightSearchPageOR.departureDateRightArrow, driver);
        assert Operations.verifyElementIsDisplayed(FlightSearchPageOR.departureDateSeptemberMonth, driver);
        assert Operations.verifyElementIsDisplayed(FlightSearchPageOR.departureDateSeptemberMonth23, driver);
        Operations.click(FlightSearchPageOR.departureDateSeptemberMonth23, driver);
        Operations.click(FlightSearchPageOR.departureDateSeptemberMonth23, driver);

        Operations.click(FlightSearchPageOR.travelersInput, driver);
        Operations.click(FlightSearchPageOR.travelersInputaAdult, driver);
        Operations.click(FlightSearchPageOR.doneButton, driver);

        Operations.click(FlightSearchPageOR.searchButton, driver);

    }

    @When("I filter flights by airline {string}")
    public void iFilterFlightsByAirline(String airline) {
        if (airline.equalsIgnoreCase("US-Bangla Airlines")) {
            Operations.click(FlightSearchPageOR.usBanglaFilter, driver);
        } else if (airline.equalsIgnoreCase("Novo Air")) {
            Operations.click(FlightSearchPageOR.novoAirFilter, driver);
        }
        Operations.waitUntilElementIsVisible(FlightSearchPageOR.FilterButton, driver);
        Operations.waitUntilElementIsVisible(FlightSearchPageOR.usBanglaFilter, driver);
        Operations.waitUntilElementIsVisible(FlightSearchPageOR.FilterButton, driver);
    }

    @When("I select the last flight in the list")
    public void iSelectTheLastFlightInTheList() {
        Operations.scrollIntoElement(FlightSearchPageOR.lastFlight, driver);
        Operations.click(FlightSearchPageOR.lastFlight, driver);
    }

    @Then("I should see the Sign In page modal")
    public void iShouldSeeTheSignInPageModal() {
        Operations.verifyElementIsPresent(FlightSearchPageOR.signInModal, driver);
    }

    @When("I close the Sign In modal")
    public void iCloseTheSignInModal() {
        Operations.click(FlightSearchPageOR.closeSignIn, driver);
    }

    @When("I capture the prices of {string}")
    public void iCaptureThePrices(String airline) {
        List<WebElement> priceElements = Operations.findElements(FlightSearchPageOR.flightPrices, driver);
        for (WebElement element : priceElements) {
            String value = element.getText().replaceAll("[^0-9.]", "");
            double amount = Double.parseDouble(value);
            if (airline.equalsIgnoreCase("US-Bangla Airlines")) {
                usBanglaPrices.add(amount);
            } else if (airline.equalsIgnoreCase("Novo Air")) {
                novoAirPrices.add(amount);
            }
        }
    }

    @When("I deselect {string} and select {string}")
    public void iDeselectAndSelectAirlines(String airline1, String airline2) {
        if (airline1.equalsIgnoreCase("US-Bangla Airlines")) {
            Operations.click(FlightSearchPageOR.usBanglaFilter, driver);
        }
        if (airline2.equalsIgnoreCase("Novo Air")) {
            Operations.click(FlightSearchPageOR.novoAirFilter, driver);
        }
    }

    @Then("I compare both captured prices and assert they differ")
    public void iCompareBothCapturedPricesAndAssertTheyDiffer() {
        assert !usBanglaPrices.equals(novoAirPrices) : "Prices are unexpectedly identical!";
    }
}
