import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;


public class UcusBilgileri {


    public static void main(String[] args) throws InterruptedException {
        //Ucuz Uçak Bileti almak için Nereden-Nereye ve Tarih bilgileri seçiliyor.
        String month="Haziran 2022";
        String day="30";
        String month2="Temmuz 2022";
        String day2="31";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flypgs.com/?ds_rl=1256634&ds_rl=1263092&ds_rl=1263092&gclid=Cj0KCQjw1N2TBhCOARIsAGVHQc4GWkDrkkLBtNBzuKjfNMTqOBL5G0DgOLvAOowwKnVzLrlHdJQ1yXsaAnP8EALw_wcB&gclsrc=aw.ds");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[2]/div[1]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Istanbul Tümü");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[2]/div[2]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Ankara");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("dp1")).click();
        Thread.sleep(1000);

        //Belirttiğimiz Gidiş-tarihi Dönüş-tarihi seçimi yapılıyor.
        while (true){
            String text = driver.findElement(By.xpath("//*[@id=\"search-flight-datepicker-departure\"]/div/div[1]/div/div")).getText();
                if(text.equals(month)){
                   break;
               }else{
                   driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[1]/div/div[2]/div/div[2]/div/a")).click();
               }
            String text2 = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[2]/div/div[2]/div/div[2]/div/div/span[1]")).getText();
               if(text2.equals(month2)){
                   break;
               }else{
                   driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[1]/div/div[2]/div/div[2]/div/a")).click();
               }
        }

        //Yolcular botonu çalışıyor mu diye kontrol ediyoruz.
        driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[3]/div[3]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[3]/div/div[2]/a")).click();
        driver.findElement(By.xpath("//button[text()='Ucuz Uçuş Ara']")).click();




        }
    }
