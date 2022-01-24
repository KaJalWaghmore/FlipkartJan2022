package utility;

public class Trial {
	
	public static void main(String[] args)
	{
		Object[] a1=new Object[2];                               //browser launch
	    a1[0]="Chrome";
	    a1[1]="G://Automation Support//chromedriver.exe";
	    Seleniumproject.browserlaunch(a1);
	    
	    Object[] a2=new Object[1];                               //navigate to flipkart
	    a2[0]="https://www.flipkart.com/";
	    Seleniumproject.geturl();
	    
	    Object[] a3=new Object[1];                               //Cancel login window
	    a3[0]="//*[@class='_2KpZ6l _2doB4z']";
	    Seleniumproject.click(a3);
	    
	    Object[] a4=new Object[1];                               //move cursor towards login
	    a4[0]="//*[@class='_1_3w1N']";
	    Seleniumproject.moveonElement(a4);
	   
	    Object[] a5=new Object[1];                               //click on my profile
	    a5[0]="(//*[@class='_3vhnxf'])[1]";
	    Seleniumproject.click(a5);
	    
	    
	    Object[] a6=new Object[2];                          //Enter username
	    a6[0]="//*[@class='_2IX_2- VJZDxU']";
	    a6[1]="8552979304";
	    Seleniumproject.sendkeys(a6);
	    
	    Object[] a7=new Object[2];                           //Enter password
	    a7[0]="//*[@type='password']";
	    a7[1]="8552979304";
	    Seleniumproject.sendkeys(a7);
	    
	    Object[] a8=new Object[1];                                // click on submit
	    a8[0]="(//*[@type='submit'])[2]";
	    Seleniumproject.click(a8);
	    
	   		    	   
	}



}
