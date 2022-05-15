import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Control {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flypgs.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        //Giriş sayfasındaki Ucuz Uçak Bileti Ara,Online Check-In butonlarının çalışıp çalışmadığı kontrol ediliyor.
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sb-site\"]/div[6]/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[1]/ul/li[4]/a")).click();
        Thread.sleep(2000);

        String originalHandle = driver.getWindowHandle();


        //Hediye Kart butonu çalıştığı için yeni sekme açıyor eski sekmeye dönmek aşağıdaki için if koşulunu kullanıyoruz.
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(originalHandle);

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[1]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[1]/ul/li[6]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[1]/ul/li[7]/a")).click();
        Thread.sleep(2000);


        //Covid Hub butonu çalıştığı için yeni sekme açıyor eski sekmeye dönmek aşağıdaki için if koşulunu kullanıyoruz.
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }


        }
    }
}

