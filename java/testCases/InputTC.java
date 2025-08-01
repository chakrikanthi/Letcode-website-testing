package testCases;

import org.testng.annotations.Test;

import pageObjects.Inputtab;
import testBase.Baseclass;

public class InputTC extends Baseclass{
	@Test
	public void InputTC_001()
	{
		Inputtab in= new Inputtab(driver);
	    in.editbtn();
	    in.SetFirstnLastName("Kanthi");
	    in.setkeyboardtab("hi this is test msg");
	    in.settextbox("Hi this is second text message");
	    in.cleartext();
	    in.setcleartext("Wow it's working");
	    boolean status= in.editdisabled();
	    System.out.println(status);
	    in.ConformText();
		driver.quit();
	}
	
}


/*output:
Keyboard tab text is:I am good
Clear terxt field haas this message:Koushik Chatterjee
Confirm edit field is disabled
false
Text in conformed text read only field is:This text is readonly*/