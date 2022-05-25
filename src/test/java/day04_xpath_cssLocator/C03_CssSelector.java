package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        //1)Bir class oluşturun :Locators_css
        //2)Main method oluşturun ve aşağıdaki görevi tamamlayın


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //3) a. Verilen web sayfasına gidin.   https://a.testaddressbook.com/sign_in
        driver.get(" https://a.testaddressbook.com/sign_in");
        //   b. Locate email textbox
        WebElement mailTextBox=driver.findElement(By.cssSelector("session_email"));

        //   c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_pasword"));

        //   d. Locate signin button
        WebElement signinButonu=driver.findElement(By.cssSelector("input[value='Sign in]"));

        //   e. Aşağıdaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıkalayın
        //
        //   i. Usarname  : testtechproed@gmail.com
        mailTextBox.sendKeys(" testtechproed@gmail.com");
        //   ii.Password  :Test1234!
        passwordTextBox.sendKeys("Test1234!");
        signinButonu.click();
        driver.close();


    }
}
