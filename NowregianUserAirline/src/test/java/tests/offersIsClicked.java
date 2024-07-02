package tests;

import NorwegianAllPages.Homepage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class offersIsClicked extends Homepage {

    @Test(priority = 1)

    public void verifyOffersIsClicked() throws IOException {

        System.out.println("-------");

        System.out.println("Home page test 1 for clicking on offers in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement offers = driver.findElement(By.xpath("//a[2]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(offers).click().build().perform();

        if (offers.isSelected()) {

            System.out.println("Test passes as Offers is clicked");
        } else {

            System.out.println("Test fails as Offers is not clicked");
        }

        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(pageScreenshot, new File("./Desktop/page.jpg"));
    }
}
