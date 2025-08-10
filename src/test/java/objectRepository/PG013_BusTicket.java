package objectRepository;

import org.openqa.selenium.By;

public class PG013_BusTicket {

    public static By dashboardTitle = By.xpath("//span[normalize-space()='Dashboard']");
    public static By ticketTravelsLink = By.xpath("//span[normalize-space()='Ticket & Travels']");
    public static By editBtnShortcut = By.xpath("//button[normalize-space()='Edit']");
    public static By plusBtnShortcutAdd = By.xpath("//div[7]//button[1]//span[4]");
    public static By doneBtnShortcut = By.xpath("//button[normalize-space()='Done']");


    public static By busCategory = By.xpath("//div[contains(text(),'Bus')]");

    public static By shohozIcon = By.xpath("//img[contains(@alt,'Shohoz')]");
    public static By bdTicketsIcon = By.xpath("//img[contains(@alt,'BDTickets')]");

    public static By reviewScreen = By.xpath("//h2[contains(text(),'Review') or contains(text(),'Ticket Details')]");
    public static By ticketDetails = By.xpath("//div[contains(@class,'ticket-details') or contains(text(),'Ticket')]");
    public static By sourceAccountDropdown = By.xpath("//mat-select[@formcontrolname='sourceAccount']");
    public static By amountInfo = By.xpath("//div[contains(@class,'amount') or contains(text(),'Amount')]");
    public static By otpChannel = By.xpath("//mat-select[@formcontrolname='otpChannel']");

    public static By termsCheckbox = By.xpath("//mat-checkbox[@formcontrolname='termsAndConditions']");
    public static By sendOTPButton = By.xpath("//button[contains(text(),'Send OTP')]");
    public static By otpInput = By.xpath("//input[@formcontrolname='otp']");
    public static By payButton = By.xpath("//button[contains(text(),'Pay') or contains(text(),'Confirm')]");

    public static By transactionStatus = By.xpath("//span[contains(@class,'transaction-status') or contains(text(),'Success') or contains(text(),'Failed')]");
    public static By goHomeButton = By.xpath("//button[contains(text(),'Home') or contains(text(),'Back')]");

    //Microsite
    public static By selectSourceLocation;
    public static By selectSourceLocationValue;
    public static By selectDesLocationValue;
    public static By departureDateValue;
    public static By departureDateValue2;
    public static By departureDateValue3;
    public static By departureDateValue4;
    public static By searchBusBtn;
    public static By viewSeats;
    public static By boardingPointDropdown;
    public static By selectSeats;
    public static By arambugBusPoint;
    public static By continueBtn;
    public static By passengerDetailsName;
    public static By passengerDetailsAge;
    public static By passengerDetailsMobile;
    public static By passengerDetailsEmail;
    public static By termsCheckboxMicrosite;
    public static By payNowBtn;

    //Review Screen
    public static By ticketDetailsReviewTitle;
    public static By ticketDetailsPrice;
    public static By ticketDetailsIssuedOn;
    public static By ticketDetailsCoach;
    public static By ticketDetailsBoarding;
    public static By ticketDetailsDepartureTime;
    public static By ticketDetailsReportingTime;
    public static By ticketDetailsSeats;
    public static By sourceAccountAvailableBalance;
    public static By serviceCharge;
    public static By grandTotal;
    public static By termsCheckboxLink;
    public static By sendOTP;
    public static By cancelOTP;
    public static By sourceAccountDropdownValue;
    public static By departureDate;




}
