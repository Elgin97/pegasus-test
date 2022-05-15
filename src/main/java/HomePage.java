import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flypgs.com/");
        driver.manage().window().maximize();

        //Açılan sayfada üyelik bilgileri giriliyor.
        driver.findElement(By.linkText("Üyelik Oluştur")).click();
        driver.get("https://web.flypgs.com/signup");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[1]/div[1]/div/div/div/input")).sendKeys("Elgin");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[1]/div[2]/div/div/div/input")).sendKeys("Erkoç");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[1]/div[3]/div/div[2]/div[1]/div/div/input")).sendKeys("555");
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/div[2]/div/form/div/div[3]/div[1]/div[3]/div/div[2]/div[2]/div/div/input")).sendKeys("2550505");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[1]/div[4]/div/div/div/input")).sendKeys("elgin123@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[2]/div[3]/div[1]/label/span[1]/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[4]/label/span[1]/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/form/div/div[3]/div[5]/div")).click();


    }
}
