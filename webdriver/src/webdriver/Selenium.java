package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
public class Selenium {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensourse-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String txturl = driver.getCurrentUrl()	;
		System.out.println(txturl);
		String txttitle = driver.getTitle();
		System.out.println(txttitle);
		driver.close();
		
		
	}	


}
