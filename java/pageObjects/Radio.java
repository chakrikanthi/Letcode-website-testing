package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Radio extends Basepage {

	public Radio(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Toggle']") 
	WebElement toggle;
	
	public void Radiobtn()
	{
		toggle.click();
	}
	
	@FindBy(xpath="//input[@id='yes']") 
	WebElement Yesopt;
	
	public void setoptYes() {
		Yesopt.click();
		if(Yesopt.isSelected()) {
		System.out.println("Yes option got selected");
		}
		else
		{
			System.out.println("None of the option got selected");
		}
	}
	
	@FindBy(xpath="//input[@id='two']") 
	WebElement SecondradiobtnNOopt;
	
	public void secondopt() {
		SecondradiobtnNOopt.click();
		
		if (SecondradiobtnNOopt.isSelected()) {
			System.out.println("second radio btn option:NO option got selected");
		}
		else
		{
			System.out.println("second radio btn option:Yes option got selected");
		}
	}
		@FindBy(xpath="//input[@id='nobug']") 
		WebElement nobug;
		
	public void bugbtn() {
		nobug.click();
		if(nobug.isSelected()) {
			System.out.println("Bug found in this test");
			
		}
		else
		{
			System.out.println("Bug free test");
		}
	}
	
	@FindBy(xpath="//input[@id='foo']") 
	WebElement foobar;
	
	public void foobaropt() {
		
		boolean foostatus=foobar.isSelected();
		System.out.println("status ofthe foo option got selected:"+foostatus);
		
	
	if (foostatus==true) 
		{
		    System.out.println("foo Checkbox selected");
		}
	else
	{
		System.out.println("Bar got selected");
	}
	}	
	
	@FindBy(xpath="//input[@id='maybe']") 
	WebElement Maybedisabled;
	
	public void maybebtndisabled() {
	Boolean status=Maybedisabled.isEnabled();
	if(status==true) {
		System.out.println("May be button is enabled");
	}
	else
	{
		System.out.println("May be button is disabled");
	}
	}
	
	@FindBy(xpath="//label[normalize-space()='Remember me']") 
	WebElement rememberMe;
	
	public void rememberMechckbx() {
		
		boolean status=rememberMe.isSelected();
		System.out.println(status);
		if (status==false) {
			System.out.println("Remember me check box is selected");
		}
		else
		{
			System.out.println("Remember me check box is NOT selected");
		}
	}
	
	@FindBy(xpath="//body[1]/app-root[1]/app-radio-check[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/label[2]/input[1]") 
	WebElement Agreeterms;
	
	public void Agreeterms() {
		Agreeterms.click();
		System.out.println("Agree terms got selected");
	}
}
