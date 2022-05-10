package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public void dragDrop(WebDriver driver) throws InterruptedException {

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.xpath("//img[@src=\"images/high_tatras4_min.jpg\"]"));
		WebElement destination = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();

		Thread.sleep(2000);

		WebElement source1 = driver.findElement(By.xpath("//img[@src=\"images/high_tatras4_min.jpg\"]"));
		WebElement des = driver.findElement(By.xpath("//ul[@Id='gallery']"));

		action.dragAndDrop(source1, des).perform();

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.CallBrowser();
		DragDrop obj = new DragDrop();
		obj.dragDrop(driver);

	}

}
