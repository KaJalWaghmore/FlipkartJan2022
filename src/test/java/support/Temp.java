package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp {
	
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "G://Automation Support//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();																															
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.flipkart.com/");                       //open url
	
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();       //cancel login window
	
	Actions act=new Actions(driver);                                                //move cursor  towards login 
	WebElement log=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
	act.moveToElement(log).build().perform();

	
	WebElement myprofile=driver.findElement(By.xpath("(//*[@class='_3vhnxf'])[1]"));       //click on my profile
	act.moveToElement(myprofile).click().perform();
	
	
	 driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8552979304");        //login by entering username and password
	 driver.findElementByXPath("//*[@type='password']").sendKeys("8552979304");
	 driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	 
	
	
}


}
