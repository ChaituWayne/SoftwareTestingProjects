package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;
import utils.PropertyReader;

public class BasePage {

	// If you want to call something before every Page Object Class Call
	// Keep that code here
	// Its common to all the Pages

	WebDriverWait exp_wait;

	// Constructor
	public BasePage() {

	}

	public void goToVMO() throws IOException {

		DriverManager.getDriver().get(PropertyReader.readKey("url"));
	}

	public void waitForClickableElement(By element) {

		exp_wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		exp_wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void waitForElementToBeSelected(By element) {

		exp_wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		exp_wait.until(ExpectedConditions.elementToBeSelected(element));

	}

	public void waitForVisibleElement(By element) {

		exp_wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		exp_wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}
	
	public void waitForTextInElement(By element,String text) {

		exp_wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		exp_wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));

	}

}
