package TestCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BasicClass;
import Resources.CommonMethod;
import Resources.Constants;

public class SignUpTestCase extends BasicClass {

	// private static final String CommonMethods = null;

	@Test
	public void verifySignup() throws IOException, InterruptedException {
		// browserLaunch();

		LogInPageObject LPO = new LogInPageObject(driver);
		LPO.clickOnTryForFree().click();

		SignUpPageObject SPO = new SignUpPageObject(driver);

		Thread.sleep(5000);

		SPO.enterFirstname().sendKeys(Constants.firstname);

		SPO.enterLastName().sendKeys(Constants.lastname);

		CommonMethod.SelectDropdown(SPO.selectjobTitle(), 1);

		/*
		 * Select s=new Select(SPO.selectjobTitle()); s.selectByIndex(1);
		 */

		SPO.enterWorkEmail().sendKeys(Constants.workemail);

		SPO.enterCompanyName().sendKeys(Constants.company);

		CommonMethod.SelectDropdown(SPO.selectEmployees(), 1);

		/*
		 * Select s2= new Select(SPO.selectEmployees()); s2.selectByIndex(2);
		 */

		SPO.enterPhoneNo().sendKeys(Constants.phone);

		CommonMethod.SelectDropdown(SPO.selectCountry(), ("India"));

		SPO.clickcheckbox().click();

	}

}
