package testCases;

import org.testng.annotations.Test;

import pageObjects.Dropdownpage;
import testBase.Baseclass;

public class Dropdownpage_TC extends Baseclass {
	
	@Test
	public void Dropdownpage() {
		Dropdownpage dp= new Dropdownpage(driver);
		dp.dropDowntab();
		System.out.println("Select drop down tab clicked");
		dp.selctfruit();
		dp.fruitsucmsg();
		dp.SelectSuperheros();
		dp.successmsg();
		dp.selectprgmlang();
		dp.prgsuccessmsg();
		dp.selectcountry();
		driver.quit();
		
		
	}

}
/*output:Select drop down tab clicked
Total number of fruit options:6
Select Fruit
Apple
Mango
Orange
Banana
Pine Apple
You have selected Mango
Total number of super hero options:29
Ant-Man
Aquaman
The Avengers
Batman
Batwoman
Black Panther
Captain America
Captain Marvel
Daredevil
Doc Savage
Doctor Strange
Elektra
Fantastic Four
Ghost Rider
Green Lantern
Guardians of the Galaxy
Hellboy
Incredible Hulk
Iron Man
Marvelman
Robin
The Shadow
Spider-Man
Supergirl
Superman
Thor
Wolverine
Wonder Woman
e="xm"X-Men
You have selected The Avengers
Total number of programming language options:5
JavaScript
Java
Python
Swift
C#
You have selected Java
Total number of country options:12
Argentina
Bolivia
Brazil
Chile
Colombia
Ecuador
India
Paraguay
Peru
Suriname
Uruguay
Venezuela
You have selected  option India
*/