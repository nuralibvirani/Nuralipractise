import com.google.common.io.ByteSink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

    static protected WebDriver driver;
    public static void main(String[] args){


        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        //C:\Users\Welcome\IdeaProjects\Webdriver\src\BrowserDriver\chromedriver.exe
        driver= new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Nurali");
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("LastName")).sendKeys("Virani");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1978");
        driver.findElement(By.name("Email")).sendKeys("nuralivirani@yahoo.co.uk");
        driver.findElement(By.id("Company")).sendKeys("Virani");
        //driver.findElement(By.tagName("label")).click();
        driver.findElement(By.id("Password")).sendKeys("noorali1");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("noorali1");
        driver.findElement(By.id("register-button")).click();




    }



}
