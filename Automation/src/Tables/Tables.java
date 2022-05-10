package Tables;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver = Browser.CallBrowser();
		// No.of Columns
		List<WebElement> colomn = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr/th"));
		System.out.println("No of cols are : " + colomn.size());
		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		System.out.println("No of rows are : " + rows.size());

	}

}
