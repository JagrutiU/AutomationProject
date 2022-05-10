package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("http://demo.automationtesting.in/Frames.html");// to get an url
		driver.manage().window().maximize();

//        driver.switchTo().frame(0); // by index
//        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
//        input.sendKeys("ByIndex");

//        driver.switchTo().frame("singleframe"); // by ID
//        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
//        input.sendKeys("ByID");
//        
//        driver.switchTo().frame("SingleFrame"); // by Name
//        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
//        input.sendKeys("ByName");

		WebElement iframe = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width: 600px'])"));
		driver.switchTo().frame(iframe); // by WebElement
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("ByWebElement");
	}

}
