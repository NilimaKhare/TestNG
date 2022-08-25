package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	
static WebDriver driver;
@BeforeTest (groups="browserlaunch")
public void browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}	

@Test(priority=1, groups="smoke")
public void verifyurl() {
String url1 = driver.getCurrentUrl();
SoftAssert SoftAssert = new SoftAssert ();
Assert.assertEquals(url1, "https://www.flipkart.com/","verifyingurl");
System.out.println("next line after solftassert");	
SoftAssert.assertAll();
}

@Test(priority=2, groups="smoke")
public void verifytitle() throws InterruptedException {
	Thread.sleep(2000);
String pagetext = driver.findElement(By.cssSelector("._36KMOx")).getText();
SoftAssert SoftAssert = new SoftAssert ();
Assert.assertEquals(pagetext, "Login","verifyintitle");
System.out.println("next");
SoftAssert.assertAll();
}

@Test(priority=3, groups="regression")
public void verifyuppericon() throws InterruptedException { 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
String icon = driver.findElement(By.xpath("//*[text()='Grocery']")).getText();
Assert.assertEquals(icon, "Grocery","iconpresent");
}
@Test(priority=4, groups="regression")
public void verifyuppericon1() { 
String icon = driver.findElement(By.xpath("//*[text()='Top Offers']")).getText();
Assert.assertEquals(icon, "Top Offers","icon present");
}
@AfterTest 
public void teardown() {
	driver.quit();
}
}
