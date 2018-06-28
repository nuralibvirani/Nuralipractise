import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

    static protected WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demoqa.com/registration/");

        driver.findElement(By.id("name_3_firstname")).sendKeys("Noor");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Vira");


        driver.findElement(By.xpath(".//*[@value='divorced']")).click();
        driver.findElement(By.xpath(".//*[@value='cricket ']")).click();
        Select sel12=new Select(driver.findElement(By.id("dropdown_7")));
        sel12.selectByValue("United Kingdom");
        driver.findElement(By.id("mm_date_8")).sendKeys("1");
        driver.findElement(By.id("dd_date_8")).sendKeys("12");
        driver.findElement(By.id("yy_date_8")).sendKeys("1978");
        driver.findElement(By.id("phone_9")).sendKeys("0786");
        driver.findElement(By.id("username")).sendKeys("noou");
        driver.findElement(By.id("email_1")).sendKeys("noorali@yahoo.com");
        driver.findElement(By.id("description")).sendKeys("Hi to All");
        driver.findElement(By.id("password_2")).sendKeys("abc.007000");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("abc.007000");
        driver.findElement(By.name("pie_submit")).click();

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        driver.navigate().to("https://www.phptravels.net/register");






    }
}
