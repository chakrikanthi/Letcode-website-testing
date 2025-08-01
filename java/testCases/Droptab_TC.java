package testCases;

import org.testng.annotations.Test;

import pageObjects.Drop_tab;
import testBase.Baseclass;

public class Droptab_TC extends Baseclass{
	@Test
	public void Droptab_TC_001() {
		Drop_tab dp= new Drop_tab(driver) ;
		dp.clickaui();
		dp.source();
		System.out.println(" Dropped source box with in the target box");
		driver.quit();	
		
	}

}

//output: Dropped source box with in the target box