package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class NopOpera  {
    public static void main(String[] args) {

        // 2  Set up a WebDriver path
        System.setProperty("webdriver.opera.driver","C:\\Software\\Driver\\operadriver.exe");

        // 1 Create an instance of WebDriver
        WebDriver driver = new OperaDriver();

        // 3 Navigate to webpage
        driver.get("https://demo.nopcommerce.com");

        // 3.1 Maximize the window
        driver.manage().window().maximize();

        // 4 get Titlepage
        String Titlepage = driver.getTitle();
        System.out.println("This is Title page :" + driver.getTitle());

        // 5 Expected vs Actual validation
        String ExpectedPageTitle = "nopCommerce demo store";
        if(ExpectedPageTitle.equals(driver.getTitle())){
            System.out.println("The PageTitle is Correct");
        }else {
            System.out.println("The PageTitle is incorrect");
        }

        // 6. Navigate to Refresh
        driver.navigate().refresh();


        // 7. Get current URL
          System.out.println("This is current URL : " + driver.getCurrentUrl());
          driver.getCurrentUrl();

        //8 Quit WebBrowser

        driver.quit();









    }
}
