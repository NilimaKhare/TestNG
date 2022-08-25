package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(6000);
		
		
		 List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		 for (WebElement day:days)
			 if (day.getText().equals("5"))
				 day.click();
		 
		  Thread.sleep(5000);
		 List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		 for (WebElement month:months)
			 if (month.getText().equalsIgnoreCase("Nov"))
				 month.click();
		 
		  Thread.sleep(3000);
		 List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		 for (WebElement year:years)
			 if ( year.getText().equals("1994"))
				 year.click();
			driver.manage().deleteAllCookies();
			
		 driver.findElement(By.name("firstname")). sendKeys ("Nilima");

		 driver.findElement(By.name("lastname")). sendKeys ("Khare");
		 Thread.sleep(3000);
		 driver.findElement(By.name("reg_email__")). sendKeys ("nilimakhare1994@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.name("reg_passwd_")). sendKeys ("Nilima@123");
		Thread.sleep(1000);
				 driver.findElement(By.cssSelector("#_58mt input")).click(); 
}
}