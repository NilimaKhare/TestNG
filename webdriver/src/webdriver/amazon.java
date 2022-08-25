package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		      driver.get("https://www.amazon.in");
		      driver.manage().window().maximize();
		
		  
		
	      driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T-shirt");
	           Thread.sleep(1500);
	      driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

		  Set<String> allwindows = driver.getWindowHandles();
		  Iterator <String>  win   = allwindows.iterator();
		  
		  String parentid = win.next(); 
		  String child1 = win.next();
		  String child2 = win.next();
	      driver.switchTo().window(parentid);
	     
          driver.findElement(By.linkText("AELOMART Men's T Shirt-(Amt250105-P_Green)")).click();
	              Thread.sleep(1500);
	              driver.switchTo().window(child1);
	      driver.findElement(By.xpath("//input[@id='add-to-cart-button'][1]")).click();
		    
		  driver.switchTo().window(child2);
		  driver.findElement(By.name("proceedToRetailCheckout")).click();
	 
}
}