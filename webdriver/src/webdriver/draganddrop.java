package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	static WebDriver driver;
	public static void main (String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement sourseelement = driver.findElements(By.xpath("//*[@id='fourth']//a")).get(0);
	Thread.sleep(2000);
	WebElement targetelemrnt = driver.findElement(By.xpath("//*[@id='amt7']//li"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.dragAndDrop(sourseelement, targetelemrnt).release().build().perform();
	}
	}