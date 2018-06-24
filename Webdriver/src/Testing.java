import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

    static protected WebDriver driver;
    public static void main(String[] args){


        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Nurali");
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("LastName")).sendKeys("Virani");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("September");

    }



}
