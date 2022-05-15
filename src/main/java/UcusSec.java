import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;
public class UcusSec {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.flypgs.com/booking?language=TR&adultCount=1&childCount=0&infantCount=0&soldierCount=0&arrivalPort=ESB&departurePort=IST_SAW&currency=TL&dateOption=1&departureDate=2022-06-30&returnDate=2022-07-31");
        driver.manage().window().maximize();

        //Gidiş için Uçuş Tarihi seçimi yapılıyor.
        driver.findElement(By.xpath("//button[@class='item-content'][1]")).click();
        driver.findElement(By.xpath("//div[@class='package-card'][1]")).click();

        //Dönüş için Uçuş Tarihi seçimi yapılıyor.
        driver.findElement(By.xpath("//button[@class='item-content'][1]")).click();
        driver.findElement(By.xpath("//div[@class='package-card'][1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[7]/div[1]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div/div[2]/div/div/div[3]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div/div[3]/button[1]/div")).click();

        //Açılan sayfada Misafir olarak devam et butonuna basıp yolcu bilgilerinin olduğu sayfaya yönlendiriliyoruz.
        driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/div[3]/button[3]")).click();

        //Yolcu ve İletişim Bilgileri kısmına bilgileri gönderiyoruz.
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[1]/div/div/div/input")).sendKeys("Elgin");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[2]/div/div/div/input")).sendKeys("Erkoç");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input")).sendKeys("07");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/input")).sendKeys("02");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[3]/div[2]/div[1]/div[3]/div/div/div/input")).sendKeys("1997");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[4]/div[2]/div/label[1]/span[1]/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[5]/div[1]/div/div[2]/div[1]/div/div/input")).sendKeys("555");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[5]/div[1]/div/div[2]/div[2]/div/div/input")).sendKeys("5555555");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[6]/div/div[1]/div[2]/label[1]/span[1]/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[1]/div/div/form/div/div/div[6]/div/div[2]/div/div/div/input")).sendKeys("11122233456");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[4]/button")).click();

        //Devam butonundan sonra mail kısmı açılıyor.
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[2]/div/form/div/div[2]/div[4]/div/div/div/input")).sendKeys("elgin123@gmail.com");

        //Tekrar Devam butonuna tıklıyoruz.
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div[2]/div/div[4]/button")).click();

        //Koltuk Seçimi
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[2]/div[5]/div[3]/div[2]/div[1]/div[2]/div[3]/div/div[1]/button[1]/svg")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[2]/div[5]/div[3]/div[4]/button")).click();

        /*Koltuk Seçimini yaptıktan sonra Yemek Seçimi,Bagaj Seçimi,Uçak İçi Eğlence Seçimi ve Diğer hizmetler
        butonlarına kontrol amaçlı birer kez tıklıyoruz
         */
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div[4]/div/div/div/div[2]/button/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div[4]/div/div/div/div[3]/button/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div[4]/div/div/div/div[4]/button/div[1]/svg[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div[4]/div/div/div/div[5]/button/div[1]/svg")).click();
        Thread.sleep(2000);

        //Sonrasında Ödemeye Devam butonuna tıklatıyoruz.
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[2]/div[5]/div[4]/button")).click();









    }
}