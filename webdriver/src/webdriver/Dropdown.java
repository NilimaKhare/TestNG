package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main (String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mbasic.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("#signup-button input")).click();
	WebElement Day = driver.findElement(By.xpath("//*[@id='day']"));
	WebElement Month = driver.findElement(By.xpath("//*[@id=' month ']"));
	WebElement Year = driver.findElement(By.xpath("//*[@id='year']"));
	
	Thread.sleep(3000);
	Select selday = new Select(Day);
	selday.selectByValue("5");
	
	Thread.sleep(3000);
	Select selmonth = new Select(Month);
	selmonth.selectByIndex(12);
	
	Thread.sleep(3000);
	Select selyear = new Select(Year);
	 selyear.selectByVisibleText("1994");
	 
		
	}
}
