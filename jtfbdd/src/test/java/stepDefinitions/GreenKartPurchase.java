//package stepDefinitions;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.*;
//
//public class GreenKartPurchase {
//
//	WebDriver driver;
//	String projectPath = System.getProperty("user.dir");
//	String baseURL = "https://rahulshettyacademy.com/seleniumPractise/#/";
//
//	@After
//	public void teardown() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
//
//	@Given("Browser is open")
//	public void browser_is_open() {
//
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//
//	}
//
//	@When("User provide URL")
//	public void user_provide_url() {
//
//		driver.get(baseURL);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//	}
//
//	@Then("User should be navigated to the home page")
//	public void user_should_be_navigated_to_the_home_page() {
//		
//		String title = driver.getTitle();
//		//System.out.println(title);
//		Assert.assertEquals(title, "GreenKart - veg and fruits kart");
//
//	}
//
//	@When("User adds multiple veg to cart")
//	public void user_adds_multiple_veg_to_cart() {
//		
//		String[] itemsReq = {"Beans", "Carrot", "Brinjal"};
//		
//		List<WebElement> pnames = new ArrayList<WebElement>(driver.findElements(By.cssSelector("h4.product-name")));
//		int k=0;
//		
//		for(int i = 0; i < pnames.size(); i++) {
//			
//			String[] product = pnames.get(i).getText().split("-");
//			String formattedName = product[0].trim();
//			List<String> itemsReqList = Arrays.asList(itemsReq);
//			
//			
//			
//			if(itemsReqList.contains(formattedName)) {
//				
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//				k++;
//				
//				if(k==3) {
//					break;
//				}
//			}
//				
//			}
//		
//
//			
//		}
//
//	@And("Proceed to checkout and click place order")
//	public void proceed_to_checkout_and_click_place_order() {
//
//		driver.findElement(By.cssSelector("a.cart-icon img")).click();
//		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//		
//		//total validation
//		int rowCount = driver.findElements(By.cssSelector("table[class='cartTable'] tr")).size();
//		int count = driver.findElements(By.cssSelector("table[class='cartTable'] tr td:nth-child(5) p")).size();
//		
//		int sum = 0;
//		for(int i = 0; i < count; i++) {
//			String value = driver.findElements(By.cssSelector("table[class='cartTable'] tr td:nth-child(5) p")).get(i).getText();
//			int valueInt = Integer.parseInt(value);
//			sum += valueInt;
//		}
//		
//		String totAmt = driver.findElement(By.cssSelector("span[class='totAmt']")).getText();
//		int totalAmt = Integer.parseInt(totAmt);
//		Assert.assertEquals(totalAmt, sum);
//		
//		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//	}
//
//	@And("Select country and agree to TnC")
//	public void select_country_and_agree_to_tn_c() {
//		
//		Select s = new Select(driver.findElement(By.tagName("select")));
//		s.selectByValue("India");
//		
//		driver.findElement(By.cssSelector(".chkAgree")).click();
//		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
//		
//
//	}
//
//	@And("Click proceed")
//	public void click_proceed() {
//
//	}
//
//	@Then("Order should be successfully placed")
//	public void order_should_be_successfully_placed() {
//
//	}
//
//}
