package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM {

	@FindBy(xpath = "//input[@id= 'userid']")
	private WebElement user;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath = "//button[text()='Login ']")
	private WebElement login;
	@FindBy(xpath = "//a[text()= 'Forgot password?']")
	private WebElement forgotPass;
	@FindBy(xpath = "//input[@id= 'pin']")
	private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public PoM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendUser(String userName) {
		user.sendKeys(userName);
	}

	public void sendPass(String password) {
		pass.sendKeys(password);
	}

	public void clickLogin() {
		login.click();
	}

	public void forgotPassword() {
		forgotPass.click();
	}

	public void sendPin(String enterPin) {
		pin.sendKeys(enterPin);
	}

	public void clickSumbit() {
		submit.click();
	}

}
