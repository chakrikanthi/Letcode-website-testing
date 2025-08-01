package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frames extends Basepage{

	public Frames(WebDriver driver) {
		super(driver);
		
	}

	
	
	
	@FindBy(xpath="//a[normalize-space()='Inner HTML']")  
	WebElement frames;
	
	public void clickframes() {
		frames.click();
	}
	@FindBy(xpath="//iframe[@id='firstFr']") WebElement firstFr;
	public void iframe() {
		driver.switchTo().frame("firstFr");
	}
	
	@FindBy(xpath="//input[@placeholder='Enter email']") 
	WebElement enterEmail;
	
	public void setemail() {
		enterEmail.sendKeys("kanthi@gmail.com");
	}
	
	@FindBy(xpath="//input[@placeholder='Enter name']") 
	WebElement insideIframe;
	
	public void setinsideframefirstname() {
		
		insideIframe.sendKeys("KANTHI");
	}
	
	
	
	@FindBy(xpath="//iframe[@src='innerFrame']")
	WebElement switchingtoinneriframe;
	public void switchingtoinneriframe() {
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
	}
	@FindBy(xpath="//iframe[@name='googlefcPresent']")
	WebElement innerinsideIframe;
	
	public void innerframeofinsideframe() {
		driver.switchTo().frame(0);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter email']")  
	WebElement innerenterEmail;
	
	public void setinnerenterEmail() {
		
		innerenterEmail.sendKeys("Satvik@gmail.com");
	}
}
