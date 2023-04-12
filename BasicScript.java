package nopcommerce;


import org.openqa.selenium.edge.EdgeDriver;

public class BasicScript {
    public static void main(String[] args) {


        // 2 Set up the Edgedriver path
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\Updated Edgedriver\\msedgedriver.exe");
        // 1 create an instance EdgeDriver
        EdgeDriver driver = new EdgeDriver();
        // 3 Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
        // 3A. Maximise the window
        driver.manage().window().maximize();
        // 4 Get the page title
        String PageTitle = driver.getTitle();
        System.out.println("The Page Title is :" + driver.getTitle());
        // 5 Expected vs Actual - validation
        String ExpectedPageTitle = "nopCommerce demo store";
        if(ExpectedPageTitle.equals(driver.getTitle())){
            System.out.println("Page title is correct");
        }else{
            System.out.println("Page title is incorrect");
        }
        // 6 Navigation Back
        driver.navigate().back();
        // 7 Navigation forward
        driver.navigate().forward();
        // 8 refresh
        driver.navigate().refresh();
        // 9 Get Current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        driver.getCurrentUrl();
        // 10 close the browser
        driver.close();







    }
}
