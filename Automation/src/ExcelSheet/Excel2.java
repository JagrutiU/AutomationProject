package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws IOException {

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
				//XSSFSheet sheet1 = wb.createSheet("ResultSheet");

		XSSFSheet sheet3 = wb.createSheet("ResultSheet1");


		/*
		 * XSSFRow row = sheet.getRow(1); XSSFCell cell = row.getCell(5); 
		 * String address= cell.getStringCellValue(); System.out.println(address);
		 */ 

		// get all rows in the sheet
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		

		XSSFRow row3 = sheet3.createRow(4);
		row3.createCell(0).setCellValue("Sweety");
		row3.createCell(1).setCellValue("Jadhav");
		row3.createCell(2).setCellValue("sweety4@gmail.com");
		row3.createCell(3).setCellValue("Female");
		row3.createCell(4).setCellValue("8775667890");
		row3.createCell(5).setCellValue("Dombivali East");

		FileOutputStream out = new FileOutputStream(
				"C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\ExcelSheet\\TestData.xlsx");
		wb.write(out); // for write into excel

	}

}
