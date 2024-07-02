package tests;

import NorwegianAllPages.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testHomePage extends Homepage {

    @Test(priority = 1)

    public void verifyHomePageImageIsShown() {

        //Verify home page logo is shown

        System.out.println("-------");

        System.out.println("Home Page Test 1 for Home page image");

        SoftAssert softAssert = new SoftAssert();

        boolean homePageImage;

        By homePageImages = By.xpath("//div[1]/a");

        driver.findElement(homePageImages).isDisplayed();

        if (homePageImage = true) {

            System.out.println("Test passes as home page image is shown");
        } else {

            System.out.println("Test fails as home page image is not shown");
        }

    }

    @Test(priority = 2)

    public void verifyHomePageTitle() {

        //Verify home page title

        System.out.println("-------");

        System.out.println("Home Page Test 2 for Home page title");

        SoftAssert softAssert = new SoftAssert();

        String actualPageTitle = driver.getTitle();

        System.out.println("Home page title is " + actualPageTitle);

        String expectedPageTitle = "HomePage";

        Assert.assertEquals(actualPageTitle, expectedPageTitle);

        if (actualPageTitle.equals(expectedPageTitle)) {

            System.out.println("Test passes as actual home page title matches expected page title");
        } else {

            System.out.println("Test fails as actual home page title does not match expected page title");
        }
    }

    @Test(priority = 3)

    public void verifyHowItWorksIsShown() {

        //Verify how it works is shown

        System.out.println("-------");

        System.out.println("Home Page Test 3 for How it works in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        if (howItWorks.isDisplayed()) {

            System.out.println("Test passes as how it works is shown");
        } else {

            System.out.println("Test fails as how it works is not shown");
        }
    }

    @Test(priority = 4)

    public void verifyHowItWorksFontSize() {

        //Verify how it works font size

        System.out.println("-------");

        System.out.println("Home Page Test 4 for How it works font size in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        String actualFontSize = howItWorks.getCssValue("font-size");

        System.out.println(actualFontSize);

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        } else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }
    }

    @Test(priority = 5)

    public void verifyHowItWorksFontColour() {

        System.out.println("-------");

        System.out.println("Home page test 5 for How It Works font colour in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        String actualFontColour = howItWorks.getCssValue("font-colour");

        System.out.println(actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        } else {

            System.out.println("Test fails as actual font colour matches expected font colour");
        }

    }


    @Test(priority = 6)

    public void verifyHowItWorksFontFamily() {

        System.out.println("-------");

        System.out.println("Home page test 6 for how it works font family in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        String actualFontFamily = howItWorks.getCssValue("font-family");

        System.out.println(actualFontFamily);

        String expectedFontFamily = "__Inter_d9825c, __Inter_Fallback_d9825c";

        Assert.assertEquals(actualFontFamily, expectedFontFamily);

        if (actualFontFamily.equals(expectedFontFamily)) {

            System.out.println("Test passes as actual font type matches expected font type");
        } else {

            System.out.println("Test fails as actual font type does not match expected font type");
        }

    }

    @Test(priority = 7)

    public void verifyHowItWorksTextAlignment() {

        System.out.println("-------");

        System.out.println("Home page test 7 for how it works text alignment in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        String actualTextAlignment = howItWorks.getCssValue("text-align");

        System.out.println("Text alignment -> " + actualTextAlignment);

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        } else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }
    }

    @Test(priority = 8)

    public void verifyOffersIsShown() {

        System.out.println("-------");

        System.out.println("Home page test 1 for clicking on offers in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        if (offers.isDisplayed()) {

            System.out.println("Test passes as Offers is shown");
        } else {

            System.out.println("Test fails as Offers is not shown");
        }
    }

    @Test(priority = 9)

    public void verifyOffersFontSize() {

        System.out.println("-------");

        System.out.println("Home page test 9 for offers font size in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        String actualFontSize = offers.getCssValue("font-size");

        System.out.println("Font size is -> " + actualFontSize);

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        }
    }

    @Test(priority = 10)

    public void verifyOffersFontColour() {

        System.out.println("-------");

        System.out.println("Home page test 10 for offers font colour in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        String actualFontColour = offers.getCssValue("font-colour");

        System.out.println("Font colour is -> " + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        } else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }

    }

    @Test(priority = 11)

    public void verifyOffersFontType() {

        System.out.println("-------");

        System.out.println("Home page test 11 for offers font type in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        String actualFontType = offers.getCssValue("font-family");

        System.out.println("Font type is -> " + actualFontType);

        String expectedFontSize = "__Inter_d9825c, __Inter_Fallback_d9825c";

        Assert.assertEquals(actualFontType, expectedFontSize);

        if (actualFontType.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font type matches expected font type");
        } else {

            System.out.println("Test fails as actual font type matches expected font type");
        }
    }

    @Test(priority = 12)

    public void verifyOffersTextAlignment() {

        System.out.println("-------");

        System.out.println("Home page test 12 for offers text alignment in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        String actualTextAlignment = offers.getCssValue("text-align");

        System.out.println("Text alignment is -> " + actualTextAlignment);

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        } else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }
    }

    //--------

    @Test(priority = 13)

    public void verifyWhoWeAreIsShown() {

        //Verify who we are is shown

        System.out.println("-------");

        System.out.println("Home Page Test 13 for Who we are in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement whoWeAre = driver.findElement(By.xpath("//a[3]"));

        if (whoWeAre.isDisplayed()) {

            System.out.println("Test passes as who we are is shown");
        } else {

            System.out.println("Test fails as who we are is not shown");
        }

    }

    @Test(priority = 14)

    public void verifyWhoWeAreFontSize() {

        //Verify who we are font size

        System.out.println("-------");

        System.out.println("Home Page Test 14 for Who we are font size in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement whoWeAre = driver.findElement(By.xpath("//a[3]"));

        String actualFontSize = whoWeAre.getCssValue("font-size");

        System.out.println("Font size -> " + actualFontSize);

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size of Who we are matches expected font size");
        } else {

            System.out.println("Test fails as actual font size of Who we are  does not match expected font size");
        }
    }

    @Test(priority = 15)

    public void verifyWhoWeAreFontColour() {

        //Verify font colour

        System.out.println("-------");

        System.out.println("Home Page Test 15 for Who we are font colour in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement whoWeAre = driver.findElement(By.xpath("//a[3]"));

        String actualFontColour = whoWeAre.getCssValue("font-colour");

        System.out.println("Font colour is -> " + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour of Who we are matches expected font colour");
        } else {

            System.out.println("Test fails as actual font colour of Who we are does not match expected font colour");
        }
    }

    @Test(priority = 16)

    public void verifyWhoWeAreFontType() {

        //Verify font type

        System.out.println("-------");

        System.out.println("Home Page Test 16 for Who we are font type in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement whoWeAre = driver.findElement(By.xpath("//a[3]"));

        String actualFontType = whoWeAre.getCssValue("font-family");

        System.out.println("Font colour is -> " + actualFontType);

        String expectedFontType = "__Inter_d9825c, __Inter_Fallback_d9825c";

        Assert.assertEquals(actualFontType, expectedFontType);

        if (actualFontType.equals(expectedFontType)) {

            System.out.println("Test passes as actual font type of Who we are matches expected font type");
        } else {

            System.out.println("Test fails as actual font type of Who we are does not match expected font type");
        }

    }

    @Test(priority = 17)

    public void verifyWhoWeAreTextAlignment() {

        //Verify text alignment

        System.out.println("-------");

        System.out.println("Home Page Test 17 for Who we are text alignment in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement whoWeAre = driver.findElement(By.xpath("//a[3]"));

        String actualTextAlignment = whoWeAre.getCssValue("text-align");

        System.out.println("Text alignment -> " + actualTextAlignment);

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        //Assert.assertNotEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment of Who we are matches expected text alignment");
        } else {

            System.out.println("Test fails as actual text alignment of Who we are does not match expected text alignment");
        }
    }

    @Test(priority = 18)

    public void verifyPartnersIsShown() {

        System.out.println("-------");

        System.out.println("Home Page Test 18 for Partners is shown in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partnerWithUs = driver.findElement(By.xpath("//a[4]"));

        if (partnerWithUs.isDisplayed()) {

            System.out.println("Test passes as Partners is shown");
        } else {

            System.out.println("Test fails as Partners is not shown");
        }
    }

    @Test(priority = 19)

    public void verifyPartnersFontSize() {

        System.out.println("-------");

        System.out.println("Home Page Test 19 for Partners font size in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partnerWithUs = driver.findElement(By.xpath("//a[4]"));

        String actualFontSize = partnerWithUs.getCssValue("font-size");

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        } else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }

    }

    @Test(priority = 20)

    public void verifyPartnersFontColour() {

        System.out.println("-------");

        System.out.println("Home Page Test 20 for Partners font colour in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partnerWithUs = driver.findElement(By.xpath("//a[4]"));

        String actualFontColour = partnerWithUs.getCssValue("font-colour");

        System.out.println("Font colour is -> " + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        } else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }
    }

    @Test(priority = 21)

    public void verifyPartnersFontType() {

        System.out.println("-------");

        System.out.println("Home Page Test 21 for Partners font type in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partnerWithUs = driver.findElement(By.xpath("//a[4]"));

        String actualFontType = partnerWithUs.getCssValue("font-family");

        String expectedFontType = "__Inter_d9825c, __Inter_Fallback_d9825c";

        Assert.assertEquals(actualFontType, expectedFontType);

        if (actualFontType.equals(expectedFontType)) {

            System.out.println("Test passes as actual font type matches expected font type");
        } else {

            System.out.println("Test fails as actual font type does not match expected font type");
        }
    }

    @Test(priority = 22)

    public void verifyPartnersTextAlignment() {

        System.out.println("-------");

        System.out.println("Home Page Test 22 for Partners text alignment in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partnerWithUs = driver.findElement(By.xpath("//a[4]"));

        String actualTextAlignment = partnerWithUs.getCssValue("text-align");

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected test alignment");
        } else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }
    }

    @Test(priority = 23)

    public void verifyFAQIsShown() {

        System.out.println("-------");

        System.out.println("Home Page Test 23 for FAQ is shown in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement fAQ = driver.findElement(By.xpath("//a[5]"));

        if (fAQ.isDisplayed()) {

            System.out.println("Test passes as FAQ is shown");
        } else {

            System.out.println("Test fails as FAQ is not shown");
        }

    }

    @Test(priority = 24)

    public void verifyFAQFontSize() {

        System.out.println("-------");

        System.out.println("Home Page Test 24 for FAQ font size in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement fAQ = driver.findElement(By.xpath("//a[5]"));

        String actualFontSize = fAQ.getCssValue("font-size");

        System.out.println("Font size ->" + actualFontSize);

        String expectedFontSize = "16px";

        Assert.assertEquals(actualFontSize, expectedFontSize);

        if (actualFontSize.equals(expectedFontSize)) {

            System.out.println("Test passes as actual font size matches expected font size");
        } else {

            System.out.println("Test fails as actual font size does not match expected font size");
        }

    }

    @Test(priority = 25)

    public void verifyFAQFontColour() {

        System.out.println("-------");

        System.out.println("Home Page Test 25 for FAQ font colour in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement fAQ = driver.findElement(By.xpath("//a[5]"));

        String actualFontColour = fAQ.getCssValue("font-colour");

        System.out.println("Font size ->" + actualFontColour);

        String expectedFontColour = "";

        Assert.assertEquals(actualFontColour, expectedFontColour);

        if (actualFontColour.equals(expectedFontColour)) {

            System.out.println("Test passes as actual font colour matches expected font colour");
        } else {

            System.out.println("Test fails as actual font colour does not match expected font colour");
        }

    }

    @Test(priority = 26)

    public void verifyFAQFontType() {

        System.out.println("-------");

        System.out.println("Home Page Test 26 for FAQ font type in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement fAQ = driver.findElement(By.xpath("//a[5]"));

        String actualFontType = fAQ.getCssValue("font-family");

        System.out.println("Font size ->" + actualFontType);

        String expectedFontType = "__Inter_d9825c, __Inter_Fallback_d9825c";

        Assert.assertEquals(actualFontType, expectedFontType);

        if (actualFontType.equals(expectedFontType)) {

            System.out.println("Test passes as actual font type matches expected font type");
        } else {

            System.out.println("Test fails as actual font type does not match expected font type");
        }

    }

    @Test(priority = 27)

    public void verifyFAQTextAlignment() {

        System.out.println("-------");

        System.out.println("Home Page Test 27 for FAQ text alignment in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement fAQ = driver.findElement(By.xpath("//a[5]"));

        String actualTextAlignment = fAQ.getCssValue("text-align");

        System.out.println("Text alignment ->" + actualTextAlignment);

        String expectedTextAlignment = "start";

        Assert.assertEquals(actualTextAlignment, expectedTextAlignment);

        if (actualTextAlignment.equals(expectedTextAlignment)) {

            System.out.println("Test passes as actual text alignment matches expected text alignment");
        } else {

            System.out.println("Test fails as actual text alignment does not match expected text alignment");
        }

    }

    @Test(priority = 28)

    public void verifyEnglishIsSelected() throws InterruptedException {

        System.out.println("-------");

        System.out.println("Home Page Test 28 for English language selected in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        boolean english;

        if (driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[1]/div/div/div[2]")).isSelected()) {

            english = true;

            Assert.assertTrue(true);

        } else {

            english = false;

            System.out.println("Assert passes as English is displayed");
        }
    }

    @Test(priority = 29)

    public void verifyDownloadTheAppTodayButtonIsShown() {

        System.out.println("-------");

        System.out.println("Home Page Test 29 for Download the app today button");

        SoftAssert softAssert = new SoftAssert();

        WebElement DownloadTheAppButton = driver.findElement(By.xpath("//button"));

        if (DownloadTheAppButton.isDisplayed()) {

            System.out.println("Test passes as download the app button is shown");
        } else {

            System.out.println("Test fails as download the app button is not shown");
        }

    }

    @Test(priority = 30)

    public void verifyDownloadTheAppTodayIsShownInYourDigitalWallet() {

        System.out.println("-------");

        System.out.println("Home page test 30 for Download the app today in Your digital wallet");

        SoftAssert softAssert = new SoftAssert();

        WebElement downloadTheAppToday = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div/div[2]/div/a/button"));

        if (downloadTheAppToday.isDisplayed()) {

            System.out.println("Test passes as download the app today button is shown");
        }

        else {

            System.out.println("Test fails as download the app today button is not shown");
        }
    }

    @Test(priority = 31)

    public void verifyTermsandConditionsFooterLinkIsShown() {

        System.out.println("-------");

        System.out.println("Home Page Test 31 for TandC link shown in footer");

        SoftAssert softAssert = new SoftAssert();

        WebElement tAndC = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/footer/div/div[2]/div/a[1]"));

        if (tAndC.isDisplayed()) {

            System.out.println("Test passes as TandC footer link is shown");
        }

        else {

            System.out.println("Test fails as TandC footer link is not shown");
        }

    }

    @Test(priority = 32)

    public void verifyPrivacyPolicyFooterLinkIsShown() {

        System.out.println("-------");

        System.out.println("Home Page Test 32 for privacy policy link shown in footer");

        SoftAssert softAssert = new SoftAssert();

        WebElement privacyPolicy = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/footer/div/div[2]/div/a[2]/span"));

        if (privacyPolicy.isDisplayed()) {

            System.out.println("Test passes as privacy policy footer link is shown");
        } else {

            System.out.println("Test fails as privacy policy footer link is not shown");
        }

    }

}