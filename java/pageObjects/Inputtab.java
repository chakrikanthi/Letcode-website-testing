package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inputtab extends Basepage{

	public Inputtab(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//a[normalize-space()='Edit']")  
	WebElement editbtn;

	public void editbtn() {
		editbtn.click();
	}

	@FindBy(xpath="//input[@id='fullName']")
	WebElement SetFirstnLastName;

	public void SetFirstnLastName(String firstnlastname) {
		SetFirstnLastName.sendKeys(firstnlastname);
	}
	
	@FindBy(xpath="//input[@id='join']") 
	WebElement Keyboardtb;

	public String setkeyboardtab(String Tabtxt) {
		String txt=Keyboardtb.getAttribute("Value");
		System.out.println("Keyboard tab text is:"+txt);
		Keyboardtb.clear();
		Keyboardtb.sendKeys(Tabtxt);
		return txt;
	}

	@FindBy(xpath="//input[@id='getMe']")  WebElement Textbox;

	public void settextbox(String txtbx) {

		Textbox.clear();
		Textbox.sendKeys(txtbx);
		
	}

	@FindBy(xpath="//input[@id='clearMe']") 
	WebElement cleartxt;
	
	public void cleartext()
	{
		String txt=cleartxt.getAttribute("Value");
	
		System.out.println("Clear text field has this message:"+txt);
		return;
		
	}
	
	public void setcleartext(String txt) {
		cleartxt.clear();
		cleartxt.sendKeys(txt);
		
	}
	
	@FindBy(xpath="//input[@id='noEdit']")  
	WebElement editdisabled;
	public boolean editdisabled() {
		   if (editdisabled.isDisplayed() && editdisabled.isEnabled()) {
		        System.out.println("Confirm edit field is enabled");
		        return true;
		    } else {
		        System.out.println("Confirm edit field is disabled");
		        return false;
		    }
		}
	
	@FindBy(xpath="//input[@id='dontwrite']") 
	WebElement ConformTextReadonly;
	
	public void ConformText() {
		ConformTextReadonly.getText();
		
		String Value=ConformTextReadonly.getAttribute("value");
		System.out.println("Text in conformed text read only field is:"+Value);
		
		//return;
	
	
	}
	
	
	
}
