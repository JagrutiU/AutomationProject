package POM;

import org.openqa.selenium.WebDriver;

public class Test {

	public void test1() throws InterruptedException {

		WebDriver driver = Browser.CallBrowser();
		PoM obj = new PoM(driver);
		obj.sendUser("OKP335");
		obj.sendPass("06051993");
		obj.clickLogin();
		Thread.sleep(2000);
		obj.sendPin("199365");
		Thread.sleep(2000);
		obj.clickSumbit();
	}

	public static void main(String[] args) throws InterruptedException {
		Test obj = new Test();
		obj.test1();
	}

}
