package webdriver;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	static WebDriver driver;
	
	   public void ss() throws IOException{
		   
		TakesScreenshot  scrnshot =(TakesScreenshot)driver;
		File sourse  = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File  ("C:\\Users\\nilima\\Documents\\SCREENSHOT\\velocity7.png");
		FileHandler.copy(sourse, destination);
		
		} 
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
	      driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		WebElement  iframe = driver.findElement(By.cssSelector(".demo-frame")); 
		driver.switchTo().frame(iframe);
		
		WebElement sourse = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(sourse).build().perform();
		Thread.sleep(1000);
		act.moveToElement(sourse,550,0).release().build().perform();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Demos']")).click();
		Thread.sleep(1000);
		Screenshot obj = new Screenshot();
		obj.ss();
}
}