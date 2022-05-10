package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {

	public void alertPopup(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement clickme = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickme.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		// a.accept();
		String text = a.getText();
		System.out.println(text);
		a.dismiss();

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.CallBrowser("https://demoqa.com/alerts");
		AlertPopup obj = new AlertPopup();
		obj.alertPopup(driver);

	}

}
