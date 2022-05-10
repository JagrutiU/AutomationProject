package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		// driver.get("https://www.facebook.com/");// to get an url
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();// to maximize window
//       driver.navigate().refresh();
//       driver.navigate().back();
//       driver.navigate().forward();
		// driver.close(); to close chrome
//       driver.manage().window().minimize();   //to manimize window
//       driver.manage().window().maximize();
		// driver.getTitle(); to get page title
		String title = driver.getTitle();
		System.out.println(title);
//       String actualTitle = "Facebook – log in or sign up";
//       if(actualTitle.equals(title)) {
//    	   System.out.println("Test Pass");
//       }
//       else {
//    	   System.out.println("test fail");
//       }

		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
