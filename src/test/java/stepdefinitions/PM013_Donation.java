package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG012_Donation;
import utils.Base;
import utils.Operations;
import utils.SoftAssertCollector;

public class PM013_Donation extends Base {
    @When("I navigate to the Donation Page")
    public void iNavigateToTheDonationPage() {
        Operations.waitUntilElementIsVisible(PG012_Donation.donationMenu, driver);
        Operations.scrollIntoElement(PG012_Donation.donationMenu, driver);
        Operations.click(PG012_Donation.donationMenu, driver);
    }
    @When("I select As-Sunnah Foundation")
    public void iSelectAsSunnahFoundation() {
        Operations.waitUntilElementIsVisible(PG012_Donation.asSunnahFoundationMenu, driver);
        Operations.click(PG012_Donation.asSunnahFoundationMenu, driver);
    }
    @Then("I input Donor Name {string}")
    public void iInputDonorName(String Name) {
        Operations.waitUntilElementIsVisible(PG012_Donation.donorName, driver);
        Operations.sendText(PG012_Donation.donorName,Name, driver);
    }
    @Then("I input Email {string}")
    public void iInputEmail(String Email) {
        Operations.waitUntilElementIsVisible(PG012_Donation.email, driver);
        Operations.sendText(PG012_Donation.email,Email, driver);
    }
    @Then("I input Amount {string}")
    public void iInputAmount(String Amount) {
        Operations.waitUntilElementIsVisible(PG012_Donation.amount, driver);
        Operations.sendText(PG012_Donation.amount,Amount, driver);
    }
    @Then("I input Amount for Anonymous {string}")
    public void iInputAmountForAnonymous(String Amount) {
        Operations.waitUntilElementIsVisible(PG012_Donation.amount2, driver);
        Operations.sendText(PG012_Donation.amount2,Amount, driver);
    }
    @When("I click on the Verify button")
    public void iClickOnTheVerifyButton() {
        Operations.waitUntilElementIsVisible(PG012_Donation.verifyButton, driver);
        Operations.click(PG012_Donation.verifyButton, driver);
    }
    @When("I click on the Next button")
    public void iClickOnTheNextButton() {
        Operations.waitUntilElementIsVisible(PG012_Donation.nextButton, driver);
        Operations.scrollIntoElement(PG012_Donation.nextButton, driver);
        Operations.click(PG012_Donation.nextButton, driver);
    }
    @When("I click on the Terms & Condtions checkbox and Send OTP button")
    public void iClickOnTheTermsAndCondtionsCheckboxAndSendOTPButton() {
        Operations.waitUntilElementIsVisible(PG012_Donation.termsAndCondition, driver);
        Operations.scrollIntoElement(PG012_Donation.termsAndCondition, driver);
        Operations.click(PG012_Donation.termsAndCondition, driver);
        Operations.waitUntilElementIsVisible(PG012_Donation.sendOTPButton, driver);
        Operations.click(PG012_Donation.sendOTPButton, driver);
    }
    @Then("Enter OTP {string} and click on the Pay button")
    public void EnterOTP(String OTP) {
        Operations.waitUntilElementIsVisible(PG012_Donation.OTPInput, driver);
        Operations.verifyElementIsPresent(PG012_Donation.OTPInput, driver);
        Operations.sendText(PG012_Donation.OTPInput,OTP, driver);
        Operations.waitUntilElementIsVisible(PG012_Donation.payButton, driver);
        Operations.click(PG012_Donation.payButton, driver);
    }
    @When("I Can check transaction status {string}")
    public void iCanCheckTransactionStatus(String Status) {
        try {
            Operations.waitUntilElementIsVisible(PG012_Donation.transactionStatus, driver);
            Operations.verifyElementIsPresent(PG012_Donation.transactionStatus, driver);
            Operations.matchText(PG012_Donation.transactionStatus, Status, driver);
        } catch (AssertionError e) {
            SoftAssertCollector.addError(e);
        }
    }
    @When("Back to the Home Page")
    public void backToTheHomePage() {
        Operations.waitUntilElementIsVisible(PG012_Donation.gotoHomeButton, driver);
        Operations.click(PG012_Donation.gotoHomeButton, driver);
    }
    @When("I Can Add Favourite with Name {string}")
    public void iCanAddFavouriteWithName(String Name) {
        Operations.waitUntilElementIsVisible(PG012_Donation.addFavouriteButton, driver);
        Operations.click(PG012_Donation.addFavouriteButton, driver);
        Operations.waitUntilElementIsVisible(PG012_Donation.favouriteName, driver);
        Operations.sendText(PG012_Donation.favouriteName,Name, driver);
        Operations.waitUntilElementIsVisible(PG012_Donation.saveButton, driver);
        Operations.click(PG012_Donation.saveButton, driver);
    }
    @When("I click on the Anonymous checkbox")
    public void iClickOnTheAnonymousCheckbox() {
        Operations.waitUntilElementIsVisible(PG012_Donation.anonymousCheckbox, driver);
        Operations.click(PG012_Donation.anonymousCheckbox, driver);
    }
}
