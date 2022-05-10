package RadioButtons;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadiobutton {

	public static void main(String[] args) throws InterruptedException {

		// Don't forget to change the path of Chromedriver as per the location on your
		// machine

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("http://techcanvass.com/examples/register.html");// to get an url
		driver.manage().window().maximize();

		WebElement TxtFname = driver.findElement(By.xpath(".//*[@id='login']/form/fieldset/p[1]/input[1]"));

		WebElement TxtLname = driver.findElement(By.xpath(".//*[@id='login']/form/fieldset/p[1]/input[2]"));

		WebElement radio1 = driver.findElement(By.xpath(".//*[@id='login']/form/fieldset/p[2]/input[1]"));
		WebElement radio2 = driver.findElement(By.xpath(".//*[@id='login']/form/fieldset/p[2]/input[2]"));

		TxtFname.sendKeys("Meenaxi");
		TxtLname.sendKeys("Kabra");

		if (radio1.isSelected()) {
			Thread.sleep(2000);
			radio2.click();
			Thread.sleep(2000);

		}

		if (radio2.isSelected()) {
			radio1.click();
			Thread.sleep(2000);

		}

		WebElement Checkbx = driver.findElement(By.xpath(".//*[@id='login']/form/fieldset/p[6]/input"));

		Checkbx.click();
		Thread.sleep(2000);

		//driver.quit();

	}

}
