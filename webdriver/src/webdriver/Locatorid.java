package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locatorid {


public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	Thread.sleep(500);
	WebElement txtBoxUsername = driver.findElement(By.id("txtUsername") );
	txtBoxUsername. sendKeys ("Admin");
	
   WebElement txtBoxPassword = driver.findElement(By.id("txtPassword"));
   txtBoxPassword.sendKeys ("admin123");
   WebElement login = driver.findElement(By.id ("btnLogin"));
   login.click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
 
   driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
   
          Thread.sleep(1000);
 
  WebElement checkbox =driver.findElement(By.xpath("//*[text()='Goutam.Ganesh']//parent::td//parent::tr//a"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView()", checkbox);
    Thread.sleep(1000);
    checkbox.click();


}

}



