package objectRepository;

import org.openqa.selenium.By;

public class PG012_Donation {
    public static By donationMenu = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bank-account/div/div/div/div[2]/div[5]/div[2]/fuse-card/div/div/div/div[4]/a/img");
    public static By asSunnahFoundationMenu = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bills-and-fees/div/div/form/div/div/div/ul/li");

    public static By anonymousCheckbox = By.xpath("//div[@class='mdc-checkbox']");

    public static By donorName = By.xpath("//*[@id=\"mat-input-0\"]");
    public static By email = By.xpath("//*[@id=\"mat-input-1\"]");
    public static By amount = By.xpath("//*[@id=\"mat-input-2\"]");
    public static By amount2 = By.xpath("//*[@id=\"mat-input-5\"]");

    public static By verifyButton = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bills-and-fees-details/div/div/form/form/div[5]/div/button[2]");
    public static By nextButton = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bills-and-fees-details/div/div/form/div[5]/div/button[2]");

    public static By termsAndCondition = By.xpath("//div[@class='mdc-checkbox']");
    public static By sendOTPButton = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bills-and-fees-details/div/div/form/div[5]/div/button[2]");

    public static By OTPInput = By.xpath("//span[1]//input[1]");
    public static By payButton = By.xpath("//div[@class='flex space-x-2 justify-center']//button[@class='btn-primary']");


    public static By gotoHomeButton = By.xpath("//button[@class='btn-secondary w-auto']");
    public static By addFavouriteButton = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-bill-payment/div[2]/button[2]");
    public static By favouriteName = By.xpath("//input[@placeholder='Favourite Name']");
    public static By saveButton = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/mat-dialog-actions/button[2]");

    public static By downloadReceiptButton = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-bill-payment/div[2]/button[3]");
}
