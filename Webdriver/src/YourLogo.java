import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {


    static protected WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();





        driver.get("http://automationpractice.com/index.php?controller=authentication");

        driver.findElement(By.name("email_create")).sendKeys("nuralivirani@yahoo.co.uk");
        driver.findElement(By.id("SubmitCreate")).click();

        //i used Thread because i was not able to go forward and try to get help with all but nothing resolve
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.name("id_gender")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Nura");
        driver.findElement(By.id("customer_lastname")).sendKeys("Vira");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("passwd")).sendKeys("abc123");
        Select sel1=new Select(driver.findElement(By.id("days")));
        sel1.selectByValue("13");
        Select sel2=new Select(driver.findElement(By.id("months")));
        sel2.selectByValue("9");
        Select sel3=new Select(driver.findElement(By.id("years")));
        sel3.selectByValue("1978");
        driver.findElement(By.id("newsletter")).click();
         driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("company")).sendKeys("VIR");
        driver.findElement(By.className("form-control")).sendKeys("540 road");
        driver.findElement(By.className("form-control")).sendKeys("harrow");
        driver.findElement(By.name("city")).sendKeys("London");

        driver.findElement(By.name("phone")).sendKeys("04747");
        driver.findElement(By.id("phone_mobile")).sendKeys("74663737");
        driver.findElement(By.id("alias")).sendKeys("sjskksls");
        driver.findElement(By.id("submitAccount")).click();
        driver.wait(10);

        //driver.quit();


    }
}
