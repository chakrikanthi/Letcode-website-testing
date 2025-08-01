package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertTab extends Basepage{

	public AlertTab(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//a[normalize-space()='Dialog']") 
	WebElement dialog;
	
	public void dialogbtn()
	{
		dialog.click();
	}
	
	@FindBy(xpath="//button[@id='accept']") 
	WebElement simpleAlert;
	public void clicksimpleAlert()
	{
		simpleAlert.click();
		String text= driver.switchTo().alert().getText();
		System.out.println("Simple click alert message is:"+text);
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath="//button[@id='confirm']") 
	WebElement confirmAlert;
	public void confirmAlert()
	{
		confirmAlert.click();
		String txt=driver.switchTo().alert().getText();
		System.out.println("ConfirmAlert text message is:"+txt);
		driver.switchTo().alert().dismiss();
	}
	@FindBy(xpath="//button[@id='prompt']") 
	WebElement promptAlert;
	public void promptAlert() throws InterruptedException
	{
		promptAlert.click();
		Thread.sleep(1500);
		driver.switchTo().alert().sendKeys("Kanthi");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//p[@id='myName']") 
	WebElement yourNametxt;
	public void yourNametxt() throws InterruptedException
	{
		String msg=yourNametxt.getText();
		System.out.println("Prompt alert msg after entering your name is:"+msg);
		
		Thread.sleep(2000);
	}
	
	
	@FindBy(xpath="//button[@id='modern']") 
	WebElement modernAlert;
	public void modernAlert()
	{
		modernAlert.click();
	}
		@FindBy(xpath="(//p[contains(text(),'Modern Alert - Some people address me as sweet ale')])[1]") 
		WebElement modernAlertTXT;
		public void modernAlertTXT() {
		String msg=modernAlertTXT.getText();
		System.out.println(msg);
		driver.close();
		}
	
}
