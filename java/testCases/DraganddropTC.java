package testCases;

import org.testng.annotations.Test;

import pageObjects.Drag_drop;
import testBase.Baseclass;

public class DraganddropTC extends Baseclass{
	@Test
	public void dragndrop() {
		Drag_drop dp= new Drag_drop(driver);
		dp.drapdropclick();
		dp.draganddrop();
	}

}

//output:Source file moved to target file successfully