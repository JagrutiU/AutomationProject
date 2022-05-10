package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void screenShot(WebDriver driver, String name) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\Selenium\\ "
				+ name + "  .jpeg");
		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.CallBrowser();
		ScreenShot.screenShot(driver, "123");

	}

}
