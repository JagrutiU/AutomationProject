package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExicution {
	@Test
	public void loginToZerodha() throws InterruptedException {

		WebDriver driver = Browser.CallBrowser();

		PoM pom = new PoM(driver);
		pom.sendUser("OKP335");
		pom.sendPass("EDC123456");
		pom.clickLogin();
		Thread.sleep(2000);
		pom.sendPin("654321");
		pom.clickSumbit();
	}

	@Test
	public void loginToZerodhaWithInvalidCredentials() throws InterruptedException {

		WebDriver driver = Browser.CallBrowser();

		PoM pom = new PoM(driver);
		pom.sendUser("");
		pom.sendPass("");
		pom.clickLogin();
		Thread.sleep(2000);
		pom.sendPin("654321");
		pom.clickSumbit();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}
