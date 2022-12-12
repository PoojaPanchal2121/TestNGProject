package TestCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObject;
import Resources.BasicClass;
import Resources.CommonMethod;
import Resources.Constants;

public class LogInTestCase extends BasicClass {

	@Test
	public void login() throws IOException {
		// browserLaunch();

		// This driver have scope
		// driver.get("https://login.salesforce.com/?locale=in");

		LogInPageObject LPO = new LogInPageObject(driver);

		LPO.enterUsername().sendKeys(Constants.username);
		LPO.enterPassword().sendKeys(Constants.password);
		LPO.clickOnLogin().click();

		CommonMethod.handleAssertion(LPO.getErrorMessage().getText(), Constants.ErrorMessage);

	}

}
