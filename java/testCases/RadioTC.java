package testCases;

import org.testng.annotations.Test;

import pageObjects.Radio;
import testBase.Baseclass;

public class RadioTC extends Baseclass {
	@Test
	public void Radiotestcase() {
		Radio rd= new Radio(driver);
		rd.Radiobtn();
		rd.setoptYes();
		rd.secondopt();
		rd.bugbtn();
		rd.foobaropt();
		rd.maybebtndisabled();
		rd.rememberMechckbx();
		rd.Agreeterms();
		driver.quit();
	}

}


/*output
Yes option got selected
second radio btn option:NO option got selected
Bug found in this test
status ofthe foo option got selected:false
Bar got selected
May be button is disabled
false
Remember me check box is selected
Agree terms got selected*/