package driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import utils.PropertyReader;

public class DriverManager {

	// Creating variables and Methods in Static as there is no need of creating
	// object for this class to use

	// We will be only using Static for DriverManager class because we dont want to
	// create object for this class again and again

	public static WebDriver driver;

	public static void setDriver(WebDriver driver) {

		DriverManager.driver = driver;
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static WebDriver invokeDriver() {

		String browser=null;
		try {
			browser = PropertyReader.readKey("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch (browser) {

		case "edge":
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--guest");
			driver = new EdgeDriver(options);
			break;
		case "chrome":
			ChromeOptions choptions = new ChromeOptions();
			choptions.addArguments("--start-maximized");
			driver = new ChromeDriver(choptions);
			break;

		}
		return driver;
	}

	public static void quitDriver() {

		driver.quit();
	}

}
