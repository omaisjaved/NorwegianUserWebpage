package InitialSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

//Why does Java need a main class?
/*Every application needs one class with a main method.
This class is the entry point for the program, and is the class name passed to the java interpreter
command to run the application.*/

public class Main {


        //Initialising driver in Selenium Webdriver, creating a new session
        public static WebDriver driver;

        /*@BeforeSuite annotated method will be run before the execution of all the test cases defined
        in the folder or inside a TestNG suite.
         For example, this annotation is used when you have separate URLs to test all your test cases.
         Environment variables can be set in a @BeforeSuite annotated method.*/
        @BeforeSuite

        //Open browser
        public void launchBrowser() {

            System.setProperty("webdriver.http.factory", "jdk-http-client");

            //Instantiate Chrome browser, create/open a new chrome browser session
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        /*What is Hashmap in Java?

        A HashMap basically designates unique keys to corresponding values that
        can be retrieved at any given point.*/

            Map<String, Object> prefs = new HashMap<String, Object>();

            //Accept Chrome Notifications Selenium

            prefs.put("profile.default_content_setting_values.notifications", 2);

            //WebDriver Chrome Browser: Avoid 'Do you want chrome to save your password' pop up

            prefs.put("credentials_enable_service", false);

            //Disable Chrome save your password? (Selenium Java)

            prefs.put("profile.password_manager_enabled", false);

        /*Using the ChromeOptions class
        Create an instance of ChromeOptions, which has convenient methods for setting ChromeDriver-specific
        capabilities. You can then pass the ChromeOptions object into the ChromeDriver constructor:*/

            ChromeOptions options = new ChromeOptions();

            //Disable Chrome notifications (Selenium)

            options.addArguments("--disable-notifications");

        /*Sets an experimental option. Useful for new ChromeDriver options not yet exposed
        through the ChromeOptions API.

        It basically allows us to test particular feature before it gets released from Chrome Developers.*/

            options.setExperimentalOption("prefs", prefs);

            // disable chrome extension in selenium

            options.addArguments("--disable-extensions");

        /*Disable 'Chrome is being controlled by automated test software' information
         and disable chrome save password dialog using selenium?*/

        /*To disable the ribbon alert which comes on the chrome browser when the browser is
        invoked via Selenium use –*/

            //To run the chrome browser in headless mode we can use- options.addArguments(“–headless”);

            options.addArguments("--disable-infobars");

            options.addArguments("--remote-allow-origins=*");

        /*ChromeOptions is a new concept added in Selenium WebDriver starting from Selenium
        version 3.6. 0 which is used for customizing the ChromeDriver session. By default
        when selenium opens up any browser (Chrome browser or Firefox browser), it opens
        up without any extension or history or cookies, etc.*/

            //driver = new ChromeDriver(options);

        }

        @BeforeTest
        public void launchApplication() {

            String page_url = "https://norwegianairlines-web-nextjs.vercel.app/";

            driver.get(page_url);

            driver.manage().window().maximize();

            //Declare and initialise a fluent wait

            FluentWait wait = new FluentWait(driver)

                    //Wait wait = new FluentWait(driver)

                    //Specify the timeout of the wait
                    .withTimeout(Duration.ofSeconds(10))

                    //Specify polling time
                    .pollingEvery(Duration.ofSeconds(2))
                    .withMessage("User defined Timed out after 30 seconds")

                    //Specify what exceptions to ignore
                    .ignoring(NoSuchElementException.class);
        }


        @AfterTest(alwaysRun=true)
        public void tearDown() {
            if(driver != null) {
                driver.quit();
            }
        }

    }

//How do you scroll till an element is visible in Selenium?
//How do I scroll based on the visibility of the Web element on the page in Selenium?
//​
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript(“arguments[0].scrollIntoView();”, webElement);