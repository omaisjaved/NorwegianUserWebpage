package NorwegianAllPages;

import InitialSetup.Main;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

  /*Definition and Usage
    The extends keyword extends a class (indicates that a class is inherited from another class).

    In Java, it is possible to inherit attributes and methods from one class to another.
    We group the "inheritance concept" into two categories:

    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from
            To inherit from a class, use the extends keyword.*/

public class LoginPage extends Main {

        //goToHomePage is a method

    /*The purpose of the interrupt system is to provide a well-defined framework for allowing threads
    to interrupt tasks (potentially time-consuming ones) in other threads.
    A good way to think about interruption is that it doesn’t actually interrupt a running thread
    it just requests that the thread interrupt itself at the next convenient opportunity. */

        public Homepage goToHomePage() throws InterruptedException {

            Logger.getRootLogger().setLevel(Level.OFF);

            //Locator for the password input field

            WebElement password = driver.findElement(By.name("_vercel_password"));

            //Enter the password

            password.click();

            password.sendKeys("duckForerunner50");

            //Click the login button

            By Login = By.xpath("//*[@id=\"bottom-section\"]/form/div/button");

            //*[@id="bottom-section"]/form/div/button

            driver.findElement(Login).click();

            return null;
        }

    }
