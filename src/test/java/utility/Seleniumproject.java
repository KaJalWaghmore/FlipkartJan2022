package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class Seleniumproject
{
	public static ConfigReader config=null;
	public static WebDriver driver=null;
	public static Hashtable<String, Object> outputParameters=new Hashtable<String, Object>();
			public static Hashtable<String, Object> browserlaunch(Object[]inputpara)                            //method for Launching the browser
			{
				try {
				String browsername=(String) inputpara[0];
				config=new ConfigReader();
				if(browsername.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				}
				else if(browsername.equalsIgnoreCase("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver",config.getDriverPathFF() );
					driver=new FirefoxDriver();
					driver.manage().window().maximize();	
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				}
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:browserlaunch, Input_Data :" +inputpara[0].toString());
				}catch(Exception e) {
					outputParameters.put("STATUS","FAIL");
					outputParameters.put("MESSAGE","methodUsed:browserlaunch, Input_Data :" +inputpara[0].toString());
				}
				return outputParameters;
			}
			
			public static Hashtable<String, Object> geturl()                  //get url method
			{
				try {
				driver.get(config.getApplicationUrl());
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:geturl, Input_Data :" +config.getApplicationUrl().toString());
				}catch(Exception e)
				{
					outputParameters.put("STATUS","FAIL");
					outputParameters.put("MESSAGE","methodUsed:geturl, Input_Data :" +config.getApplicationUrl().toString());
				}
				return outputParameters;
			}
			public static Hashtable<String, Object> click(Object[]inputpara)                         //click method
			{
				try {
				String xpath=(String) inputpara[0];
				WebElement ele=driver.findElement(By.xpath(xpath));
				ele.click();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:click, Input_Data :" +inputpara[0].toString());
				}catch(Exception e) {
					outputParameters.put("STATUS","FAIL");
					outputParameters.put("MESSAGE","methodUsed:click, Input_Data :" +inputpara[0].toString());
				}
				return outputParameters;
			}
			public static Hashtable<String, Object> moveonElement(Object[]inputpara)                   //movetoElement method
			{
				try {
				Actions act=new Actions(driver);
				String xpath=(String) inputpara[0];
				WebElement ele=driver.findElement(By.xpath(xpath));
				act.moveToElement(ele).build().perform();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:moveonElement, Input_Data :" +inputpara[0].toString());
			         }catch(Exception e) {
			        	 outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","methodUsed:moveonElement, Input_Data :" +inputpara[0].toString());
				}
				return outputParameters;
			}	
			public static Hashtable<String, Object> sendkeys(Object[]inputpara)
			{
				try {
				String send=(String) inputpara[0];
				String abc=(String) inputpara[1];
				driver.findElement(By.xpath(send)).sendKeys(abc);
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:sendkeys, Input_Data :" +inputpara[1].toString());
				}catch(Exception e) {
					outputParameters.put("STATUS","FAIL");
					outputParameters.put("MESSAGE","methodUsed:sendkeys, Input_Data :" +inputpara[1].toString());
				}
				return outputParameters;
			}
			
			public static Hashtable<String, Object> testcheck(Object[] inputpara)
			{
				try {
				String xpath=(String) inputpara[0];
				String text= (String) inputpara[1];
				WebElement ele=driver.findElement(By.xpath(xpath));
				if(ele.getText().contains(text))
				{
					System.out.println("Test case pass");	
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
				
				else
				{
					System.out.println("Test Case Fail");
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
				outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE","methodUsed:testcheck, Input_Data :" +inputpara[1].toString());
				
			         }catch(Exception e) {
			        	 outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","methodUsed:testcheck, Input_Data :" +inputpara[1].toString());
			           }
				return outputParameters;
			}

			public static void main(String[] args) 
			{
				Object[] a1=new Object[1];                               //browser launch
			    a1[0]="Chrome";
			    browserlaunch(a1);
			    
			   
			    geturl();          //navigate to flipkart
			    
			    Object[] a3=new Object[1];                               //Cancel login window
			    a3[0]="//*[@class='_2KpZ6l _2doB4z']";
			    click(a3);
			    
			    Object[] a4=new Object[1];                               //move cursor towards login
			    a4[0]="//*[@class='_1_3w1N']";
			    moveonElement(a4);
			   
			    Object[] a5=new Object[1];                               //click on my profile
			    a5[0]="(//*[@class='_3vhnxf'])[1]";
			    click(a5);
			    
			   
			    Object[] a6=new Object[2];                          //Enter username
			    a6[0]="//*[@class='_2IX_2- VJZDxU']";
			    a6[1]="8552979304";
			    sendkeys(a6);
			    
			    Object[] a7=new Object[2];                           //Enter password
			    a7[0]="//*[@type='password']";
			    a7[1]="8552979304";
			    sendkeys(a7);
			    
			    Object[] a8=new Object[1];
			    a8[0]="(//*[@type='submit'])[2]";                        //click on submit button
			    click(a8);
			  
			    Object[] a9=new Object[2];                               
			    a9[0]="//*[@class='_1ruvv2']";
			    a9[1]="Kajal Waghmore";
			    testcheck(a9);
			    
			    Object[] a10=new Object[1];                                  //click on manage address
			    a10[0]="(//*[@class='NS64GK'])[1]";
			    click(a10);
			    
			    Object[] a11=new Object[1];                                 //click on add new address
			    a11[0]="//*[@class='_1QhEVk']";
			    click(a11);
			    
			    Object[] a12=new Object[2];                           //Enter name
			    a12[0]="//*[@name='name']";
			    a12[1]="Kajal Waghmore";
			    sendkeys(a12);
			    
			    Object[] a13=new Object[2];                           //Enter mobile number
			    a13[0]="//*[@name='phone']";
			    a13[1]="8552979304";
			    sendkeys(a13);
			    
			    Object[] a14=new Object[2];                           //Enter pincode
			    a14[0]="//*[@name='pincode']";
			    a14[1]="411057";
			    sendkeys(a14);
			    
			    Object[] a15=new Object[2];                           //Enter Locality
			    a15[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
			    a15[1]="Hinjewadi";
			    sendkeys(a15);
			    
			    Object[] a16=new Object[2];                           //Enter  Address
			    a16[0]="//*[@name='addressLine1']";
			    a16[1]="Lakshmi Chowk";
			    sendkeys(a16);
			    
			      Object[] a17=new Object[1];
				  a17[0]="(//*[@class='_1XFPmK'])[1]";
				  Seleniumproject.click(a17);
				
				  Object[] a18=new Object[1];
				   a18[0]="(//*[@type='button'])[2]";
				   Seleniumproject.click(a18);
				   
				   Object[] input=new Object[2];
		         input[0]="(//*[@class='_2dQV-8'])[1]";
				  input[1]="411057";
				  Seleniumproject.testcheck(input);
				   
				 
			   		    	   
			}

	
		

	}


