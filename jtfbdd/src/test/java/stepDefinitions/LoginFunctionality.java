package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginFunctionality {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.get("https://example.testproject.io/web/");

		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_userame_and_password(String username, String password) throws InterruptedException  {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);

	}

	@When("press login button")
	public void press_login_button() {
		driver.findElement(By.id("login")).click();

	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() throws InterruptedException {
		
		driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
}
