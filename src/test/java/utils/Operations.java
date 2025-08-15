package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class Operations {

    static WebElement findElement(By path, WebDriver driver){
        WebElement el = driver.findElement(path);
        return el;
    }

    public static List<WebElement> findElements(By path, WebDriver driver) {
        return driver.findElements(path);
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static void click(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        el.click();
    }
    
    public static void clear(By locator, WebDriver driver) {
    	
        WebElement el = findElement(locator, driver);
        while(!el.getAttribute("value").equals("")){
        	el.click();
        	el.sendKeys(Keys.BACK_SPACE);
        }
     }

    public static void enter(By locator, WebDriver driver) {

        WebElement el = findElement(locator, driver);
            el.sendKeys(Keys.RETURN);
    }

    public static void tab(By locator, WebDriver driver) {

        WebElement el = findElement(locator, driver);
        el.sendKeys(Keys.TAB);
    }
    

    public static void sendText(By locator, String text, WebDriver driver){
        WebElement el = findElement(locator, driver);
        el.clear();
        el.sendKeys(text);
    }

    public static String getText(By locator, WebDriver driver){
        WebElement el = findElement(locator, driver);
        String elementText = el.getText();
        return elementText;
    }

    public static void matchText(By locator, String expectedText, WebDriver driver){
        WebElement el = findElement(locator, driver);
        String actualText = el.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public static void matchTextContains(By locator, String expectedText, WebDriver driver){
        WebElement el = findElement(locator, driver);
        String actualText = el.getText();
        assertThat(actualText, containsString(expectedText));
    }

    public static void matchAttribute(By locator, String expectedText,String attributeName, WebDriver driver){
        WebElement el = findElement(locator, driver);
        String actualText = el.getAttribute(attributeName);
     
        Assert.assertEquals(actualText, expectedText);
    }
    
    public static void matchColor(By locator, String expectedColorCode,String ValueName, WebDriver driver){
        WebElement el = findElement(locator, driver);
        String actualColor = el.getCssValue(ValueName);
        String hexcolor=Color.fromString(actualColor).asHex();
        Assert.assertEquals(hexcolor, expectedColorCode);
    }
    
    
    public static void sleep(long ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public static boolean verifyElementIsDisplayed(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isDisplayed = el.isDisplayed();
        System.out.println("Element displayed is : " +isDisplayed);
        return isDisplayed;
    }

    public static boolean verifyElementIsEnabled(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isEnabled = el.isEnabled();
        System.out.println("Element enabled is : " +isEnabled);
        return isEnabled;
    }

    public static boolean verifyElementIsSelected(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isSelected = el.isSelected();
        System.out.println("Element selected is : " +isSelected);
        return isSelected;
    }

    public static void scrollIntoElement(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
    }

    public static boolean verifyElementIsPresent(By locator, WebDriver driver) {
        try{
            WebElement el = findElement(locator, driver);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static void waitUntilElementIsClickable(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        // explicit wait
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20L));
        // elementToBeClickable expected criteria
        wt.until(ExpectedConditions.elementToBeClickable (el));
    }
    

    public static void waitUntilElementIsVisible(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        // explicit wait
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20L));
        // elementToBeVisible expected criteria
        wt.until(ExpectedConditions.visibilityOf(el));
    }

    public static void switchToWindow(WebDriver driver) {
        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Heading of parent window is " + mainWindowHandle);

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        for (String ChildWindow : allWindowHandles) {
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is " + ChildWindow);
            }

        }

    }

    public static void uploadSingleFile(By locator, String filepath, WebDriver driver){
        WebElement el = findElement(locator, driver);
        el.sendKeys(filepath);
    }

    public static void randomDropdownSelect(By locator, WebDriver driver){
        Select dropdown= new Select (findElement(locator, driver));
        List<WebElement> elementCount = dropdown.getOptions();
        int listNUmber=elementCount.size()-1;
        System.out.println(listNUmber);

        Random rand = new Random();
        int  indexNumber=rand.nextInt(listNUmber)+1;
        System.out.println(indexNumber);

        dropdown.selectByIndex(indexNumber);
    }

    public static String createRandomDate(int startYear, int endYear, int startMonth, int endMonth, int startDate, int endDate) {
        int day = createRandomIntBetween(startDate, endDate);
        int month = createRandomIntBetween(startMonth, endMonth);
        int year = createRandomIntBetween(startYear, endYear);
        //return String.format("%d/%d/%s", year, month, day);
        return (year+"-"+month+"-"+day).toString();
    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(srcFile, destFile);

    }

    public static void scrollBarDown(WebDriver driver) throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(2000);
    }

    public static void scrollBarUp(WebDriver driver) throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
        System.out.println("Scroll up perfomed");
        Thread.sleep(2000);
    }

    public static void randomDropdownList(By locator, WebDriver driver){
        List<WebElement> options = driver.findElements(locator);
        int size = options.size()-1;
        int number = createRandomIntBetween(0,size);
        options.get(number).click();
        //options.get(new Random().nextInt(size)).click();
    }

    public static void selectRandomDateFromDatePicker(By locator,int startDate, int endDate, WebDriver driver) {
        WebElement dateWidget = driver.findElement(locator);
        //List of 30/31 dates
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        // Choose a random day from 1 to 28
        int day = createRandomIntBetween(startDate, endDate);
        for (WebElement cell : columns) {
            // check the date is equals with day and if yes select
            if (cell.getText().equals(day+"")) {
                cell.click();
                break;
            }
        }
    }

    public static int selectRandomValueFromDivDropdownWithSize(By locator, int sizeOfStartIndex, WebDriver driver) {
        List<WebElement> webElementList = driver.findElements(locator);
        System.out.println("Element size ---------");
        System.out.println(webElementList.size());
        int startIndex = sizeOfStartIndex;
        int endIndex = webElementList.size();
        //Printing element xpath
        webElementList.forEach(webElement -> System.out.println(webElement.toString()));
        //Printing the value of dropdown list
        webElementList.forEach(webElement -> System.out.println(webElement.getText()));
        //Click random index from the div dropdown
        int randomIndex = createRandomIntBetween(startIndex, --endIndex);
        //Print random index number
        System.out.println(randomIndex);
        webElementList.get(randomIndex).click();
        return endIndex;
    }

    public static void waitForPageToLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed
        wait.until(pageLoadCondition);
    }



}
