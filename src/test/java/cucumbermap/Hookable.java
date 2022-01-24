package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable {
	@Before
	public void before(Scenario Scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("G:\\projectfinalmaven\\Flipkart1\\target\\Report\\extentreports\\flipkart.html", "Flipkartproject");
		HTMLReportGenerator.TestCaseStart(Scenario.getName(), Scenario.getStatus());
		System.out.println("-----------------------------Scenario start------------------------------");
		
	}
    @After
	public void after(Scenario Scenario)
	{
    	
		System.out.println("-------------------------------Scenario end--------------------------------");
		HTMLReportGenerator.TestCaseEnd();
    	HTMLReportGenerator.TestSuiteEnd();
	}
}
