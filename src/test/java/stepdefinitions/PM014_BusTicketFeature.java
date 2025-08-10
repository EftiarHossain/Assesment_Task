package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG013_BusTicket;
import utils.Base;
import utils.FileHelper;
import utils.Operations;
import utils.SoftAssertCollector;
import io.cucumber.java.Scenario;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PM014_BusTicketFeature extends Base {

    private Scenario scenario;

    @io.cucumber.java.Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Then("System navigate to the Dashboard")
    public void systemNavigateToTheDashboard() {
        Operations.waitUntilElementIsVisible(PG013_BusTicket.dashboardTitle, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.dashboardTitle, driver);
    }

    @Then("User can see Ticket & Travels Link on the Dashboard Navbar")
    public void systemCanSeeTicketTravelsLink() {
        Operations.waitUntilElementIsVisible(PG013_BusTicket.ticketTravelsLink, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketTravelsLink, driver);
    }

    @Then("User set Ticket & Travels as Shortcut")
    public void userSetTravelsShortcut() {
        Operations.waitUntilElementIsVisible(PG013_BusTicket.ticketTravelsLink, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketTravelsLink, driver);
        Operations.click(PG013_BusTicket.editBtnShortcut, driver);
        Operations.click(PG013_BusTicket.plusBtnShortcutAdd, driver);
        Operations.click(PG013_BusTicket.doneBtnShortcut, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketTravelsLink, driver);
    }

    @Then("User can see Ticket & Travels Shortcut on the Dashboard If Selected")
    public void systemCanSeeTicketTravelsShortcut() {
        Operations.waitUntilElementIsVisible(PG013_BusTicket.ticketTravelsLink, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketTravelsLink, driver);
    }

    @Then("User can see Ticket & Travels Menu on the Dashboard Under Services")
    public void systemCanSeeTicketTravelsMenu() {
        Operations.waitUntilElementIsVisible(PG013_BusTicket.ticketTravelsLink, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketTravelsLink, driver);
    }

    @Then("Clicking on the Tickets & Travels Navigates into Ticket & Travel Screen and show the Category for BUS")
    public void navigateToTicketTravelsScreen() {
        Operations.click(PG013_BusTicket.ticketTravelsLink, driver);
        Operations.waitUntilElementIsVisible(PG013_BusTicket.busCategory, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.busCategory, driver);
    }

    @When("System navigates to the Bus Category by clicking Bus on the Ticket & Travels Screen")
    public void navigateToBusCategory() {
        Operations.click(PG013_BusTicket.busCategory, driver);
    }

    @Then("User can see Shohoz & BDTickets are visible")
    public void verifyShohozAndBDTicketsVisible() {
        assert Operations.verifyElementIsPresent(PG013_BusTicket.shohozIcon, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.bdTicketsIcon, driver);
    }

    @Then("User click on the Shohoz to navigates into the microsite")
    public void clickShohozMicrosite() {
        Operations.click(PG013_BusTicket.shohozIcon, driver);
        assert !Operations.verifyElementIsPresent(PG013_BusTicket.shohozIcon, driver);
    }

    @Then("User complete journey on the microsite and redirect back into the ABDirect")
    public void completeMicrositeJourney() {
        // Simulate wait or switch context if needed
        Operations.click(PG013_BusTicket.selectSourceLocation, driver);
        Operations.click(PG013_BusTicket.selectSourceLocationValue, driver);
        Operations.click(PG013_BusTicket.selectDesLocationValue, driver);
        Operations.click(PG013_BusTicket.selectDesLocationValue, driver);
        Operations.click(PG013_BusTicket.departureDate, driver);
        if (Operations.verifyElementIsPresent(PG013_BusTicket.departureDateValue, driver)){
            Operations.click(PG013_BusTicket.departureDateValue, driver);
        }
        else if (Operations.verifyElementIsPresent(PG013_BusTicket.departureDateValue2, driver)){
            Operations.click(PG013_BusTicket.departureDateValue2, driver);
        }
        else if (Operations.verifyElementIsPresent(PG013_BusTicket.departureDateValue3, driver)){
            Operations.click(PG013_BusTicket.departureDateValue3, driver);
        }
        else
            Operations.click(PG013_BusTicket.departureDateValue4, driver);
        Operations.click(PG013_BusTicket.searchBusBtn, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.viewSeats, driver);
        Operations.click(PG013_BusTicket.viewSeats, driver);
        Operations.click(PG013_BusTicket.selectSeats, driver);
        Operations.click(PG013_BusTicket.boardingPointDropdown, driver);
        Operations.click(PG013_BusTicket.arambugBusPoint, driver);
        Operations.click(PG013_BusTicket.continueBtn, driver);
        Operations.click(PG013_BusTicket.passengerDetailsName, driver);
        Operations.sendText(PG013_BusTicket.passengerDetailsName,"eftiar", driver);
        Operations.click(PG013_BusTicket.passengerDetailsAge, driver);
        Operations.sendText(PG013_BusTicket.passengerDetailsAge,"23", driver);
        Operations.click(PG013_BusTicket.passengerDetailsMobile, driver);
        Operations.sendText(PG013_BusTicket.passengerDetailsMobile,"eftiar", driver);
        Operations.click(PG013_BusTicket.passengerDetailsEmail, driver);
        Operations.sendText(PG013_BusTicket.passengerDetailsEmail,"eftiar", driver);
        Operations.click(PG013_BusTicket.continueBtn, driver);
        Operations.click(PG013_BusTicket.termsCheckboxMicrosite, driver);
        Operations.click(PG013_BusTicket.payNowBtn, driver);
        Operations.waitUntilElementIsVisible(PG013_BusTicket.reviewScreen, driver);
    }

    @Then("System shows valid review screen with ticket details, source account list, amounts and OTP Channel")
    public void verifyReviewScreenDetails() {
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsReviewTitle, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsPrice, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsIssuedOn, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsCoach, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsBoarding, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsDepartureTime, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsReportingTime, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.ticketDetailsSeats, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.sourceAccountDropdown, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.sourceAccountAvailableBalance, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.serviceCharge, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.grandTotal, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.otpChannel, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.termsCheckbox, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.termsCheckboxLink, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.sendOTP, driver);
        assert Operations.verifyElementIsPresent(PG013_BusTicket.cancelOTP, driver);
    }

    @Then("User selects source account {string} from account list")
    public void selectSourceAccount() {
        Operations.click(PG013_BusTicket.sourceAccountDropdown, driver);
        Operations.click(PG013_BusTicket.sourceAccountDropdownValue, driver);
    }

    @Then("User Selects OTP Channel as SMS")
    public void selectOtpChannelAsSMS() {
        Operations.click(PG013_BusTicket.otpChannel, driver);
    }

    @Then("User click on the Terms & Condtions checkbox and Send OTP button")
    public void clickTermsAndSendOtp() {
        Operations.click(PG013_BusTicket.termsCheckbox, driver);
        Operations.click(PG013_BusTicket.sendOTPButton, driver);
    }

    @Then("User enter OTP {string} and click on the Pay button")
    public void enterOtpAndClickPay(String otp) {
        Operations.sendText(PG013_BusTicket.otpInput, otp, driver);
        Operations.click(PG013_BusTicket.payButton, driver);
    }

    @Then("User verify transaction status {string} IF Transaction is Failed then add an Screenshot")
    public void verifyTransactionStatus(String status) throws Exception {
        try {
            Operations.waitUntilElementIsVisible(PG013_BusTicket.transactionStatus, driver);
            Operations.matchText(PG013_BusTicket.transactionStatus, status, driver);
        } catch (AssertionError e) {
            SoftAssertCollector.addError(e);
            String screenshotPath = FileHelper.generateScreenshotFilePath("BusTransactionFailed");
            Operations.takeSnapShot(driver, screenshotPath);
            try {
                byte[] screenshotBytes = Files.readAllBytes(Paths.get(screenshotPath));
                scenario.attach(screenshotBytes, "image/png", "BusTransactionFailed");
            } catch (Exception ex) {
                System.err.println("Failed to attach screenshot: " + ex.getMessage());
            }
        }
    }

    @Then("User Back to the Home Page")
    public void navigateBackToHomePage() {
        Operations.click(PG013_BusTicket.goHomeButton, driver);
    }
}
