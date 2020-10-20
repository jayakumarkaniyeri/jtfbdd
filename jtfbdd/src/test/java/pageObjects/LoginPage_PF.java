package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	//By txt_username = By.id("name");
	
	//By txt_password = By.id("password");
	
	//By btn_login = By.id("login");
	
	//By btn_logout = By.id("logout");
	
	
	public void login(String username, String password) {
		
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		
		
		//driver.findElement(txt_username).sendKeys(username);
		//driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clickLogin() {
		
		btn_login.click();
		
		//driver.findElement(btn_login).click();
		
	}
	
	//public void checkLogOutBtn() {
		
		//driver.findElement(btn_logout).isDisplayed();
	//}
	

}
