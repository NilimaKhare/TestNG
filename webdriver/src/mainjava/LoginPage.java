package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;
public class LoginPage extends  BaseTest{
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement userName;

	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement passWord;

	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;

	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod(){
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
		}

}
