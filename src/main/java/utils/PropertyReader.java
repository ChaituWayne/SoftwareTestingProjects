package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static FileInputStream fis;
	public static Properties property;

	public static String readKey(String key) throws IOException {

		fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/resources/data.properties");
		property = new Properties();
		property.load(fis);

		return property.getProperty(key);
	}

}
