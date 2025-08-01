package testCases;

import org.testng.annotations.Test;

import pageObjects.Elements;
import testBase.Baseclass;
/*Type and Enter your Git username
Assert that user has image
Print the user name & other informations
Assert that no.of public repositories are listed correctly
eg. if Public Repos has 10 then in the list 10 links should be available


*/
public class Elementstab_TC extends Baseclass{
	@Test
	public void elements() {
		Elements EL= new Elements(driver);
		EL.clickelements();
		EL.setGitusername();
		EL.clicksearch();
		EL.imagecheck();
		EL.checknameoftheuser();
		EL.placeoftheuser();
		EL.publicRepos();
		
		
	}

}
/*output:Image is NOT present
Name of the user is:Kanthi Sri
Place of the user is;Usa
public repositories that user have is;9
Total number of links in the page:22
https://github.com/chakrikanthi/FORMY_Project
https://github.com/chakrikanthi/kanthi_selenium_projects
https://github.com/chakrikanthi/nopCommerce-Website-testing
https://github.com/chakrikanthi/Omayo-Website-testing
https://github.com/chakrikanthi/Only-testing-blogwebsite
https://github.com/chakrikanthi/OpenCart
https://github.com/chakrikanthi/Opencart-End-to-End-Testing
https://github.com/chakrikanthi/The-internet.herokkuapp-testing
https://github.com/chakrikanthi/Webdriver-University-Website-testing
*/