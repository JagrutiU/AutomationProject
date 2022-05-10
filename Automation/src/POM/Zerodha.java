package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zerodha {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.CallBrowser();

		WebElement userId = driver.findElement(By.xpath("//input[@id= 'userid']"));
		userId.sendKeys("OKP335");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("06051993");

		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		Thread.sleep(2000);

		WebElement pin = driver.findElement(By.xpath("//input[@id= 'pin']"));
		pin.sendKeys("199365");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
