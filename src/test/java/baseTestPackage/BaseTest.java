package baseTestPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverManager;

public class BaseTest {

	// Invoke and quit the WebDriver

	@BeforeMethod
	public void setUp() throws IOException {

		DriverManager.invokeDriver();

	}

	@AfterMethod
	public void tearDown() {

		DriverManager.quitDriver();

	}

}
