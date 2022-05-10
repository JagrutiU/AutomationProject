package Tables;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables3 {

	public static void main(String[] args) throws ParseException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		double m = 0, r = 0;

		// No. of Columns
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr/th"));
		System.out.println("Total No of columns are : " + col.size());
		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println("Total No of rows are : " + rows.size());
		for (int i = 1; i < rows.size(); i++) {
			String max = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody/tr[" + i + "]/td[4]"))
					.getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if (m > r) {
				r = m;
			}
		}
		System.out.println("Maximum current price is : " + r);
	}
}
