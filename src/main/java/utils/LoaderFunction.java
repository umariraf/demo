package utils;

import utils.CommonFunctions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class LoaderFunction extends CommonFunctions {
	Properties properties;

	public Properties locators(String filename) {
		try {
			FileInputStream Locator = new FileInputStream(filename);
			properties = new Properties();
			properties.load(Locator);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}
