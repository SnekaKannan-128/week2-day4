package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Locate the User name
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		Thread.sleep(3000);
				
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		Thread.sleep(3000);
				
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		//Click CRM/SFA
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		Thread.sleep(3000);
		
		//Click Accounts tab
		WebElement accountsTab= driver.findElement(By.linkText("Accounts"));
	    accountsTab.click();
	    Thread.sleep(3000);
	    
	    //Click create account
	    driver.findElement(By.linkText("Create Account")).click();
	    Thread.sleep(3000);

	    //Enter account name
	    WebElement accountName = driver.findElement(By.id("accountName"));
	    accountName.sendKeys("Sneka");
	    Thread.sleep(5000);
	    
	    //Enter a description
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    Thread.sleep(5000);
	    
	    //Select industry
	    WebElement industry1 = driver.findElement(By.name("industryEnumId"));
	    Select industry = new Select(industry1);
	    industry.selectByValue("IND_SOFTWARE");
	    Thread.sleep(5000);
	    
	    //Select  ownership
	    WebElement  ownership1 = driver.findElement(By.name("ownershipEnumId"));
	    Select ownership = new Select(ownership1);
	    ownership.selectByVisibleText("S-Corporation");
	    Thread.sleep(5000);
	    
	    //Source drop down
	 	WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	 	Select source = new Select(sourceDD);
	    source.selectByValue("LEAD_EMPLOYEE");
	    Thread.sleep(5000);
	    	
		//Locating marketing campaign
		WebElement markCampDD = driver.findElement(By.id("marketingCampaignId"));
		Select markCamp = new Select(markCampDD);
		markCamp.selectByIndex(6);
		Thread.sleep(5000);
		
		//select state/province
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("TX");
		Thread.sleep(5000);
		
		//click create account & submit
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		//close
		driver.close();
	}

}
