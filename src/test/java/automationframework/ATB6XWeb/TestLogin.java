package automationframework.ATB6XWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestLogin {

	@Test
	public void SampleTest() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com/#/login");

	}

}
