import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UyeGirisi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flypgs.com/");
        driver.manage().window().maximize();

        //Üyelik girişi için ilgili alanlar dolduruluyor
        driver.findElement(By.id("header-input-tel2")).sendKeys("5055051111");
        driver.findElement(By.id("intTextBox")).sendKeys("password123");
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/div[2]/ul/li[2]/div[1]/div[2]/div[2]/form/div[5]/div/button/span")).click();


    }
}