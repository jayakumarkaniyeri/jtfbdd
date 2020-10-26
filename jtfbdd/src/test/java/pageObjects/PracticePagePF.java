package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePagePF {
	
	WebDriver driver;
	
	public PracticePagePF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")
	WebElement rbtn_one;
	
	@FindBy(css = "#autocomplete")
	WebElement asf_country;
	
	
	@FindBy(css = "li[class='ui-menu-item'] div")
	List<WebElement> asd_countryname;
	
	@FindBy(xpath = "//input[@id='checkBoxOption1']")
	WebElement cb_option;
	
	@FindBy(id = "dropdown-class-example")
	WebElement stc_dropdwon;
	
	@FindBy(id = "openwindow")
	WebElement btn_openwindow;
	
	@FindBy(xpath = "//header/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement link_courses;
	
	@FindBy(css = "#opentab")
	WebElement btn_opentab;
	
	
	public void selectRadioBtn() {
		rbtn_one.click();
	}
	
	public void inputCountry(String name) {
		asf_country.sendKeys(name);
	}
		
	public void selectCountry(String name) {
		for(WebElement cname : asd_countryname) {
			if(cname.getText().equalsIgnoreCase(name)) {
				cname.click();
			}
		}
	}
		
	
	public void selectCheckbox() {
		
		cb_option.click();
			
	}
	
	public void selectStaticDropdown(String val) {
		Select s = new Select(stc_dropdwon);
		s.selectByValue(val);
	}
	
	public void clickOpenWindow() {
		btn_openwindow.click();
	}
	
	public void clickCourses() {
		link_courses.click();
	}
	
	public void ClickOpenTab() {
		btn_opentab.click();
	}
	

}
