package testCases;

import org.testng.annotations.Test;

import pageObjects.AlertTab;
import testBase.Baseclass;

public class AlertTabTC extends Baseclass{
	@Test
	public void AlertTabTC_1() throws InterruptedException {
		AlertTab AT= new AlertTab(driver);
		AT.dialogbtn();
		AT.clicksimpleAlert();
		AT.confirmAlert();
		AT.promptAlert();
		Thread.sleep(2000);
		AT.yourNametxt();
		AT.modernAlert();
		AT.modernAlertTXT();
		
		driver.quit();
	}

}
/*Output:
 * Simple click alert message is:Hey! Welcome to LetCode
ConfirmAlert text message is:Are you happy with LetCode?
Prompt alert msg after entering your name is:Your name is: Kanthi
Modern Alert - Some people address me as sweet alert as well
 *(Socket exception) */
 
	