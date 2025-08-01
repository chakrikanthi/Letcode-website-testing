package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Elements extends Basepage {

	public Elements(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='Find Elements']") 
	WebElement findElements;
	
	public void clickelements() {
		findElements.click();
	}
	
	@FindBy(xpath="//input[@placeholder='Enter your git user name eg., ortonikc']") 
	WebElement enterGitUserName;
	
	public void setGitusername() {
		enterGitUserName.sendKeys("CHAKRIKANTHI");
	}
	
	@FindBy(xpath="//button[@id='search']") 
	WebElement search;
	public void clicksearch() {
		search.click();
		
	}
	
	@FindBy(xpath="//img[@alt='Placeholder image']") 
	WebElement placeholderImage;
	public void imagecheck() {
		boolean imagestatus=placeholderImage.isDisplayed();
		if(imagestatus==true) {
			System.out.println("Image is present");
					
		}
		else {
			System.out.println("Image is NOT present");
		}
			
	}
	
	@FindBy(xpath="//p[normalize-space()='Kanthi Sri']") 
	WebElement Nameoftheuser;
	
	public void checknameoftheuser() {
		String Actualnameoftheuser=Nameoftheuser.getText();
		System.out.println("Name of the user is:"+Actualnameoftheuser);
		String expectedName = "Kanthi Sri";
		Assert.assertEquals(Actualnameoftheuser, expectedName);
	}
	@FindBy(xpath="//p[normalize-space()='Usa']") 
	WebElement Placeoftheuser;
	
	public void placeoftheuser() {
		String place=Placeoftheuser.getText();
		System.out.println("Place of the user is;"+place);
		String expectedLocation = "Usa";
		Assert.assertEquals(place, expectedLocation);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='9']")  
	WebElement publicRepos;
	public void publicRepos() {
		String publicrepos=publicRepos.getText();
		System.out.println("public repositories that user have is;"+publicrepos);
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in the page:"+links.size());
					
		List<WebElement> displayedRepoLinks = driver.findElements(By.xpath("//app-gitrepos//a"));
		
		for(WebElement repoLink : displayedRepoLinks) {
			
			System.out.println(repoLink.getAttribute("href"));
			
		}
				
	}
}

