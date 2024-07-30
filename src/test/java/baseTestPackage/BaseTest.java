package baseTestPackage;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverManager;

public class BaseTest {

	// Invoke and quit the WebDriver

	@BeforeMethod
	public void setUp(){

		DriverManager.invokeDriver();

	}

	@AfterMethod
	public void tearDown() {

		DriverManager.quitDriver();

	}

}
