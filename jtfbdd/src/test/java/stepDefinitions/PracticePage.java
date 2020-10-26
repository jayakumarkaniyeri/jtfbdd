package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;
import pageObjects.PracticePagePF;


public class PracticePage {
	
	WebDriver driver;
	PracticePagePF pp;
	
	

@SuppressWarnings("deprecation")
@Given("^Chrome browser is launched$")
public void chrome_browser_is_launched() {
	
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
}

@When("^User enters url to the practice page and hit enter$")
public void user_enters_url_to_the_practice_page_and_hit_enter() {
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

}

@Then("^User should be navigated to the home page.$")
public void user_should_be_navigated_to_the_home_page() {
	
	String title = driver.getTitle();
	Assert.assertEquals(title, "Practice Page");

}


@When("^User selects radio1$")
public void user_selects_radio1() {
	pp = new PracticePagePF(driver);
	pp.selectRadioBtn();
	//driver.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
}

@When("^User search for India$")
public void user_search_for_india() {
	
	pp.inputCountry("ind");
	pp.selectCountry("India");
	//driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
	//List<WebElement> countryNames = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
	
	//for(WebElement cname : countryNames) {
		//if(cname.getText().equalsIgnoreCase("india")) {
			//cname.click();
		//}
	//}
	

}

@When("^User selects option1 from drop down$")
public void user_selects_option1_from_drop_down() {
	
	pp.selectStaticDropdown("option1");
	//Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
	//s.selectByValue("option1");
	
	

}

@Then("^User should be able to select Option2 under checkbox options$$")
public void user_should_be_able_to_select_option2_under_checkbox_options() throws InterruptedException {
	
	//driver.findElement(By.id("checkBoxOption1")).click();
	
	pp.selectCheckbox();
	
	Thread.sleep(2000);
	driver.close();
	driver.quit();

}



}
