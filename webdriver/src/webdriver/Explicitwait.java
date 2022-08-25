package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Explicitwait {
	 static WebDriver driver ;
	public void ss() throws IOException {
		TakesScreenshot	scrn = (TakesScreenshot)driver;
		File sourse = scrn.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\nilima\\Documents\\SCREENSHOT\\velocity7.png");
		FileHandler.copy(sourse , destination);
		
	}
public static void main(String[] args) throws InterruptedException  {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
			
		 WebElement firstname = driver.findElement(By.name("email"));
    	 WebElement lastname =  driver.findElement(By.name("pass"));
		
		 sendKeys(driver, firstname ,10 ,"nilima");
		 sendKeys(driver, lastname ,10 ,"khare");
		 
		 WebElement forgotAccount = driver.findElement(By.linkText("Forgotten password?"));
		 clickOn(driver, forgotAccount, 10);
} 
  public static void sendKeys(WebDriver driver ,  WebElement element , int timeout ,String value) {
	  
	 new WebDriverWait(driver ,timeout).
	 until(ExpectedConditions.visibilityOf(element));
	 element.sendKeys(value);
	
} public static void clickOn(WebDriver driver ,  WebElement element , int timeout) {
	
	
	new WebDriverWait(driver,timeout).
	until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	
}


}


