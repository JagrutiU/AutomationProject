package ExcelSheet;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = Browser.CallBrowser();
		String userName = TestData.Excel(1, 0);
		String passward = TestData.Excel(1, 1);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(userName);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(passward);

	}

}
