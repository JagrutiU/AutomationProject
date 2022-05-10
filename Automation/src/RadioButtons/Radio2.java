package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get(" http://demo.guru99.com/test/radio.html"); 
		driver.manage().window().maximize();
		
		

		
        WebElement radioEle = driver.findElement(By.xpath("//input[@value='Option 3']"));
        boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}
//        
//        int a = driver.findElements(By.xpath("//input [@name=\"webform\"]")).size();
//        System.out.println(a);  
//        for(int i=1;i<=a;i++)  
//        {  
//            driver.findElements(By.xpath("//input [@name=\"webform\"]")).get(2).click();  
//        }  

	}

		

	
	

}
