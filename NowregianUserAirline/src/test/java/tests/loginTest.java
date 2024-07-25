package tests;

import NorwegianAllPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginTest extends LoginPage {

    @Test(priority = 1)

    public void verifyLoginPageTitle() {

        testCaseId = "56674";

        //Verifying the correct login page title is shown

        System.out.println("-------");

        System.out.println("Login Page Test 1 for Login page title");

        SoftAssert softAssert = new SoftAssert();

        String actualLoginPageTitle = driver.getTitle();

        String expectedLoginPageTitle = "Authentication Required";

        Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle);

        if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {

            System.out.println("Test passes as actual login page title matches expected login page title");
        } else {

            System.out.println("Test fails as actual login page title does not match expected login page title");
        }

    }

    @Test(priority = 2)

    public void verifyFontSizeOfLoginPageTitle() {

        //Verify font size of login page title is 24px

        System.out.println("-------");

        System.out.println("Login Page Test 2 for Login page title");

        SoftAssert softAssert = new SoftAssert();

        WebElement loginPageTitle = driver.findElement(By.xpath("//h1"));

        String actualFontSize = loginPageTitle.getCssValue("font-size");

        System.out.println("Font size -> " + actualFontSize);

        String expectedFontSize = "24px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        }

        else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }
    }

    @Test(priority = 3)

    public void verifyLoginPageTitleFontColour() {

        //Verify font size of login page title is correct

        System.out.println("-------");

        System.out.println("Login Page Test 3 for Login page title");

        SoftAssert softAssert = new SoftAssert();

        WebElement loginPageTitle = driver.findElement(By.xpath("//h1"));

        String actualFontColour = loginPageTitle.getCssValue("font-colour");

        System.out.println("Font colour -> " + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        }

        else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }

    }

    @Test(priority = 4)

    public void verifyLoginPageTitleFontFamily() {

        //Verify font is correct

        System.out.println("-------");

        System.out.println("Login Page Test 4 for Login page title");

        SoftAssert softAssert = new SoftAssert();

        WebElement loginPageTitle = driver.findElement(By.xpath("//h1"));

        String actualFontFamily = loginPageTitle.getCssValue("font-family");

        System.out.println("Font -> " + actualFontFamily);

        String expectedFontFamily = "-apple-system, \"system-ui\", \"segoe ui\", roboto, oxygen, ubuntu, cantarell, \"fira sans\", \"droid sans\", \"helvetica neue\", sans-serif";

        Assert.assertEquals(actualFontFamily, expectedFontFamily);

        if (actualFontFamily.equals(expectedFontFamily)) {

            System.out.println("Test passes as actual font family matches expected font family");
        }

        else {

            System.out.println("Test fails as actual font family does not match expected font family");
        }

    }

    @Test(priority = 5)

    public void verifyLoginPageTitleTextAlignment() {

        //Verify login page title text is aligned correctly

        System.out.println("-------");

        System.out.println("Login Page Test 5 for Login page title");

        SoftAssert softAssert = new SoftAssert();

        WebElement loginPageTitle = driver.findElement(By.xpath("//h1"));

        String actualTextAlignment = loginPageTitle.getCssValue("text-align");

        System.out.println("Font Text Alignment -> " + actualTextAlignment);

        String expectedTextAlignment = "center";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        }

        else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }

    }

    @Test(priority = 6)

    public void verifyPasswordFieldName() {

        //Verify password field name is correct

        System.out.println("-------");

        System.out.println("Login Page Test 6 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement passwordFieldName = driver.findElement(By.xpath("//label/div"));

        String actualPasswordFieldName = passwordFieldName.getText();

        System.out.println("Password Field Name -> " + actualPasswordFieldName);

        String expectedPasswordFieldName = "VISITOR PASSWORD";

        Assert.assertEquals(actualPasswordFieldName, expectedPasswordFieldName);

        if (actualPasswordFieldName.equals(expectedPasswordFieldName)) {

            System.out.println("Test passes as actual password field name matches expected password field name");
        }

        else {

            System.out.println("Test fails as actual password field name matches expected password fiele name");
        }

    }

    @Test(priority = 7)

    public void verifyPasswordFieldNameFontSize() {

        //Verify font size for password field name is correct

        System.out.println("-------");

        System.out.println("Login Page Test 7 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement passwordFieldName = driver.findElement(By.xpath("//label/div"));

        String actualFontSize = passwordFieldName.getCssValue("font-size");

        System.out.println("Font size -> " + actualFontSize);

        String expectedFontSize = "12px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        }

        else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }
    }

    @Test(priority = 8)

    public void verifyPasswordFieldNameFontColour() {

        //Verify font colour of login page password field name is correct

        System.out.println("-------");

        System.out.println("Login Page Test 8 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement passwordFieldName = driver.findElement(By.xpath("//label/div"));

        String actualFontColour = passwordFieldName.getCssValue("font-colour");

        System.out.println("Font colour -> " + actualFontColour);

        String expectedFontColour ="";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        }

        else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }
    }

    @Test(priority = 9)

    public void verifyPasswordFieldNameFontFamily() {

        //Verify the correct font is shown for password field name

        System.out.println("-------");

        System.out.println("Login Page Test 9 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement passwordFieldName = driver.findElement(By.xpath("//label/div"));

        String actualFont = passwordFieldName.getCssValue("font-family");

        System.out.println("Font -> " + actualFont);

        String expectedFont = "-apple-system, \"system-ui\", \"segoe ui\", roboto, oxygen, ubuntu, cantarell, \"fira sans\", \"droid sans\", \"helvetica neue\", sans-serif";

        Assert.assertEquals(actualFont, expectedFont);

        if (actualFont.equals(expectedFont)) {

            System.out.println("Test passes as actual font matches expected font");
        }

        else {

            System.out.println("Test fails as actual font does not match expected font");
        }
    }

    @Test(priority = 10)

    public void verifyPasswordFieldNameTextAlignment() {

        //Verify text alignment is correct

        System.out.println("-------");

        System.out.println("Login Page Test 10 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement passwordFieldName = driver.findElement(By.xpath("//label/div"));

        String actualTextAlignment = passwordFieldName.getCssValue("text-align");

        System.out.println("Text alignment -> " + actualTextAlignment);

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        }

        else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }

    }

    @Test(priority = 11)

    public void verifyPasswordFieldIsEnabled() {

        //Verify password field for entering password is enabled

        System.out.println("-------");

        System.out.println("Login Page Test 11 for Password field");

        SoftAssert softAssert = new SoftAssert();

        WebElement enterPasswordField = driver.findElement(By.name("_vercel_password"));

        //Assert.assertEquals(true, enterPasswordField.isEnabled());

        if (enterPasswordField.isEnabled()) {

            System.out.println("Test passes as password field is enabled");
        }

        else {

            System.out.println("Test fails as password field is not enabled");
        }

    }

    @Test(priority = 12)

    public void verifyLoginButtonIsDisplayed() {

        //Verify login button is displayed

        System.out.println("-------");

        System.out.println("Login Page Test 12 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        Assert.assertEquals(true, logInButton.isDisplayed());

        if (logInButton.isDisplayed()) {

            System.out.println("Test passes as login button is shown");
        }

        else {

            System.out.println("Test fails as login button is not displayed");
        }

    }

    @Test(priority = 13)

    public void verifyLoginButtonName() {

        //Verifying log in button name is correct

        System.out.println("-------");

        System.out.println("Login Page Test 13 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        String actualName = logInButton.getText();

        System.out.println("Name of button is -> " + actualName);

        String expectedName = "Log in";

        Assert.assertEquals(actualName, expectedName);

        if (actualName.equals(expectedName)) {

            System.out.println("Test passes as actual name matches expected name");
        }

        else {

            System.out.println("Test fails as actual name does not match expected name");
        }
    }

    @Test(priority = 14)

    public void verifyLogInButtonIsEnabled() {

        //Verify log in button is enabled

        System.out.println("-------");

        System.out.println("Login Page Test 14 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        Assert.assertEquals(true, logInButton.isEnabled());

        if (logInButton.isEnabled()) {

            System.out.println("Test passes as log in button is enabled");
        }

        else {

            System.out.println("Test fails as login button is not enabled");
        }

    }

    @Test(priority = 15)

    public void verifyLogInButtonFontSize() {

        //Verify log in button font size is correct

        System.out.println("-------");

        System.out.println("Login Page Test 15 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        String actualFontSize = logInButton.getCssValue("font-size");

        System.out.println("Font size is -> " + actualFontSize);

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");

        }

        else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }

    }

    @Test(priority = 16)

    public void verifyLogInButtonFontColour() {

        //Verify font colour of log in button is correct

        System.out.println("-------");

        System.out.println("Login Page Test 16 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        String actualFontColour = logInButton.getCssValue("font-colour");

        System.out.println("Font Colour -> " + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        }

        else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }

    }

    @Test(priority = 17)

    public void verifyLogInButtonFontFamily() {

        //Verify the font is correct

        System.out.println("-------");

        System.out.println("Login Page Test 17 for Login button");

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        String actualFont = logInButton.getCssValue("font-family");

        System.out.println("Font is -> " + actualFont);

        String expectedFont = "-apple-system, \"system-ui\", \"segoe ui\", roboto, oxygen, ubuntu, cantarell, \"fira sans\", \"droid sans\", \"helvetica neue\", sans-serif";

        Assert.assertEquals(actualFont, expectedFont);

        if (actualFont.equals(expectedFont)) {

            System.out.println("Test passes as actual font matches expected font");
        }

        else {

            System.out.println("Test fails as actual font does not match expected font");
        }

    }

    @Test(priority = 18)

    public void verifyLogInButtonTextAlignment() {

        //Verify log in button text alignment

        System.out.println("-------");

        System.out.println("Login Page Test 18 for Login button");

        SoftAssert softAssert = new SoftAssert();

        WebElement logInButton = driver.findElement(By.xpath("//button"));

        String actualTextAlignment = logInButton.getCssValue("text-align");

        System.out.println("Text alignment -> " + actualTextAlignment);

        String expectedTextAlignment = "center";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        }

        else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }

    }


    /*@Test(priority = 20)

    public void verifyLogInButtonTextSize() {

        //Verify log in button text alignment

        System.out.println("-------");

        System.out.println("Login Page Test 20");

        SoftAssert softAssert = new SoftAssert();

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"bottom-section\"]/form/div/button"));

        //String s = String.valueOf(loginButton);

        //Dimension actualSize = loginButton.getSize();

        Dimension actualSize = loginButton.getSize();
        System.out.println(loginButton.getSize());

        int expectedX = 320;

        int expectedY = 48;

        //Assert.assertEquals(actualSize, expectedX, String.valueOf(expectedY));

        //Dimension actualSize==expectedX;

        int compare = Integer.compare(actualSize, expectedY, expectedY);
    }*/

    @Test(priority = 19)

    public void enterPassword() throws InterruptedException {

        System.out.println("-------");

        System.out.println("Login Page Test 19");

        goToHomePage();

        System.out.println("User is logged in to the webpage and Homescreen is shown");

    }

}

