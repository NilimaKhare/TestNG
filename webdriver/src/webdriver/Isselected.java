package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Create New Account")).click();
	
		//driver.findElement(By.xpath("//*[text()='Female']//parent::span//*[@name='sex']")).click();

		
		 boolean check = driver.findElements(By.cssSelector("span._5k_3 input")).get(1).isSelected();
		 Thread.sleep(2000);

		 driver.findElements(By.cssSelector("span._5k_3 input")).get(1).click();
	     Thread.sleep(3000);
	     
		 boolean check1 = driver.findElements(By.cssSelector("span._5k_3 input")).get(1).isSelected();
		    Thread.sleep(3000);
		 System.out.println(check);
		    Thread.sleep(3000);
		 System.out.println(check1);
		 
		 
}
}