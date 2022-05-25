package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2-Add element butonuna basın
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();


        //3-Delete butonu'nun görünür olduğunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else {
            System.out.println("delete butonu testi FAILED");
        }
        //4-Delete tuşuna basın
        deleteButonu.click();

        //5-"Add/Remove Elements" yazısının görünür olduğunu test edin
        WebElement addRemoveYazıElementi=driver.findElement(By.xpath("//h3"));

        if (addRemoveYazıElementi.isDisplayed()){
            System.out.println("addRemoveYazı testi PASSED");
        }else {
            System.out.println("addRemoveYazı testi FAILED");
        }


        Thread.sleep(3000);
        driver.close();



    }
}
