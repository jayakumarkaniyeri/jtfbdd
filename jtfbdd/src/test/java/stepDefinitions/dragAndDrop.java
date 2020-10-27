package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class dragAndDrop {

	WebDriver driver;

	@Given("Chrome browser is started")
	public void chrome_browser_is_started() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

//	@After
//	public void windUp() {
//		driver.close();
//		driver.quit();
//	}

	@When("User provides site url")
	public void user_provides_site_url() {
		driver.get("https://jqueryui.com/draggable/");
	}

	@Then("Webpage should be displayed")
	public void webpage_should_be_displayed() {
		System.out.println(driver.getTitle());
	}
	
	@When("User is on home page")
	public void user_is_on_home_page() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
	}

	@And("User click and hold the object")
	public void user_click_and_hold_the_object() {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
	}

	@Then("User should be able to drag and drop")
	public void user_should_be_able_to_drag_and_drop() {
		System.out.println("Dropped Successfully");
	}
	

}
