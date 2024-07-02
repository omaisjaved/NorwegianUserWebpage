package tests;

import NorwegianAllPages.Homepage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class howItWorksClickedTest extends Homepage {

    @Test(priority = 1)

    public void verifyHowItWorksIsClicked() throws IOException {

        System.out.println("-------");

        System.out.println("Home page test 1 for clicking on how it works in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement howItWorks = driver.findElement(By.xpath("//a[1]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(howItWorks).click().build().perform();

        if (howItWorks.isSelected()) {

            System.out.println("Test passes as Offers is clicked");
        } else {

            System.out.println("Test fails as Offers is not clicked");
        }

        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(pageScreenshot, new File("./Desktop/page.jpg"));
    }
}



