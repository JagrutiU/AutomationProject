package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public void amazonPrimeVideo(WebDriver driver) throws InterruptedException {

		WebElement accounts = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(accounts);
		action.perform();

		WebElement prime = driver.findElement(By.xpath("//span[text()=\"Your Prime Video\"]"));
		action.moveToElement(prime);
		action.click();

		action.build().perform();

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.CallBrowser();
		MouseAction obj = new MouseAction();
		obj.amazonPrimeVideo(driver);

	}

}
