package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.Seleniumproject;

public class ManageAddress {
     
	@When("^user click on Manage Address$")
	public void user_click_on_Manage_Address() throws Throwable {
	   Object[] input=new Object[1];
	   input[0]="(//*[@class='NS64GK'])[1]";
	   Hashtable<String, Object> output=Seleniumproject.click(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on Manage Address$", output.get("MESSAGE").toString());
	}

	@When("^user click on Add new Address$")
	public void user_click_on_Add_new_Address() throws Throwable {
		   Object[] input=new Object[1];
		   input[0]="//*[@class='_2KpZ6l _3lI646 _3dESVI']";
		   Hashtable<String, Object> output=Seleniumproject.click(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on Add new Address$", output.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String arg1) throws Throwable {
		   Object[] input=new Object[2];
		   input[0]="//*[@name='name']";
		   input[1]=arg1;
		   Hashtable<String, Object> output=Seleniumproject.sendkeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter \"([^\"]*)\" as name$", output.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as mobile number$")
	public void user_enter_as_mobile_number(String arg1) throws Throwable {
		   Object[] input=new Object[2];
		   input[0]="//*[@name='phone']";
		   input[1]=arg1;
		   Hashtable<String, Object> output=Seleniumproject.sendkeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter \"([^\"]*)\" as mobile number$", output.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as pin code$")
	public void user_enter_as_pin_code(String arg1) throws Throwable {
		   Object[] input=new Object[2];
		   input[0]="//*[@name='pincode']";
		   input[1]=arg1;
		   Hashtable<String, Object> output=Seleniumproject.sendkeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter \"([^\"]*)\" as pincode$", output.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String arg1) throws Throwable {
		 Object[] input=new Object[2];
		   input[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		   input[1]=arg1;
		   Hashtable<String, Object> output=Seleniumproject.sendkeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter \"([^\"]*)\" as locality$", output.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String arg1) throws Throwable {
		 Object[] input=new Object[2];
		   input[0]="//*[@name='addressLine1']";
		   input[1]=arg1;
		   Hashtable<String, Object> output=Seleniumproject.sendkeys(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$", output.get("MESSAGE").toString());

	}

	@When("^user select Home as address type$")
	public void user_select_Home_as_address_type() throws Throwable {
		   Object[] input=new Object[1];
		   input[0]="(//*[@class='_1XFPmK'])[1]";
		   Hashtable<String, Object> output=Seleniumproject.click(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user select Home as address type$", output.get("MESSAGE").toString());

	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
		 Object[] input=new Object[1];
		   input[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
		   Hashtable<String, Object> output=Seleniumproject.click(input);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on save button$", output.get("MESSAGE").toString());

	}

	@Then("^Application shows New Address Added to successfully$")
	public void application_shows_New_Address_Added_to_successfully() throws Throwable {
		Object[] input=new Object[2];
	    input[0]="(//*[@class='_1bYJzd'])[1]";
	    input[1]="ADD A NEW ADDRESS";
	    Hashtable<String, Object> output=Seleniumproject.testcheck(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^Application shows New Address Added to successfully$", output.get("MESSAGE").toString());
 
	}



}
