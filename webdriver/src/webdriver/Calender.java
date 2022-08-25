package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Calender {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		 
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

      driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='datepick-month-year' and @title='Change the year']//option[1]")).click();
		 WebElement years = driver.findElement(By.xpath("//*[@class='datepick']//select [@title='Change the year']"));
         Select year = new Select(years);
           year. selectByVisibleText("1994");
           Thread.sleep(4000);
		 
		List<WebElement> months = driver.findElements(By.xpath("//*[@class='datepick-month-year'and @title='Change the month']//parent::div//option"));
		 for (WebElement month:months)
			 if (month.getText().equalsIgnoreCase("November"))
				 month.click();
		 
	            Thread.sleep(4000);
     
		
	 	  driver.findElement(By.xpath("//*[title='Select Saturday, Nov 5, 1994']")).click();
	 		     /*for (WebElement day:days)
	 			 if (day.getText().equals("5"))
	 			          day.click();*/
				 
              
}
}
