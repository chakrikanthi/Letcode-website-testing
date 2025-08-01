package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SortTab extends Basepage{

	public SortTab(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="//a[normalize-space()='AUI - 3']")
	WebElement sorttab;
	
	public void clicksorttab() {
		sorttab.click();
	}


@FindBy(xpath="//div[@id='cdk-drop-list-4']//div[1]")  WebElement pickUpGroceries;
@FindBy(xpath="//div[@id='cdk-drop-list-4']//div[1]")  WebElement getToWork;
@FindBy(xpath="//div[@id='cdk-drop-list-4']//div[1]") WebElement goHome;
@FindBy(xpath="//div[@id='cdk-drop-list-4']//div[1]") WebElement fallAsleep;
@FindBy(xpath="//div[@id='cdk-drop-list-1']")   WebElement drop;
public void movingtodonetab() {
	Actions act = new Actions(driver);

	act.clickAndHold(pickUpGroceries).dragAndDrop(fallAsleep, drop).perform();
	act.dragAndDrop(fallAsleep, drop).perform();
	act.dragAndDrop(goHome, drop).perform();
	act.dragAndDrop(getToWork, drop).perform();
	act.dragAndDrop(pickUpGroceries, drop).perform();
}
}
