package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

//        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//        Select value = new Select(dropdown);
//       // value.selectByValue("Google");  //by value
//       // value.selectByIndex(2);  //index starts with 0
//          value.selectByVisibleText("Google"); //by visible text

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");// to get an url
		driver.manage().window().maximize();
		Select listbox = new Select(driver.findElement(By.xpath("//select[@id=\"first\"]")));
		listbox.selectByValue("Google");
		Thread.sleep(5000);

		// prints first option which is selected
		WebElement option = listbox.getFirstSelectedOption();
		System.out.println(option.getText());

		System.out.println("—Showing all the selected options—-“");

		// Listing down all the selected options
		List<WebElement> options = listbox.getAllSelectedOptions();
		for (WebElement option2 : options) {
			System.out.println(option2.getText()); // Prints “Option”, followed by “Not Option”
		}

		System.out.println("—Showing all the options—-“");

		List<WebElement> optionss = listbox.getOptions();
		for (WebElement option3 : optionss) {
			System.out.println(option3.getText());
		}

		// Quitting the web driver
		driver.quit();

	}

}
