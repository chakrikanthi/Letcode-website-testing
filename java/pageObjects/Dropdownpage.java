package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpage extends Basepage{

	public Dropdownpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Drop-Down']")  
	WebElement dropDowntab;
	
	public void dropDowntab() {
		dropDowntab.click();
	}

	@FindBy(xpath="//select[@id='fruits']") 
	WebElement selectFruitAppleMangoOrangeBa;
	
	public void selctfruit() {
		Select dropdown= new Select(selectFruitAppleMangoOrangeBa);
		List<WebElement> options = dropdown.getOptions();
		System.out.println("Total number of fruit options:"+options.size());
		for (WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		dropdown.selectByIndex(2);
	}
	
	@FindBy(xpath="//p[normalize-space()='You have selected Mango']") 
	WebElement youHaveSelectedMango;
	
	public void fruitsucmsg() {
		String fruitsuccessmsg=youHaveSelectedMango.getText();
		System.out.println(fruitsuccessmsg);
	}
	
	@FindBy(xpath="//select[@id='superheros']") 
	WebElement Superheros;
	
	public void SelectSuperheros() 
	{
		Select superherodropdown= new Select(Superheros);
		List<WebElement> options = superherodropdown.getOptions();
		System.out.println("Total number of super hero options:"+options.size());
		for (WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		superherodropdown.selectByValue("ta");
	}
	@FindBy(xpath="//p[normalize-space()='You have selected The Avengers']") 
	WebElement youHaveSelectedTheAvengers;
	
	public void successmsg() {
		String successmsg=youHaveSelectedTheAvengers.getText();
		System.out.println(successmsg);
	}
	
	@FindBy(xpath="//select[@id='lang']") 
	WebElement Programminglanguage;
	
	public void selectprgmlang() {
		Select selectprogmlang=new Select(Programminglanguage);
		List<WebElement> options = selectprogmlang.getOptions();
		System.out.println("Total number of programming language options:"+options.size());
		for (WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
		
		selectprogmlang.selectByVisibleText("Java");
	}
	@FindBy(xpath="//p[normalize-space()='You have selected Java']") 
	WebElement youHaveSelectedJava;
	public void prgsuccessmsg() {
		String prgsuccessmsg=youHaveSelectedJava.getText();
		System.out.println(prgsuccessmsg);
	}
	
	
	@FindBy(xpath="//select[@id='country']") 
	WebElement Countries;
	
	public void selectcountry() {
		Select country= new Select(Countries);
		List<WebElement> options = country.getOptions();
		System.out.println("Total number of country options:"+options.size());
		for (WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		country.selectByValue("India");
		System.out.println("You have selected  option India");
	}
}
