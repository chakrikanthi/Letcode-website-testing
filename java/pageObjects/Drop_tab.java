package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Drop_tab extends Basepage{

	public Drop_tab(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='AUI - 2']") 
	WebElement aUI2;
	
	public void clickaui() {
		aUI2.click();
	}
	@FindBy(xpath="//div[@id='draggable']") 
	WebElement dragMeToMyTarget;
	
	@FindBy(xpath="//p[normalize-space()='Drop here']") 
	WebElement dropHere;
	
	public void source() {
		
		Actions act= new Actions(driver);
		act.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
		
	}
	
	
}
