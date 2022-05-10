package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {

	public void hdp(WebDriver driver) throws InterruptedException {

		WebElement signupform = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		signupform.click();
		Thread.sleep(2000);
		WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FName.sendKeys("Jagruti");
		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LName.sendKeys("Utane");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("Jagruti@gmail.com");
		WebElement reemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reemail.sendKeys("Jagruti@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Jagruti@1610");

		WebElement BirthdayDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(BirthdayDate);
		date.selectByValue("16");

		WebElement BirthdayMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(BirthdayMonth);
		month.selectByValue("10");

		WebElement Birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(Birthdayyear);
		year.selectByValue("1994");

		WebElement female = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		female.click();

//		 WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
//		 male.click();
//		 
//		 WebElement custom = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
//		 custom.click();

		Thread.sleep(1000);

		WebElement signup = driver.findElement(By.xpath("((//button[text()='Sign Up'])[1]"));
		signup.click();

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.CallBrowser("https://www.facebook.com/");
		HiddenDivisionPopup obj = new HiddenDivisionPopup();
		obj.hdp(driver);

	}

}
