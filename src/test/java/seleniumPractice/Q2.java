package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    //...Exercise2
    //1-driver oluşturalım
    //2-java class'ımıza chromedriver.exe'yi tanıtalım
    //3-driver'in tüm ekranı kaplamasını sağlayalım
    //4-drivera sayfanın yüklenmesini 10000 milisaniye(10 saniye) belemesini söyleyelim
    //  eğer öncesinde sayfa yüklenirse ,beklemeyi bıraksın
    //5-"sahibinden.com" adresine gidelim
    //6-Bu web adresinin sayfa başlığını (title) ve adres(url)ini alalım
    //7-Title ve Url'nin  "Oto" kelimesini içerip içermediğini kontrol edelim
    //8-Ardından "gittigidiyor.com" adresine gidelim.
    //9-Bu adresin başlığını alalım ve "Sitesi" kelimesini içerip içermediğini kontrol edelim
    //10-Bir önceki web saysafıma geri dönelim
    //11-Sayfayı yenileyelim
    //12-Daha sonra web saysafıma tekrar dönelim ve olduğumuz sayfayı kapatalım
    //13-En son adım olarak bütün sayfalarımızı kapatmış olalım

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com ");
        Thread.sleep(1000);

        //6-Bu web adresinin sayfa başlığını (title) ve adres(url)ini alalım
        String sahibindenTitle=driver.getTitle();
        System.out.println("sahibinden Title = " + sahibindenTitle);

        String sahibindenUrl=driver.getCurrentUrl();
        System.out.println("sahibindenUrl = " + sahibindenUrl);

        //7-Title ve Url'nin  "Oto" kelimesini içerip içermediğini kontrol edelim
        if (sahibindenTitle.contains("Oto") && sahibindenUrl.contains("Oto")){
            System.out.println("Oto yazızı varsa test PASSED");
        }else {
            System.out.println("Oto yazısı yoksa test FAILED");
        }
        //8-Ardından "gittigidiyor.com" adresine gidelim.
        driver.get("https://www.gittigidiyor.com");

        //9-Bu adresin başlığını alalım ve "Sitesi" kelimesini içerip içermediğini kontrol edelim
        System.out.println(driver.getTitle());
        boolean isTrue=driver.getTitle().contains("Sitesi");
        if (isTrue){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //10-Bir önceki web saysafıma geri dönelim
        driver.navigate().back();

        //11-Sayfayı yenileyelim
        driver.navigate().refresh();

        //12-Daha sonra web saysafıma tekrar dönelim ve olduğumuz sayfayı kapatalım
        driver.navigate().forward();
        driver.close();

        //13-En son adım olarak bütün sayfalarımızı kapatmış olalım
        driver.quit();

    }
}
