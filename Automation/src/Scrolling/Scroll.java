package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

	public void scrolling(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//h2[text()='Artificial Intelligence']"));

		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",
		// element);

		JavascriptExecutor e = ((JavascriptExecutor) driver);
		e.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.CallBrowser();
		Thread.sleep(2000);
		Scroll obj = new Scroll();
		obj.scrolling(driver);
	}
}
