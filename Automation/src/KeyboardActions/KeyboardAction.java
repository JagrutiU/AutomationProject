package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public void keyboardActions(WebDriver driver) throws InterruptedException {

		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Jagruti");
		Actions action = new Actions(driver);

		action.sendKeys(Keys.TAB);
		action.sendKeys("jagruti@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("At post Wani");

		// select All
		action.keyDown(Keys.CONTROL);// help to press any key on keyboard
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);// helps to release the press key

		// copy selected
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);

		// change focas to next feild
		action.sendKeys(Keys.TAB);

		// paste the copied data
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);

		action.sendKeys(Keys.TAB);

		action.sendKeys(Keys.ENTER);

		action.build().perform();

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.CallBrowser();
		KeyboardAction obj = new KeyboardAction();
		obj.keyboardActions(driver);

	}

}
