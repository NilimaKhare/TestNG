package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends BaseTest{
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();

		
	}
	@Test(priority=3)
	public void verifyPimPage() {
		Assert.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}
}
