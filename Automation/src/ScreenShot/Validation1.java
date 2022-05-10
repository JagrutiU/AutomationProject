package ScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validation1 {

	public void test(WebDriver driver) throws IOException {

		WebElement dropdown = driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
		dropdown.click();

		WebElement element = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		element.click();

		WebElement element1 = driver.findElement(By.xpath("//font[text()='DEMO Flash Movie']"));

		if (element1.isDisplayed()) {

			ScreenShot.screenShot(driver, "isnotdisplayed");
			System.out.println(element1.isDisplayed());

		}

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = Browser.CallBrowser();

		Thread.sleep(2000);

		Validation1 obj = new Validation1();
		obj.test(driver);

	}

}
