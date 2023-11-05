package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();	
		
	    driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Sneka");
		driver.findElement(By.name("lastname")).sendKeys("Kannan");
		driver.findElement(By.name("reg_email__")).sendKeys("sk2023@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("faeltset23");
		
		WebElement day=driver.findElement(By.id("day"));
	    Select Day=new Select(day);
	    Day.selectByIndex(11);
	    
	    WebElement month=driver.findElement(By.id("month"));
	    Select Month=new Select(month);
	    Month.selectByValue("8");
	    
	    WebElement year=driver.findElement(By.id("year"));
	    Select Year=new Select(year);
	    Year.selectByVisibleText("2000");
	    Thread.sleep(3000);
	    
	    //gender
	    driver.findElement(By.cssSelector("input[value='1']")).click();
		
		

		
	
		

		
	}

}
