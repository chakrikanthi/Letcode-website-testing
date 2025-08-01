package testCases;

import org.testng.annotations.Test;

import pageObjects.Windowstab;
import testBase.Baseclass;

public class WindowsTab_TC extends Baseclass{
	@Test
	public void windowstc() {
		Windowstab wt= new Windowstab(driver);
		wt.windowstab();
		wt.homepage();
		wt.homepage();
		
	}

}

/*AC58DF6F06D453F54B5177A980565CEFWindow handling - LetCode
page title is:LetCode - Testing Hub
https://letcode.in/test*/
