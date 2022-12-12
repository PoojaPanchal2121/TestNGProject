package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

//parameterization
public class CommonMethod {

	public static void SelectDropdown(WebElement dropdown, int index) {

		Select s = new Select(dropdown);
		s.selectByIndex(index);

	}

	public static void SelectDropdown(WebElement dropdown, String name) {

		Select s = new Select(dropdown);
		s.selectByVisibleText(name);

	}

	public static void handleAssertion(String actualString, String expectedString) {

		SoftAssert assertion = new SoftAssert();

		String actual = actualString;
		String expected = expectedString;

		assertion.assertEquals(actual, expected);

		assertion.assertAll();

	}

}
