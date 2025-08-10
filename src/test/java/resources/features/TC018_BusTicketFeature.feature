Feature: Bus Ticket Management

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://qa-abbl-customer-web.global.fintech23.xyz/"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"

  Scenario: Verify Successful Login With Device Binding
    When I login with "eftiar" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard


  Scenario: Verify Ticket & Travels menu displays & navigation
    Then System navigate to the Dashboard
    Then User can see Ticket & Travels Link on the Dashboard Navbar
    Then User set Ticket & Travels as Shortcut
    Then User can see Ticket & Travels Shortcut on the Dashboard If Selected
    Then User can see Ticket & Travels Menu on the Dashboard Under Services
    Then Clicking on the Tickets & Travels Navigates into Ticket & Travel Screen and show the Category for BUS


  Scenario: Verify shohoz microsite visit and tranaction positive flows
    When System navigates to the Bus Category by clicking Bus on the Ticket & Travels Screen
    Then User can see Shohoz & BDTickets are visible
    Then User click on the Shohoz to navigates into the microsite
    Then User complete journey on the microsite and redirect back into the ABDirect
    Then System shows valid review screen with ticket details, source account list, amounts and OTP Channel
    Then User selects source account "" from account list
    Then User Selects OTP Channel as SMS
    Then User click on the Terms & Condtions checkbox and Send OTP button
    Then User enter OTP "1111" and click on the Pay button
    Then User verify transaction status "Transaction is success" IF Transaction is Failed then add an Screenshot
    Then User Back to the Home Page