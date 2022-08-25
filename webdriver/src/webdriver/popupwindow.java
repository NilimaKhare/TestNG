package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupwindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		String winId1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		Thread.sleep(2000);
	Set<String> winAll	=driver.getWindowHandles();
	int nowwinIdpresent = winAll.size();
	if(nowwinIdpresent>1) {
		for (String singlewinId:winAll) {
			if(!(singlewinId.equals(winId1))){
				driver.switchTo().window(singlewinId);
				driver.findElement(By.id("login_email1")).sendKeys("Nilima");
			}
		}
	}
	
	else
		driver.findElement(By.id("login_email1")).sendKeys("nilima");
}
}