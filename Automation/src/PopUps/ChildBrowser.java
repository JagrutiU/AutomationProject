package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ChildBrowser {

	public static void main(String[] args) {

		WebDriver driver = Browser.CallBrowser("https://www.naukri.com/");
		Set<String> address = driver.getWindowHandles();
		Iterator<String> a = address.iterator();
		String title = "Tech Mahindra Limited";
		while (a.hasNext()) {
			driver.switchTo().window(a.next());
			String currentTitle = driver.getTitle();
			if (currentTitle.contains(title)) {
				driver.manage().window().maximize();
			}

		}

	}

}
