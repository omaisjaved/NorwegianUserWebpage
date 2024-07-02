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

public class partnersIsClicked extends Homepage {

    @Test(priority = 1)

    public void verifyPartnersIsClicked() throws IOException {

        System.out.println("-------");

        System.out.println("Home page test 1 for clicking on partners in the top navigation options");

        SoftAssert softAssert = new SoftAssert();

        WebElement partners = driver.findElement(By.xpath("//a[4]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(partners).click().build().perform();

        if (partners.isSelected()) {

            System.out.println("Test passes as Partners is clicked");
        } else {

            System.out.println("Test fails as Partners is not clicked");
        }

        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(pageScreenshot, new File("./Desktop/page1.jpg"));
    }
}
