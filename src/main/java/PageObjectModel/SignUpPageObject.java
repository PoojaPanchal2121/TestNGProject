package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;

	By FirstName = By.xpath("//input[@name='UserFirstName']");

	By LastName = By.xpath("//input[@name='UserLastName']");

	By JobTitle = By.xpath("//select[@name='UserTitle']");

	By WorkEmail = By.xpath("//input[@name='UserEmail']");

	By Company = By.xpath("//input[@name='CompanyName']");

	By Employees = By.xpath("//select[@name='CompanyEmployees']");

	By Phone = By.xpath("//input[@name='UserPhone']");

	By Country = By.xpath(" //select[@name='CompanyCountry']");

	By Checkbox = By.xpath("(//div[@class='checkbox-ui'])[1]");

	public SignUpPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterFirstname() {

		return driver.findElement(FirstName);
	}

	public WebElement enterLastName() {

		return driver.findElement(LastName);
	}

	public WebElement selectjobTitle() {

		return driver.findElement(JobTitle);
	}

	public WebElement enterCompanyName() {

		return driver.findElement(Company);
	}

	public WebElement enterWorkEmail() {
		return driver.findElement(WorkEmail);
	}

	public WebElement selectEmployees() {
		return driver.findElement(Employees);
	}

	public WebElement enterPhoneNo() {
		return driver.findElement(Phone);
	}

	public WebElement selectCountry() {
		return driver.findElement(Country);

	}

	public WebElement clickcheckbox() {
		return driver.findElement(Checkbox);

	}

	/*
	 * public WebElement clickCheckbox() { return driver.findElement(Checkbox); }
	 */

}
