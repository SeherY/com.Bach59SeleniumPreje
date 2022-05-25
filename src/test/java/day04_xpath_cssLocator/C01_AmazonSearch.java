package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {

        //Main method oluşturun ve aşağıdaki görevi tamamlayın
        // a.amazon web saysafasına gidin.https://www. amazon.com/
        // b.Search(ara) "city bike"
        // c.Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        // d."Shopping" e tıklayın
        // e.Sonra karşınıza çıkan ilk sonucun resmine tıklayın


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a.amazon web saysafasına gidin.https://www. amazon.com
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // b.Search(ara) "city bike"
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        // c.Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonuçYazısıElementi = istenenElementListesi.get(0);
        System.out.println(sonuçYazısıElementi.getText());


        // e.Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ürünResimleriList = driver.findElements(By.className("s-image"));
        WebElement ilkÜrünResmi = ürünResimleriList.get(0);
        ilkÜrünResmi.click();


    }
}