package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselec {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr\r\n");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		boolean check = driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isSelected();
		driver.findElements(By.cssSelector("table.p td input#sex")).get(0).click();
		boolean check1 = driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isSelected();
		
		System.out.println(check);
		System.out.println(check1);
	}
}