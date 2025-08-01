package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Windowstab extends Basepage{

	public Windowstab(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='Tabs']")
	WebElement tabs;
	
	public void windowstab() {
		tabs.click();
	}
	
	@FindBy(xpath="//button[@id='home']") 
	WebElement gotoHome;
	
	public void homepage() {
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow+driver.getTitle());
		gotoHome.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println("page title is:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.switchTo().defaultContent();
		driver.switchTo().alert().dismiss();
		
	}
	@FindBy(xpath="//button[@id='multi']") 
	WebElement muiltipleWindows;
	public void muiltipleWindows() {
		muiltipleWindows.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		muiltipleWindows.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
}
