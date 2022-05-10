package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {
	public static String Excel(int a, int b) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\ExcelSheet\\TestData.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("Data").getRow(a).getCell(b).getStringCellValue();
		return value;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String userName = TestData.Excel(1, 0);
		String pass = TestData.Excel(1, 1);
		System.out.println(userName);
		System.out.println(pass);

	}

}
