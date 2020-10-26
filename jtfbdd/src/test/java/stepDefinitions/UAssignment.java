package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class UAssignment {

	WebDriver driver;

	@Given("Chrome browser is open")
	public void chrome_browser_is_open() {
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

	@When("User provides site address")
	public void user_provides_site_address() {
		driver.get("https://www.cleartrip.com/");
	}

	@Then("Webpage should be loaded")
	public void webpage_should_be_loaded() {
		System.out.println(driver.getTitle());
	}

	@When("User is on flight search page")
	public void user_is_on_flight_search_page() {

		driver.findElement(By.xpath("//body/section[@id='Home']/div[1]/aside[1]/nav[1]/ul[1]/li[1]/a[1]")).click();

	}

	@When("User provides journey details and click search")
	public void user_provides_journey_details_and_click_search() throws InterruptedException {

		driver.findElement(By.cssSelector("#OneWay")).click();

		//from
		driver.findElement(By.cssSelector("#FromTag")).sendKeys("koz");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]/a[1]")).click();

		//to
		driver.findElement(By.id("ToTag")).sendKeys("bom");
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[1]/a[1]")).click();

		//date & month
		driver.findElement(By.cssSelector("a[class='calendarIcon'] i")).click();

		while(!driver.findElement(By.cssSelector("div[class='monthBlock first'] span[class='ui-datepicker-month']")).getText().contains("December")) {
			driver.findElement(By.cssSelector(".nextMonth")).click();
		}

		Thread.sleep(3000);

		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='monthBlock first'] a"));

		for(int i = 0; i < dates.size(); i++) {
			String date = driver.findElements(By.cssSelector("div[class='monthBlock first'] a")).get(i).getText();
			if(date.equalsIgnoreCase("25")) {
				driver.findElements(By.cssSelector("div[class='monthBlock first'] a")).get(i).click();
			}
		}
		
		//adults selection
		
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
		
		//click search button
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.getTitle());
	}

	@Then("Available flight should be listed")
	public void available_flight_should_be_listed() {

	}

}
