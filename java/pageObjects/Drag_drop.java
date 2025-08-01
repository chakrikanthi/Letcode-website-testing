package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Drag_drop extends Basepage {

	public Drag_drop(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='AUI - 2']") 
	WebElement dragdroptab;
	
	public void drapdropclick() {
		dragdroptab.click();
	}
	
	@FindBy(xpath="//div[@id='draggable']") 
	WebElement sourcefile;
	
	@FindBy(xpath="//div[@id='droppable']") 
	WebElement Targetplace;
	
	public void draganddrop() {
		Actions act = new Actions(driver);
		act.dragAndDrop(sourcefile, Targetplace).perform();;
		System.out.println("Source file moved to target file successfully");
			
		
		
	}
}
