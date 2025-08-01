package testCases;

import org.testng.annotations.Test;

import pageObjects.SortTab;
import testBase.Baseclass;

public class Sort_TC extends Baseclass{
	@Test
	public void sorttab() {
		SortTab st= new SortTab(driver);
		st.clicksorttab();
		st.movingtodonetab();
	}

}
