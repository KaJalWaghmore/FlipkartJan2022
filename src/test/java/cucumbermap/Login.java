package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.Seleniumproject;

public class Login {
	


	@Given("^user open \"(.*)\" browser with exe$")
	public void user_open_browser_with_exe(String arg1) throws Throwable {
		Object[] a1=new Object[2];                               //browser launch
	    a1[0]=arg1;
	    Seleniumproject.browserlaunch(a1);
	    
	}

	@Given ("^user open url as$")
	public void user_open_url_as() throws Throwable {
		 
		    Seleniumproject.geturl();
		    
	}

	@When("^user click on Cancel button$")
	public void user_click_on_Cancel_button() throws Throwable {
		Object[] a3=new Object[1];                               //Cancel login window
	    a3[0]="//*[@class='_2KpZ6l _2doB4z']";
	    Hashtable<String, Object> output3=Seleniumproject.click(a3);
	    HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user click on Cancel button$", output3.get("MESSAGE").toString()); 
 
	    
	}

	@When("^user move on Login DropDown$")
	public void user_move_on_Login_DropDown() throws Throwable {
		Object[] a4=new Object[1];                               //move cursor towards login
	    a4[0]="//*[@class='_1_3w1N']";
	   Hashtable<String, Object> output4=Seleniumproject.moveonElement(a4);
	    HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user move on Login DropDown$", output4.get("MESSAGE").toString()); 

	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable {
		 Object[] a5=new Object[1];                               //click on my profile
		    a5[0]="(//*[@class='_3vhnxf'])[1]";
		   Hashtable<String, Object> output5= Seleniumproject.click(a5);
	HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on My Profile$", output5.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		 Object[] a6=new Object[2];                          //Enter username
		    a6[0]="//*[@class='_2IX_2- VJZDxU']";
		    a6[1]=arg1;
		    Hashtable<String, Object> output6=Seleniumproject.sendkeys(a6);
		    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$", output6.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		 Object[] a7=new Object[2];                           //Enter password
		    a7[0]="//*[@type='password']";
		    a7[1]=arg1;
		    Hashtable<String, Object> output7=Seleniumproject.sendkeys(a7);
		    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$", output7.get("MESSAGE").toString());
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		 Object[] a8=new Object[1];                                // click on submit
		    a8[0]="(//*[@type='submit'])[2]";
		    Hashtable<String, Object> output8=Seleniumproject.click(a8);
		    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login button$", output8.get("MESSAGE").toString());
	}

	@Then("^Application shows user profile to the user$")
	public void application_shows_user_profile_to_the_user() throws Throwable {
		 Object[] a9=new Object[2];
		    a9[0]="//*[@class='_1ruvv2']";
		    a9[1]="Kajal Waghmore";
		   Hashtable<String, Object> output9=Seleniumproject.testcheck(a9);
		    HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^Application shows user profile to the user$", output9.get("MESSAGE").toString());
	}

}
