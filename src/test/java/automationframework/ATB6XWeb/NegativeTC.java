package automationframework.ATB6XWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTestPackage.BaseTest;
import driver.DriverManager;
import pageObjects.LoginPageObjects;
import utils.PropertyReader;

public class NegativeTC extends BaseTest {

	LoginPageObjects loginpage;

	@Test
	public void invalidLogin() throws IOException {

		loginpage = new LoginPageObjects(DriverManager.driver);
		loginpage.goToVMO();
		loginpage.loginWithInvalidCredenttials(PropertyReader.readKey("invalid_username"),
				PropertyReader.readKey("invalid_password"));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String error_text = loginpage.getErrorMessaage();

		Assert.assertEquals(error_text, PropertyReader.readKey("error_message"));

	}

}
