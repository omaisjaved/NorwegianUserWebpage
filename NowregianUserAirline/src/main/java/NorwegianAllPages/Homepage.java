package NorwegianAllPages;

import InitialSetup.Main;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

 /*Definition and Usage
    The extends keyword extends a class (indicates that a class is inherited from another class).

    In Java, it is possible to inherit attributes and methods from one class to another.

    We group the "inheritance concept" into two categories:

    subclass (child) - the class that inherits from another class

    superclass (parent) - the class being inherited from
            To inherit from a class, use the extends keyword.*/

public class Homepage extends Main {

        public Homepage goToHomePage() throws InterruptedException {

            Logger.getRootLogger().setLevel(Level.OFF);

            //Locator for the Cookies and clicking Allow for Cookies

            By Cookies = By.xpath("//button[1]");

            //Method to click on Cookies

            driver.findElement(Cookies).click();

            return null;
        }

    }
