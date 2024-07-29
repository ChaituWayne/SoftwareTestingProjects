package automationframework.ATB6XWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class NegativeTC {

	LoginPageObjects loginpage;

	@Test
	public void invalidLogin() {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com/#/login");
		loginpage = new LoginPageObjects(driver);
		loginpage.loginWithInvalidCredenttials("hellobabai@gmail.com", "heybabu@123");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String error_text = loginpage.getErrorMessaage();

		Assert.assertEquals(error_text, "Your email, password, IP address or location did not match");
		driver.quit();

	}

}
