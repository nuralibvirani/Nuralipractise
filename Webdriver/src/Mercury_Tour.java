import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_Tour {

    static protected WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");
        driver.findElement(By.name("firstName")).sendKeys("Nur");
        driver.findElement(By.name("lastName")).sendKeys("Vir");
        driver.findElement(By.name("phone")).sendKeys("07867864");
        driver.findElement(By.name("userName")).sendKeys("nuralivii@yahoo.co.uk");
        driver.findElement(By.name("address1")).sendKeys("6 Road");
        driver.findElement(By.name("address2")).sendKeys("Harrow");
        driver.findElement(By.name("city")).sendKeys("London");
        driver.findElement(By.name("state")).sendKeys("Middlesex");
        driver.findElement(By.name("postalCode")).sendKeys("H 8LD");
        Select sel1 = new Select(driver.findElement(By.name("country")));
        sel1.selectByValue("214");
        driver.findElement(By.id("email")).sendKeys("nuralivirani");
        driver.findElement(By.name("password")).sendKeys("abc123");
        driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
        driver.findElement(By.name("register")).click();

        //i am not able to get the login successfull message

        driver.navigate().back();
        driver.navigate().forward();

        Thread.sleep(5000);
        driver.quit();
    }







}
