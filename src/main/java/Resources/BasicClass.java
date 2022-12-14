package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BasicClass {

	public WebDriver driver; // to resolve driver error
	       //we declare it globally (on the top) for the access in different packages

	public void browserLaunch() throws IOException {

		// to read the file 
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Admin\\eclipse-workspace\\SalesForceProject\\src\\main\\java\\Resources\\data.properties");

		
		//if we want to access the property file
		//=> we need to create object of that file
		
		 
		// to get access of the file
		Properties prop = new Properties(); // make a object of method

		prop.load(file);

		prop.getProperty("browser");

		String browserName = prop.getProperty("browser"); // store it in string

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

			driver.get("https://login.salesforce.com/?locale=in");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {
		browserLaunch();

		// This driver have scope
		driver.get("https://login.salesforce.com/?locale=in");

	}

	/*
	 * private void optimization() { // TODO Auto-generated method stub
	 */

}
