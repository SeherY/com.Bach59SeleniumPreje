package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

    //...Exercise1...
    //Create a new class under Q1 create main method
    //Set path
    //Create chrome driver
    //Maximize the window
    //Open google home page https://www.google.com/
    //on the same class Navigate to amazon home page https://www.amazon.com/Navigate back to google
    //Navigate forward to amazon
    //Refresh the page
    //Close/Quit the browser
    //And last step  : print "all ok" on console

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");

        //on the same class Navigate to amazon home page https://www.amazon.com/Navigate back to google
        driver.navigate().to(" https://www.amazon.com/");
        driver.navigate().back();

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        //Close/Quit the browser
        driver.close();

        //And last step  : print "all ok" on console
        System.out.println("all ok");


    }
}
