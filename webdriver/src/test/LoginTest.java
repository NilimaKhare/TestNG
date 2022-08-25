package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority=2,groups="smoke")
	public void verifyLogin() {
		loginPage.loginMethod();
		Assert.assertEquals(pimPage.titleOfPimPage(),"PIM");
		
	}
}
