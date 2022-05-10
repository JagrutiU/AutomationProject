package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("http://demo.automationtesting.in/Frames.html");// to get an url
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		button.click();

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);// Frame 1

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(frame2); // Frame 2

		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("Jagruti");

		// driver.switchTo().parentFrame();

		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // switch to default content
		WebElement button2 = driver.findElement(By.xpath("//a[@class='analystic'][1]"));
		button2.click();

		WebElement iframe = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width: 600px'])"));
		driver.switchTo().frame(iframe);
		WebElement input1 = driver.findElement(By.xpath("//input[@type='text']"));
		input1.sendKeys("ByDefaultContent");

	}

}
