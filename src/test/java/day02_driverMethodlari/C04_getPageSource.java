package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {

        //amazon sitesine gidip kaynak kodlarında "spend less" yazdığını test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodları=driver.getPageSource();
        String arananKelime="Spend less";

        if (sayfaKaynakKodları.contains(arananKelime)){
            System.out.println("Kaynak kodu testi PASSED");
        }else {
            System.out.println("Kaynak kodlarında " +arananKelime+"yok,test FAILED");
        }
        driver.close();


    }
}
