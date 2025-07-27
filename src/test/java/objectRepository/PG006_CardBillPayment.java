package objectRepository;

import org.openqa.selenium.By;

public class PG006_CardBillPayment {

    public static By navBarPayment = By.xpath("//span[normalize-space()='Payments']");
    public static By navBarCreditCardBillPayment = By.xpath("//span[normalize-space()='Credit Card Bill Payment']");

    public static By cardBillPaymentTitle = By.xpath("//h1[normalize-space()='Card Bill Payment']");
    public static By selectPaymentTypeTitle = By.xpath("//h1[normalize-space()='Select Payment Type']");

    public static By selectOwnCardBillPayment = By.xpath("(//button)[2]");
    public static By selectWithinCardBillPayment = By.xpath("(//button)[3]");
    public static By selectOtherCardBillPayment = By.xpath("(//button)[4]");
    public static By selectLankaCardBillPayment = By.xpath("(//button)[5]");

    public static By cardOwnSelect = By.xpath("//body/app-root/layout/classy-layout/div/div/app-payments/div/div/form/div/div/div/button[@type='button']/div[1]");
    public static By searchField = By.xpath("//input[@placeholder='Search']");

    public static By ownCardDetailsScreenTitle = By.xpath("//h1[normalize-space()='Own Card Details']");
    public static By withinCardDetailsScreenTitle = By.xpath("//h1[normalize-space()='Within Bank Card Details']");
    public static By otherCardDetailsScreenTitle = By.xpath("//h1[normalize-space()='Other Bank Card Details']");
    public static By lankaCardDetailsScreenTitle = By.xpath("//h1[normalize-space()='Lanka Bangla Credit Card Details']");

    public static By selectFromAccount = By.xpath("//span[normalize-space()='--Select Account--']");
    public static By selectFromAccountFirstOne = By.xpath("//body//div//mat-option[1]");

    public static By selectToAccountCurrency = By.xpath("//span[normalize-space()='--Select Currency--']");
    public static By toAccountCurrencySelectionBDT = By.xpath("//span[normalize-space()='BDT']");
    public static By selectPaymentAmount = By.xpath("//span[normalize-space()='--Select--']");
    public static By selectPaymentAmountOther = By.xpath("//span[normalize-space()='Other Amount']");
    public static By ownPaymentAmountOther = By.xpath("//input[@placeholder='Enter Your Amount']");

    public static By selectCardTypeWithin = By.xpath("//span[normalize-space()='--Select Card Type--']");
    public static By selectBankOther = By.xpath("//span[normalize-space()='--Select Bank--']");
    public static By selectedBankOther = By.xpath("//span[normalize-space()='Al-Arafah Islami Bank Limited']");
    public static By selectedCardType = By.xpath("//span[normalize-space()='World']");
    public static By selectedCardTypeLanka = By.xpath("//span[normalize-space()='VISA']");

    public static By enterCardNumber = By.xpath("//input[@placeholder='Enter Card Number']");
    public static By enterCardHolderName = By.xpath("//input[@placeholder='Enter Card Holder Name']");
    public static By transferDetailsPaymentAmount = By.xpath("//input[@placeholder='Enter Payment Amount']");
    public static By transferDetailsPaymentAmountOther = By.xpath("//input[@placeholder='Enter payment amount']");
    public static By transferDetailsPaymentAmountOwn = By.xpath("//input[@placeholder='Enter Your Amount']");

    public static By paymentRemarks = By.xpath("//input[@placeholder='Enter Remarks']");


    public static By paymentDetailsNextButton = By.xpath("//button[contains(text(),'Next')]");
    public static By paymentDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By withinCardPaymentReviewPageTitle = By.xpath("//h1[normalize-space()='Within Bank Card Review']");
    public static By otherCardPaymentReviewPageTitle = By.xpath("//h1[normalize-space()='Other Bank Card Review']");
    public static By lankaCardPaymentReviewPageTitle = By.xpath("//h1[normalize-space()='Lanka Bangla Credit Card Review']");
    public static By ownCardPaymentReviewPageTitle = By.xpath("//h1[normalize-space()='Own Card Review']");

    public static By withinTransferType = By.xpath("//li[normalize-space()='Within Bank Card']");
    public static By paymentAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By paymentAuthenticationTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By paymentTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By paymentTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");
    public static By paymentConfirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public static By OwnPaymentConfirmSendOTPButton = By.xpath("//button[normalize-space()='Send OTP']");

    public static By paymentTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    public static By paymentOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By paymentOTPInputNext = By.xpath("//button[normalize-space()='Next']");

    public static By paymentSuccessScreenTransferType = By.xpath("//li[normalize-space()='Mobile Recharge']");

    public static By paymentGoToHome = By.xpath("//button[normalize-space()='Go to Home']");

    public static By paymentDownloadReceipt = By.xpath("//button[normalize-space()='Download']");


}
