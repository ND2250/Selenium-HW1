package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewBrowserScript {
    public static void main(String[] args) {

        // 2 . Set up the Firefox drive path\
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");

        // 1 Create an instance of WebDriver
        FirefoxDriver driver = new FirefoxDriver();

        // 3 Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");

        // 3A Maxmise the window
        driver.manage().window().maximize();

        // 4 Get a page title
        String TtitelPage = driver.getTitle();
        System.out.println("This is the TitilePage : " + driver.getTitle());

        // 5 Expected vs Actual Validation
        String ExpectedTitlepPage = "nopCommerce demo store";
        if(ExpectedTitlepPage.equals(driver.getTitle())){
            System.out.println("The TitlePage is correct");
        }else{
            System.out.println("The Titlepage is incorrect ");
        }

        // 6 Navigation to the Back
        driver.navigate().back();

        // 7.Navigation to Refresh
        driver.navigate().refresh();

        // 8 Get current URL
        System.out.println("This is current URL : " + driver.getCurrentUrl() );


        // 9 Close the browser
        driver.close();



    }
}
