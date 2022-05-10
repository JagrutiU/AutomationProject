package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SelectClass2 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//JavascriptExecutor js = (JavascriptExecutor)driver;
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
//js.executeScript("window.scrollBy(0,300)");
WebElement signupform = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
signupform.click();
Thread.sleep(2000);
WebElement month_dropdown = driver.findElement(By.id("month"));
Select oSelect = new Select(month_dropdown);
List<WebElement> month_list = oSelect.getOptions();
int total_month = month_list.size();
System.out.println("Total count is "+total_month);
for(WebElement ele:month_list)
{
String month_name = (ele.getText());
System.out.println("Months are "+month_name);
}
 

 
}
 
}
