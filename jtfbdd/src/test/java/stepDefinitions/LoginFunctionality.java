package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
//import pageObjects.LoginPage;
import pageObjects.LoginPage_PF;

public class LoginFunctionality {
	
	WebDriver driver;
	LoginPage_PF lp;
	HomePage hp;
	
	@When("browser is open")
	public void browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Then("user is on login page")
	public void user_is_on_login_page() {

		driver.get("http://www.shino.de/parkcalc/");
		
		Select s = new Select(driver.findElement(By.id("ParkingLot")));
		s.selectByValue("Valet");
		
		driver.findElement(By.id("StartingDate")).clear();
		driver.findElement(By.id("StartingDate")).sendKeys("10/28/2020");
		
		driver.findElement(By.id("StartingTime")).clear();
		driver.findElement(By.id("StartingTime")).sendKeys("17:00");
		driver.findElement(By.id("LeavingDate")).clear();
		driver.findElement(By.id("LeavingDate")).sendKeys("10/29/2020");
		driver.findElement(By.id("LeavingTime")).clear();
		driver.findElement(By.id("LeavingTime")).sendKeys("17:00");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		
	}

//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_userame_and_password(String username, String password) throws InterruptedException  {
//		lp = new LoginPage_PF(driver);
//		lp.login(username, password);
//		
//		//driver.findElement(By.id("name")).sendKeys(username);
//		//driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//
//	}
//
//	@When("press login button")
//	public void press_login_button() {
//		
//		lp.clickLogin(); 
//		//driver.findElement(By.id("login")).click();
//
//	}
//
//	@Then("user should be able to login successfully")
//	public void user_should_be_able_to_login_successfully() throws InterruptedException {
//		
//		hp = new HomePage(driver);
//		hp.checkLogout();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//
//	}
}
