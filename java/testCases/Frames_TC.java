package testCases;

import org.testng.annotations.Test;

import pageObjects.Frames;
import testBase.Baseclass;

public class Frames_TC extends Baseclass{
	
	@Test
	public void frames() {
		Frames fm= new Frames(driver);
		fm.clickframes();
		fm.iframe();
		fm.setinsideframefirstname();
		fm.setemail();
		//fm.switchingtoinneriframe();
		fm.innerframeofinsideframe();
		fm.setinnerenterEmail();
	}

}
