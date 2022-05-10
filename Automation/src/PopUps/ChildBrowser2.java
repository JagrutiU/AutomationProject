package PopUps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ChildBrowser2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.CallBrowser("https://www.naukri.com/");
		String main1 = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		List<String> address = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(address.get(0));
		driver.switchTo().window(address.get(0));
		System.out.println(driver.getTitle());

		System.out.println(address.get(1));
		driver.switchTo().window(address.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());


		System.out.println(address.get(2));
		driver.switchTo().window(address.get(2));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		System.out.println(address.get(3));
		driver.switchTo().window(address.get(3));
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		Thread.sleep(1000);

//		driver.quit();

	}

}
