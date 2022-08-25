package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement txtBoxUsername = driver.findElement(By.xpath("//*[@name='email']") );
		txtBoxUsername. sendKeys ("9527692705");
		
	   WebElement txtBoxPassword = driver.findElement(By.xpath("//*[@name='pass']"));
	   txtBoxPassword.sendKeys ("Anup@123");
	   WebElement login = driver.findElement(By.name ("login"));
	   login.click();
	   driver.findElement(By.linkText("logout")).click();

}
}