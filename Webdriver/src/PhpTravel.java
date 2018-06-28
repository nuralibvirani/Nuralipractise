import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravel {

        static protected WebDriver driver;

        public static void main(String[] args){

            System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.phptravels.net/register");

            driver.findElement(By.name("firstname")).sendKeys("Nure");
            driver.findElement(By.name("lastname")).sendKeys("gdgd");
            driver.findElement(By.name("phone")).sendKeys("7446677");
            driver.findElement(By.name("email")).sendKeys("nurali@usgsh.com");
            driver.findElement(By.name("password")).sendKeys("abc12345");
            driver.findElement(By.name("confirmpassword")).sendKeys("abc12345");

            driver.findElement(By.xpath(".//*[@type='submit']")).click();

            driver.navigate().refresh();




        }






}
