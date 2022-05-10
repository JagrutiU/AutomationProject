package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExicution {

	WebDriver driver; // global variable

	@BeforeMethod
	public void beforeMethod() {
		driver = Browser.CallBrowser();
	}

	@Test(priority = 1)
	public void loginToZerodha() throws InterruptedException {

		System.out.println("LogIn To Zerodha");
		PoM pom = new PoM(driver);
		pom.sendUser("OKP335");
		pom.sendPass("EDC123456");
		pom.clickLogin();
		Thread.sleep(2000);
		pom.sendPin("654321");
		pom.clickSumbit();
	}

	@Test(dependsOnMethods = "loginToZerodha")
	public void loginToZerodhaWithInvalidCredentials() throws InterruptedException {

		System.out.println("LogIn To Zerodha With Invalid Credentials");
		PoM pom = new PoM(driver);
		pom.sendUser("");
		pom.sendPass("");
		pom.clickLogin();
		Thread.sleep(2000);
		pom.sendPin("654321");
		pom.clickSumbit();
	}

//	@Test(enabled = false)
//	public void aTest() {
//		System.out.println("Demo Test Method");
//	}

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

	@AfterMethod
	public void afterMethod() {
		System.out.println("Method is close");
	}

}
