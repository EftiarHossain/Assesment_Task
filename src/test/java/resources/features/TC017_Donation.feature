Feature: Donation

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"

  Scenario: Verify Successful Login With Device Binding
    When I login with "Shams1" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard


  Scenario: Verify Successful Donation without Anonymous
    Then I navigate to the Donation Page
    Then I select As-Sunnah Foundation
    Then I input Donor Name "Asif"
    Then I input Email "asif@yopmail.com"
    Then I input Amount "100"
    Then I click on the Verify button
    Then I click on the Next button
    Then I click on the Terms & Condtions checkbox and Send OTP button
    Then Enter OTP "1111" and click on the Pay button
    Then I Can check transaction status "Transaction is success"
    Then I Can Add Favourite with Name "Asif11"
    Then Back to the Home Page


  Scenario: Verify Successful Donation with Anonymous
    Then I navigate to the Donation Page
    Then I select As-Sunnah Foundation
    Then I click on the Anonymous checkbox
    Then I input Amount for Anonymous "500"
    Then I click on the Verify button
    Then I click on the Next button
    Then I click on the Terms & Condtions checkbox and Send OTP button
    Then Enter OTP "1111" and click on the Pay button
    Then I Can check transaction status "Transaction is success"
    Then Back to the Home Page