package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

	WebDriver driver;

	// Contains Login Page locators & respective Action methods

	// Constructor
	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	private By username = By.id("login-username");
	private By password = By.name("password");
	private By signInButton = By.xpath("//button[@type='submit']");
	private By errorMessage = By.cssSelector("div[id='js-notification-box-msg']");

	// Action Methods
	public void loginWithInvalidCredenttials(String user, String pwd) {

		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();

	}

	public String getErrorMessaage() {
		String error = driver.findElement(errorMessage).getText();
		return error;
	}

}
