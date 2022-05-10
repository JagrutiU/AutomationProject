package ScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validation {

	public void test(WebDriver driver) throws IOException {

		WebElement button1 = driver.findElement(By.xpath("//input[@value=\"Option 1\"]"));
		button1.click();

		if (button1.isSelected() != true) {

			ScreenShot.screenShot(driver, "isnotselected");
			System.out.println(button1.isSelected());

		} else {
			ScreenShot.screenShot(driver, "isselected");
			System.out.println(button1.isSelected());
		}

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = Browser.CallBrowser();

		Thread.sleep(2000);

		Validation obj = new Validation();
		obj.test(driver);

	}

}
