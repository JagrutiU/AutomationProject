package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Excel {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create an object of File class to open xlsx file
		File file = new File(
				"C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\ExcelSheet\\TestData.xlsx");
		// Create an object of FileInputStream class to read excel file
		FileInputStream fis = new FileInputStream(file);
		// Creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// Creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Data");

		/*
		 * XSSFRow row = sheet.getRow(1); XSSFCell cell = row.getCell(5); String address
		 * = cell.getStringCellValue(); System.out.println(address);
		 */

		// get all rows in the sheet
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		System.out.println(rowcount);

		// Chrome intializing and get url
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Form
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
		WebElement email = driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		WebElement gender = driver.findElement(By.xpath("//input[@id=\"gender-radio-2\"]"));
		WebElement mobile = driver.findElement(By.xpath("//input[@id=\"userNumber\"]"));
		WebElement address = driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));

		// iterate over all the row to print the data present in each cell.
		for (int i = 1; i < rowcount; i++) {
			firstname.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			lastname.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
			gender.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
			mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
			address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());

			/*
			 * WebElement month = driver.findElement(By.tagName("select")); //WebElement
			 * year = driver.findElement(By.xpath(
			 * "//select[@class=\"react-datepicker__year-select\"]")); Select date1 = new
			 * Select(month); date1.selectByValue("10"); Select year1 = new Select(month);
			 * year1.selectByValue("1993");
			 * driver.findElement(By.xpath("//div[text()=\"4\"]")).click();
			 */

			// click gender radio button using javascript
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", gender);

			Thread.sleep(500);
			WebElement submit = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
			js.executeScript("arguments[0].click();", submit);
			// submit.click();

			WebElement display = driver.findElement(By.xpath("//div[text()=\"Thanks for submitting the form\"]"));

			XSSFCell cell = sheet.getRow(i).createCell(6); // creating new cell

			if (display.isDisplayed()) {
				cell.setCellValue("Pass");

				File source = ((TakesScreenshot) driver).getScreenshotAs((OutputType.FILE));
				File dest = new File(
						"C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\Selenium\\ThankYou.jpeg");
				FileHandler.copy(source, dest);

			} else {
				cell.setCellValue("Fail");
			}

			FileOutputStream out = new FileOutputStream(
					"C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\ExcelSheet\\TestData.xlsx");
			wb.write(out); // for write into excel
		}

	}

}

/*
 * //get cell count in a row int cellcount = sheet.getRow(i).getLastCellNum();
 * //iterate over each cell to print its value System.out.println("Row "+i
 * +" data");
 * 
 * for(int j=1;j<cellcount;j++) {
 * System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()); }
 * System.out.println();
 */
